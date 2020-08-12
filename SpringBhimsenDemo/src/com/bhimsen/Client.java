package com.bhimsen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	// 
	public static void main(String[] args) {
		// Traditional way of creating a object
		Employee e = new Employee();
		e.setEid(1);
		e.setEname("Bhimsen");
		e.setEsalary(40000);
		System.out.println(e);
		System.out.println("Spring IOC in action");
		// Inversion of control(IOC)
		// we perform these three simple steps to perform the first fundamental i.e IOC
		// 1. Add jar files for spring core(Configure my project with build path with spring core jar file)
		// Build Path -> Configure Build Path -> Libraries -> Add External Jars ->
		// 2. Configure Java object in an XML file
		// 3. Use spring IOC container , eg : BeanFactory or ApplicationContext to get
		// the objects constructed by them itself

		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = (Employee) context.getBean("emp1");
		Employee e2 = context.getBean("emp2", Employee.class);
		System.out.println(e1);
		System.out.println(e2);
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) context;
		ctx.close();

		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource); // Spring container which shall parse XML file and
																// construct the objects
		Employee e3 = (Employee) beanFactory.getBean("emp1");
		Employee e4 = beanFactory.getBean("emp2", Employee.class);
		System.out.println(e3);
		System.out.println(e4);

	}
}
