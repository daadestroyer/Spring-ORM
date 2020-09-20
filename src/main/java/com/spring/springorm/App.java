package com.spring.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		StudentDao sd = ctx.getBean("studentDao", StudentDao.class);
		Student st = new Student(101, "durgesh", "kanpur");
		int r = sd.insert(st);

		System.out.println("done : " + r);
	}
}
