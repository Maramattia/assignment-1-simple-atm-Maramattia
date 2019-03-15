
public class BankAccount implements IBankAccount {

	private int balance=0;
	private String cardNumber="963258741";
	private Transactions transactions=new Transactions();
	@Override
	public int balanceInquiry() {
		transactions.addTransaction("Balance inquiry: "+balance);
		return balance;
	}

	@Override
	public boolean withdraw(int amount) {
	  if(amount>balance)
		 {System.out.println("<<No sufficent balance>>");
		 return false;}
	  else
	  {
		  balance-=amount;
		  transactions.addTransaction("Withdraw: "+amount);
		  return true;
	  }
	}

	@Override
	public void deposit(int amount) {
		transactions.addTransaction("Deposit: "+amount);
		balance+=amount;
	}

	@Override
	public String prev() {
		return transactions.previous();
	}

	@Override
	public String next() {
		return transactions.next();
	}

	public String getCardNumber() {
		return cardNumber;
	}

}
