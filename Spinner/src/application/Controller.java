package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Controller {
	
	@FXML
	private Label label;
	@FXML
	private Spinner<Integer> spinner;
	
	
	@FXML
	private void initialize() {
		
		spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0, 1));
		/**spinner.valueProperty().addListener((obs,oldV,newV)->{
			label.setText(String.valueOf(newV));
		});*/
		label.textProperty().bind(spinner.valueProperty().asString());
	}
}
