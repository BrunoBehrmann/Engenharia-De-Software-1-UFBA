package atvSOLID;

/**
* Essa Classe implementa a interface IRegistradorValores seguindo
* o princípio de Inversao de Dependencias, pois agora ela depende
* de uma interface e nao de uma classe.
*/
public class BancoDados implements IRegistradorValores{
	@Override
	public void registraValor(int ano, int mes, double valor) {
		System.out.println("Simulando o registro em banco de dados: " + ano + "/" + mes + " " + valor);
	}
}
