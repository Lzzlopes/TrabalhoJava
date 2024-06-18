package Tipos;

public class Aco extends Pokemon {

    private Tipo MagneticBomb;

    private Tipo IronHead;

    private Tipo Tackle;

    private boolean Defense;

    public Aco(String codigo, String nome, int saude, Tipo tipo, Tipo magneticBomb, Tipo ironHead, Tipo tackle,
            Tipo Defense) {
        super(codigo, nome, saude, tipo);
        this.MagneticBomb = Tipo.ACO;
        this.IronHead = Tipo.ACO;
        this.Tackle = Tipo.NORMAL;
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