package pooKotlin;

public class Pessoa {
    public Pessoa() {

    }

    public Pessoa(String nome, int nasc) {
        this.nasc = nasc;
        this.nome = nome;
    }

    public static void main(String[] args) {
        MaquinaHeranca m = new MaquinaHeranca("eletrolux");
        Alarme ala = new Alarme("", Prioridade2.ALTA);
    }

    private int nasc;
    private String nome;

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
