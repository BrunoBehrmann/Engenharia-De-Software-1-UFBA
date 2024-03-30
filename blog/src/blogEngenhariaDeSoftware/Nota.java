package blogEngenhariaDeSoftware;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Nota extends Conteudo {
    private List<Comentario> comentarios;

    public Nota(String textoNota, Blog blogNota, Date dataCriacaoNota, Usuario autorNota) {
        super(textoNota, blogNota, dataCriacaoNota, autorNota);
        this.comentarios = new ArrayList<>();
    }

    public void adicionarComentario(Comentario comentario, Usuario usuario) {
        int idComentario = comentarios.size() + 1; // Obtém o tamanho atual da lista e adiciona 1 para obter o próximo ID
        comentario.setIdComentario(idComentario);
        comentario.setAutor(usuario);
        comentarios.add(comentario);
    }

    public void removerComentario(int idComentario) {
        Iterator<Comentario> iterator = comentarios.iterator();
        while (iterator.hasNext()) {
            Comentario comentarioAtual = iterator.next();
            if (comentarioAtual.getIdComentario() == idComentario) {
                iterator.remove(); // Remove o comentário usando o iterador
            }
        }
        // Redefine os IDs dos comentários após a remoção
        for (int i = 0; i < comentarios.size(); i++) {
            comentarios.get(i).setIdComentario(i + 1);
        }
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
        if (this.getComentarios().isEmpty()) {
            System.out.println("Não há comentários.");
        } else {
        	System.out.println("COMENTARIOS:");
        	for (Comentario comentario : this.getComentarios()) {
                System.out.println("         " + comentario.getIdComentario() + ". " + comentario.getAutor().getNome() + ":  " + comentario.getTexto());
            }
        }
    }
}
