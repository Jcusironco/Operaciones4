package controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Principal extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("/Vista/VistaOperacion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Operaciones Basicas");
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/controlador/CSS/estilos.css").toExternalForm());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}