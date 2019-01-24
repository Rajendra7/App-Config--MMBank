package com.capgemini.moneymoney.accountservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.capgemini.moneymoney.accountservice.entity.Account;
import com.capgemini.moneymoney.accountservice.repo.AccountRepository;



@EnableDiscoveryClient
@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner popularData(AccountRepository repository) {
		return (arg)->{
			repository.save(new Account(101,"Rajendra",25000.0));
			repository.save(new Account(102,"Grace",30000.0));
			repository.save(new Account(103,"janu",23000.0));
			repository.save(new Account(104,"bhanu",25000.0));
			repository.save(new Account(105,"mrudula",2000.0));
			repository.save(new Account(106,"Priyanka",23000.0));
		};
	}

}

