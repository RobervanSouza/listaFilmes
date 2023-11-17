package br.com.alura.listaFilme.modelos;

public class Filme {
 private String nome;
 private int anoLancamento;
 private boolean plano;
 private double avaliacao;
 private int totalAvaliacao;
 private int duracao;

  public int getTotalAvaliacao(){
    return  totalAvaliacao;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setPlano(boolean plano) {
        this.plano = plano;
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
