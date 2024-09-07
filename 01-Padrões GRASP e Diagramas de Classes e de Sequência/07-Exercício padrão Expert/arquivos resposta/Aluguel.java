public class Aluguel {
  private Fita fita;
  private int diasAlugada;

  public Aluguel(Fita fita, int diasAlugada) {
    this.fita = fita;
    this.diasAlugada = diasAlugada;
  }

  public Fita getFita() {
    return fita;
  }

  public int getDiasAlugada() {
    return diasAlugada;
  }

  // agora Aluguel que passa a fazer os calculos

  public double calculaValor() {
    double valorCorrente = 0.0;
    switch (fita.getCodigoDePreco()) {
      case Fita.NORMAL:
        valorCorrente += 2;
        if (diasAlugada > 2) {
          valorCorrente += (diasAlugada - 2) * 1.5;
        }
        break;
      case Fita.LANCAMENTO:
        valorCorrente += diasAlugada * 3;
        break;
      case Fita.INFANTIL:
        valorCorrente += 1.5;
        if (diasAlugada > 3) {
          valorCorrente += (diasAlugada - 3) * 1.5;
        }
        break;
    }
    return valorCorrente;
  }

  public int calculaPontosDeAlugadorFrequente() {
    int pontos = 1;
    if (fita.getCodigoDePreco() == Fita.LANCAMENTO && diasAlugada > 1) {
      pontos++;
    }
    return pontos;
  }
}
