package com.samster.springdi;

import com.samster.springdi.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringdiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void myControllerTest(){
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}



	@Test
	void contextLoads() {
	}

}
