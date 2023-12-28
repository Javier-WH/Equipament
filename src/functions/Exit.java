package functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Exit extends WindowAdapter implements ActionListener {
	
	private JFrame parent;
	
	public Exit(JFrame parent) {
		this.parent = parent;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		exitSystem();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		exitSystem();
		
	}
	
	private void exitSystem() {
	    int option = JOptionPane.showOptionDialog(parent, "Desea Salir", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] { "Salir", "Cancelar" }, "Aceptar");
	    
	    if(option == JOptionPane.YES_OPTION) {
	    	System.exit(0);	    	
	    }
	}
	
	

	
}
