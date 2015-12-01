package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class FXcontroller {
@FXML
private Button loadImage;

@FXML
private Button filterImage;

@FXML
private ImageView imageFrame;

@FXML
public void loadImage(){
	System.out.println("load image button pressed");
}
@FXML
public void filterImage(){
	
}
}
