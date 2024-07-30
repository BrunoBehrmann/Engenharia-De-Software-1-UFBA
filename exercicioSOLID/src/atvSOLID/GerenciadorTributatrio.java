package atvSOLID;

import java.util.List;

public class GerenciadorTributatrio {

	public void registraTotalImpostoMes(int ano, int mes, List<Venda> vendasMes) {
		
		ICalculadorImposto imp = Fabrica.criarCalculadorImposto();
		double imposto = imp.calculaImposto(vendasMes);
		
		IRegistradorValores registro = Fabrica.criarRegistradorValores();
		registro.registraValor(ano, mes, imposto);
		
	}

}
