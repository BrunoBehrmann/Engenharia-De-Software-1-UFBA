package blogEngenhariaDeSoftware;

import java.util.Date;

public class Comentario extends Conteudo {
	private int idComentario;
	private Usuario autor;
	
    public Comentario(String texto, Blog blog, Date dataCriacao, Usuario autor) {
        super(texto, blog, dataCriacao, autor);
    }
    
	public int getIdComentario() {
		return idComentario;
	}
	
	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}
	
	public Usuario getAutor() {
		return this.autor;
	}
	
	public void setAutor(Usuario usuario) {
		this.autor = usuario;
	}
	
}
