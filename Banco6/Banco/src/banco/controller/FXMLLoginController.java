
package banco.controller;

import banco.Banco;
import banco.model.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLLoginController implements Initializable {

    
    @FXML
    private Label labell_usuario;

    @FXML
    private Label lable_senha;

    @FXML
    private TextField textField_usuario;

    @FXML
    private TextField textField_senha;

    @FXML
    private Button btn_entrar;

    @FXML
    void gerenciaConta(ActionEvent event) {
        int numConta=Integer.parseInt(textField_usuario.getText());
        long u = Long.parseLong(textField_senha.getText());
        System.out.println(numConta);
        long senha = Agencia.RetornUsu(numConta);
         System.out.println(senha);
        if(u == senha){
            Banco.trocaTelas(Banco.GERENCIA_CONTA_ID);
        }
        else{
        }
            
         Banco.LOGADO = true;
         Banco.trocaTelas(Banco.GERENCIA_CONTA_ID);
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
