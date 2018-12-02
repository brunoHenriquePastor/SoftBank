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

/**
 * FXML Controller class
 *
 * @author range
 */
public class FXMLTransferenciaController implements Initializable {

     @FXML
    private Button btn_tranferencia_cc_cp;

    @FXML
    private Button btn_tranferencia_cc_cc;

    @FXML
    private Button btn_tranferencia_cancelar;

    @FXML
    private Button btn_tranferencia_cp_cc;

    @FXML
    private Button btn_tranferencia_cp_cp;

    @FXML
    void cancelar(ActionEvent event) {
        Banco.trocaTelas(Banco.GERENCIA_CONTA_ID);
    }
    
    @FXML
    void transferenciaCC(ActionEvent event) {
        Banco.trocaTelas(Banco.TRANSFERENCIA_CC_ID);
    }

    @FXML
    void transferenciaCP(ActionEvent event) {
       Banco.trocaTelas(Banco.TRANSFERENCIA_CP_ID);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
