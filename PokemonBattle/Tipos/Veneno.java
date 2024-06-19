package Tipos;

public class Veneno extends Pokemon {

    private Tipo VenoShock;
    private Tipo SludgeBomb;
    private Tipo bodySlam;
    private boolean Defense;

    public Veneno(String id, String nome, int saude, Tipo tipo) {
        super(id, nome, saude, tipo);
        this.VenoShock = Tipo.Veneno;
        this.SludgeBomb = Tipo.Veneno;
        this.bodySlam = Tipo.Normal;
        this.Defense = false;
    }

    @Override
    public int calcularDano(Tipo tipoAtacante, Tipo tipoDefensor) {
        double modificadorAtaque = 1.0;
        double modificadorDefesa = 1.0;

        if (tipoAtacante.isForteContra(tipoDefensor)) {
            modificadorAtaque = 2.0;
        } else if (tipoAtacante.isFracoContra(tipoDefensor)) {
            modificadorAtaque = 0.5;
        }

        if (tipoDefensor.isForteContra(tipoAtacante)) {
            modificadorDefesa = 0.5;
        } else if (tipoDefensor.isFracoContra(tipoAtacante)) {
            modificadorDefesa = 2.0;
        }

        return (int) (modificadorAtaque * modificadorDefesa * 5);
    }
}
