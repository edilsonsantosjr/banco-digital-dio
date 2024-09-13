package org.example.models;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.tipoDeConta = "Conta poupança";
    }

    @Override
    public void extrato() {
        System.out.println("Informações conta corrente:");
        System.out.println("Cliente: " + this.cliente.getNome());
        super.extratoInfo();
    }
}
