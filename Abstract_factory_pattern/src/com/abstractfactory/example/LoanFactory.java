package com.abstractfactory.example;

public class LoanFactory extends AbstractFactory {
	


	
	public Loan getLoan(String loanName) {
		// TODO Auto-generated method stub
		if(loanName== null) return null;
		if(loanName.equalsIgnoreCase("Home")) return new HomeLoan();
		if(loanName.equalsIgnoreCase("Education")) return new EducationLoan();
		if(loanName.equalsIgnoreCase("Business")) return new BusinessLoan();
		
		return null;
	}

	@Override
	public Bank getBank(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}

}
