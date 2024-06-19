package Tipos;

public class Pedra extends Pokemon {

    private Tipo RockSlide;
    private Tipo StoneEdge;
    private Tipo RockThrow;
    private boolean Defense;

    public Pedra(String codigo, String nome, int saude, Tipo tipo) {
        super(codigo, nome, saude, tipo);
        this.RockSlide = Tipo.Pedra;
        this.StoneEdge = Tipo.Pedra;
        this.RockThrow = Tipo.Normal;
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