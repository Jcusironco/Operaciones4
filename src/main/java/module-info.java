module controlador.operaciones4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens controlador to javafx.fxml;
    exports controlador;
}