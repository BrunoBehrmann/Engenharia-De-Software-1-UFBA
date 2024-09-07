
public class TesteCaixaAutomatico {

	public static void main(String[] args) {
		CaixaAutomatico caixa = new CaixaAutomatico();
		
		caixa.ejetarCartao();
		caixa.retirarDinheiro();
		caixa.digitarSenha();
		caixa.inserirCartao();
		
		caixa.inserirCartao();
		caixa.ejetarCartao();
		
		caixa.inserirCartao();
		caixa.retirarDinheiro();
		caixa.digitarSenha();
		
		caixa.inserirCartao();
		caixa.digitarSenha();
		caixa.retirarDinheiro();
	}

}
