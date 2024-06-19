package Tipos;

public class Noturno extends Pokemon {

    private Tipo Bite;
    private Tipo FoulPlay;
    private Tipo Tackle;
    private boolean Defense;

    public Noturno(String codigo, String nome, int saude, Tipo tipo) {
        super(codigo, nome, saude, tipo);
        this.Bite = Tipo.Noturno;
        this.FoulPlay = Tipo.Noturno;
        this.Tackle = Tipo.Normal;
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
