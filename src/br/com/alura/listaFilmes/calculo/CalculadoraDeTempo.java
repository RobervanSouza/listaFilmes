package br.com.alura.listaFilmes.calculo;

import br.com.alura.listaFilme.modelos.Filme;
import br.com.alura.listaFilme.modelos.Serie;
import br.com.alura.listaFilme.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
//    public void calcularTempoTotal (Filme filme){
//        this.tempoTotal += filme.getDuracao();
//    }public void calcularTempoTotal (Serie filme){
//        this.tempoTotal += filme.getDuracao();
//    }

    public  void incluirTitulos(Titulo titulo) {
        this.tempoTotal += titulo.getDuracao();
    }
}
