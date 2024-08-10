package strategy;

public class CalculaPorCodigoInfantil implements ICalculoPorCodigo {

	@Override
	public double CalculaPreco(int diasAlugada) {
		double valorCorrente = 1.5;
        if(diasAlugada > 3) {
          valorCorrente += (diasAlugada - 3) * 1.5;
        }
		return valorCorrente;
	}

}
