
package banco.controller;

import banco.Banco;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLTelaInicialController implements Initializable {
    
     @FXML
    private Button btn_cadastro;

    @FXML
    private Button btn_login;

    @FXML
    private Button btn_deposito;

    @FXML
    void cadastrar(ActionEvent event) {
         Banco.trocaTelas(Banco.CADASTRO_ID);
    }

    @FXML
    void deposito(ActionEvent event) {
         Banco.trocaTelas(Banco.DEPOSITO_ID);
    }

    @FXML
    void login(ActionEvent event) {
         Banco.trocaTelas(Banco.LOGIN_ID);
    }
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
