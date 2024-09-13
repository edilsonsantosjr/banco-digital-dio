package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contaList;

    public Banco(String nome) {
        this.nome = nome;
        this.contaList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContaList() {
        return contaList;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }
}
