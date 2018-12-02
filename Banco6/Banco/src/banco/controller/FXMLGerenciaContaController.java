/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.controller;

import banco.Banco;
import banco.model.Agencia;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author range
 */
public class FXMLGerenciaContaController implements Initializable {

    
    @FXML
    private Button btn_ger_saque;

    @FXML
    private Button btn_ger_transferencia;

    @FXML
    private Button btn_ger_extrato;

    @FXML
    private Button btn_ger_deposito;

    @FXML
    private Button btn_ger_saldo;

    @FXML
    private Button btn_ger_encerrar;

    @FXML
    void deposito(ActionEvent event) {
        Banco.trocaTelas(Banco.DEPOSITO_ID);
    }

    @FXML
    void encerrar(ActionEvent event) {
        Banco.LOGADO = false;
        Agencia.getInstance().saveInstance();
        Banco.trocaTelas(Banco.TELA_INICIAL_ID);
    }

    @FXML
    void extrato(ActionEvent event) {
        Banco.trocaTelas(Banco.TELA_INICIAL_ID);
    }

    @FXML
    void sacar(ActionEvent event) {
        Banco.trocaTelas(Banco.SAQUE_1_ID);
    }

    
    @FXML
    void saldo(ActionEvent event) {
        Banco.trocaTelas(Banco.SALDO_ID);
    }

    @FXML
    void tranferencia(ActionEvent event) {
        Banco.trocaTelas(Banco.TRANSFERENCIA_ID);
    } 
    
     

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
