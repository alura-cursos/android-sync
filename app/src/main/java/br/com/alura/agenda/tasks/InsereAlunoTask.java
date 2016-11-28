package br.com.alura.agenda.tasks;

import android.os.AsyncTask;

import br.com.alura.agenda.converter.AlunoConverter;
import br.com.alura.agenda.modelo.Aluno;
import br.com.alura.agenda.web.WebClient;

/**
 * Created by alura on 11/28/16.
 */
public class InsereAlunoTask extends AsyncTask{
    private final Aluno aluno;

    public InsereAlunoTask(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    protected Object doInBackground(Object[] params) {
        String json = new AlunoConverter().converteParaJSONCompleto(aluno);
        new WebClient().insere(json);
        return null;
    }
}
