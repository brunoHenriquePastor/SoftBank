/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.controller;

import java.net.URL;
import java.util.ResourceBundle;
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
public class FXMLSaque2Controller implements Initializable {

    
    @FXML
    private Label lable_saque_valor;

    @FXML
    private Button btn_confirmarSaque;

    @FXML
    private Label lable_saque_erro;

    @FXML
    private TextField textField_saque_valor;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
