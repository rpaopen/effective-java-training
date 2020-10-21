package in.conceptarchitect.banking;

import in.conceptarchitect.utils.Input;

public class BankAccount {
	
	int accountNumber;
	String name;
	String password;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//you can't change your account number
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	

}
