package assignment3;

public class AxisBank extends BankInfo {
	
	public void deposit(int a,int b) {
		int c = a*b;
		System.out.println(c);

	}
    
	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		bank.deposit(250000, 100000);
		
		AxisBank Axis=new AxisBank();
		Axis.deposit(2500, 500);
	}
    

	
}
