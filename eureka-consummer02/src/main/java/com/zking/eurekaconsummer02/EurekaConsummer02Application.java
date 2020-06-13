package com.zking.eurekaconsummer02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaConsummer02Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsummer02Application.class, args);
	}

//	@Bean  //加入Bean容器
//	@LoadBalanced	//支持负载均衡
//	RestTemplate restTemplate(){
//		return new RestTemplate();
//	}

}
