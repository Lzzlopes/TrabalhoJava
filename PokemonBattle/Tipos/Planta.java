package Tipos;

public class Planta extends Pokemon {

    private Tipo VineWhip;
    private Tipo SolarBeam;
    private Tipo Slam;
    private boolean Defense;

    public Planta(String codigo, String nome, int saude, Tipo tipo, Tipo vineWhip, Tipo solarBeam, Tipo slam,
            boolean defense) {
        super(codigo, nome, saude, tipo);
        this.VineWhip = Tipo.PLANTA;
        this.SolarBeam = Tipo.PLANTA;
        this.Slam = Tipo.NORMAL;
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