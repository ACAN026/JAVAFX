package application;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;

public class Controller {

	@FXML
	private ColorPicker colorPicker;
	@FXML
	private Canvas canvas;
	
	GraphicsContext gc;
	
	public void cizim() {
		gc = canvas.getGraphicsContext2D();
		gc.setLineWidth(4);
		gc.setStroke(colorPicker.getValue());
		
		colorPicker.setOnAction(e -> gc.setStroke(colorPicker.getValue()));
		
		canvas.setOnMousePressed(this::tiklama);
		canvas.setOnMouseDragged(this::surukleme);
	}
	
	private void tiklama(MouseEvent e) {
		gc.beginPath();
		gc.moveTo(e.getX(), e.getY());
		gc.stroke();
	}
	
	private void surukleme(MouseEvent e) {
		gc.lineTo(e.getX(), e.getY());
		gc.stroke();
	}

}
