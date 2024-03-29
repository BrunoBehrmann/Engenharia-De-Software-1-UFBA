package blogEngenhariaDeSoftware;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Nota extends Conteudo {
    private List<Comentario> comentarios;

    public Nota(String textoNota, Blog blogNota, Date dataCriacaoNota, Usuario autorNota) {
        super(textoNota, blogNota, dataCriacaoNota, autorNota);
        this.comentarios = new ArrayList<>();
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void removerComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public String getTextoNota() {
        return this.getTexto();
    }

    public Blog getBlogNota() {
        return this.getBlog();
    }

    public Date getDataCriacaoNota() {
        return this.getDataCriacao();
    }

    public Usuario getAutorNota() {
        return this.getAutor();
    }

    public void getNota() {
        System.out.println("Data da nota: " + this.getDataCriacaoNota());
        System.out.println("Nota: " + this.getTextoNota());
        System.out.println("Comentários: ");
        for (Comentario comentario : this.getComentarios()) {
            System.out.println(" - " + comentario.getTexto());
        }
    }
}
