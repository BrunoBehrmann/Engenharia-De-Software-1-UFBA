package obs;

import java.util.ArrayList;
import java.util.Date;

public class Titulo implements Sujeito {
	
	private ArrayList<Observador> observadores;
	
	private int codigo;
	private float valorDeCompra;
	private float valorDeVenda;
	private String tipo;
	private String dataDeVencimento;
	private String dataDeLançamento;
	
	Titulo(int codigo, float valorDeCompra, float valorDeVenda, String tipo, String dataDeVencimento, String dataDeLançamento){
		this.codigo = codigo;
		this.valorDeCompra = valorDeCompra;
		this.valorDeVenda = valorDeVenda;
		this.tipo = tipo;
		this.dataDeVencimento = dataDeVencimento;
		this.dataDeLançamento = dataDeLançamento;
		observadores = new ArrayList<Observador>();
	}
	
	public void inscreverObservador(Observador o) {
		observadores.add(o);
	}
	
	public void removerObservador(Observador o) {
		int i = observadores.indexOf(o);
		if (i >= 0) {
			observadores.remove(i);
		}
	}
	
	public void notificarObservadores() {
		for (int i = 0; i < observadores.size(); i++) {
			Observador observador = observadores.get(i);
			observador.update(this);
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
		notificarObservadores();
	}

	public float getValorDeCompra() {
		return valorDeCompra;
	}

	public void setValorDeCompra(float valorDeCompra) {
		this.valorDeCompra = valorDeCompra;
		notificarObservadores();
	}

	public float getValorDeVenda() {
		return valorDeVenda;
	}

	public void setValorDeVenda(float valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
		notificarObservadores();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
		notificarObservadores();
	}

	public String getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(String dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
		notificarObservadores();
	}

	public String getDataDeLançamento() {
		return dataDeLançamento;
	}

	public void setDataDeLançamento(String dataDeLançamento) {
		this.dataDeLançamento = dataDeLançamento;
		notificarObservadores();
	}
	
}
