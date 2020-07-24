package com.rn.SpringProj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx= null;
		Alien alien =null;
		
		//creating application context
		
		ctx = new ClassPathXmlApplicationContext("com/rn/SpringProj/applicationContext.xml");
		alien = ctx.getBean("alien",Alien.class);
		
		System.out.println(" Name :: "+alien.getName());
		alien.code();
		
				
	}
}
