package com.soa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ArtemisReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtemisReceiverApplication.class, args);
	}

}
