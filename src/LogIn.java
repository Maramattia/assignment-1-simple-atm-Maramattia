import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LogIn {

	Stage stage;
	MainMenu mainMenu;
	BankAccount myAccount;
	Scene scene;
	
	public LogIn(Stage stage, BankAccount myAccount) {
		this.stage=stage;
		this.myAccount=myAccount;
	}

	public void setMainMenu(MainMenu mainMenu) {
		this.mainMenu=mainMenu;	
	}

	public Scene getScene() {
		return this.scene;
	}
	
	public void drawScene() {
		GridPane grid=new GridPane();
		Label enterCardNumber=new Label("Enter your Card Number");
		PasswordField cardNumber=new PasswordField();
		Button submit=new Button("Submit");
		Label validation=new Label();
				
		grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(16));
        grid.setHgap(16);
        grid.setVgap(8);
        enterCardNumber.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR,16));
        validation.setTextFill(Color.web("Red"));
		
		grid.add(enterCardNumber, 0, 0);
		grid.add(cardNumber, 0, 1);
		grid.add(submit,0, 2);
		grid.add(validation, 0, 3);
       
		submit.setOnAction(e->{
			validation.setText("");
			if(cardNumber.getText().contentEquals(myAccount.getCardNumber()))
					{stage.setScene(mainMenu.getScene());}
			else 
					validation.setText("<<Invalid card number>>");
			cardNumber.setText("");
		});	
		scene=new Scene(grid,500,450);
	}
}
