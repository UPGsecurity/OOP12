public class Events {
    UI ui;
    public Events(UI ui) {
        this.ui = ui;
    }
    public void addEvents() {

        ui.calcBtn.setOnAction(e -> {
            try {
                double a = Double.parseDouble(ui.num1.getText());
                double b = Double.parseDouble(ui.num2.getText());

                double res = Calc.add(a, b);
                ui.result.setText(Format.make(res));
            } catch (Exception ex) {
                ui.result.setText("Invalid input!");
            }
        });

        ui.clearBtn.setOnAction(e -> {
            ui.num1.clear();
            ui.num2.clear();
            ui.result.clear();
        });
    }
}
