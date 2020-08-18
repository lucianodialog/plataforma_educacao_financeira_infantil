package com.luciano.plataformafinanceira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class PlataformaFinanceiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlataformaFinanceiraApplication.class, args);
	}

}
