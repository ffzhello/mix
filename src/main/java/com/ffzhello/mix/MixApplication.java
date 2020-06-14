package com.ffzhello.mix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 启动类
 **/
@SpringBootApplication(scanBasePackages = "com.ffzhello.mix.*")
public class MixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MixApplication.class, args);
	}
}
