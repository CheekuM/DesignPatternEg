package com.abstractfactory.example;

public class BankFactory extends AbstractFactory {
	
	 public Bank getBank(String bankName) {
		if(bankName == null)
			return null;
		if(bankName.equalsIgnoreCase("HDFC")) return new HDFCBank();
		if(bankName.equalsIgnoreCase("ICICI")) return new ICICIBank();
		if(bankName.equalsIgnoreCase("SBI")) return new SBIBank();
		
		return null;
	}

	@Override
	public Loan getLoan(String loanName) {
		// TODO Auto-generated method stub
		return null;
	}

}
