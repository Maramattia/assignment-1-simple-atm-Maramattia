import javax.sound.midi.MidiDevice.Info;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public abstract class DrawInitialScene {
protected Stage stage;
private Scene scene;
protected BankAccount myAccount;
private MainMenu mainMenu;


	public void setMainMenu(MainMenu mainMenu) {
		this.mainMenu=mainMenu;
	}

	public void drawScene(boolean x) {
		
		GridPane grid=new GridPane();
		Button one=new Button("1");
		Button two=new Button("2");
		Button three=new Button("3");
		Button four=new Button("4");
		Button five=new Button("5");
		Button six=new Button("6");
		Button seven=new Button("7");
		Button eight=new Button("8");
		Button nine=new Button("9");
		Button zero=new Button("0");
		Button submit=new Button("  Submit ");
		Button back=new Button("    Back   ");
		Label error=new Label("");
		TextField amount=new TextField();
		
		grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(16));
        grid.setHgap(16);
        grid.setVgap(8);
        error.setTextFill(Color.web("Red"));
        amount.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR,16));
        amount.setDisable(true);
        
        grid.add(one, 0, 0);
        grid.add(two, 1, 0);
        grid.add(three, 2, 0);
        grid.add(four, 0, 1);
        grid.add(five, 1, 1);
        grid.add(six, 2, 1);
        grid.add(seven, 0, 2);
        grid.add(eight, 1, 2);
        grid.add(nine, 2, 2);
        grid.add(zero, 1, 3);
        grid.add(submit, 4, 2);
        grid.add(amount, 3, 2);
        grid.add(error, 3, 3);
        grid.add(back, 4,10);
        
        one.setOnAction(e->{amount.setText(amount.getText()+"1");});
        two.setOnAction(e->{amount.setText(amount.getText()+"2");});
        three.setOnAction(e->{amount.setText(amount.getText()+"3");});
        four.setOnAction(e->{amount.setText(amount.getText()+"4");});
        five.setOnAction(e->{amount.setText(amount.getText()+"5");});
        six.setOnAction(e->{amount.setText(amount.getText()+"6");});
        seven.setOnAction(e->{amount.setText(amount.getText()+"7");});
        eight.setOnAction(e->{amount.setText(amount.getText()+"8");});
        nine.setOnAction(e->{amount.setText(amount.getText()+"9");});
        zero.setOnAction(e->{amount.setText(amount.getText()+"0");});
        
        submit.setOnAction(e->
        {
        	error.setText("");
        	
        	if(x) {
        		myAccount.deposit(Integer.valueOf(amount.getText()));
        	}
        	else {
        		boolean valid=myAccount.withdraw(Integer.valueOf(amount.getText()));
        		if(!valid)error.setText("<No sufficent balance>");
        	}
        	amount.setText("");
        });
        back.setOnAction(e->{error.setText("");stage.setScene(mainMenu.getScene());});
        
		scene=new Scene(grid,500,450);
	}

	public Scene getScene() {
		return this.scene;
	}

	public void setAccount(BankAccount myAccount) {
		this.myAccount=myAccount;
		
	}

}
