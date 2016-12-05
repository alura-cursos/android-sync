package br.com.alura.agenda.dto;

import java.util.List;

import br.com.alura.agenda.modelo.Aluno;

/**
 * Created by alura on 12/2/16.
 */

public class AlunoSync {

    private List<Aluno> alunos;
    private String momentoDaUltimaModificacao;

    public String getMomentoDaUltimaModificacao() {
        return momentoDaUltimaModificacao;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
