package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
	@FXML
	private Button buton;
	@FXML
	private Label label;
	@FXML
	private TextField text;
	
	int yas;
	
	public void kontrol(ActionEvent event) {
		try {
			yas = Integer.parseInt(text.getText());	
			
			if (yas >= 18) {
				label.setText("Hos Geldiniz");
			}
			else {
				label.setText("Yasiniz  kucuk");
			}
		}
		catch (NumberFormatException e1) {
			label.setText("lutfen sayi giriniz");
		}
		catch (Exception e) {
			label.setText("Hata");
		}
		
	}
}
