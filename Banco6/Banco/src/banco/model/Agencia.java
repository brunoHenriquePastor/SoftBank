/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Agencia implements Serializable{
    
     private static Agencia singleton = null;
     private ArrayList<Usuario> usuarios;
     
     private Agencia(){
         
         usuarios = new ArrayList<Usuario>();
         
     }        
     
     public void inserir_usuario (String nome, String cpf, String identidade, String rua,String bairro, String numero, String complemento){
         long id = usuarios. size();
         Endereço end = new Endereço(rua,bairro,numero,complemento);
         Conta conta = new Conta("rangel", 1234, 12345,"123456", new ArrayList<Serviço>());
         Usuario one = new Usuario(id, nome, cpf, identidade, end,conta);
         usuarios.add(one);
     }
     
      public static long RetornUsu(int numCont){
         long s = 0;
         for(Usuario u : Agencia.getInstance().getUsuarios()){
             u.getConta().getSenha();
             if(u.getConta().getNumero() == numCont){
                 s = u.getConta().getSenha();
                 return s;
             }
         }
         return 0;
     }
     
      public static Agencia getInstance() {
        if (singleton == null) {
            singleton = new Agencia();
            return singleton;
        } else {
            return singleton;
        }
    }
     
     public void saveInstance() {

        try {
            File file = new File("banco.txt");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream bos = new ObjectOutputStream(fos);
            bos.writeObject(singleton);
            bos.flush();
            bos.close();
            System.out.println("Saved successfully !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadInstance() {
        try {
            File file = new File("banco.txt");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            singleton = (Agencia) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            singleton = null;
            //e.printStackTrace();
        } catch (IOException e) {
            singleton = null;
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            singleton = null;
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
}
