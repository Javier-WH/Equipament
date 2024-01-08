package main;

import java.sql.SQLException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
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

				//hilo de actualización de las alertas
				ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
				AlterThread alertWatcher = new AlterThread();
				executorService.scheduleAtFixedRate(alertWatcher, 0, 1, TimeUnit.MINUTES);
				
			} else {
				JOptionPane.showMessageDialog(null, "Las bases de datos no estan completas");
				System.exit(2);
			}

		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

}
