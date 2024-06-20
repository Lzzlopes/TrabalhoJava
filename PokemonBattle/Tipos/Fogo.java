package Tipos;

public class Fogo extends Pokemon {

    private static String Scratch;
    private static String FlameThrower;
    private static String Ember;
    private static boolean Defense;

    public Fogo(String id, String nome, int saude, Tipo tipo) {
        super(id, nome, saude, tipo, Scratch, FlameThrower, Ember, Defense);
    }

    public void defender() {
        setDefense(true);
    }

    @Override
    public void curar(Pokemon jogador) {
        setSaude((int) (getSaude() + (getSaude() * 0.65)));
    }

    public static void setDefense(boolean defense) {
        Defense = defense;
    }

    @Override
    public int calcularDano(Tipo tipoAtaque, Tipo tipoDefensor) {
        double modificadorAtaque = 1.0;
        double modificadorDefesa = 1.0;

        if (tipoAtaque.ataqueCritico(tipoAtaque, tipoDefensor)) {
            modificadorAtaque = 2.0;
        } else if (tipoAtaque.DanoCritico(tipoAtaque, tipoDefensor)) {
            modificadorAtaque = 0.5;
        }

        if (tipoDefensor.ataqueCritico(tipoAtaque, tipoDefensor)) {
            modificadorDefesa = 0.5;
        } else if (tipoDefensor.DanoCritico(tipoAtaque, tipoDefensor)) {
            modificadorDefesa = 2.0;
        }

        return (int) (modificadorAtaque * modificadorDefesa * 5);
    }

    @Override
    public void atacar(String nomeAtaque, Pokemon defensor) {
        System.out.println(getNome() + "usou " + nomeAtaque + "em" + defensor);
        if (nomeAtaque != Scratch) {
            defensor.receberDano(calcularDano(Tipo.Fogo, defensor.getTipo()));
        } else
            defensor.receberDano(calcularDano(Tipo.Normal, defensor.getTipo()));

    }

    @Override
    public void receberDano(int dano) {
        if(Defense == false){
            this.setSaude(getSaude() - dano);
        } else
            {this.setSaude(getSaude() - (int) (dano * 0.5));}
                
        System.out.println(getNome() + "recebeu " + dano + "pontos de dano!");
    }

}
