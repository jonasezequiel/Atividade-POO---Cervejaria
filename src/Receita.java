import java.util.ArrayList;

public class Receita {

    private String nome;
    private ArrayList<Ingrediente> ingredientes;

    public Receita(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
    }

    public Receita() {
    }

    public void adicionaIngredientes(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        ingredientes = ingredientes;
    }

}
