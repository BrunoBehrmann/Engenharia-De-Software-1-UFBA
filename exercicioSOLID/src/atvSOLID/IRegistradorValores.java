package atvSOLID;

/**
 * Seguindo o principio de Inversao de Dependencia, foi criado 
 * uma interface para que a forma de registro dependa nao de uma 
 * classe mas sim de uma interface.
 */

public interface IRegistradorValores {
	
	public void registraValor(int ano, int mes, double valor);
	
}
