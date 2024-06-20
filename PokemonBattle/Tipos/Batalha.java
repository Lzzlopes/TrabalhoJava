package Tipos;

public interface Batalha {

    public void atacar(String nomeAtaque, Pokemon defensor);

    public void receberDano(int dano);

    public int calcularDano(Tipo atacante, Tipo defensor);

    public void curar(Pokemon jogador);

}