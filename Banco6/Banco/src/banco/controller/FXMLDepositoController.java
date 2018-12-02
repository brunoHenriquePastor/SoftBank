
package banco.controller;

import banco.Banco;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FXMLDepositoController implements Initializable {

    @FXML
    private Button btn_depositoCC;

    @FXML
    private Button btn_depositoCP;

    @FXML
    void depositoCC(ActionEvent event) {
        Banco.trocaTelas(Banco.DEPOSITO_CC_ID);
    }

    @FXML
    void depositoCP(ActionEvent event) {
        Banco.trocaTelas(Banco.DEPOSITO_CP_ID);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
