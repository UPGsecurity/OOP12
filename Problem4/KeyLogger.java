import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class KeyLogger extends Application {
    @Override
    public void start(Stage stage) {

        TextField input = new TextField();
        input.setPromptText("Type here...");
        TextArea log = new TextArea();
        log.setEditable(false);
        log.setPrefRowCount(5);
        Button clearBtn = new Button("Clear Log");
        clearBtn.setOnAction(e -> log.clear());
        input.setOnKeyPressed((KeyEvent e) -> {
            KeyCode code = e.getCode();

            boolean shift = e.isShiftDown();
            boolean ctrl = e.isControlDown();

            log.appendText(
                    "PRESSED | Code: " + code +
                    " | Shift: " + shift +
                    " | Ctrl: " + ctrl + "\n"
            );
        });
      input.setOnKeyReleased(e -> {
            KeyCode code = e.getCode();
            log.appendText("RELEASED | Code: " + code + "\n");
        });

        input.setOnKeyTyped(e -> {
            String ch = e.getCharacter();
            log.appendText("TYPED | Char: " + ch + "\n");
        });

        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20;");
        root.getChildren().addAll(input, log, clearBtn);

        Scene scene = new Scene(root, 420, 320);
        stage.setTitle("Key Logger");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

     
