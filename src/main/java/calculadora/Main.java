package calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controller.Controller;

public class Main extends Application{
	private Controller controlador;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controlador = new Controller();
		
		Scene scene = new Scene(controlador.get_view());
		
		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
