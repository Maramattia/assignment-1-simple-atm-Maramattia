public class Transactions {

	private String[]transactions=new String[5];
	private int counter=0,currentIndex=0,i;
	private boolean x,y;

	public void addTransaction(String transaction)
	{
		this.checkTransaction();
		currentIndex=counter;
		transactions[counter++]=transaction;
		currentIndex=counter;
	}
	
	public void checkTransaction() {
		if(counter==5)
		{
			for(i=0;i<4;i++)
			{
				transactions[i]=transactions[i+1];
			}
			counter--;
		}
	}
	 
	public String previous() {
		if(y) {y=false;return transactions[--currentIndex];}
		if(currentIndex==0) {x=true;return "No more transactions";}	
		else return transactions[--currentIndex];
	} 
	
	
	public String next() {
		if(x) {x=false;return transactions[currentIndex];}
		if(currentIndex==(counter-1)) {y=true;return "No more transactions";}
		else  {return transactions[++currentIndex];}
	}
	
}
	