package org.example.models;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.tipoDeConta = "Conta corrente";
    }

    @Override
    public void extrato(){
        System.out.println("Informações conta corrente:");
        System.out.println("Cliente: " + this.cliente.getNome());
        super.extratoInfo();
    }
}
