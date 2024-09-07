
public class ComSenha implements EstadoCaixaAutomatico {

	@Override
	public void inserirCartao(CaixaAutomatico caixa) {
		System.out.println("Voc� j� inseriu o cart�o e digitou a senha.");
	}

	@Override
	public void digitarSenha(CaixaAutomatico caixa) {
		System.out.println("Voc� j� havia digitado a senha.");	
	}

	@Override
	public void ejetarCartao(CaixaAutomatico caixa) {
		System.out.println("Tem certeza? Aqui est� seu cart�o.");
		caixa.setMeuEstado(new SemCartao());
	}

	@Override
	public void retirarDinheiro(CaixaAutomatico caixa) {
		System.out.println("Aqui est� seu dinheiro e seu cart�o.");
		caixa.setMeuEstado(new SemCartao());
	}

}
