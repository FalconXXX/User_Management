package application;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainView
{
    private Stage stage;
    public MainView()
    {
        buildUI();

    }
    private void buildUI()    {
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 320, 240);
        stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("User Management");
        stage.setScene(scene);
        stage.show();
    }
}

