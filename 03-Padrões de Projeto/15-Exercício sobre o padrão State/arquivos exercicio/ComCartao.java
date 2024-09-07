
public class ComCartao implements EstadoCaixaAutomatico {

	@Override
	public void inserirCartao(CaixaAutomatico caixa) {
		System.out.println("Já há um cartão na máquina.");
	}

	@Override
	public void digitarSenha(CaixaAutomatico caixa) {
		System.out.println("Ótimo. Senha válida.");
		caixa.setMeuEstado(new ComSenha());
	}

	@Override
	public void ejetarCartao(CaixaAutomatico caixa) {
		System.out.println("Aqui está seu cartão.");
		caixa.setMeuEstado(new SemCartao());
	}

	@Override
	public void retirarDinheiro(CaixaAutomatico caixa) {
		System.out.println("Antes de tirar dinheiro, digite a senha.");
	}

}
