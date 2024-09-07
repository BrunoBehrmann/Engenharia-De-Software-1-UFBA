package obs;

import java.util.Date;

public class GGN implements Observador {
	
	private int codigo;
	private float valorDeCompra;
	private float valorDeVenda;
	private String tipo;
	private String dataDeVencimento;
	private String dataDeLançamento;

	@Override
	public void update(Titulo titulo) {
		this.codigo = titulo.getCodigo();
		this.valorDeCompra = titulo.getValorDeCompra();
		this.valorDeVenda = titulo.getValorDeVenda();
		this.tipo = titulo.getTipo();
		this.dataDeVencimento = titulo.getDataDeVencimento();
		this.dataDeLançamento = titulo.getDataDeLançamento();
		display();
	}
	
	public void display() {
		System.out.println("--- GNN ---");
		System.out.println("codigo: " + codigo);
		System.out.println("valorDeCompra: R$" + valorDeCompra);
		System.out.println("valorDeVenda: R$" + valorDeVenda);
		System.out.println("tipo: " + tipo);
		System.out.println("dataDeVencimento: " + dataDeVencimento);
		System.out.println("dataDeLançamento: " + dataDeLançamento);
		System.out.println("--- --- ---");
	}

}
