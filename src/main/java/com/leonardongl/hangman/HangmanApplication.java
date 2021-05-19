package com.leonardongl.hangman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HangmanApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HangmanApplication.class, args);
	}

}
