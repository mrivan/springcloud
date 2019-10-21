package it.almaviva.springclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Configuration
public class MessageController {
	@Value("${app.greet.name:Hello defaultff}")
	private String message;

	@RequestMapping("/message")
	String message() {
		return message;
	}
}