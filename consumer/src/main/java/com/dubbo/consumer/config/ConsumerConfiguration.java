//package com.dubbo.consumer.config;
//
//import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//@Configuration
//@EnableDubbo(scanBasePackages = "com.dubbo.consumer.service")
//@PropertySource("classpath:application.properties")
//@ComponentScan(value = "com.dubbo.consumer.service")
//public class ConsumerConfiguration {
//
////    @Bean
////    public ApplicationConfig applicationConfig(){
////        ApplicationConfig applicationConfig = new ApplicationConfig();
////        applicationConfig.setName("consumer-test");
////        return applicationConfig;
////    }
////
////    @Bean
////    public ConsumerConfig consumerConfig(){
////        ConsumerConfig consumerConfig = new ConsumerConfig();
////        consumerConfig.setTimeout(3000);
////        return consumerConfig;
////    }
////
////    @Bean
////    public RegistryConfig registryConfig(){
////        RegistryConfig registryConfig = new RegistryConfig();
////        registryConfig.setAddress("nacos://127.0.0.1:8848");
////        registryConfig.setClient("curator");
////        return registryConfig;
////    }
//
//}
