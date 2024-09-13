package org.example;

import org.example.models.Cliente;
import org.example.models.Conta;
import org.example.models.ContaCorrente;
import org.example.models.ContaPoupanca;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Edilson", 24);
        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);


        contaCorrente.depositar(150.00);
        contaPoupanca.depositar(100.00);

        contaCorrente.extrato();
        contaPoupanca.extrato();

        contaCorrente.transferir(25.00, contaPoupanca);
        contaCorrente.extrato();
        contaPoupanca.extrato();

    }
}