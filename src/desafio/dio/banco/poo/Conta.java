/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dio.banco.poo;

/**
 *
 * @author john_elway7
 */
public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected FormatoDeTransferencia formaDeTransferencia;
    
 
    public Conta(Cliente cliente, FormatoDeTransferencia formaDeTransferencia) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.formaDeTransferencia = formaDeTransferencia;
    }
    
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }    
        
    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }
       
   protected void imprimirInfosComuns() {
        System.out.println(String.format("Títular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Formato de transferência: %s", this.formaDeTransferencia.getDEBITO_AUTOMATICO()));
   }
   
}
