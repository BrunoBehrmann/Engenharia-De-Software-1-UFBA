package obs;

public class ExemploMonitoramento {

	public static void main(String[] args) {
		
		Google google = new Google();
		GGN ggn = new GGN();
		Uol uol = new Uol();
		
		Titulo titulo01 = new Titulo(001, 1000, 500, "padrao", "10/10/2024", "01/10/2024");
		titulo01.inscreverObservador(google);
		titulo01.inscreverObservador(ggn);
		titulo01.inscreverObservador(uol);
		
		Titulo titulo02 = new Titulo(002, 99999, 80000, "tipo 06", "20/12/2024", "30/11/2024");
		titulo02.inscreverObservador(ggn);
		titulo02.inscreverObservador(uol);
		
		Titulo titulo03 = new Titulo(003, 151515, 141515, "tipo 09", "05/01/2025", "01/01/2025");
		titulo03.inscreverObservador(google);
		titulo03.inscreverObservador(uol);
		
		Titulo titulo04 = new Titulo(003, 151515, 141515, "tipo 09", "05/01/2025", "01/01/2025");
		titulo04.inscreverObservador(google);
		
		System.out.println("alteração titulo01");
		titulo01.setTipo("outro");
		System.out.println();
		
		titulo01.removerObservador(uol);
		System.out.println("alteração titulo01 após remover um observador");
		titulo01.setTipo("novo");
		System.out.println("-----------------------------\n\n\n");
		
		
		
		System.out.println("alteração titulo02");
		titulo02.setDataDeVencimento("31/12/2024");
		System.out.println("-----------------------------\n\n\n");
		
		
		
		System.out.println("alteração titulo03");
		titulo03.setValorDeCompra(95959);
		System.out.println("-----------------------------\n\n\n");
		
		
		
		System.out.println("alteração titulo04");
		titulo04.setValorDeVenda(0);
		System.out.println();
		
		titulo04.removerObservador(google);
		
		System.out.println("alteração titulo04 sem observadores");
		titulo04.setValorDeVenda(10);
		
	}
}
