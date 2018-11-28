package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// loading the fxml
		   Pane pane = FXMLLoader.load(getClass().getResource(
		     "notepad.fxml"));
		   		   
		   // creating and initializing the scene.
		   Scene scene = new Scene(pane);
		   primaryStage.setScene(scene);
		
		   // setting the height and width of stage.
		   primaryStage.setWidth(800);
		   primaryStage.setHeight(600);
		
		   // setting the App title
		   primaryStage.setTitle("Untitled - Notepad");
		
		   // display the stage
		   primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
