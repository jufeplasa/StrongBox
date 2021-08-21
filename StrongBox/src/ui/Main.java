package ui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application{
	
    @FXML
    private Label lbMessg;
    
	public static void main (String [] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("SaveBox1.fxml"));
		SaveBoxGUI controller = new SaveBoxGUI();
		fxmlLoader.setController(controller);
		Parent root = fxmlLoader.load();
		Scene scene= new Scene(root);
		controller.setMainStage(primaryStage);
		primaryStage.setScene(scene);
		primaryStage.setTitle("StrongBox");
		primaryStage.show();
	}
}
