import javafx.scene.control.*;

public class UI {
    TextField num1 = new TextField();
    TextField num2 = new TextField();
    TextField result = new TextField();

    Button calcBtn = new Button("calculate");
    Button clearBtn = new Button("clear");

    Label l1 = new Label("Number 1:");
    Label l2 = new Label("Number 2:");
    Label l3 = new Label("Result:");

    public UI() {
        result.setEditable(false);
    }
}
