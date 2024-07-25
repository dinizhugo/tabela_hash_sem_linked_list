package com.hugoDiniz;

import com.hugoDiniz.domain.tabela.TabelaHash;

public class Main {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash(5);

        tabelaHash.insertAluno("0", "hugo");
        tabelaHash.insertAluno("1", "hugo");
        tabelaHash.insertAluno("2", "hugo");
        tabelaHash.insertAluno("3", "hugo");

        System.out.println(tabelaHash.getAllAlunos());
    }
}