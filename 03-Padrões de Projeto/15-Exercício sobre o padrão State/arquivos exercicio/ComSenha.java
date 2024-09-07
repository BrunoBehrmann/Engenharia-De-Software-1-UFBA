
public class ComSenha implements EstadoCaixaAutomatico {

	@Override
	public void inserirCartao(CaixaAutomatico caixa) {
		System.out.println("Você já inseriu o cartão e digitou a senha.");
	}

	@Override
	public void digitarSenha(CaixaAutomatico caixa) {
		System.out.println("Você já havia digitado a senha.");	
	}

	@Override
	public void ejetarCartao(CaixaAutomatico caixa) {
		System.out.println("Tem certeza? Aqui está seu cartão.");
		caixa.setMeuEstado(new SemCartao());
	}

	@Override
	public void retirarDinheiro(CaixaAutomatico caixa) {
		System.out.println("Aqui está seu dinheiro e seu cartão.");
		caixa.setMeuEstado(new SemCartao());
	}

}
