package Tipos;

public class Psiquico extends Pokemon {

    private Tipo Tackle;

    private Tipo Psybeam;

    private Tipo Psychock;

    private Tipo Defense;

    public Psiquico(String codigo, String nome, int saude, Tipo tipo, Tipo Tackle, Tipo psybeam, Tipo psychock,
            Tipo defense) {
        super(codigo, nome, saude, tipo);
        Tackle = Tipo.NORMAL;
        Psybeam = Tipo.PSIQUICO;
        Psychock = Tipo.PSIQUICO;
        Defense = defense;
    }

    @Override
    public int calcularDano(Tipo TipoAtaque, Tipo tipoDefensor) {
        double modificadorAtaque = 1.0;
        double modificadorDefesa = 1.0;

        if (TipoAtaque.isForteContra(tipoDefensor)) {
            modificadorAtaque = 2.0;
        } else if (TipoAtaque.isFracoContra(tipoDefensor)) {
            modificadorAtaque = 0.5;
        }

        if (tipoDefensor.isForteContra(TipoAtaque)) {
            modificadorDefesa = 0.5;
        } else if (tipoDefensor.isFracoContra(TipoAtaque)) {
            modificadorDefesa = 2.0;
        }

        return (int) (modificadorAtaque * modificadorDefesa * 5);
    }
}
