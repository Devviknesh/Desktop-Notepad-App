import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Notepad extends Application {
    @Override
    public void start(Stage stage) {
        TextArea textArea = new TextArea();
        VBox root = new VBox(textArea);
        Scene scene = new Scene(root, 500, 400);
        stage.setTitle("Notepad");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
