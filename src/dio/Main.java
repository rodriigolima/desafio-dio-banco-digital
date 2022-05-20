package dio;

public class Main {

	public static void main(String[] args) {
		
		Cliente rodrigo = new Cliente();
		rodrigo.setNome("Rodrigo");
		
		IConta cc = new ContaCorrente(rodrigo);
		
		IConta cp = new ContaPoupanca(rodrigo);
		
		
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
