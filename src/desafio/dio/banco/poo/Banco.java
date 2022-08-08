/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dio.banco.poo;

import java.util.List;

/**
 *
 * @author john_elway7
 */
public class Banco {
    private String nome;
    private List<Conta> conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getConta() {
        return conta;
    }

    public void setConta(List<Conta> conta) {
        this.conta = conta;
    }
    
}
