package com.hibernet.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		System.out.println("1");
		configuration.configure("hibernate.cfg.xml");
		System.out.println("1");
		SessionFactory sf=configuration.buildSessionFactory();
		Session s=sf.openSession();
		System.out.println("3");
		Emplyoee student = new Emplyoee();
		Emplyoee.setfirstName("Raj");
		Emplyoee.setLastName("Verma") 
		Emplyoee.setEmail("raj.verma@imagine.com")
		Emplyoee.setage("35")
		s.save(student);
		s.close();
		System.out.println("record is inserted>>");

}
}
