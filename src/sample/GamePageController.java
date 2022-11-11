package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class GamePageController {

    @FXML
    public void start(MouseEvent event) throws IOException {
        StackPane pane = new StackPane();
        AnchorPane start = new AnchorPane();
        start = FXMLLoader.load(getClass().getResource("StartGame.fxml"));

        Main.root1.getChildren().setAll(start);
    }
}
