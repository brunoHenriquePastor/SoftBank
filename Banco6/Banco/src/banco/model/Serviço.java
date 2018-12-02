
package banco.model;

import java.io.Serializable;


class Serviço implements Serializable{
    
    private String nome; // conta corrente ou conta poupança
    private double saldo;
    private double limite; // caso poupança e corrente sem chque especial limite igual a 0

    public Serviço(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
