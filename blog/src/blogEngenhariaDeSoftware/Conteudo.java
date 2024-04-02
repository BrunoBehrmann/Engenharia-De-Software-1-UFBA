package blogEngenhariaDeSoftware;

import java.util.Date;

public abstract class Conteudo {
	private Blog blog;
    private String texto;
    private Date dataCriacao;
    private Usuario autor;

    public Conteudo(String texto, Blog blog, Date dataCriacao, Usuario autor) {
        this.texto = texto;
        this.dataCriacao = dataCriacao;
        this.autor = autor;
    }
    
    public Blog getBlog() {
    	return blog;
    }
    
	public String getTexto() {
        return texto;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Usuario getAutor() {
        return autor;
    }
}