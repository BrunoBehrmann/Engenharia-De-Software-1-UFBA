
public class SemCartao implements EstadoCaixaAutomatico {

	@Override
	public void inserirCartao(CaixaAutomatico caixa) {
		System.out.println("Agora digite a senha");
		caixa.setMeuEstado(new ComCartao());
	}

	@Override
	public void digitarSenha(CaixaAutomatico caixa) {
		System.out.println("Antes de digitar a senha, insira o cart�o");
	}

	@Override
	public void ejetarCartao(CaixaAutomatico caixa) {
		System.out.println("N�o h� cart�o na m�quina");
	}

	@Override
	public void retirarDinheiro(CaixaAutomatico caixa) {
		System.out.println("Antes de tirar o dinheiro, insira o cart�o e digite a senha");
	}
	
}
