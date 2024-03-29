package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {

	
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
	
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		List<Account> theAccounts = theAccountDAO.findAccounts(false);
		
		
		
		System.out.println("\nThese are the accounts: ");
		
		for (Account acc: theAccounts) {
			System.out.println("\n" + acc);
		}
		
		context.close();
	}

}
