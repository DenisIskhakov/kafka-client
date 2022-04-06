//package com.example.examplekafkaconsumer.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.stereotype.Component;
//
//@Configuration
//public class KafkaInitialConfiguration {
//
//
//    //  Monitor factory
//    @Autowired
//    private ConsumerFactory consumerFactory;
//
//    //  Monitor container factory ( Set the ban KafkaListener Self starting )
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory delayContainerFactory() {
//
//        ConcurrentKafkaListenerContainerFactory container =
//                new ConcurrentKafkaListenerContainerFactory();
//        container.setConsumerFactory(consumerFactory);
//        // Disable auto start
//        container.setAutoStartup(false);
//        return container;
//    }
//}
