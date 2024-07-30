package a5abertorFechado.atvAbertoFechado.contas;

import a5abertorFechado.atvAbertoFechado.candidato.ICandidato;
import a5abertorFechado.atvAbertoFechado.candidato.ICriadorContas;
import a5abertorFechado.atvAbertoFechado.empregado.Empregado;

public class CriadorContasGenerico implements ICriadorContas{
    public Empregado criar(ICandidato candidato)
    {
        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        empregado.setEmail(candidato.getNome().substring(0, 1) + candidato.getSobrenome() + "@xpto.com");
        
        return empregado;
    }
}
