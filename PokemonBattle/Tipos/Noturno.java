package Tipos;

public class Noturno extends Pokemon {

    private Tipo Bite;
    private Tipo FoulPlay;
    private Tipo Tackle;
    private boolean Defense;

    public Noturno(String codigo, String nome, int saude, Tipo tipo, Tipo bite, Tipo foulPlay, Tipo tackle,
            boolean defense) {
        super(codigo, nome, saude, tipo);
        this.Bite = Tipo.NOTURNO;
        this.FoulPlay = Tipo.NOTURNO;
        this.Tackle = Tipo.NORMAL;
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
