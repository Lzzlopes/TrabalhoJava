package Tipos;

public class Dragao extends Pokemon {

    private Tipo DragonBreath;
    private Tipo DragonPulse;
    private Tipo Headbutt;
    private boolean Defense;

    public Dragao(String codigo, String nome, int saude, Tipo tipo, Tipo dragonBreath, Tipo dragonPulse, Tipo headbutt,
            Tipo defense) {
        super(codigo, nome, saude, tipo);
        this.DragonBreath = Tipo.DRAGAO;
        this.DragonPulse = Tipo.DRAGAO;
        this.Headbutt = Tipo.NORMAL;
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
