package Tipos;

public enum Tipo {

  FOGO, AGUA, PLANTA, ELETRICO, TERRA, ROCHA, GELO, LUTADOR, VOADOR, PSIQUICO, VENENO, INSETO, FANTASMA, DRAGAO, ACO,
  FADA, NORMAL, NOTURNO;

  public boolean isForteContra(Tipo outro) {

    switch (this) {
      case FOGO:
        return outro == PLANTA || outro == GELO || outro == INSETO || outro == ACO;
      case AGUA:
        return outro == FOGO || outro == ROCHA || outro == TERRA;
      case PLANTA:
        return outro == AGUA || outro == ROCHA || outro == TERRA;
      case ELETRICO:
        return outro == AGUA || outro == VOADOR;
      case TERRA:
        return outro == FOGO || outro == ELETRICO || outro == VENENO || outro == ROCHA || outro == ACO;
      case ROCHA:
        return outro == FOGO || outro == GELO || outro == VOADOR || outro == INSETO;
      case GELO:
        return outro == PLANTA || outro == TERRA || outro == DRAGAO || outro == VOADOR;
      case LUTADOR:
        return outro == NORMAL || outro == GELO || outro == ROCHA || outro == ACO || outro == NOTURNO;
      case VOADOR:
        return outro == PLANTA || outro == LUTADOR || outro == INSETO;
      case PSIQUICO:
        return outro == LUTADOR || outro == VENENO;
      case VENENO:
        return outro == PLANTA || outro == FADA;
      case INSETO:
        return outro == PLANTA || outro == PSIQUICO || outro == NOTURNO;
      case FANTASMA:
        return outro == PSIQUICO || outro == FANTASMA;
      case DRAGAO:
        return outro == DRAGAO;
      case ACO:
        return outro == GELO || outro == ROCHA || outro == FADA;
      case FADA:
        return outro == LUTADOR || outro == DRAGAO || outro == NOTURNO;
      case NOTURNO:
        return outro == PSIQUICO || outro == FANTASMA;
      case NORMAL:
        return false;
      default:
        return false;
    }
  }

  public boolean isFracoContra(Tipo outro) {

    switch (this) {
      case FOGO:
        return outro == AGUA || outro == ROCHA || outro == TERRA;
      case AGUA:
        return outro == ELETRICO || outro == PLANTA;
      case PLANTA:
        return outro == FOGO || outro == GELO || outro == VOADOR || outro == INSETO || outro == VENENO;
      case ELETRICO:
        return outro == TERRA;
      case TERRA:
        return outro == AGUA || outro == GELO || outro == PLANTA;
      case ROCHA:
        return outro == AGUA || outro == PLANTA || outro == LUTADOR || outro == TERRA || outro == ACO;
      case GELO:
        return outro == FOGO || outro == LUTADOR || outro == ROCHA || outro == ACO;
      case LUTADOR:
        return outro == VOADOR || outro == PSIQUICO || outro == FADA;
      case VOADOR:
        return outro == ELETRICO || outro == GELO || outro == ROCHA;
      case PSIQUICO:
        return outro == INSETO || outro == FANTASMA || outro == NOTURNO;
      case VENENO:
        return outro == TERRA || outro == PSIQUICO;
      case INSETO:
        return outro == FOGO || outro == VOADOR || outro == ROCHA;
      case FANTASMA:
        return outro == FANTASMA || outro == NOTURNO;
      case DRAGAO:
        return outro == GELO || outro == DRAGAO || outro == FADA;
      case ACO:
        return outro == FOGO || outro == LUTADOR || outro == TERRA;
      case FADA:
        return outro == VENENO || outro == ACO;
      case NOTURNO:
        return outro == LUTADOR || outro == INSETO || outro == FADA;
      case NORMAL:
        return outro == LUTADOR;
      default:
        return false;
    }
  }

}