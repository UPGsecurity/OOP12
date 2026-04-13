import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class Layout {
    GridPane grid = new GridPane();
    public Layout(UI ui) {
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));
        grid.setAlignment(Pos.CENTER);

        grid.add(ui.l1, 0, 0);
        grid.add(ui.num1, 1, 0);

        grid.add(ui.l2, 0, 1);
        grid.add(ui.num2, 1, 1);

        grid.add(ui.calcBtn, 0, 2);
        grid.add(ui.clearBtn, 1, 2);

        grid.add(ui.l3, 0, 3);
        grid.add(ui.result, 1, 3);
    }

    public GridPane getGrid() {
        return grid;
    }
}
