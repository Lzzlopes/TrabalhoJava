package Tipos;

public class Fogo extends Pokemon {

    private Tipo Scratch;

    private Tipo FlameThrower;

    private Tipo Ember;

    private boolean Defense;

    public Fogo(String id, String nome, int saude, Tipo Scratch, Tipo FlameThrower, Tipo Ember, String Defense) {
        super(id, nome, saude, Tipo.FOGO);
        this.Ember = Tipo.FOGO;
        this.FlameThrower = Tipo.FOGO;
        this.Scratch = Tipo.NORMAL;
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
