import javafx.application.Application;
import javafx.stage.Stage;
public class MainGUI extends Application{

	public static void main(String[]args)
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Simple ATM");
		BankAccount myAccount=new BankAccount();
		LogIn logIn=new LogIn(primaryStage,myAccount);
		MainMenu mainMenu=new MainMenu(primaryStage,myAccount);
		Deposit deposit=new Deposit(primaryStage,myAccount);
		Withdraw withdraw=new Withdraw(primaryStage,myAccount);
		
		logIn.setMainMenu(mainMenu);
		mainMenu.setLogIn(logIn);
		mainMenu.setDeposit(deposit);
		deposit.setMainMenu(mainMenu);
		mainMenu.setWithdraw(withdraw);
		withdraw.setMainMenu(mainMenu);
		
		logIn.drawScene();
		mainMenu.drawScene();
		deposit.drawScene();
		withdraw.drawScene();
		
		primaryStage.setScene(logIn.getScene());
		primaryStage.show();
	
		
	}
	

}
