package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	private ImageView image;
	@FXML
	private CheckBox cb;
	
	Image resim1 = new Image(getClass().getResourceAsStream("/templates/tbm-logo.png"));
	Image resim2 = new Image(getClass().getResourceAsStream("/templates/autract-logo.png"));

	public void degistir(ActionEvent event) {
		
		Stage stage = (Stage) image.getScene().getWindow();
		
		if(cb.isSelected()) {
			
			image.setImage(resim2);
			
			stage.getIcons().clear();
			stage.getIcons().add(resim2);
			
		}
		else {
			image.setImage(resim1);
			stage.getIcons().clear();
			stage.getIcons().add(resim1);
		}
	}
}
