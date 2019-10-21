package it.almaviva.springclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class ExampleSpringCloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringCloudClientApplication.class, args);
	}

}
