package Tipos;

public enum Tipo {

  Fogo, Agua, Planta, Eletrico, Terra, Pedra, Gelo, Lutador, Voador, Psiquico, Veneno, Inseto, Fantasma, Dragao, Aco, Fada, Normal, Noturno;

  public boolean isForteContra(Tipo outro) {

    switch (this) {
      case Fogo:
        return outro == Planta || outro == Gelo || outro == Inseto || outro == Aco;
      case Agua:
        return outro == Fogo || outro == Pedra || outro == Terra;
      case Planta:
        return outro == Agua || outro == Pedra || outro == Terra;
      case Eletrico:
        return outro == Agua || outro == Voador;
      case Terra:
        return outro == Fogo || outro == Eletrico || outro == Veneno || outro == Pedra || outro == Aco;
      case Pedra:
        return outro == Fogo || outro == Gelo || outro == Voador || outro == Inseto;
      case Gelo:
        return outro == Planta || outro == Terra || outro == Dragao || outro == Voador;
      case Lutador:
        return outro == Normal || outro == Gelo || outro == Pedra || outro == Aco || outro == Noturno;
      case Voador:
        return outro == Planta || outro == Lutador || outro == Inseto;
      case Psiquico:
        return outro == Lutador || outro == Veneno;
      case Veneno:
        return outro == Planta || outro == Fada;
      case Inseto:
        return outro == Planta || outro == Psiquico || outro == Noturno;
      case Fantasma:
        return outro == Psiquico || outro == Fantasma;
      case Dragao:
        return outro == Dragao;
      case Aco:
        return outro == Gelo || outro == Pedra || outro == Fada;
      case Fada:
        return outro == Lutador || outro == Dragao || outro == Noturno;
      case Noturno:
        return outro == Psiquico || outro == Fantasma;
      case Normal:
        return false;
      default:
        return false;
    }
  }

  public boolean isFracoContra(Tipo outro) {

    switch (this) {
      case Fogo:
        return outro == Agua || outro == Pedra || outro == Terra;
      case Agua:
        return outro == Eletrico || outro == Planta;
      case Planta:
        return outro == Fogo || outro == Gelo || outro == Voador || outro == Inseto || outro == Veneno;
      case Eletrico:
        return outro == Terra;
      case Terra:
        return outro == Agua || outro == Gelo || outro == Planta;
      case Pedra:
        return outro == Agua || outro == Planta || outro == Lutador || outro == Terra || outro == Aco;
      case Gelo:
        return outro == Fogo || outro == Lutador || outro == Pedra || outro == Aco;
      case Lutador:
        return outro == Voador || outro == Psiquico || outro == Fada;
      case Voador:
        return outro == Eletrico || outro == Gelo || outro == Pedra;
      case Psiquico:
        return outro == Inseto || outro == Fantasma || outro == Noturno;
      case Veneno:
        return outro == Terra || outro == Psiquico;
      case Inseto:
        return outro == Fogo || outro == Voador || outro == Pedra;
      case Fantasma:
        return outro == Fantasma || outro == Noturno;
      case Dragao:
        return outro == Gelo || outro == Dragao || outro == Fada;
      case Aco:
        return outro == Fogo || outro == Lutador || outro == Terra;
      case Fada:
        return outro == Veneno || outro == Aco;
      case Noturno:
        return outro == Lutador || outro == Inseto || outro == Fada;
      case Normal:
        return outro == Lutador;
      default:
        return false;
    }
  }

}