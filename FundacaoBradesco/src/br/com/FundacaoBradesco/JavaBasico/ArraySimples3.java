package br.com.FundacaoBradesco.JavaBasico;

import java.util.Arrays;

public class ArraySimples3 {

	public static void main(String[] args) {
		
		String[] paises  = {"Brasil", "Italia", "Roma", "Argentina"};

		System.out.println(paises[0]);
		System.out.println(Arrays.toString(paises));
		
		int posicao = Arrays.binarySearch(paises, "Brasil");
		System.out.println("A posicao do Brasil e: " + posicao);

	}

}
