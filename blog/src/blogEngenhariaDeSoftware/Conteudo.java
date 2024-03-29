package blogEngenhariaDeSoftware;

import java.util.Date;

public abstract class Conteudo {
    private String texto;
    private Date dataCriacao;
    private Usuario autor;

    public Conteudo(String texto, Date dataCriacao, Usuario autor) {
        this.texto = texto;
        this.dataCriacao = dataCriacao;
        this.autor = autor;
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