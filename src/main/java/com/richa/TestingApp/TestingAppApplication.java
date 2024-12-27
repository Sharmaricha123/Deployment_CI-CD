package com.richa.TestingApp;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class TestingAppApplication{

	public static void main(String[] args) {
		SpringApplication.run(TestingAppApplication.class, args);
	}

}
