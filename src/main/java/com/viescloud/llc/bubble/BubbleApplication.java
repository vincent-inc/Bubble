package com.viescloud.llc.bubble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

import com.vincent.inc.viesspringutils.ViesApplication;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class BubbleApplication extends ViesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BubbleApplication.class, args);
	}

	@Override
	public String getApplicationName() {
		return "bubble";
	}

}
