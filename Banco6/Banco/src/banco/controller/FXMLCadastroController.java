
package banco.controller;

import banco.model.TextFieldFormatter;
import banco.Banco;
import banco.model.Agencia;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLCadastroController implements Initializable {

   
    @FXML
    private Label label_nome;

    @FXML
    private TextField textField_nome;

    @FXML
    private Label lable_cpf;

    @FXML
    private Label lable_identidade;

    @FXML
    private TextField textField_cpf;

    @FXML
    private TextField textField_identidade;

    @FXML
    private TextField textField_rua;

    @FXML
    private Label lable_rua;

    @FXML
    private Label lable_bairro;

    @FXML
    private Label lable_numero;

    @FXML
    private Label lable_complemento;

    @FXML
    private TextField textField_bairro;

    @FXML
    private TextField textField_numero;

    @FXML
    private TextField textField_complemento;

    @FXML
    private Button btn_cadastro_prox_1;
    
    @FXML
    public void mascaraCPF(KeyEvent event) {
        
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("###.###.###-##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(textField_cpf);
        tff.formatter();

    }
    

    @FXML
    void proximo_1(ActionEvent event) {
       String nome = textField_nome.getText() ;
       String cpf = textField_cpf.getText();
       String identidade = textField_identidade.getText();
       String rua = textField_rua.getText();
       String bairro = textField_bairro.getText();
       String numero = textField_numero.getText();
       String complemento = textField_complemento.getText();
       
       Agencia.getInstance().inserir_usuario(nome, cpf, identidade, rua, bairro, numero, complemento);
       Banco.trocaTelas(Banco.CADASTRO_1_ID);
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
   
    
    
}
