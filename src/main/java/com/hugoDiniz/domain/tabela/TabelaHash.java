package com.hugoDiniz.domain.tabela;

import com.hugoDiniz.domain.aluno.Aluno;

import java.util.Objects;

public class TabelaHash {
    private int size;
    private Aluno[] currentList;

    public TabelaHash(int size) {
        this.size = size;
        this.currentList = new Aluno[size];
    }

    public int getSize() {
        return size;
    }

    public Aluno[] getCurrentList() {
        return currentList;
    }

    public Aluno getAlunoByMatricula(String matricula) {
        for (Aluno aluno: currentList) {
            if (Objects.equals(aluno.getMatricula(), matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public void insertAluno(String matricula, String nome) {
        if (isFull()) {
            resizeList();
        }

        int pos = customHash(matricula);
        for (int i = pos; i < currentList.length; i++) {
            if (currentList[i] == null) {
                currentList[i] = new Aluno(matricula,nome);
                return;
            }
        }
        resizeList();
    }

    public void removeAluno(String matricula) {
        Aluno aluno = getAlunoByMatricula(matricula);
        int pos = customHash(matricula);

        if (aluno != null) {
            currentList[pos] = new Aluno("-1", "aluno removido: " + aluno.getNome());
        }
    }

    public String getAllAlunos() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");

        for (Aluno aluno: currentList) {
            stringBuilder.append(aluno);
            if (aluno != null) { stringBuilder.append(","); }
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private int customHash(String matricula) {
        int hash = 0;

        for (int i = 0; i < matricula.length(); i++) {
            hash += matricula.charAt(i);
        }
        return Math.abs(hash % currentList.length);
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

    private void resizeList() {
        int doubleSize = getSize() * 2;
        Aluno[] oldList = currentList;
        currentList = new Aluno[doubleSize];

        for (Aluno aluno : oldList) {
            if (aluno != null) {
                insertAluno(aluno.getMatricula(), aluno.getNome());
            }
        }
    }

}
