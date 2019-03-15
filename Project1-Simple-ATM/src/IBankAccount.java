
public interface IBankAccount {

	
		//Returnsthe current balance in string format
		public int balanceInquiry();
		//withdraws from current balance and updates it
		public boolean withdraw(int amount);
		//adds to the current balance and updates it
		public void deposit(int amount);
		//returns the prevtransaction in String format, or Null if no more history
		public String prev();
		//returns the next transaction in String format, or Null if no morehistory
		public String next();
		}

