package com.imti.spring.java.money;

import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJavaMoneyApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootJavaMoneyApplication.class, args);
		CurrencyUnit real = Monetary.getCurrency("BRL");
		CurrencyUnit dollar = Monetary.getCurrency(Locale.US);
		System.out.println(real);
		System.out.println(dollar);
	}
}
