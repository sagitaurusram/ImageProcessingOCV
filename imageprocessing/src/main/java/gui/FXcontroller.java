package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FXcontroller {
	@FXML
	private Button loadImage;

	@FXML
	private Button filterImage;

	@FXML
	private ImageView imageFrame;

	@FXML
	public void loadImage() {
		this.imageFrame.setImage(new Image("/images/colourWheel.jpg"));
	}

	@FXML
	public void filterImage() {

	}
}
