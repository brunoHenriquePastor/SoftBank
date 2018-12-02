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


public class FXMLSaque1Controller implements Initializable {

    @FXML
    private Button btn_saqueCC;

    @FXML
    private Button btn_saqueCP;

    @FXML
    private Button btn_saque_voltar;
    
    @FXML
    void saqueCC(ActionEvent event) {
         Banco.trocaTelas(Banco.SAQUE_2_ID);

    }

    @FXML
    void saqueCP(ActionEvent event) {
        
         Banco.trocaTelas(Banco.SAQUE_2_ID);

    }

    @FXML
    void voltar(ActionEvent event) {
        
         Banco.trocaTelas(Banco.GERENCIA_CONTA_ID);

    }
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
