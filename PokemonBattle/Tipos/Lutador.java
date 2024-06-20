package Tipos;

public class Lutador extends Pokemon {

    private static String KarateChop;
    private static String DynamicPunch;
    private static String LowKick;
    private static boolean Defense;

    public Lutador(String codigo, String nome, int saude, Tipo tipo) {
        super(codigo, nome, saude, tipo, KarateChop, DynamicPunch, LowKick, Defense);
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
        if (nomeAtaque != LowKick) {
            defensor.receberDano(calcularDano(this.getTipo(), defensor.getTipo()));
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
