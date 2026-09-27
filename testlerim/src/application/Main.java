package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		primaryStage.setOnCloseRequest(e -> {
			Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Cikmak Istiyormusunuz", ButtonType.YES, ButtonType.NO);
			alert.setTitle("Cikis");
			alert.setHeaderText("Cikis islemi yapiliyor");
			if(alert.showAndWait().get()==ButtonType.NO) {
				e.consume();			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
