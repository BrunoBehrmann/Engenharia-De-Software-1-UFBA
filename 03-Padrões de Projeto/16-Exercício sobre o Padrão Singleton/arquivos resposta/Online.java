package sigleton;

public class Online implements State {
	
	private static Online instancia;
	
	private Online() {};
	
	public static Online getInstancia() {
		if (instancia == null) {
			instancia = new Online();
		}
		return instancia;
	}

	@Override
	public void fazerLogin(Aplicativo app) {
		System.out.println("Você já está online");
	}

	@Override
	public void sair(Aplicativo app) {
		System.out.println("Saindo...");
		app.setMeuestado(Offline.getInstancia());
	}

	@Override
	public void conectar(Aplicativo app) {
		System.out.println("Conectando...");
		app.setMeuestado(Conectado.getInstancia());
	}

}
