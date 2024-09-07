package obs;

public interface Sujeito {
	public void inscreverObservador(Observador o);
	public void removerObservador(Observador o);
	public void notificarObservadores();
}
