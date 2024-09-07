package state;

public interface State {
	public void fazerLogin(Aplicativo app);
	public void sair(Aplicativo app);
	public void conectar(Aplicativo app);
}
