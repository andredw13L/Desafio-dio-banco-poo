/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dio.banco.poo;

/**
 *
 * @author john_elway7
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, FormatoDeTransferencia formaDeTransferencia) {
        super(cliente, formaDeTransferencia);
    }
    
    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato conta poupança!" );
        super.imprimirInfosComuns();
        
    }
    
}
