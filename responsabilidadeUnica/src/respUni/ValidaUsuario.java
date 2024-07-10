package respUni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidaUsuario {
	public static void valida(Pessoa usuario) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		if (usuario.getPrimeiroNome().isEmpty()) {
	      GerenciaMensagens.MensagemErroPrimeiroNome();
	      
	      return;
	    }
	    if (usuario.getUltimoNome().isEmpty()) {
	      GerenciaMensagens.MensagemErroUltimoNome();
	      teclado.readLine();
	      return;
	    }
	}
}
