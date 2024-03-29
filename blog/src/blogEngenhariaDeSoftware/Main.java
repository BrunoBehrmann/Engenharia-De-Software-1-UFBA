package blogEngenhariaDeSoftware;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando usuários
        Usuario usuario1 = new Usuario("Alice", "alice@example.com");
        Usuario usuario2 = new Usuario("Bob", "bob@example.com");

        // Criando um blog
        Blog blog = new Blog("Meu Blog", new Date(), usuario1);

        // Criando e adicionando uma nota ao blog
        Nota nota = new Nota("Primeira nota do blog", new Date(), usuario1);
        blog.adicionarConteudo(nota);

        // Criando e adicionando um comentário à nota
        Comentario comentario = new Comentario("Ótima nota!", new Date(), usuario2);
        blog.adicionarConteudo(comentario);

        // Exibindo informações do blog e de seus conteúdos
        System.out.println("Título do blog: " + blog.getTitulo());
        System.out.println("Data de criação do blog: " + blog.getDataCriacao());
        System.out.println("Dono do blog: " + blog.getDono().getNome());

        System.out.println("\nConteúdos do blog:");
        for (Conteudo conteudo : blog.getConteudos()) {
            System.out.println("- " + conteudo.getTexto() + " (Autor: " + conteudo.getAutor().getNome() + ")");
        }
    }
}
