package com.spring.kafka;

import com.spring.kafka.service.ChangesProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaRealWorldStreamingDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaRealWorldStreamingDemoApplication.class, args);
	}

	@Autowired
	private ChangesProducer changesProducer;

	@Override
	public void run(String... args) throws Exception {
		changesProducer.sendMessage();
	}

}
