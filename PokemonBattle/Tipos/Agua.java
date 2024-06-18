package Tipos;

public class Agua extends Pokemon {

    private Tipo WaterGun;

    private Tipo HydroPump;

    private Tipo Bite;

    private boolean Defense;

    public Agua(String codigo, String nome, int saude, Tipo tipo, Tipo waterGun, Tipo hydroPump, Tipo bite,
            Tipo defense) {
        super(codigo, nome, saude, tipo);
        this.WaterGun = Tipo.AGUA;
        this.HydroPump = Tipo.AGUA;
        this.Bite = Tipo.NORMAL;
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
