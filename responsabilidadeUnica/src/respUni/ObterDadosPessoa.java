package respUni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObterDadosPessoa {
	public static Pessoa ObterDados() throws IOException {
		Pessoa usuario = new Pessoa();

	    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("Qual é seu primeiro nome?");
	    usuario.setPrimeiroNome(teclado.readLine());

	    System.out.println("Qual é seu último nome?");
	    usuario.setUltimoNome(teclado.readLine());
	    
	    return usuario;
	}
}
