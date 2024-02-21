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

@SuppressWarnings("serial")
public class LoginFormGUI extends Form{
	
	public LoginFormGUI() {
		super("Login");
		addGuiComponents();
	}	
	
	private void addGuiComponents() {
		//cria um texto não editavel na forma
		JLabel loginLabel = new JLabel("Login");
		//configura tamanho da label
		loginLabel.setBounds(0, 25, 520, 100);
		//muda cor da fonte
		loginLabel.setForeground(CommonsConstants.TEXT_COLOR);
		//tamanho da fonte
		loginLabel.setFont(new Font("Dialog", Font.BOLD, 40));
		//centralizar texto
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		//adcionar componente para o GUI
		add(loginLabel);
		
		
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
		passwordLabel.setBounds(30, 335, 400, 25);
		passwordLabel.setForeground(CommonsConstants.TEXT_COLOR);
		passwordLabel.setFont(new Font( "Dialog", Font.PLAIN, 18));
				
				//campo de texto password
		JTextField passwordField = new JTextField();
		passwordField.setBounds(30, 365, 450, 55);
		passwordField.setBackground(CommonsConstants.SECUNDARY_COLOR);
		passwordField.setForeground(CommonsConstants.TEXT_COLOR);
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));
				
		add(passwordLabel);
		add(passwordField);
		
		//botão de login
		JButton loginButton = new JButton("Login");
		loginButton.setFont(new Font("Dialog", Font.BOLD, 18));
		
		//mudar cursor quando estiver sobre o botão
		loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginButton.setBackground(CommonsConstants.TEXT_COLOR);
		loginButton.setBounds(125, 520, 250, 50);
		add(loginButton);
		
		
		//registrar
		
		JLabel registerLabel = new JLabel("Not a user? Register Here");
		registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registerLabel.setForeground(CommonsConstants.TEXT_COLOR);
		
		registerLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				LoginFormGUI.this.dispose();
				
				new RegisterFormGUI().setVisible(true);
			}
		});
		
		registerLabel.setBounds(125, 600, 250, 30);
		add(registerLabel);
		
			
		
	}
}
