import javafx.stage.Stage;

public class Withdraw extends DrawInitialScene{

	boolean x=false;
	public Withdraw(Stage stage, BankAccount myAccount) {
		super.stage=stage;
		super.myAccount=myAccount;
	}

	public void drawScene() {
		super.drawScene(x);
	}
}
