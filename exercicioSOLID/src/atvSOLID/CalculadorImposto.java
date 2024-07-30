package atvSOLID;

import java.util.List;

/**
 * Conforme o princípio de Responsabilidade Unica foi criado 
 * uma classe para fazer o calculo do imposto, deixando a classe 
 * GerenciadorTributario mais coesa.
 * 
 * Essa Classe implementa a interface ICalculadorImposto seguindo
 * o princípio de Inversao de Dependencias, pois agora ela depende
 * de uma interface e nao de uma classe.
 */
public class CalculadorImposto implements ICalculadorImposto{
	@Override
	public double calculaImposto(List<Venda> vendas) {
		double imposto = 0;
		for (Venda venda : vendas)
		{	
			if (venda.getValor() < 1000)
				imposto += 0.05 * venda.getValor();
			else
				imposto += 0.07 * venda.getValor();
		}
		return imposto;
	}
}
