package org.app.Entities;

public class Pessoa {
    private String _nome;
    private int _idade;

    public Pessoa(String nome, int idade){
        this._nome = nome;
        this._idade = idade;
    }

    public int getIdade() {
        return _idade;
    }

    public void setIdade(int _idade) {
        this._idade = _idade;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String _nome) {
        this._nome = _nome;
    }
}
