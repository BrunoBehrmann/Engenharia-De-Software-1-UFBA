package strategy;

public class CalculaPorCodigoLancamento implements ICalculoPorCodigo {

	@Override
	public double CalculaPreco(int diasAlugada) {
		return diasAlugada * 3;
	}

}
