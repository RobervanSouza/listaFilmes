import br.com.alura.listaFilme.modelos.Filme;
import br.com.alura.listaFilme.modelos.Serie;
import br.com.alura.listaFilmes.calculo.CalculadoraDeTempo;

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

        //System.out.println( " total de avaliação: "+ meuFilme.getTotalAvaliacao());

       // meuFilme.exibeFichaTecnica();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodios(10);
        lost.setEpisodiosPorTemporada(50);

        lost.exibeFichaTecnica();
        //System.out.println( " tempo da serie: " + lost.getDuracao());

        Filme meuFilme3 = new Filme();
        meuFilme3.setNome("O poderoso chefão");
        meuFilme3.setAnoLancamento(1920);
        meuFilme3.setDuracao(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluirTitulos(meuFilme3);
        calculadora.incluirTitulos(meuFilme);
        calculadora.incluirTitulos(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}
