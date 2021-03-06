package main;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Marking;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		
		
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("/view/fxml/MainScreen.fxml"));
			Scene scene = new Scene(root,1000,300);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
}
