package com.rn.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
		private static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
			@Before("execution(public * com.rn.controller.HomeController.*(..))")
			public void log() {
				//System.out.println("LoggingAspect.log()");
				logger.info("inside from log method : logging aspect class");
			}
}
