package br.com.FundacaoBradesco.JavaBasico;

import java.util.Arrays;

public class ArraySimples4 {

	public static void main(String[] args) {
		
		String[] paises  = {"Brasil", "Italia", "Roma", "Argentina", "Bolivia"};

		Arrays.sort(paises, 0, paises.length); //ordena em ordem alfabetica
		System.out.println(Arrays.toString(paises));
	}

}
