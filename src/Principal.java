public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLancamento = 1230;
        meuFilme.duracao= 130;
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(6);
        meuFilme.avalia(7);
        System.out.println(meuFilme.avaliacao);
        System.out.println(meuFilme.totalAvaliacao);
        System.out.println(meuFilme.mediaAvliacao() + " media avaliação");

        meuFilme.exibeFichaTecnica();
    }
}
