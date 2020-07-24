package com.rn.SpringProj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
     //  BeanFactory  factory = null;
    	ApplicationContext ctx= null;

       Alien alien =null;
//    	factory= new XmlBeanFactory(new FileSystemResource("src/main/java/com/rn/SpringProj/applicationContext.xml"));
        	ctx = new ClassPathXmlApplicationContext("com/rn/SpringProj/applicationContext.xml");//working
        //alien = (Alien) factory.getBean("alien");
        	
        	alien = ctx.getBean("alien",Alien.class);
        	
        	alien.code();
        
    }
}