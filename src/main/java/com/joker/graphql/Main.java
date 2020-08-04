package com.joker.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
public class Main extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
