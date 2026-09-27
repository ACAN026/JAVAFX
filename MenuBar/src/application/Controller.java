package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	private AnchorPane contenu;
	
	@FXML
	public void nouveau(ActionEvent event) {

        System.out.println("Tu as appuye sur NEW");

        // MenuItem'ten ana pencereyi bul
        MenuItem item = (MenuItem) event.getSource();
        Stage primaryStage = (Stage) item.getParentPopup().getOwnerWindow();

        // Main.fxml'deki ana AnchorPane'i al
        AnchorPane root = (AnchorPane) primaryStage.getScene().getRoot();

        // MenuBar'ı bul
        MenuBar menuBar = (MenuBar) root.lookup(".menu-bar");

        // MenuBar HARİÇ diğer her şeyi sil
        root.getChildren().removeIf(node -> node != menuBar);

        // Yeni içerik
        Label texte = new Label("Tu es dans la page NEW");

        texte.setLayoutX(50);
        texte.setLayoutY(80);

        // Ana pencereye ekle
        root.getChildren().add(texte);
	}
	
	
	@FXML
	public void sauvegarder(ActionEvent event) {
		System.out.println("Tu as appuye sur Save");
		
		// MenuItem'ten ana pencereyi bul
        MenuItem item = (MenuItem) event.getSource();
        Stage primaryStage = (Stage) item.getParentPopup().getOwnerWindow();

        // Main.fxml'deki ana AnchorPane'i al
        AnchorPane root = (AnchorPane) primaryStage.getScene().getRoot();

        // MenuBar'ı bul
        MenuBar menuBar = (MenuBar) root.lookup(".menu-bar");

        // MenuBar HARİÇ diğer her şeyi sil
        root.getChildren().removeIf(node -> node != menuBar);

        // Yeni içerik
        Label texte = new Label("Tu es dans la page save");

        texte.setLayoutX(50);
        texte.setLayoutY(80);

        // Ana pencereye ekle
        root.getChildren().add(texte);
	}
	
	@FXML
	public void supprimer(ActionEvent event) {
		System.out.println("Tu as appuyer sur DELETE");
	}
	@FXML
	public void edit(ActionEvent event) {
		System.out.println("Tu as appuyer sur Edit");
	}
	@FXML
	public void Help(ActionEvent event) {
		System.out.println("Tu as appuyer sur Help");
	}
	@FXML
    public void about(ActionEvent event) {

        Alert message = new Alert(Alert.AlertType.INFORMATION);

        message.setTitle("About");
        message.setHeaderText("Mon programme JavaFX");
        message.setContentText("Bonjour ! Ceci est mon premier menu.");

        message.show();
    }

    @FXML
    public void fermer(ActionEvent event) {
        System.exit(0);
    }
	
}
