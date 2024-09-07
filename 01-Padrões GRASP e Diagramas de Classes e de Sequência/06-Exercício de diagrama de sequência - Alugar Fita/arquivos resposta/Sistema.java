package dgm;

import java.util.List;

/**
 * Foi necessário criar os metodos buscaCliente(String nome) e buscaFita(String titulo) na classe Sistema
 * para que seja possível o sistema poder encontrar cliente e a fita nas listas.
 */

public class Sistema {
    private List<Cliente> clientes;
    private List<Fita> fitas;

    public Sistema(List<Cliente> clientes, List<Fita> fitas) {
        this.clientes = clientes;
        this.fitas = fitas;
    }

    public void alugarFita(String nomeCliente, String tituloFita, int diasAlugada) {
        Cliente cliente = buscaCliente(nomeCliente);
        Fita fita = buscaFita(tituloFita);
        Aluguel a = new Aluguel(fita, diasAlugada);
        cliente.adicionaAluguel(a);
    }

    private Cliente buscaCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    private Fita buscaFita(String titulo) {
        for (Fita fita : fitas) {
            if (fita.getTitulo().equals(titulo)) {
                return fita;
            }
        }
        return null;
    }
}
