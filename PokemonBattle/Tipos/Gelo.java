package Tipos;

public class Gelo extends Pokemon {

    private Tipo PowderSnow;
    private Tipo Avalanche;
    private Tipo TakeDown;
    private boolean Defense;

    public Gelo(String codigo, String nome, int saude, Tipo tipo) {
        super(codigo, nome, saude, tipo);
        this.PowderSnow = Tipo.Gelo;
        this.Avalanche = Tipo.Gelo;
        this.TakeDown = Tipo.Normal;
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
