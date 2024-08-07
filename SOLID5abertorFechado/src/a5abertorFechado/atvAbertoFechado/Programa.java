package a5abertorFechado.atvAbertoFechado;

import java.util.*;

import a5abertorFechado.atvAbertoFechado.candidato.CandidatoDiretor;
import a5abertorFechado.atvAbertoFechado.candidato.CandidatoGenerico;
import a5abertorFechado.atvAbertoFechado.candidato.CandidatoGerente;
import a5abertorFechado.atvAbertoFechado.candidato.ICandidato;
import a5abertorFechado.atvAbertoFechado.empregado.Empregado;

public class Programa {

	public static void main(String[] args) {
		List<ICandidato> candidatos = new ArrayList<ICandidato>();
	    candidatos.add(new CandidatoGenerico("Carlos", "Silva"));
	    candidatos.add(new CandidatoGerente("Maria", "Souza"));
	    candidatos.add(new CandidatoDiretor("Ana", "Lopes"));

	    List<Empregado> empregados = new ArrayList<Empregado>();
	    //CriadorContasGenerico criadorContas = new CriadorContasGenerico();

	    for (ICandidato candidato: candidatos)
	    {
	        empregados.add(candidato.obterCriadorContas() .criar(candidato));
	    }

	    for (Empregado empregado: empregados)
	    {
	        System.out.println(empregado.getNome() + " " + empregado.getSobrenome() + " " + empregado.getEmail() + " Gerente: " + empregado.isGerente() + " Diretor: " + empregado.isDiretor());
	    }

	}

}
