package com.soyoungboy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soyoungboy.bean.Person;

public class PersonTest {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("person.xml");

	@Test
	public void test() {
		Person bean = (Person) applicationContext.getBean("person");
		System.out.println(bean);
	}

	@Test
	public void test4() {
		Person person04 = (Person) applicationContext.getBean("person04");
		System.out.println(person04);
	}

	/**
	 * 通过构造器获取对象内容
	 */
	@Test
	public void test5() {
		Person person05 = (Person) applicationContext.getBean("person05");
		System.out.println(person05);
	}
	
	
}
