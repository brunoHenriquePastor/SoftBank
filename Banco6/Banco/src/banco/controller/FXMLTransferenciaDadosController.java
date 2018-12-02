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

/**
 * FXML Controller class
 *
 * @author range
 */
public class FXMLTransferenciaDadosController implements Initializable {

    @FXML
    private Label lable_transf_dados_favorecido;

    @FXML
    private Label lable_transf_dados_nome;

    @FXML
    private Label lable_transf_dados_servico;

    @FXML
    private Label lable_transf_dados_conta;

    @FXML
    private Label lable_transf_dados_valor;

    @FXML
    private Button btn_transf_dados_confirmar;

    @FXML
    private Button btn_transf_dados_cancelar;

    @FXML
    void cancelar_transferencia(ActionEvent event) {
         Banco.trocaTelas(Banco.GERENCIA_CONTA_ID);
    }

    @FXML
    void confirmar_dados(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
