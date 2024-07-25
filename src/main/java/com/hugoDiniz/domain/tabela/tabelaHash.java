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

    private boolean isFull() {
        int countNonNull = 1;

        for (Aluno aluno: currentList) {
            if (aluno != null) {
                countNonNull++;
            }
        }

        return countNonNull == currentList.length;
    }

}
