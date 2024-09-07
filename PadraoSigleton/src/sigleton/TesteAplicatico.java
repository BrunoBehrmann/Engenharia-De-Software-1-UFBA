package sigleton;

public class TesteAplicatico {
	public static void main(String[] args) {
		Aplicativo app = new Aplicativo();
		
		app.sair();
		app.conectar();
		app.fazerLogin();
		
		app.fazerLogin();
		app.sair();
		
		app.fazerLogin();
		app.conectar();
		app.fazerLogin();
		app.conectar();
		app.sair();
		app.sair();
		
	}
}
