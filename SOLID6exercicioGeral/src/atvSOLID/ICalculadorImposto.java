package atvSOLID;

import java.util.List;

/**
 * Seguindo o principio de Inversao de Dependencia, foi criado 
 * uma interface para que a forma de calculo de imposto dependa 
 * nao de uma classe mas sim de uma interface.
 */
public interface ICalculadorImposto {
	
	public double calculaImposto(List<Venda> vendas);
}
