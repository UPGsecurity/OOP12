import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class MouseCoords extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Move mouse over pane");

        StackPane pane = new StackPane();
        pane.setPrefSize(400, 300);
        pane.setStyle("-fx-background-color: lightblue;");

        pane.setOnMouseMoved(e -> {
            double x = e.getX();
            double y = e.getY();
            label.setText("X: " + x + " Y: " + y);
        });

        pane.setOnMouseClicked(e -> {
            int r = (int)(Math.random() * 256);
            int g = (int)(Math.random() * 256);
            int b = (int)(Math.random() * 256);

            pane.setStyle(String.format(
                    "-fx-background-color: rgb(%d,%d,%d);", r, g, b
            ));
        });

        pane.setOnMouseExited(e -> {
            label.setText("Move mouse over pane");
        });

        BorderPane root = new BorderPane();
        root.setCenter(pane);
        root.setBottom(label);

        Scene scene = new Scene(root, 400, 320);
        primaryStage.setTitle("Mouse coordinates");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
