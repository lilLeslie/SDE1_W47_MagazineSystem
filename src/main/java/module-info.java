module dk.sea.magazinesystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.sea.magazinesystem to javafx.fxml;
    exports dk.sea.magazinesystem;
}