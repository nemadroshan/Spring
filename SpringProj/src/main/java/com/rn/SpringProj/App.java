package com.rn.SpringProj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     //  BeanFactory  factory = null;
    	ApplicationContext ctx= null;

       Alien alien =null;
       Alien alien2 =null;
//    	factory= new XmlBeanFactory(new FileSystemResource("src/main/java/com/rn/SpringProj/applicationContext.xml"));
        	ctx = new ClassPathXmlApplicationContext("com/rn/SpringProj/applicationContext.xml");//working
        //alien = (Alien) factory.getBean("alien");
        	
			/*
			 * alien = ctx.getBean("alien",Alien.class);
			 * alien2=ctx.getBean("alien",Alien.class);
			 * 
			 * alien.setAge(12); System.out.println(alien.getAge());
			 * 
			 * System.out.println(alien2.getAge());
			     	
        	
        	alien.code();
        */    
    }
}
