package com.Puduvai.Care;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PuduvaiCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuduvaiCareApplication.class, args);
	}

}
