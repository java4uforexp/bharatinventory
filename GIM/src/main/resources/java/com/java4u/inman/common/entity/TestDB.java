package com.java4u.inman.common.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	System.out.println("TEST DoNE");

	}

}
