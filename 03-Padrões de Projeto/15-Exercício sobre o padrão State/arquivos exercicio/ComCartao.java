
public class ComCartao implements EstadoCaixaAutomatico {

	@Override
	public void inserirCartao(CaixaAutomatico caixa) {
		System.out.println("J� h� um cart�o na m�quina.");
	}

	@Override
	public void digitarSenha(CaixaAutomatico caixa) {
		System.out.println("�timo. Senha v�lida.");
		caixa.setMeuEstado(new ComSenha());
	}

	@Override
	public void ejetarCartao(CaixaAutomatico caixa) {
		System.out.println("Aqui est� seu cart�o.");
		caixa.setMeuEstado(new SemCartao());
	}

	@Override
	public void retirarDinheiro(CaixaAutomatico caixa) {
		System.out.println("Antes de tirar dinheiro, digite a senha.");
	}

}
