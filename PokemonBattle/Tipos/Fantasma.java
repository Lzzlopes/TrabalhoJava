package Tipos;

public class Fantasma extends Pokemon {

    private Tipo ShadowBall;
    private Tipo ShadowPunch;
    private Tipo Lick;
    private boolean Defense;

    public Fantasma(String codigo, String nome, int saude, Tipo tipo, Tipo shadowBall, Tipo shadowPunch, Tipo lick,
            Tipo defense) {
        super(codigo, nome, saude, tipo);
        this.ShadowBall = Tipo.FANTASMA;
        this.ShadowPunch = Tipo.FANTASMA;
        this.Lick = Tipo.NORMAL;
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