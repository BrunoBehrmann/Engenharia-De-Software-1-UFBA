package invDep;

public class MecanismoLog implements IMecanismoLog {
	
	@Override
	public void registrar(String mensagem) {
		System.out.println(mensagem);
	}
}
