package br.com.zup.edu.gestaofuncionarioclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestaoFuncionarioClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoFuncionarioClientApplication.class, args);
	}

}
