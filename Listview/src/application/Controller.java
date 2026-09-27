package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class Controller implements Initializable{
	
	@FXML
	private Label label;
	@FXML
	private ListView <String> list;
	
	String[] meyveler = {"Elma", "kavun", "Cilek", "Karpuz"};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		list.getItems().addAll(meyveler);
		list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String oldValue, String newValue) {
				
				label.setText(newValue);
				
			}
		});
		
	}
	
	
}
