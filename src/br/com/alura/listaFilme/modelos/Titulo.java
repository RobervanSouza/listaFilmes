package br.com.alura.listaFilme.modelos;

public abstract class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean plano;
    private double avaliacao;
    private int totalAvaliacao;
    private int duracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean plano() {
        return plano;
    }

    public void setPlano(boolean plano) {
        this.plano = plano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Duração: " + duracao);

    }

    public void  avalia (double nota){
        avaliacao +=  nota;
        totalAvaliacao++;
    }

    public double mediaAvliacao(){
        return avaliacao / totalAvaliacao;
    }


}


