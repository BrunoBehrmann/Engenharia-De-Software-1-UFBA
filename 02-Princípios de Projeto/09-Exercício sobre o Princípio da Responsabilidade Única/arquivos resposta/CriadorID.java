package srp;

public class CriadorID {
	public static void CriaID(Pessoa usuario) {
		System.out.println("Seu id de usuário é " + usuario.getPrimeiroNome().substring(0, 1) + usuario.getUltimoNome());
	}
}
