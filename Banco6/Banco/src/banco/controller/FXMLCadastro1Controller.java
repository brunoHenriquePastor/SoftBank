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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author range
 */
public class FXMLCadastro1Controller implements Initializable {

   @FXML
    private Button btn_cad_finalizar;

    @FXML
    private Label lable_cad_senha;

    @FXML
    private Label lable_cad_confirmar;

    @FXML
    private Button btn_confirmarSenha;

    @FXML
    private PasswordField textField_cad_senha;

    @FXML
    private Label lable_cad_erro;

    @FXML
    private PasswordField textField_cad_confirmar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
