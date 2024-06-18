package Tipos;

public abstract class Pokemon {

    private final String codigo;
    private final String nome;
    private int saude;
    private final Tipo tipo;

    public Pokemon(String codigo, String nome, int saude, Tipo tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saude = saude;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getSaude() {
        return saude;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public abstract int calcularDano(Tipo tipoAtacante, Tipo tipoDefensor);

    public void atacar(Pokemon defensor) {
        System.out.println(nome + " ataca " + defensor.getNome());
        int dano = calcularDano(this.tipo, defensor.getTipo());
        defensor.receberDano(dano);
    }

    public void receberDano(int dano) {
        this.saude -= dano;
        System.out.println(nome + " recebeu " + dano + " pontos de dano");
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", saude=" + saude +
                ", tipo=" + tipo +
                '}';
    }
}
