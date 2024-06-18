package Tipos;

public class Lutador extends Pokemon {

    private Tipo KarateChop;
    private Tipo DynamicPunch;
    private Tipo LowKick;
    private boolean Defense;

    public Lutador(String codigo, String nome, int saude, Tipo tipo, Tipo karateChop, Tipo dynamicPunch, Tipo lowKick,
            Tipo defense) {
        super(codigo, nome, saude, tipo);
        this.KarateChop = Tipo.LUTADOR;
        this.DynamicPunch = Tipo.LUTADOR;
        this.LowKick = Tipo.NORMAL;
        this.Defense = false;
    }

    @Override
    public int calcularDano(Tipo tipoAtaque, Tipo tipoDefensor) {
        double modificadorAtaque = 1.0;
        double modificadorDefesa = 1.0;

        if (tipoAtaque.isForteContra(tipoDefensor)) {
            modificadorAtaque = 2.0;
        } else if (tipoAtaque.isFracoContra(tipoDefensor)) {
            modificadorAtaque = 0.5;
        }

        if (tipoDefensor.isForteContra(tipoAtaque)) {
            modificadorDefesa = 0.5;
        } else if (tipoDefensor.isFracoContra(tipoAtaque)) {
            modificadorDefesa = 2.0;
        }

        return (int) (modificadorAtaque * modificadorDefesa * 5);
    }
}