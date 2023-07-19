package br.com.FundacaoBradesco.POO;

public class AnimalTeste {
	
	//Aplicando a herança

	public static void main(String[] args) {
		
		Gato lizzie = new Gato();
		lizzie.comida = "racao";
		lizzie.dormir();
		lizzie.emitirSom();
		
		
		Galinha cocorico = new Galinha();
		cocorico.peso = 2.00;
		cocorico.emitirSom();

	}

}
