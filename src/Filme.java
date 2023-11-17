public class Filme {
  String nome;
  int anoLancamento;
  boolean plano;
  double avaliacao;
  int totalAvaliacao;
  int duracao;

  void exibeFichaTecnica(){
    System.out.println("Nome: " + nome);
    System.out.println("Ano: " + anoLancamento);
    System.out.println("Duração: " + duracao);

  }

  void  avalia (double nota){
    avaliacao +=  nota;
    totalAvaliacao++;
  }

  double mediaAvliacao(){
    return avaliacao / totalAvaliacao;
  }

}
