public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLancamento = 1230;
        meuFilme.duracao= 130;
        System.out.println("Meu filme: " + meuFilme.nome);
        System.out.println("Meu filme: " + meuFilme.anoLancamento);
        System.out.println("Meu filme: " + meuFilme.duracao);
    }
}
