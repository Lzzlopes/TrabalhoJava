public class Pokemon {
    private String nome;
    private int saude;
    private Tipo tipo;

    public Pokemon(String nome, int saude, Tipo tipo) {
        this.nome = nome;
        this.saude = saude;
        this.tipo = tipo;
    }

    public int calcularDano(Tipo atacante, Tipo defensor) {
        return 5;
    }

    public void atacar(Pokemon defensor){
        System.out.println(nome + " ataca " + defensor.nome);
        defensor.receberDano(calcularDano(this.tipo, defensor.tipo));
    }

    public void receberDano(int dano) {
        this.saude -= dano;
        System.out.println(nome + " recebeu " + dano + " pontos de dano");
    }

}
