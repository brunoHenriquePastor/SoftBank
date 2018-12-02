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
public class FXMLTransferenciaCPController implements Initializable {

    @FXML
    private Label lable_transferenciaCP_conta;

    @FXML
    private Label lable_transferenciaCP_agencia;

    @FXML
    private Label lable_transferenciaCP_variação;

    @FXML
    private Label lable_transferenciaCP_valor;

    @FXML
    private TextField textField_contac_cp;

    @FXML
    private TextField textField_agencia_cp;

    @FXML
    private TextField textField_variacao_cp;

    @FXML
    private TextField textField_valor_cp;

    @FXML
    private Button btn_transferenciaCP_confirmar;

    @FXML
    private Label lable_transferenciaCP_erro;

    @FXML
    void confirmar_transferenica_cp(ActionEvent event) {
       Banco.trocaTelas(Banco.TRANSFERENCIA_DADOS_ID);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
