package blogEngenhariaDeSoftware;

public class Usuario {
    private String email;
    private String nome;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}
