package org.example.models;

public abstract class Conta implements InterfaceConta{

    private static int INCREMENTENUMERO = 1;

    protected int agencia = 0001;
    protected int numero;
    protected double saldo;

    protected String tipoDeConta;

    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numero = INCREMENTENUMERO++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double value) {

        if(this.saldo >= value){
            this.saldo -= value;
        } else {
            System.out.println("Você não tem saldo suficiente para sacar. Seu saldo é: " + this.saldo);
        }

    }

    @Override
    public void depositar(double value) {
        this.saldo += value;
    }

    @Override
    public void transferir(double value, Conta conta) {
        if(this.saldo >= value){
            this.saldo -= value;
            conta.saldo += value;
            System.out.println("Você enviou " + value);
            System.out.println("Tipo de conta: " + conta.tipoDeConta);
        } else {
            System.out.println("Você não tem saldo suficiente para transferir. Seu saldo é: " + this.saldo);
        }
    }

    protected void extratoInfo(){
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("---------------------------------------");
    }
}
