package br.com.FundacaoBradesco.POO;

public class MatematicaTeste {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		int maior = m.maior(20, 59);
		System.out.println(maior);
		
		
		double somas = m.soma(20, 80);
		System.out.println(somas);

	}

}
