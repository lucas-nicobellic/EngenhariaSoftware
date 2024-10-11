import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {

    @FXML
    private Button botaologin;

    @FXML
    private TextField camposenha;

    @FXML
    private TextField campousuario;

    @FXML
    private Text esqueceusenha;

    @FXML
    void fazerlogin(ActionEvent event) {
        String usuario = campousuario.getText();
        String senha = camposenha.getText();

        if(usuario.equals("lucasvalente") && senha.equals("400298239")){
           
        }else { 
            System.out.println("Seu usuário ou senha está errada.");
    }

}
}

//git config --global user.email "you@example.com"
//git config --global user.name "Your Name"