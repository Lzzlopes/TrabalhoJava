package Tipos;

public class Fada extends Pokemon {

    private Tipo FairyWind;
    private Tipo DazzlingGleam;
    private Tipo Pound;
    private boolean Defense;

    public Fada(String codigo, String nome, int saude, Tipo tipo, Tipo fairyWind, Tipo dazzlingGleam, Tipo pound,
            boolean defense) {
        super(codigo, nome, saude, tipo);
        FairyWind = fairyWind;
        DazzlingGleam = dazzlingGleam;
        Pound = pound;
        Defense = defense;
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
