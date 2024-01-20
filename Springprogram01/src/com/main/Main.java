package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.program.JavaBeans;



public class Main {

	public static void main(String args[]) {
		
		String config_loc="/com/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
		JavaBeans s1=(JavaBeans) context.getBean("stdId");
        s1.display();
	}

}
