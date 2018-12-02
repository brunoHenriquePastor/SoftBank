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
public class FXMLDepositoDadosController implements Initializable {

    @FXML
    private Label lable_dep_dados_favorecido;

    @FXML
    private Label lable_dep_dados_nome;

    @FXML
    private Label lable_dep_dados_servico;

    @FXML
    private Label lable_dep_dados_conta;

    @FXML
    private Label lable_dep_dados_valor;

    @FXML
    private Button btn_dep_dados_confirmar;

    @FXML
    private Button btn_dep_dados_cancelar;

    @FXML
    void cancelar_deposito(ActionEvent event) {
        
        if(Banco.LOGADO == true)
            Banco.trocaTelas(Banco.GERENCIA_CONTA_ID);
        else
            Banco.trocaTelas(Banco.TELA_INICIAL_ID);
    }

    @FXML
    void confirmar_dados_dep(ActionEvent event) {
        if(Banco.LOGADO == true)
            Banco.trocaTelas(Banco.GERENCIA_CONTA_ID);
        else
            Banco.trocaTelas(Banco.TELA_INICIAL_ID);
    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
