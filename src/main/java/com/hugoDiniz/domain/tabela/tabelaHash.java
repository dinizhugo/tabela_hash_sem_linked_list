package com.hugoDiniz.domain.tabela;

import com.hugoDiniz.domain.aluno.Aluno;

public class tabelaHash {
    private int size;
    private Aluno[] currentList;

    public tabelaHash(int size) {
        this.size = size;
        this.currentList = new Aluno[size];
    }

    public int getSize() {
        return size;
    }

    public Aluno[] getCurrentList() {
        return currentList;
    }



}
