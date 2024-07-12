package Utilities.Pessoas;

import Utilities.Ferramentas.Tipos;

public class Pessoa {
    private String nome;
    private Tipos tipo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}

