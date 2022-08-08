/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dio.banco.poo;

/**
 *
 * @author john_elway7
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cliente andre = new Cliente();
        andre.setNome("André");
        
        FormatoDeTransferencia forma = new FormatoDeTransferencia();
        forma.setFormato("PIX");
        
        Conta contaCo = new ContaCorrente(andre, forma);
        contaCo.depositar(1000);
        
        Conta contaPo = new ContaPoupanca(andre, forma);
        contaCo.transferir(100, contaPo);
        
        
        contaCo.imprimirExtrato();
        contaPo.imprimirExtrato();
    }
}
