package gui;

import javax.swing.*;

import constants.CommonsConstants;

@SuppressWarnings("serial")
public class Form extends JFrame {
	
	public Form(String title) {
		super(title);
		setSize(520,680);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		//mudar a cor de fundo do GUI
		
		getContentPane().setBackground(CommonsConstants.PRIMARY_COLOR);
	}
	
}
