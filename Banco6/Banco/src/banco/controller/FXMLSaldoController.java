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


public class FXMLSaldoController implements Initializable {
    
    @FXML
    private Label lable_saldo_CC;

    @FXML
    private Label lable_saldoPositivo;

    @FXML
    private Label lable_saldoNegativo;

    @FXML
    private Label label_saldoTotalCC;

    @FXML
    private Label lable_SaldoPositivo_valor;

    @FXML
    private Label lable_saldoTotalCC_valor;

    @FXML
    private Label lable_saldoNegativo_valor;

    @FXML
    private Label lable_saldo_CP;

    @FXML
    private Label label_saldoTotalCP;

    @FXML
    private Label label_saldoTotalCP_valor;

    @FXML
    private Button btn_saldo_cancelar;

    @FXML
    private Button btn_saldo_sacar;

    @FXML
    void cancelar(ActionEvent event) {
        Banco.trocaTelas(Banco.GERENCIA_CONTA_ID);
    }

    @FXML
    void sacar(ActionEvent event) {
        Banco.trocaTelas(Banco.SAQUE_1_ID);
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
