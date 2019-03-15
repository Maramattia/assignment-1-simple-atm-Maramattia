public class MAinTest {

	public static void main(String[]args)
	{
	BankAccount myAccount=new BankAccount();
	if(myAccount.getCardNumber().equals("123456789"))
	System.out.println("welcome");
	else System.out.println("wrong number");
	if(myAccount.getCardNumber().equals("963258741"))
		System.out.println("welcome");
		else System.out.println("wrong number");
	System.out.println(myAccount.balanceInquiry());
	myAccount.deposit(1000);
	myAccount.deposit(1000);
	myAccount.deposit(1000);
	System.out.println(myAccount.balanceInquiry());																																	
	System.out.println(myAccount.next());
	System.out.println(myAccount.prev());
	System.out.println(myAccount.prev());
	System.out.println(myAccount.prev());
	System.out.println(myAccount.prev());
	System.out.println(myAccount.prev());
	System.out.println(myAccount.prev());
	System.out.println(myAccount.prev());
	myAccount.withdraw(1000);
	myAccount.withdraw(10000);
	System.out.println(myAccount.prev());	
	System.out.println(myAccount.prev());
	System.out.println(myAccount.prev());
	System.out.println(myAccount.prev());
	System.out.println(myAccount.next());
	System.out.println(myAccount.next());
	System.out.println(myAccount.next());
	
	}
	
	
	
}
