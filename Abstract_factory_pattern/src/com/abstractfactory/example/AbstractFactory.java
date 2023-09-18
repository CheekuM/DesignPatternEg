package com.abstractfactory.example;

 abstract class AbstractFactory {
	public abstract Bank getBank(String bankName);
	public abstract Loan getLoan(String loanName);

}
