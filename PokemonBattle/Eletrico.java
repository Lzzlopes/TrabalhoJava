public class Eletrico extends Pokemon{
    public Eletrico(String nome, int saude, Tipo tipo) {
        super(nome, saude, Tipo.Eletrico);
    }

    @Override
    public int calcularDano(Tipo tipoAtacante, Tipo tipoDefensor) {
        if(tipoDefensor == Tipo.Voador || tipoDefensor == Tipo.Agua){
            return 2 * super.calcularDano(tipoAtacante, tipoDefensor);
        } else
            return super.calcularDano(tipoAtacante, tipoDefensor);
    }
}
