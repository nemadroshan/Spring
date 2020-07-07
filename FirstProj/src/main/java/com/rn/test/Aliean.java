package com.rn.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aliean {
	@Autowired
	Laptop lap;
		public void code() {
			// TODO Auto-generated method stub
				System.out.println("I am Coading ");
				lap.compile();
		}
}
