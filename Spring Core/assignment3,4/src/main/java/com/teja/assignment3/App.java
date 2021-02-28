package com.teja.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		BankAccountController controller = (BankAccountController)context.getBean("bankAccountController");
		double amountLeft = controller.withdraw(controller.getAccount().getAccountId(), 10000);
	    System.out.println(amountLeft);
		System.out.println(controller);
		
	}
}
