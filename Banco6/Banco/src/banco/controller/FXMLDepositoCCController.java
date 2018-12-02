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

/**
 * FXML Controller class
 *
 * @author range
 */
public class FXMLDepositoCCController implements Initializable {

     @FXML
    private Label lable_conta_cc;

    @FXML
    private Label lable_agencia_cc;

    @FXML
    private Label lable_valor_cc;

    @FXML
    private TextField textField_conta_cc;

    @FXML
    private TextField textField_agencia_cc;

    @FXML
    private TextField textField_valor_cc;

    @FXML
    private Button btn_confirmar_cc;

    @FXML
    void confirmar_deposito_cc(ActionEvent event) {
        Banco.trocaTelas(Banco.DEPOSITO_DADOS_ID);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
