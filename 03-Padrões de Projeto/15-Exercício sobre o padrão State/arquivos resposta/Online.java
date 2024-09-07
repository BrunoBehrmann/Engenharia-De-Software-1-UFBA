package state;

public class Online implements State {

	@Override
	public void fazerLogin(Aplicativo app) {
		System.out.println("Você já está online");
	}

	@Override
	public void sair(Aplicativo app) {
		System.out.println("Saindo...");
		app.setMeuestado(new Offline());
	}

	@Override
	public void conectar(Aplicativo app) {
		System.out.println("Conectando...");
		app.setMeuestado(new Conectado());
	}

}
