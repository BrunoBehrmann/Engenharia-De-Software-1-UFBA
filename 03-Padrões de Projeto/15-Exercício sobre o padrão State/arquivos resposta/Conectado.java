package state;

public class Conectado implements State {

	@Override
	public void fazerLogin(Aplicativo app) {
		System.out.println("Você já está online");
	}

	@Override
	public void sair(Aplicativo app) {
		System.out.println("Desconectando...");
		app.setMeuestado(new Online());
	}

	@Override
	public void conectar(Aplicativo app) {
		System.out.println("Você já está conectado");
	}

}
