package br.com.FundacaoBradesco.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener {
	
	public Eventos() {
		super("Meus Eventos");
		
		
		JButton BCadastrar = new JButton("Cadastrar");
		BCadastrar.addActionListener(this);
		
		getContentPane().add(BCadastrar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	
	


	public static void main(String[] args) {
		new Eventos();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("cadastrado");
		
	}

}
