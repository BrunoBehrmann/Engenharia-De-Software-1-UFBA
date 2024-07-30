package a5abertorFechado.atvAbertoFechado.contas;

import a5abertorFechado.atvAbertoFechado.candidato.ICandidato;
import a5abertorFechado.atvAbertoFechado.candidato.ICriadorContas;
import a5abertorFechado.atvAbertoFechado.empregado.Empregado;

public class CriadorContasDiretor implements ICriadorContas{
	
	@Override
	public Empregado criar(ICandidato candidato) {
		Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        empregado.setEmail(candidato.getNome() + candidato.getSobrenome() + "@xptodiretoria.com");
        empregado.setDiretor(true);
        
        return empregado;
	}
}
