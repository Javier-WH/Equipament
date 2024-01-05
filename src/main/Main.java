package main;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import utilitys.DatabaseChecker;
import views.MainWindow;

public class Main {

	public static void main(String[] args) {

		try {
			DatabaseChecker DBC = new DatabaseChecker();
			boolean isComplete = DBC.checkDatabaseList();
			if (isComplete) {
				MainWindow mainWindow = new MainWindow();
				mainWindow.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Las bases de datos no estan completas");
				System.exit(2);
			}

		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

}
