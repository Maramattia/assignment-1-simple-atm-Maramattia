import javafx.stage.Stage;

public class Deposit extends DrawInitialScene {

	boolean x=true;
	public Deposit(Stage stage, BankAccount myAccount) {
		super.stage=stage;
		super.myAccount=myAccount;
	}

	public void drawScene() {
		super.drawScene(x);
	}
}
