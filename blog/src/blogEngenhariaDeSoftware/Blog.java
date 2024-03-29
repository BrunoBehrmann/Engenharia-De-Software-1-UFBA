package blogEngenhariaDeSoftware;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {
    private String titulo;
    private Date dataCriacao;
    private Usuario dono;
    private List<Conteudo> conteudos;

    public Blog(String titulo, Date dataCriacao, Usuario dono) {
        this.titulo = titulo;
        this.dataCriacao = dataCriacao;
        this.dono = dono;
        this.conteudos = new ArrayList<>();
    }

    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public void removerConteudo(Conteudo conteudo) {
        this.conteudos.remove(conteudo);
    }

 // Métodos getter para acessar os atributos título, dataCriacao e dono
    public String getTitulo() {
        return titulo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Usuario getDono() {
        return dono;
    }
    
    public List<Conteudo> getConteudos() {
    	return conteudos;
    }
    // Outros métodos da classe...
}