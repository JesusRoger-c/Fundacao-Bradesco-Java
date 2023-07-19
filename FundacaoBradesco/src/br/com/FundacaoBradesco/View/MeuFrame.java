package br.com.FundacaoBradesco.View;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame {
	
	
	public MeuFrame() {
		
		
		super ("Meu Frame");
		
		JButton entrar = new JButton("Entrar");
		
		
		getContentPane().add(entrar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MeuFrame();
	}
	

}
