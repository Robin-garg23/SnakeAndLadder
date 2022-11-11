package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class gamePage {
    public AnchorPane root;
    gamePage() throws IOException {
        root = FXMLLoader.load(getClass().getResource("GamePage.fxml"));
    }
}
