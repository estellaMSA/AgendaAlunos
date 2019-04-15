package com.example.agenda.modelo;

import java.io.Serializable;

public class Aluno implements Serializable {

    private Long id;
    private String Nome;
    private String Endereco;
    private String Telefone;
    private String Site;
    private Double Nota;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        this.Telefone = telefone;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String site) {
        this.Site = site;
    }

    public Double getNota() {
        return Nota;
    }

    public void setNota(Double nota) {
        this.Nota = nota;
    }

    public String toString() {
        return getId() + " - " + getNome();
    }
}
