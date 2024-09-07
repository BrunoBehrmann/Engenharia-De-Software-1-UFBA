package sigleton;

public class Conectado implements State {
	
	private static Conectado instancia;
	
	private Conectado() {};
	
	public static Conectado getInstancia() {
		if (instancia == null) {
			instancia = new Conectado();
		}
		return instancia;
	}
	
	@Override
	public void fazerLogin(Aplicativo app) {
		System.out.println("Você já está online");
	}

	@Override
	public void sair(Aplicativo app) {
		System.out.println("Desconectando...");
		app.setMeuestado(Online.getInstancia());
	}

	@Override
	public void conectar(Aplicativo app) {
		System.out.println("Você já está conectado");
	}

}
