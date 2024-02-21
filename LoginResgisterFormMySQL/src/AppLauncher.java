import javax.swing.SwingUtilities;

import gui.LoginFormGUI;
import gui.RegisterFormGUI;

public class AppLauncher {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				new LoginFormGUI().setVisible(true);	
				
			}
			
		});
	}
}
