package com.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.dubbo.consumer.service.AnnotateConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@EnableDubbo
@SpringBootApplication
public class ConsumerApplication implements CommandLineRunner {

	@Autowired
	private AnnotateConsumerService annotateConsumerService;

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	public void callMethod(){
		try {
			log.info("消费端启动成功～");
			Thread.sleep(3000);
			log.info("开始调用欢迎接口～");
			String sayHello = annotateConsumerService.callProvider();
			log.info(sayHello);
			Thread.sleep(5000);
			log.info("开始调用欢迎接口～");
			String userInfo = annotateConsumerService.getAllUser();
			log.info(userInfo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run(String... args) {
		callMethod();
	}
}

