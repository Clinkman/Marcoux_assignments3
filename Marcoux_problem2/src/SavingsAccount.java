
public class SavingsAccount {
	public static double annualInterestRate = 0.0; // static class variable
	  
	private double savingsBalance; // private instance variable
	  
	// Constructor
	public SavingsAccount(double amt){
	this.savingsBalance = amt;  
	}
	  
	// to calculate the monthly interest
	public void calculateMonthlyInterest(){
	double interest;
	interest = (this.savingsBalance * (annualInterestRate/100))/12;
	this.savingsBalance += interest;
	}
	  
	// to display balance
	public void showBalance(){
	System.out.printf("$%.2f", this.savingsBalance);
	}
	  
	// to set the static variable
	public static void modifyInterestRate(double newRate){
	annualInterestRate = newRate;
	}
}
