import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimpleCalc extends Application {
    @Override
    public void start(Stage stage) {
        UI ui = new UI();
        Layout layout = new Layout(ui);
        Events events = new Events(ui);

        events.addEvents();
        Scene scene = new Scene(layout.getGrid(), 350, 200);
        stage.setTitle("Simple Calculator");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
