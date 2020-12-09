package com.vosouq.grpcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GrpcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcDemoApplication.class, args);
	}
}
