package a4inversaoDeDependencias.invDep;

public class Fabrica {
	public static IFuncionario criarFuncionario() {
		return new Funcionario();
	}
	
	public static ITarefa criarTarefa() {
		return new Tarefa(criarMecanismoLog(), criarMecanismoMensagem());
	}
	
	public static IMecanismoLog criarMecanismoLog() {
		return new MecanismoLog();
	}
	
	public static IMecanismoMensagem criarMecanismoMensagem() {
		return new MecanismoSms();
	}
}
