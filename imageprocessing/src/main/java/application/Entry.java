package application;


import org.opencv.core.Core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Entry extends Application{
	
	static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME);}
	public static void main(String[] args) {
		launch(args);
	}		
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/gui/FXgui.fxml"));
	    
        Scene scene = new Scene(root, 1048, 762);
    
        stage.setTitle("Open CV learning");
        stage.setScene(scene);
        stage.show();
		
	}
}
