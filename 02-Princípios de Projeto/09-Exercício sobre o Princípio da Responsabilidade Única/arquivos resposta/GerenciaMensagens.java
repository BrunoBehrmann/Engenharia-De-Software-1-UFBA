package srp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GerenciaMensagens {
	public static void MensagemInicial() {
	    System.out.println("Seja bem-vinda ou bem-vindo.");		
	}
	
	public static void MensagemFinal() throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pressione Enter para finalizar o programa.");
		teclado.readLine();
		return;
	}
	
	public static void MensagemErroPrimeiroNome() throws IOException {
		System.out.println("Você não forneceu um primeiro nome válido");
		MensagemFinal();
	}
	
	public static void MensagemErroUltimoNome() throws IOException {
		System.out.println("Você não forneceu um último nome válido");
		MensagemFinal();
	}
}
