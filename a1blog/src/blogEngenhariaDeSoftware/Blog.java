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

    public void adicionarNota(Nota nota, Usuario usuario) {
    	if (usuario == this.dono) {
            this.nota.add(nota);
            System.out.println("Nota adicionada com sucesso.");
        } else {
            System.out.println("Apenas o dono deste Blog pode adicionar notas.");
        }
    }

    public void removerNota(Nota nota, Usuario usuario) {
    	if (usuario == this.dono) {
            if (this.nota.contains(nota)) {
                this.nota.remove(nota);
                System.out.println("Nota removida com sucesso.");
            } else {
                System.out.println("Esta nota não está presente na lista.");
            }
        } else {
            System.out.println("Apenas o dono desta nota pode removê-la.");
        }
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
    
    public List<Nota> getNotas() {
    	return nota;
    }
    
    public void getBlog() {
    	System.out.println("Dono: " + this.getDono());
    	System.out.println("Título: " + this.getTitulo());
    	System.out.println("Data de criação: " + this.getDataCriacao());
    	System.out.println("Notas: " + this.getNotas());
    	return;
    }
}