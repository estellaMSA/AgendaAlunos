package com.example.agenda.Helper;

import android.widget.EditText;
import android.widget.RatingBar;

import com.example.agenda.Formulario;
import com.example.agenda.R;
import com.example.agenda.modelo.Aluno;

public class FormularioHelper {

    private final EditText formNome;
    private final EditText formEnd;
    private final EditText formTel;
    private final EditText formSite;
    private final RatingBar formNota;

    private Aluno aluno;

    public FormularioHelper(Formulario formularioActivity) {

       formNome = (EditText) formularioActivity.findViewById(R.id.form_nome);
       formEnd = (EditText) formularioActivity.findViewById(R.id.form_end);
       formTel = (EditText) formularioActivity.findViewById(R.id.form_tel);
       formSite = (EditText) formularioActivity.findViewById(R.id.form_site);
       formNota = (RatingBar) formularioActivity.findViewById(R.id.form_nota);

       aluno = new Aluno();
    }

    public Aluno puxaAluno() {
        aluno.setNome(formNome.getText().toString());
        aluno.setEndereco(formEnd.getText().toString());
        aluno.setTelefone(formTel.getText().toString());
        aluno.setSite(formSite.getText().toString());
        aluno.setNota(Double.valueOf(formNota.getProgress()));

        return aluno;
    }

    public void preencheFormulario(Aluno aluno) {
        formNome.setText(aluno.getNome());
        formEnd.setText(aluno.getEndereco());
        formTel.setText(aluno.getTelefone());
        formSite.setText(aluno.getSite());
        formNota.setProgress(aluno.getNota().intValue());
        this.aluno = aluno;
    }
}
