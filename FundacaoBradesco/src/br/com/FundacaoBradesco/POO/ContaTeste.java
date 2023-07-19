package br.com.FundacaoBradesco.POO;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta Roger = new Conta();
		Roger.cliente = "Roger Gabriel";
		Roger.saldo = 3200.00;
		Roger.exibirSaldo();
		
		//Roger.saque(230);
		//Roger.exibirSaldo();
		
		
		//Roger.deposita(349);
		//Roger.exibirSaldo();
		
		
		Conta destino = new Conta();
		destino.cliente = "Julia Buscarini";
		destino.saldo = 20000.00;
		destino.exibirSaldo();

	}

}
