package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
	
	@FXML
	private Button buton;
	@FXML
	private Label label;
	@FXML
	private ChoiceBox<String> box;
	@FXML
	private TextField text;
	
	
	ObservableList<String> dil = FXCollections.observableArrayList("Java","JavaFX","C++");
	
	@FXML
	public void initialize() {
		box.setItems(dil);
		box.setValue("Java");
		
		label.textProperty().bind(box.getSelectionModel().selectedItemProperty().asString("Secilen: %s"));
		
		/***box.getSelectionModel().selectedItemProperty().addListener((obs,oldValue,newValue)->{
			label.setText("Secilen: " + newValue);
		});**/
	}
	@FXML
	private void ekle() {
		String yeni = text.getText();
		if(!yeni.isEmpty()) {
			dil.add(yeni);
			text.clear();
		}
	}
}
