package strategy;

public class CalculaPorCodigoNormal implements ICalculoPorCodigo {

	@Override
	public double CalculaPreco(int diasAlugada) {
		double valorCorrente = 0;
		valorCorrente += 2;
        if(diasAlugada > 2) {
          valorCorrente += (diasAlugada - 2) * 1.5;
        }
        return valorCorrente;
	}

}
