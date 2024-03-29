package blogEngenhariaDeSoftware;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {
    private String titulo;
    private Date dataCriacao;
    private Usuario dono;
    private List<Nota> nota;

    public Blog(String titulo, Date dataCriacao, Usuario dono) {
        this.titulo = titulo;
        this.dataCriacao = dataCriacao;
        this.dono = dono;
        this.nota = new ArrayList<>();
    }

    public void adicionarNota(Nota nota) {
        this.nota.add(nota);
    }

    public void removerNota(Nota nota) {
        this.nota.remove(nota);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public String getDono() {
        return dono.getNome();
    }
    
    public List<Nota> getNota() {
    	return nota;
    }
    
    public void getBlog() {
    	System.out.println("Dono: " + this.getDono());
    	System.out.println("Título: " + this.getTitulo());
    	System.out.println("Data de criação: " + this.getDataCriacao());
    	System.out.println("Notas: " + this.getNota());
    	return;
    }
}