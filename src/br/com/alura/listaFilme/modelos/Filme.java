package br.com.alura.listaFilme.modelos;

import br.com.alura.listaFilmes.calculo.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificavel() {
        return 0;
    }
}