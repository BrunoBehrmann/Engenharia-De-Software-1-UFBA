package sigleton;

public class Offline implements State {
	
	private static Offline instancia;
	
	private Offline() {};
	
	public static Offline getInstancia() {
		if (instancia == null) {
			instancia = new Offline();
		}
		return instancia;
	}
	
	@Override
	public void fazerLogin(Aplicativo app) {
		System.out.println("Fazendo login...");
		app.setMeuestado(Online.getInstancia());
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
