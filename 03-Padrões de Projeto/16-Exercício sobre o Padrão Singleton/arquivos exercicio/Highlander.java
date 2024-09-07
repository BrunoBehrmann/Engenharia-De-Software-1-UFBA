
public class Highlander {
	
	private static Highlander instancia;
	private String nome;
	private String sobrenome;
	
	private Highlander() {};
	
	public static Highlander obterInstancia() {
		if (instancia == null) {
			instancia = new Highlander();
		}
		return instancia;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		sobrenome = sobrenome;
	}
}
