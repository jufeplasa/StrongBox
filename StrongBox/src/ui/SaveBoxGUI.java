package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Segurity;

public class SaveBoxGUI {
	
	private Segurity seguridad;

    @FXML
    private Button btnChange;
    
    @FXML
    private TextField txtField1;

    @FXML
    private TextField txtField2;

    @FXML
    private TextField txtField3;

    @FXML
    private TextField txtField4;

    @FXML
    private TextField txtField5;

    @FXML
    private TextField txtField6;
    
    @FXML
    private TextField txtField7;

    @FXML
    private TextField txtField8;

    @FXML
    private TextField txtField9;

    @FXML
    private TextField txtField10;

    @FXML
    private TextField txtField11;

    @FXML
    private TextField txtField12;

    @FXML
    private TextField txtField13;

    @FXML
    private TextField txtField14;

    @FXML
    private TextField txtField15;

    @FXML
    private TextField txtField16;

    @FXML
    private TextField txtField17;

    @FXML
    private TextField txtField18;

    @FXML
    private Label lbMessg;
    
    @FXML
    private Label lbMessg2;
    
    private Stage mainStage;
    
    public SaveBoxGUI() {
    	seguridad= new Segurity();
    } 
    
    public Stage getMainStage() {
		return mainStage;
	}

	public void setMainStage(Stage mainStage) {
		this.mainStage = mainStage;
	}
    
    @FXML
    public void switchToWindow2(ActionEvent event) throws IOException {

    	FXMLLoader fxmlloader= new FXMLLoader (getClass().getResource("SaveBox2.fxml"));
    	boolean condicion=true;
    	String dig1=txtField1.getText();
    	String dig2=txtField2.getText();
    	String dig3=txtField3.getText();
    	String dig4=txtField4.getText();
    	String dig5=txtField5.getText();
    	String dig6=txtField6.getText();
    	condicion=seguridad.comprobacion(dig1,dig2,dig3,dig4,dig5,dig6);
    	if(condicion) {
        	fxmlloader.setController(this);
        	Parent root= fxmlloader.load();
        	Scene scene= new Scene (root);
    		mainStage.setScene(scene);
        	mainStage.setTitle("window2");
    		mainStage.show();
    	}
    	else {
    		lbMessg.setTextFill(Color.TOMATO);
        	lbMessg.setText("La combinacion es incorrecta");
    	}
    }
    
    @FXML
    public void switchToWindow3(ActionEvent event) throws IOException {
    	FXMLLoader fxmlloader= new FXMLLoader (getClass().getResource("SaveBox3.fxml"));
    	fxmlloader.setController(this);
    	Parent root=fxmlloader.load();
    	Scene scene= new Scene (root);
    	mainStage.setScene(scene);
    	mainStage.setTitle("Window3");
    	mainStage.show();
    }
    
    @FXML
    public void switchToWindow1(ActionEvent event) throws IOException {
    	FXMLLoader fxmlloader= new FXMLLoader (getClass().getResource("SaveBox1.fxml"));
    	fxmlloader.setController(this);
    	Parent root=fxmlloader.load();
    	Scene scene= new Scene (root);
    	mainStage.setScene(scene);
    	mainStage.setTitle("Window1");
    	mainStage.show();
    }
    
    @FXML
    public void changePass(ActionEvent event) {
    	String currentPass=txtField7.getText()+txtField8.getText()+txtField9.getText()+txtField10.getText()+txtField11.getText()+txtField12.getText();
    	String newPass=txtField13.getText()+txtField14.getText()+txtField15.getText()+txtField16.getText()+txtField17.getText()+txtField18.getText();
    	
    	lbMessg2.setText(seguridad.changePassword(currentPass,newPass));
    }
    
    

	

}
