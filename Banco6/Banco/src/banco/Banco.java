/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import banco.model.Agencia;
import banco.model.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Felipe Tomaz
 */
public class Banco extends Application {
    
    private static Stage PALCO;
    private static Scene TELA_INICIAL;
    private static Scene CADASTRO;
    private static Scene CADASTRO_1;
    private static Scene LOGIN;
    private static Scene DEPOSITO;
    private static Scene DEPOSITO_CC;
    private static Scene DEPOSITO_CP;
    private static Scene GERENCIA_CONTA;
    private static Scene SAQUE_1;
    private static Scene SAQUE_2;
    private static Scene SALDO;
    private static Scene TRANSFERENCIA;
    private static Scene TRANSFERENCIA_CC;
    private static Scene TRANSFERENCIA_CP;
    private static Scene TRANSFERENCIA_DADOS;
    private static Scene DEPOSITO_DADOS;
    
    public static boolean LOGADO = false;
    public static final int TELA_INICIAL_ID = 0;
    public static final int CADASTRO_ID = 1;
    public static final int DEPOSITO_ID = 2;
    public static final int LOGIN_ID = 3;
    public static final int DEPOSITO_CC_ID= 4;
    public static final int DEPOSITO_CP_ID = 5;
    public static final int GERENCIA_CONTA_ID = 6;
    public static final int CADASTRO_1_ID = 7;
    public static final int SAQUE_1_ID = 8;
    public static final int SAQUE_2_ID = 9;
    public static final int SALDO_ID = 10;
    public static final int TRANSFERENCIA_ID = 11;
    public static final int TRANSFERENCIA_CC_ID = 12;
    public static final int TRANSFERENCIA_CP_ID = 13;
    public static final int TRANSFERENCIA_DADOS_ID = 14;
    public static final int DEPOSITO_DADOS_ID = 15;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        PALCO = stage;
        initTelas();
        Parent root = FXMLLoader.load(getClass().getResource("/banco/view/FXMLTelaInicial.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agencia.getInstance().loadInstance();
        for(Usuario u : Agencia.getInstance().getUsuarios()){
            System.out.println(u.getNome());
        }
        launch(args);
        Agencia.getInstance().saveInstance();   
    }
     
        
    
    private void initTelas() throws IOException{
        TELA_INICIAL = new Scene(FXMLLoader.load(getClass().getResource("/banco/view/FXMLTelaInicial.fxml")));
        CADASTRO = new Scene(FXMLLoader.load(getClass().getResource("/banco/view/FXMLCadastro.fxml")));
        CADASTRO_1 = new Scene(FXMLLoader.load(getClass().getResource("/banco/view/FXMLCadastro1.fxml")));
        DEPOSITO = new Scene(FXMLLoader.load(getClass().getResource("/banco/view/FXMLDeposito.fxml")));
        LOGIN = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLLogin.fxml")));
        DEPOSITO_CC = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLDepositoCC.fxml")));
        DEPOSITO_CP = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLDepositoCP.fxml")));
        GERENCIA_CONTA = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLGerenciaConta.fxml")));
        SAQUE_1 = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLSaque1.fxml")));
        SAQUE_2 = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLSaque2.fxml")));
        SALDO = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLSaldo.fxml")));
        TRANSFERENCIA = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLTransferencia.fxml")));
        TRANSFERENCIA_CC = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLTransferenciaCC.fxml")));
        TRANSFERENCIA_CP = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLTransferenciaCP.fxml")));
        TRANSFERENCIA_DADOS = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLTransferenciaDados.fxml")));
        DEPOSITO_DADOS = new Scene (FXMLLoader.load(getClass().getResource("/banco/view/FXMLDepositoDados.fxml")));
    }
    
    public static void trocaTelas(int telaID){
        switch(telaID){
            case TELA_INICIAL_ID : PALCO.setScene(TELA_INICIAL);
                                   PALCO.show();
                                   break;
            case CADASTRO_ID : PALCO.setScene(CADASTRO);
                               PALCO.show();
                               break;
            case DEPOSITO_ID : PALCO.setScene(DEPOSITO);
                               PALCO.show();
                               break;
            case LOGIN_ID : PALCO.setScene(LOGIN);
                            PALCO.show();
                            break; 
            case DEPOSITO_CC_ID : PALCO.setScene(DEPOSITO_CC);
                            PALCO.show();
                            break; 
            case DEPOSITO_CP_ID : PALCO.setScene(DEPOSITO_CP);
                            PALCO.show();
                            break;
            case GERENCIA_CONTA_ID : PALCO.setScene(GERENCIA_CONTA);
                            PALCO.show();
                            break; 
            case CADASTRO_1_ID : PALCO.setScene(CADASTRO_1);
                            PALCO.show();
                            break; 
            case SAQUE_1_ID : PALCO.setScene(SAQUE_1);
                            PALCO.show();
                            break; 
            case SAQUE_2_ID : PALCO.setScene(SAQUE_2);
                            PALCO.show();
                            break;    
            case SALDO_ID : PALCO.setScene(SALDO);
                            PALCO.show();
                            break;  
            case TRANSFERENCIA_ID : PALCO.setScene(TRANSFERENCIA);
                            PALCO.show();
                            break;
            case TRANSFERENCIA_CC_ID : PALCO.setScene(TRANSFERENCIA_CC);
                            PALCO.show();
                            break;
            case TRANSFERENCIA_CP_ID : PALCO.setScene(TRANSFERENCIA_CP);
                           PALCO.show();
                           break;
            case TRANSFERENCIA_DADOS_ID : PALCO.setScene(TRANSFERENCIA_DADOS);
                           PALCO.show();
                           break;   
            case DEPOSITO_DADOS_ID : PALCO.setScene(DEPOSITO_DADOS);
                           PALCO.show();
                           break;                  
            default: System.out.println("Deu ruim");
            
        
        }
    }
    
    
}
