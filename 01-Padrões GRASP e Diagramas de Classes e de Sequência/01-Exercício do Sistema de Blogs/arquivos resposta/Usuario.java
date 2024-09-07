package blogEngenhariaDeSoftware;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String email;
    private String nome;
    private List<Blog> blogs;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.blogs = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
    
    public List<Blog> getBlogs() {
    	return blogs;
    }
    
    public void adicionarBlogUsuario(Blog blog) {
        blogs.add(blog);
    }

    public void removerBlogUsuario(Blog blog) {
        blogs.remove(blog);
    }
}
