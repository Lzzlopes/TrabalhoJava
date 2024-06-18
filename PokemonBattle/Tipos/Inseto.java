package Tipos;

public class Inseto extends Pokemon {

    private Tipo BugBite;
    private Tipo XScissor;
    private Tipo StringShot;
    private boolean Defense;

    public Inseto(String codigo, String nome, int saude, Tipo tipo, Tipo bugBite, Tipo xScissor, Tipo stringShot,
            Tipo defense) {
        super(codigo, nome, saude, tipo);
        this.BugBite = Tipo.INSETO;
        this.XScissor = Tipo.INSETO;
        this.StringShot = Tipo.NORMAL;
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
