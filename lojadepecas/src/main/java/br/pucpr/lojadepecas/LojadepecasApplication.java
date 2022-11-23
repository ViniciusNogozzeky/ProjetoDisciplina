package br.pucpr.lojadepecas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;


@SpringBootApplication
@EnableFeignClients
@Component
@Configuration
@EnableScheduling
public class LojadepecasApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojadepecasApplication.class, args);
	}

}
