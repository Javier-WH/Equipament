package functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import components.Cmessage;

public class Exit extends WindowAdapter implements ActionListener {

	public Exit() {

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
		Cmessage message = new Cmessage("Salir", "Cancelar", "¿Desea salir del sistema?", new ExitListener());
		message.setVisible(true);
	}

	class ExitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}

	}

}
