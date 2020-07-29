package com.rn.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
			public void logBefore() {
				//works before pointcut method execution 
				logger.info("inside from logBEfore method : logging aspect class");
			}
			
			@After("execution(public * com.rn.controller.HomeController.*(..))")
			public void logAfter() {
				//works irrsepection of successfull execution or not
				logger.info("inside from logAfter method : logging aspect class");
			}
			
			@AfterReturning("execution(public * com.rn.controller.HomeController.getAlieanById(..))")
			public void logOnSuccessExecution() {
				//only works wheen successfull executon
				logger.info("LoggingAspect.logOnSuccessExecution() : logging aspect class");
			}
			
			@AfterThrowing("execution(public * com.rn.controller.HomeController.*(..))")
			public void logOnEXception() {
				//only works when exeception is rised
				logger.warn("LoggingAspect.logOnEXception(): logging aspect class");
			}
}
