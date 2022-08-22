package controlador;

import Modelo.Operaciones;
import Modelo.Operaciones2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

//Atributos
public class Control implements Initializable {
    @FXML
    private Button btnOperaciones1;

    @FXML
    private Button btnOperaciones2;

    @FXML
    private CheckBox cbOpen1;

    @FXML
    private CheckBox cbOpen2;

    @FXML
    private RadioButton rbBase2;

    @FXML
    private RadioButton rbDividir;

    @FXML
    private RadioButton rbMultiplicar;

    @FXML
    private RadioButton rbPorcentaje;

    @FXML
    private RadioButton rbPotencia;

    @FXML
    private RadioButton rbRaizCuadrada;

    @FXML
    private RadioButton rbRestar;

    @FXML
    private RadioButton rbSumar;

    @FXML
    private TextField txtOpe01;

    @FXML
    private TextField txtOpe02;

    @FXML
    private TextField txtOpe03;

    @FXML
    private TextField txtOpe04;

    @FXML
    private TextField txtResultado;

    @FXML
    void onOpen1(ActionEvent event) {

    }

    @FXML
    void onOpen2(ActionEvent event) {

    }

    public void onOperacion1(ActionEvent event) {
        try {
            int op1 = Integer.parseInt(this.txtOpe01.getText());
            int op2 = Integer.parseInt(this.txtOpe02.getText());
            Operaciones opera = new Operaciones(op1, op2);
            //Seleccion de acuerdo al radio button seleccionado
            if (this.rbSumar.isSelected()) {
                this.txtResultado.setText(opera.sumar() + "");
            }
            if (this.rbRestar.isSelected()) {
                this.txtResultado.setText(opera.restar() + "");
            }
            if (this.rbMultiplicar.isSelected()) {
                this.txtResultado.setText(opera.Multiplicar() + "");
            }
            if (this.rbDividir.isSelected()) {
                this.txtResultado.setText(opera.Dividir() + "");
            }
        } catch (NumberFormatException e) {
            Alert Alerta = new Alert(Alert.AlertType.ERROR);
            Alerta.setHeaderText(null);
            Alerta.setTitle("Error");
            Alerta.setContentText("Formato ingresado es erroneo");
            Alerta.showAndWait();
        }
    }
    @FXML
    void onOperacion2(ActionEvent event) {
        try {
            int op1 = Integer.parseInt(this.txtOpe03.getText());
            int op2 = Integer.parseInt(this.txtOpe04.getText());
            Operaciones2 opera = new Operaciones2(op1, op2);
            //Seleccion de acuerdo al radio button seleccionado
            if (this.rbPotencia.isSelected()) {
                this.txtResultado.setText(opera.potencia() + "");
            }
            if (this.rbPorcentaje.isSelected()) {
                this.txtResultado.setText(opera.porcentaje() + "");
            }
            if (this.rbRaizCuadrada.isSelected()) {
                this.txtResultado.setText(opera.raizcuadrada() + "");
            }
            if (this.rbBase2.isSelected()) {
                this.txtResultado.setText(opera.base2() + "");
            }
        } catch (NumberFormatException e) {
            Alert Alerta = new Alert(Alert.AlertType.ERROR);
            Alerta.setHeaderText(null);
            Alerta.setTitle("Error");
            Alerta.setContentText("Formato ingresado es erroneo");
            Alerta.showAndWait();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup tg = new ToggleGroup();
        this.rbSumar.setToggleGroup(tg);
        this.rbRestar.setToggleGroup(tg);
        this.rbMultiplicar.setToggleGroup(tg);
        this.rbDividir.setToggleGroup(tg);
        this.rbPotencia.setToggleGroup(tg);
        this.rbPorcentaje.setToggleGroup(tg);
        this.rbBase2.setToggleGroup(tg);
        this.rbRaizCuadrada.setToggleGroup(tg);
    }
}


