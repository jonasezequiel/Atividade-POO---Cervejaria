public class Cerveja {

    private String nome;
    private double volumeLitros;
    private Receita receita;

    public Cerveja(String nome, double volumeLitros, Receita receita) {
        this.nome = nome;
        this.volumeLitros = volumeLitros;
        this.receita = receita;
    }

    public Cerveja() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVolumeLitros() {
        return volumeLitros;
    }

    public void setVolumeLitros(double volumeLitros) {
        this.volumeLitros = volumeLitros;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

}
