package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
	
	@FXML 
	private RadioButton radio;
	@FXML
	private Label label;
	@FXML
	private DatePicker date;
	
	@FXML
	public void kontrol(ActionEvent event) {
		date.setVisible(radio.isSelected());
	}
	
	@FXML
	public void tarihSec(ActionEvent event) {
		LocalDate secilenTarih = date.getValue();
		
		if(secilenTarih != null) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			label.setText(secilenTarih.format(formatter));
		}
	}

}
