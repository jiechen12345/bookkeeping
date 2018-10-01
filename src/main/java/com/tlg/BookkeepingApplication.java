package com.tlg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BookkeepingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookkeepingApplication.class, args);
	}
}
