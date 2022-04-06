//package com.example.examplekafkaconsumer.config;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaConsumer {
//
//    //  Consumption monitoring
//    @KafkaListener(id = "myListener1", topics = {
//    "topic1"},
//            containerFactory = "delayContainerFactory")
//    public void listen1(String data) {
//
//        System.out.println(" Listener receives message ：" + data);
//    }
//}