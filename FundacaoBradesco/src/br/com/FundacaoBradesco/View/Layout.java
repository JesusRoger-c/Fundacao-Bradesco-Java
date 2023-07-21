package br.com.FundacaoBradesco.View;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame{
	
	public Layout() {
		super("Meu Layout");
	
	getContentPane().add(BorderLayout.NORTH, new JButton("Botao Norte"));
	getContentPane().add(BorderLayout.SOUTH, new JButton("Botao Sul"));
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300,300);
	setVisible(true);
	
	}
	
	
	
   
	public static void main(String[] args) {
		new Layout();
	}

}
