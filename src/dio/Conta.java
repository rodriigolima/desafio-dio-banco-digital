package dio;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	

	public Conta(Cliente cliente){
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
		
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;		
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor;	
	}
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfos() {
		System.err.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.err.println(String.format("Agencia: %d", this.agencia));
		System.err.println(String.format("Número: %d", this.numero));
		System.err.println(String.format("Saldo: %.2f", this.saldo));
	}
	
}
