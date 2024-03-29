package blogEngenhariaDeSoftware;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aplicacao {

	private List<Blog> blogs;

	public Blog criarBlog(String titulo, Date dataCriacao, Usuario dono) {
        Blog novoBlog = new Blog(titulo, dataCriacao, dono);
        adicionarBlog(novoBlog);
        return novoBlog;
    }
	
    public Aplicacao() {
        this.blogs = new ArrayList<>();
    }

    public void adicionarBlog(Blog blog) {
        blogs.add(blog);
    }

    public void removerBlog(Blog blog) {
        blogs.remove(blog);
    }

    public void lerConteudo(Blog blog, Conteudo conteudo) {
        // Implementação para ler conteúdo de um blog
    }

    public void criarNota(Blog blog, Nota nota) {
        // Implementação para criar uma nota em um blog
    }

    public void criarComentario(Nota nota, Comentario comentario) {
        // Implementação para criar um comentário em uma nota
    }

    public void removerConteudo(Blog blog, Conteudo conteudo) {
        // Implementação para remover conteúdo de um blog
    }

}
