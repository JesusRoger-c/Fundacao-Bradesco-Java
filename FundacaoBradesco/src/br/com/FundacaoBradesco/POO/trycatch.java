package br.com.FundacaoBradesco.POO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch {
	
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Digite o primeiro Numero:    ");
			int a = s.nextInt();
			System.out.println("Digite Seu Segundo Numero: ");
			int b = s.nextInt();
			
			System.out.println(a / b);
			
		}catch(InputMismatchException e1){
			System.err.println(" Erro Capturado!! ");
			
		}catch(Throwable e2) {
		   System.err.println("Erro capturado!!");
		}
	}

}
