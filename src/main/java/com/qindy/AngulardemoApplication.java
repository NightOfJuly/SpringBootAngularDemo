package com.qindy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@SpringBootApplication
public class AngulardemoApplication {

	@RequestMapping(value = "/search",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Person search(String personName){
		return new Person( personName,32,"beijing");
	}
	public static void main(String[] args) {
		SpringApplication.run(AngulardemoApplication.class, args);
	}
}
