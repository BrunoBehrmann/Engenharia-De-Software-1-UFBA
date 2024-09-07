package state;

public class Offline implements State {

	@Override
	public void fazerLogin(Aplicativo app) {
		System.out.println("Fazendo login...");
		app.setMeuestado(new Online());
	}

	@Override
	public void sair(Aplicativo app) {
		System.out.println("Você não está online");
	}

	@Override
	public void conectar(Aplicativo app) {
		System.out.println("Impossível conectar, pois você está offline");
	}

}
