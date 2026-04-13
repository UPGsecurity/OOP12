import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class KeyboardMove extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        pane.setPrefSize(500, 400);
        Rectangle rect = new Rectangle(60, 40, Color.BLUE);
        rect.setX(220);
        rect.setY(180);

        pane.getChildren().add(rect);

        TextField position = new TextField("X: 220 Y: 180");
        position.setEditable(false);

        BorderPane root = new BorderPane();
        root.setCenter(pane);
        root.setBottom(position);
        Scene scene = new Scene(root, 500, 420);
        scene.setOnKeyPressed(e -> {
            double x = rect.getX();
            double y = rect.getY();

            if (e.getCode() == KeyCode.UP) {
                y -= 10;
            } else if (e.getCode() == KeyCode.DOWN) {
                y += 10;
            } else if (e.getCode() == KeyCode.LEFT) {
                x -= 10;
            } else if (e.getCode() == KeyCode.RIGHT) {
                x += 10;
            }
            if (x < 0) x = 0;
            if (x > 500 - 60) x = 500 - 60;

            if (y < 0) y = 0;
            if (y > 400 - 40) y = 400 - 40;

            rect.setX(x);
            rect.setY(y);
            position.setText("X: " + (int)x + " Y: " + (int)y);
        });
        root.requestFocus(); // get focus

        stage.setTitle("Keyboard Move");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
