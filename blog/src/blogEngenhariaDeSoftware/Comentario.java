package blogEngenhariaDeSoftware;

import java.util.Date;

public class Comentario extends Conteudo {

    public Comentario(String texto, Blog blog, Date dataCriacao, Usuario autor) {
        super(texto, blog, dataCriacao, autor);
    }
}
