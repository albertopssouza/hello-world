package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

        @RestController
        class HelloWorld {
            
            @GetMapping("/")
            public String printHelloWorld() {
                return "Hello World";
            }
            
            @GetMapping("/status")
            public String showStatus() {
                return "App funcionando";
            }
            
        }
}
