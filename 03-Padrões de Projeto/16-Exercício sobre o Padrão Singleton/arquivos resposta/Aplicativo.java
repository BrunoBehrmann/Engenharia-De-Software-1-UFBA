package sigleton;

public class Aplicativo {
	
	private State estadoAtual = Offline.getInstancia();
	
	public void fazerLogin() {
		estadoAtual.fazerLogin(this);
	}

	public void sair() {
		estadoAtual.sair(this);
	}
	
	public void conectar() {
		estadoAtual.conectar(this);
	}
	
	public void setMeuestado(State novoEstado) {
		this.estadoAtual = novoEstado;
	}
}
