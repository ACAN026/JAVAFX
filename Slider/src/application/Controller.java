package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Controller {
	
	@FXML
	private Label label;
	@FXML
	private Slider slider;
	
	
	public void initialize() {
		
		slider.valueProperty().addListener((obs,oldValue,newValue)->{
			label.setText(newValue.intValue()+ "°"); 
			});
	}
	
}
