
package banco.model;
import java.io.Serializable;
import java.util.ArrayList;


class Conta  implements Serializable{
    
    private String titular;
    private long senha;
    private int numero;
    private String agencia;         
    private ArrayList<Serviço> tipo;// conta corrente, conta poupança, caso de conta conjunta insere dois serviços no array

    public Conta(String titular, long senha, int numero, String agencia, ArrayList<Serviço> tipo) {
        
        this.titular = titular;
        this.senha = senha;
        this.numero = numero;
        this.agencia = agencia;
        tipo = new ArrayList<>(); 
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public ArrayList<Serviço> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<Serviço> tipo) {
        this.tipo = tipo;
    }
    
    public long getSenha() {
        return senha;
    }

    public void setSenha(long senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }   
    
    public void sacar(String tipoConta,int valor, ArrayList<Serviço> tipo){
        
        int i;
        
        for(i=0; i<tipo.size();i++){
            
            if(tipoConta.equals(tipo.get(i).getNome())== true){
               if(tipo.get(i).getSaldo()-valor>= tipo.get(i).getLimite()){
                   tipo.get(i).setSaldo(tipo.get(i).getSaldo()-valor);
                   System.out.println("Retire seu dinheiro");
                   return;
               }
                System.out.println("Valor indisponível");    
            }
            System.out.println("Conta não existente");  
        }
    }
    
    public void deposito(String tipoConta,int valor,Conta conta){
        
        int i;
        
        for(i=0; i<tipo.size();i++){
            
            if(tipoConta.equals(conta.tipo.get(i).getNome())== true){
                System.out.println("\nFavorecido: "+conta.titular);
                System.out.println("\nConta: "+conta.numero);
                System.out.println("\nAgencia: "+conta.agencia);
                
                conta.tipo.get(i).setSaldo(conta.tipo.get(i).getSaldo()+valor);
                System.out.println("Depósito realizado");
                return;
            }
            
            System.out.println("Conta não existente"); 
        }
    } 
    
    public void transferencia_interna(double valor,String origem, Conta conta){
        
        if(conta.tipo.size()==1){
            System.out.println("Impossível realizar transferencia interna");
            return;
        }

        int i;
        
        for(i=0; i<conta.tipo.size();i++){
            
            if(origem.equals(conta.tipo.get(i).getNome())== true){
                if(conta.tipo.get(i).getSaldo()-valor>= conta.tipo.get(i).getLimite()){
                    if(i==0){
                        conta.tipo.get(i+1).setSaldo(conta.tipo.get(i+1).getSaldo()+valor);
                        conta.tipo.get(i).setSaldo(conta.tipo.get(i).getSaldo()-valor);
                        System.out.println("\nTransferencia concluida");
                        return;
                    }
                    conta.tipo.get(i-1).setSaldo(conta.tipo.get(i-1).getSaldo()+valor);
                    conta.tipo.get(i).setSaldo(conta.tipo.get(i).getSaldo()-valor);
                    System.out.println("\nTransferencia concluida");
                    return;
                }
                
               System.out.println("Saldo indisponível") ;
               return;
            }
        }
        
    }
    public void transferencia_externa(double valor,String origem,String destino, Conta c_origem, Conta c_destino){
        
        int i;
        
        for(i=0; i<c_origem.tipo.size();i++){
            
            if(origem.equals(c_origem.tipo.get(i).getNome())== true){
                if(c_origem.tipo.get(i).getSaldo()-valor>= c_origem.tipo.get(i).getLimite()){
                   c_origem.tipo.get(i).setSaldo(c_origem.tipo.get(i).getSaldo()-valor); 
                   
                    for(int j=0; j<c_destino.tipo.size();j++){
            
                        if(destino.equals(c_destino.tipo.get(i).getNome())== true){
                            System.out.println("\nFavorecido: "+c_destino.titular);
                            System.out.println("\nConta: "+c_destino.numero);
                            System.out.println("\nAgencia: "+c_destino.agencia);
                            
                            c_destino.tipo.get(i).setSaldo(c_destino.tipo.get(i).getSaldo()+valor);
                            System.out.println("\nTransferencia concluida");
                            return;
                        }   
                    }
                }
                
                System.out.println("Saldo indisponível") ;
                return;
            }   
        }
    }
    
    public void consultar_saldo(String tipoConta, ArrayList <Serviço> tipo ){
        
        int i;
        
        for(i=0; i<tipo.size();i++){
            
            if(tipoConta.equals(tipo.get(i).getNome())== true){
                System.out.println("Saldo disponivel: R$" + tipo.get(i).getSaldo());
            }
            
        }    
    }
    
}
