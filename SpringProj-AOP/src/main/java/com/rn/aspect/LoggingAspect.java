package com.rn.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
			@Before("execution(public * com.rn.controller.HomeController.*(..))")
			public void log() {
				System.out.println("LoggingAspect.log()");
			}
}
