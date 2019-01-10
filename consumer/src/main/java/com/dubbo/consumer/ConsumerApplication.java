package com.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.dubbo.consumer.service.AnnotateConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
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
			log.info("开始调用接口～");
			String sayHello = annotateConsumerService.callProvider();
			log.info(sayHello);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run(String... args) throws Exception {
		callMethod();
	}
}

