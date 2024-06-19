package Tipos;

public class Voador extends Pokemon {

    private Tipo WingAttack;
    private Tipo AirSlash;
    private Tipo AerialAce;
    private boolean Defense;

    public Voador(String codigo, String nome, int saude, Tipo tipo)

    {
        super(codigo, nome, saude, tipo);
        this.WingAttack = Tipo.Voador;
        this.AirSlash = Tipo.Voador;
        this.AerialAce = Tipo.Voador;
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
