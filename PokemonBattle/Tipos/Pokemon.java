package Tipos;

public abstract class Pokemon implements Batalha{

    private final String codigo;
    private final String nome;
    private int saude;
    private final Tipo tipo;
    private String ataqueUm;
    private String ataqueDois;
    private String ataqueTres;
    private boolean Defense;

    public Pokemon(String codigo, String nome, int saude, Tipo tipo, String ataqueUm, String ataqueDois, String ataqueTres, boolean Defense) {
        this.codigo = codigo;
        this.nome = nome;
        this.saude = saude;
        this.tipo = tipo;
        this.ataqueUm = ataqueUm;
        this.ataqueDois = ataqueDois;
        this.ataqueTres = ataqueTres;
        this.Defense = false;
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
    public void setSaude(int saude) {
        this.saude = saude;
    }

    public abstract int calcularDano(Tipo tipoAtacante, Tipo tipoDefensor);

    public void atacar(Pokemon defensor) {}

    public void receberDano(int dano){}

    public void curar(Pokemon jogador){}

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
