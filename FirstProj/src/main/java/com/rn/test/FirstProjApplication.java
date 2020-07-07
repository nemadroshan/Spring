package com.rn.test;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(FirstProjApplication.class, args);
		Aliean obj = context.getBean(Aliean.class);
		obj.code();
	}

}
