package com.abstractfactory.example;

public class FactoryCreator {
	public AbstractFactory getFactory(String name) {
		if(name == null) return null;
		if(name.equalsIgnoreCase("Loan")) return new LoanFactory();
		if(name.equalsIgnoreCase("Bank")) return new BankFactory();
		return null;
	}

}
