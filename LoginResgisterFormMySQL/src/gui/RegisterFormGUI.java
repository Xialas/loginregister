package gui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import constants.CommonsConstants;

public class RegisterFormGUI extends Form {
	public RegisterFormGUI() {
		super("Register");
		addGuiComponents();
	}	
	
	private void addGuiComponents() {
		//cria um texto não editavel na forma
		JLabel registerrLabel = new JLabel("Register");
		//configura tamanho da label
		registerrLabel.setBounds(0, 25, 520, 100);
		//muda cor da fonte
		registerrLabel.setForeground(CommonsConstants.TEXT_COLOR);
		//tamanho da fonte
		registerrLabel.setFont(new Font("Dialog", Font.BOLD, 40));
		//centralizar texto
		registerrLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		//adcionar componente para o GUI
		add(registerrLabel);
		
		
		//label username
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(30, 150, 400, 25);
		usernameLabel.setForeground(CommonsConstants.TEXT_COLOR);
		usernameLabel.setFont(new Font( "Dialog", Font.PLAIN, 18));
		
		//campo de texto username
		JTextField usernameField = new JTextField();
		usernameField.setBounds(30, 185, 450, 55);
		usernameField.setBackground(CommonsConstants.SECUNDARY_COLOR);
		usernameField.setForeground(CommonsConstants.TEXT_COLOR);
		usernameField.setFont(new Font("Dialog", Font.PLAIN, 24));
		
		add(usernameLabel);
		add(usernameField);

		//label password
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(30, 255, 400, 25);
		passwordLabel.setForeground(CommonsConstants.TEXT_COLOR);
		passwordLabel.setFont(new Font( "Dialog", Font.PLAIN, 18));
				
				//campo de texto password
		JTextField passwordField = new JTextField();
		passwordField.setBounds(30, 290, 450, 55);
		passwordField.setBackground(CommonsConstants.SECUNDARY_COLOR);
		passwordField.setForeground(CommonsConstants.TEXT_COLOR);
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));
				
		add(passwordLabel);
		add(passwordField);
		
		//re-enter password
		JLabel rePasswordLabel = new JLabel("Re-enter Password");
		rePasswordLabel.setBounds(30, 365, 400, 25);
		rePasswordLabel.setForeground(CommonsConstants.TEXT_COLOR);
		rePasswordLabel.setFont(new Font( "Dialog", Font.PLAIN, 18));
				
				//campo de texto password
		JTextField rePasswordField = new JTextField();
		rePasswordField.setBounds(30, 395, 450, 55);
		rePasswordField.setBackground(CommonsConstants.SECUNDARY_COLOR);
		rePasswordField.setForeground(CommonsConstants.TEXT_COLOR);
		rePasswordField.setFont(new Font("Dialog", Font.PLAIN, 24));
		
		add(rePasswordLabel);
		add(rePasswordField);
		
		//botão de login
		JButton registerButton = new JButton("Register");
		registerButton.setFont(new Font("Dialog", Font.BOLD, 18));
		
		//mudar cursor quando estiver sobre o botão
		registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registerButton.setBackground(CommonsConstants.TEXT_COLOR);
		registerButton.setBounds(125, 520, 250, 50);
		add(registerButton);
		
		
		//registrar
		
		JLabel loginLabel = new JLabel("Have an account? Login Here");
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginLabel.setForeground(CommonsConstants.TEXT_COLOR);
		
		//transfere a tela
		loginLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				RegisterFormGUI.this.dispose();
				
				new LoginFormGUI().setVisible(true);
			}
		});
		
		loginLabel.setBounds(125, 600, 250, 30);
		add(loginLabel);
		
			
		
	}
}
