package com.hugoDiniz;

import com.hugoDiniz.domain.tabela.TabelaHash;

public class Main {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash(5);

        System.out.println("Inserindo alunos:");
        tabelaHash.insertAluno("0", "a");
        tabelaHash.insertAluno("1", "b");
        tabelaHash.insertAluno("2", "c");
        tabelaHash.insertAluno("3", "d");
        System.out.println("size: " + tabelaHash.getSize());

        System.out.println(tabelaHash.getAllAlunos());
        System.out.println("============================");
        System.out.println("Aumentando a tabela com mais alunos:");
        tabelaHash.insertAluno("3", "e");
        tabelaHash.insertAluno("4", "f");
        tabelaHash.insertAluno("5", "g");
        tabelaHash.insertAluno("6", "Cleison");
        System.out.println(tabelaHash.getAllAlunos());
        System.out.println("size: " + tabelaHash.getSize());

        System.out.println("============================");
        System.out.println("Removendo aluno Clesion:");
        tabelaHash.removeAluno("6");
        System.out.println(tabelaHash.getAllAlunos());
        System.out.println("size: " + tabelaHash.getSize());

    }
}