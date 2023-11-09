package com.samster.springdi;

import com.samster.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringdiApplication.class, args);

		MyController myController = ctx.getBean(MyController.class);

		System.out.println("Inside Main method");

		System.out.println(myController.sayHello());
	}

}
