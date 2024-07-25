package segregacaoDeInterfaces.revista;

import segregacaoDeInterfaces.geral.IItemBiblioteca;

public interface IRevista extends IItemBiblioteca {
	public String getFrequencia();
	public void setFrequencia();
	
	public int getNumeroPaginas();
	public void setNumeroPaginas(int numeroPaginas);
}
