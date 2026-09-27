package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class Controller implements Initializable{
	
	@FXML
	private TreeView<String> treeView;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		TreeItem<String> root = new TreeItem<>("Bilgisayar");
		
		TreeItem<String> desktop = new TreeItem<>("Masaustu");
		TreeItem<String> documents = new TreeItem<>("Belgeler");
		TreeItem<String> downloads = new TreeItem<>("Indirilenler");
		
		
		TreeItem<String> alt1 = new TreeItem<>("videolar");
		TreeItem<String> alt2 = new TreeItem<>("resimler");
		
		root.getChildren().addAll(desktop,documents,downloads);
		
		downloads.getChildren().addAll(alt1,alt2);
		
		treeView.setRoot(root);
		root.setExpanded(true);
	
		treeView.getSelectionModel().selectedItemProperty().addListener((o,old,neww)->{
			System.out.println(neww.getValue());
		});
	}
	
	
}
