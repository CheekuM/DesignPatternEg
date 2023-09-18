package com.abstractfactory.example;

import java.util.Scanner;

public class MAinClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bank Name ");
		String bankName=sc.next();
		System.out.println("Enter the loan type ");
		String loanType=sc.next();
		FactoryCreator fc=new FactoryCreator();
		AbstractFactory abstractFactory=fc.getFactory("bank");
		System.out.println("Bank Name :"+ abstractFactory.getBank(bankName).getBankName());
		 abstractFactory=fc.getFactory("LOAN");
		System.out.println("Loan Name :"+ abstractFactory.getLoan(loanType).getLoanName());
		
	}
}
