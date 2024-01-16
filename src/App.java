public class App {
    public static void main(String[] args) throws Exception {

        // Criando os ingredientes
        Ingrediente malte = new Ingrediente("Malte", 5);
        Ingrediente lupulo = new Ingrediente("Lupulo", 15);
        Ingrediente agua = new Ingrediente("Agua", 20);

        // Criando a receita
        Receita minhaReceita = new Receita("Minha IPA");
        minhaReceita.adicionaIngredientes(malte);
        minhaReceita.adicionaIngredientes(lupulo);
        minhaReceita.adicionaIngredientes(agua);

        // Criando a cerveja
        Cerveja minhaCerveja = new Cerveja("IPA", 20, minhaReceita);

        System.out.println("Nome: " + minhaCerveja.getNome());
        System.out.println(" Volume: " + minhaCerveja.getVolumeLitros());
        System.out.println("Receita: " + minhaCerveja.getReceita().getNome());

        for (Ingrediente ingrediente : minhaCerveja.getReceita().getIngredientes()) {
            System.out.println("Ingrediente: " + ingrediente.getNome());
            System.out.println("Quantidade: " + ingrediente.getQuantidade());
        }

    }
}
