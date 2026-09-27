package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class Controller {
	@FXML
	private Rectangle rectangle;
	private double x;
	private double y;
	
	
	public void Haut(ActionEvent e) {
		System.out.println("Haut");
		rectangle.setY(y -= 10);
	}
	
	public void Bas(ActionEvent e) {
		System.out.println("Bas");
		rectangle.setY(y += 10);
	}

	public void Gauche(ActionEvent e) {
		System.out.println("Gauche");
		rectangle.setX(x -= 10); 
	}
	
	public void Droite(ActionEvent e) { 
		System.out.println("Droite");
		rectangle.setX(x += 10);
	}

}
