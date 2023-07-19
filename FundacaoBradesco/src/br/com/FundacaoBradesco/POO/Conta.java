package br.com.FundacaoBradesco.POO;

public class Conta {
	
	String cliente;
	double saldo;
	
	// metodo para exibicao de saldo
	void exibirSaldo() {
		System.out.println(cliente + ", seu saldo e: " + saldo);
	}
	
	// metodo para saque do valor 
	void saque(double valor) {
		saldo -= valor;
	}
	
	// metodo para deposito
	void deposita (double valor) {
		saldo += valor;
	}
	
	// metodo de tranferencia 
	void tranferenciaConta(Conta destino, double valor) {
		this.saque(valor);
		destino.deposita(valor);
		
	}

}
