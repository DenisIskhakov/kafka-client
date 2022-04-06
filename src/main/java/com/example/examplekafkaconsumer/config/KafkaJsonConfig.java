package com.example.examplekafkaconsumer.config;


import com.example.examplekafkaconsumer.model.User;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;



@Configuration
public class KafkaJsonConfig {

    public ProducerFactory<String, User> producerFactoryJson() {
        Map<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false); // disable autocommit
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//        config.put(ProducerConfig.ACKS_CONFIG, "MANUAL_IMMEDIATE");
        return new DefaultKafkaProducerFactory<>(config);
    }
//    factory.getContainerProperties().setAckMode(AckMode.MANUAL_IMMEDIATE)

    @Bean(name = "kafkaJsonTemplate")
    public KafkaTemplate<String, User> kafkaTemplateJson() {
        return new KafkaTemplate<>(producerFactoryJson());
    }

//    @Bean
//    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConcurrency(concurrency);
//        factory.setConsumerFactory(consumerFactorys());
//        factory.setBatchListener(true);//Set to batch consumption, the number of each batch is set in the Kafka configuration parameter ConsumerConfig.MAX_POLL_RECORDS_CONFIG
//        factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);//The way to set the submission offset forget the configuration place
//        return factory;
//
//
//    }
}