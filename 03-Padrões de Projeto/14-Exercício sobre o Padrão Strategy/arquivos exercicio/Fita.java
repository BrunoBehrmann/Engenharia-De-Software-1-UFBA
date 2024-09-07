
public class Fita {
  public static final int NORMAL = 0;
  public static final int LANCAMENTO = 1;
  public static final int INFANTIL = 2;

  private String titulo;
  private int codigoDePreco;

  public Fita(String titulo, int codigoDePreco) {
    this.titulo = titulo;
    this.codigoDePreco = codigoDePreco;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getCodigoDePreco() {
    return codigoDePreco;
  }

  public void setCodigoDePreco(int codigoDePreco) {
    this.codigoDePreco = codigoDePreco;
  }
  
  public double calcularValorAluguel(int diasAlugada) {
	  double valorCorrente = 0;
      switch(codigoDePreco) {
      case NORMAL:
        valorCorrente += 2;
        if(diasAlugada > 2) {
          valorCorrente += (diasAlugada - 2) * 1.5;
        }
        break;
      case LANCAMENTO:
        valorCorrente += diasAlugada * 3;
      break;
      case INFANTIL:
        valorCorrente += 1.5;
        if(diasAlugada > 3) {
          valorCorrente += (diasAlugada - 3) * 1.5;
        }
        break;
      } // fim do switch
      
      return valorCorrente;
  }
}

