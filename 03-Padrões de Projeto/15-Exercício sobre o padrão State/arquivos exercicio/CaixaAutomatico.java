
public class CaixaAutomatico {
	private EstadoCaixaAutomatico meuEstado = new SemCartao();
	
	public void inserirCartao() {
		meuEstado.inserirCartao(this);
	}
	
	public void digitarSenha() {
		meuEstado.digitarSenha(this);
	}
	
	public void ejetarCartao() {
		meuEstado.ejetarCartao(this);
	}
	
	public void retirarDinheiro() {
		meuEstado.retirarDinheiro(this);
	}
	
	public void setMeuEstado(EstadoCaixaAutomatico novoEstado) {
		meuEstado = novoEstado;
	}
}
