package strategy;

public class Fita {

  private String titulo;
  // não vai mais precisar de codigoDePreco pois a estrategia sera feita no momento da criacao do objeto
  private ICalculoPorCodigo calculoPorCodigo;

  public Fita(String titulo, ICalculoPorCodigo calculoPorCodigo) {
    this.titulo = titulo;
    this.calculoPorCodigo = calculoPorCodigo;
  }

  public String getTitulo() {
    return titulo;
  }
  
  public void setCalculoPorCodigo(ICalculoPorCodigo novoCalculo) {
	  this.calculoPorCodigo = novoCalculo;
  }
  
  public double calcularValorAluguel(int diasAlugada) {
	  return calculoPorCodigo.CalculaPreco(diasAlugada);
  }
}

