import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainMenu {
Stage stage;
Scene scene;
BankAccount myAccount;
LogIn logIn;
Deposit deposit;
Withdraw withdraw;
	
	public MainMenu(Stage stage, BankAccount myAccount) {
		this.stage=stage;
		this.myAccount=myAccount;
	}

	public void setDeposit(Deposit deposit) {
		this.deposit=deposit;
	}

	public void setLogIn(LogIn logIn) {
	this.logIn=logIn;
	}

	public void setWithdraw(Withdraw withdraw) {
		this.withdraw=withdraw;
		
	}

	public void drawScene() {
		GridPane grid=new GridPane();
		Label title=new Label("What do you want");
		Button Deposit=new Button("    Deposit    ");
		Button Withdraw=new Button("   Withdraw  ");
		Button balanceInquiry=new Button("        Balance Inquiry       ");
		Button previous=new Button("   Previous   ");
		Button next=new Button("      Next      ");
		Button logOut=new Button("     Logout    ");
		Label transactions=new Label();
		
		grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(16));
        grid.setHgap(16);
        grid.setVgap(8);
        transactions.setMinWidth(180);
        transactions.setAlignment(Pos.CENTER);
        title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR,18));
        transactions.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR,14));
        next.setDisable(true);
		
		grid.add(title, 1,0);
		grid.add(Deposit, 0, 1);
		grid.add(Withdraw, 0, 2);
		grid.add(balanceInquiry, 1, 1);
		grid.add(previous, 2, 1);
		grid.add(next, 2, 2);
		grid.add(transactions, 1,2);
		grid.add(logOut, 2,8);
		
		
		Deposit.setOnAction(e->{ next.setDisable(true);transactions.setText("");previous.setDisable(false);stage.setScene(deposit.getScene());});
		Withdraw.setOnAction(e->{next.setDisable(true); transactions.setText("");previous.setDisable(false);stage.setScene(withdraw.getScene());});
		balanceInquiry.setOnAction(e->{next.setDisable(true);previous.setDisable(false);transactions.setText(String.valueOf(myAccount.balanceInquiry()));});
		previous.setOnAction(e->
		{String check1;
		check1=myAccount.prev();
			next.setDisable(false);
		if(check1.equals("No more transactions"))
			previous.setDisable(true);
		transactions.setText(check1);
		});
		next.setOnAction(e->
		{String check2;
		check2=myAccount.next();
		previous.setDisable(false);
		if(check2.equals("No more transactions"))
			next.setDisable(true);
		transactions.setText(check2);
		});
		logOut.setOnAction(e->{transactions.setText("");stage.setScene(logIn.getScene());});
		
		scene=new Scene(grid,500,450);
	}

	public Scene getScene() {
		return this.scene;
	}

}
