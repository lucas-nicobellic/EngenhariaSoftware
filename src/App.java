import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
       Parent root = fxmlLoader.load();
       Scene tela = new Scene(root);

       primaryStage.setTitle("Controle de estoque"); // titulo da janela
       primaryStage.setScene(tela);
       primaryStage.show();
    }
}