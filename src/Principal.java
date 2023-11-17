import br.com.alura.listaFilme.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoLancamento(1920);
        meuFilme.setDuracao(190);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(6);
        meuFilme.avalia(7);

        System.out.println( " total de avaliação: "+ meuFilme.getTotalAvaliacao());

        meuFilme.exibeFichaTecnica();
    }
}
