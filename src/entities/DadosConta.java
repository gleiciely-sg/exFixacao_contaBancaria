package entities;

public class DadosConta {
	
	private int conta;
	private double saldo;
	private String nome;
	
	//construtor
	public DadosConta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public DadosConta(int conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		depositarValor(depositoInicial);
	}
	
	
	//obter atributos
	public int getConta() {
		return conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	//alterar atributos
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void depositarValor(double deposito) {
		this.saldo += deposito;
	}
	
	public void sacarValor(double saque) {
		this.saldo -= saque + 5.00;
	}
	
	public String saldo() {
		return "\n==================================\n"
				+ "SALDO: "
				+ String.format("%.2f", saldo)
				+ "\n==================================\n";
	}	
	
	public String saldoNegativo() {
		return "\n==================================\n"
				+"ATENÇÃO\n"
				+"AO REALIZAR ESTE SAQUE, SEU SALDO\n"
				+"FICARÁ NEGATIVO \n"
				+"DEPOSITE O VALOR NEGATIVO EM ATÉ 24H \n"
				+"PARA NÃO INCIDIR ENCARGOS\n"
				+"==================================\n";
	}	
	
	public String toString() {
		return "\n==================================\n"
				+"DADOS DA CONTA:\n"
				+"CONTA: "
				+ conta
				+"\nNOME DO TITULAR: "
				+ nome
				+"\nSALDO INICIAL: "
				+ String.format("%.2f", saldo)
				+"\n==================================\n";
	}

}
