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
      // davom etiriladi 

     
