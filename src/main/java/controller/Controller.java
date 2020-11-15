package controller;

import java.io.IOException;
import java.net.URL;

import calculadora.Calculadora;
//import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller {

	/* ¿Es necesario?
    @FXML
    private ResourceBundle resources;
    */
	
	public Controller()
	{
		try {
			initialize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Calculadora calc;
	
    @FXML
    private URL location;

    @FXML
    private GridPane root;

    @FXML
    private TextField tf_display;

    @FXML
    private Button bt_7;

    @FXML
    private Button bt_8;

    @FXML
    private Button bt_9;

    @FXML
    private Button bt_5;

    @FXML
    private Button bt_4;

    @FXML
    private Button bt_ce;

    @FXML
    private Button bt_c;

    @FXML
    private Button bt_6;

    @FXML
    private Button bt_mult;

    @FXML
    private Button bt_1;

    @FXML
    private Button bt_2;

    @FXML
    private Button bt_3;

    @FXML
    private Button bt_minus;

    @FXML
    private Button bt_div;

    @FXML
    private Button bt_0;

    @FXML
    private Button bt_point;

    @FXML
    private Button bt_plus;

    @FXML
    private Button bt_calc;

    @FXML
    void press_0(ActionEvent event) {
    	calc.insertar('0');
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_1(ActionEvent event) {
    	calc.insertar('1');
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_2(ActionEvent event) {
    	calc.insertar('2');
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_3(ActionEvent event) {
    	calc.insertar('3');
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_4(ActionEvent event) {
    	calc.insertar('4');
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_5(ActionEvent event) {
    	calc.insertar('5');
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_6(ActionEvent event) {
    	calc.insertar('6');
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_7(ActionEvent event) {
    	calc.insertar('7');
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_8(ActionEvent event) {
    	calc.insertar('8');
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_9(ActionEvent event) {
    	calc.insertar('9');
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_c(ActionEvent event) {
    	calc.borrarTodo();
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_calc(ActionEvent event) {
    	calc.operar(Calculadora.IGUAL);
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_ce(ActionEvent event) {
    	calc.borrar();
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_div(ActionEvent event) {
    	calc.operar(Calculadora.DIVIDIR);
    }

    @FXML
    void press_minus(ActionEvent event) {
    	calc.operar(Calculadora.RESTAR);
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_mult(ActionEvent event) {
    	calc.operar(Calculadora.MULTIPLICAR);
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_plus(ActionEvent event) {
    	calc.operar(Calculadora.SUMAR);
    	tf_display.setText(calc.getPantalla());
    }

    @FXML
    void press_point(ActionEvent event) {
    	calc.insertar('.');;
    	tf_display.setText(calc.getPantalla());
    }
    
    public Parent get_view()
    {
    	return root;
    }

    @FXML
    void initialize() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/calculadora.fxml"));
    	loader.setController(this);
    	loader.load();
    	
    	calc = new Calculadora();
    	
        assert root != null : "fx:id=\"root\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert tf_display != null : "fx:id=\"tf_display\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_7 != null : "fx:id=\"bt_7\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_8 != null : "fx:id=\"bt_8\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_9 != null : "fx:id=\"bt_9\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_5 != null : "fx:id=\"bt_5\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_4 != null : "fx:id=\"bt_4\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_ce != null : "fx:id=\"bt_ce\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_c != null : "fx:id=\"bt_c\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_6 != null : "fx:id=\"bt_6\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_mult != null : "fx:id=\"bt_mult\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_1 != null : "fx:id=\"bt_1\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_2 != null : "fx:id=\"bt_2\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_3 != null : "fx:id=\"bt_3\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_minus != null : "fx:id=\"bt_minus\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_div != null : "fx:id=\"bt_div\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_0 != null : "fx:id=\"bt_0\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_point != null : "fx:id=\"bt_point\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_plus != null : "fx:id=\"bt_plus\" was not injected: check your FXML file 'calculadora.fxml'.";
        assert bt_calc != null : "fx:id=\"bt_calc\" was not injected: check your FXML file 'calculadora.fxml'.";

    }
}
