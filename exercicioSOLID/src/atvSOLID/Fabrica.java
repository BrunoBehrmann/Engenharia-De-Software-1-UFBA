package atvSOLID;
/**
 * Seguindo o principio de aberto/fechado, essa classe foi criada
 * para que as alteracoes na forma de calculo de imposto e do registro
 * de valores possam ser fechadas para modificacao, no caso nao havera 
 * modificacoes na classe GerenciadorTributario e ela sera aberta para
 * extencoes atraves dessa classe fabria mudando a classe que ira 
 * implementar a interface.
 */
public class Fabrica {
	public static ICalculadorImposto criarCalculadorImposto() {
		return new CalculadorImposto();
	}
	
	public static IRegistradorValores criarRegistradorValores() {
		return new BancoDados();
	}
}
