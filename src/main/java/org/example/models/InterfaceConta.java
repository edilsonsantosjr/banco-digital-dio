package org.example.models;

public interface InterfaceConta {

    void sacar(double value);

    void depositar(double value);

    void transferir(double value, Conta conta);

    void extrato();
}
