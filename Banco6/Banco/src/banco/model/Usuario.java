/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.model;

import java.io.Serializable;

/**
 *
 * @author range
 */
public class Usuario implements Serializable {
    
    private long id;
    private String nome;
    private String cpf;
    private String identidade;
    private Endereço endereço;
    private Conta conta;

    public Usuario(long id, String nome, String cpf, String identidade, Endereço endereço, Conta conta) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.endereço = endereço;
        this.conta = conta;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
            
    
}
