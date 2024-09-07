package srp;

import java.io.IOException;

public class Programa {

  public static void main(String[] args) throws IOException {
	  
	GerenciaMensagens.MensagemInicial();
	  
	Pessoa usuario = ObterDadosPessoa.ObterDados();
	
	ValidaUsuario.valida(usuario);
	
	CriadorID.CriaID(usuario);
	
	GerenciaMensagens.MensagemFinal();

  }

}