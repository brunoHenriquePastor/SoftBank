/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.controller;

import banco.Banco;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDepositoCPController implements Initializable {

    @FXML
    private Label lable_conta_cp;

    @FXML
    private Label lable_agencia_cp;

    @FXML
    private Label lable_variacao_cp;

    @FXML
    private Label lable_valor_cp;

    @FXML
    private TextField textField_contac_cp;

    @FXML
    private TextField textField_agencia_cp;

    @FXML
    private TextField textField_variacao_cp;

    @FXML
    private TextField textField_valor_cp;

    @FXML
    private Button btn_confirmar_cp;

    @FXML
    void confirmar_deposito_cp(ActionEvent event) {
         Banco.trocaTelas(Banco.DEPOSITO_DADOS_ID);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
