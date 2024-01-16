package main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import components.Alarm;
import dataBaseModels.MaintenanceRoutines;
import dataBaseModels.Stock;
import utilitys.DateHandler;
import views.MainWindow;

public class AlterThread implements Runnable {

	private static MaintenanceRoutines rutines = null;

	public AlterThread() throws ClassNotFoundException, SQLException {
		rutines = new MaintenanceRoutines();

	}

	@Override
	public void run() {

		refreshAlarms();

	}
	
	public static void refreshAlarms() {
		
		try {
			MainWindow.resetAlarms();
			//ResultSet rutinesList = rutines.findRecords();
			ResultSet rutinesList = rutines.findExcludePC();
			while (rutinesList.next()) {
				String stringDate = rutinesList.getString("lastUpdate");
				LocalDate lastUpdate = DateHandler.stringToDate(stringDate);
				LocalDate currentDate = LocalDate.now(); 

				if (lastUpdate.isBefore(currentDate) || lastUpdate.isEqual(currentDate)) {
					long daysBetween = DateHandler.daysBetween(lastUpdate, currentDate);
					long frecuency = Long.parseLong(rutinesList.getString("frequency"));
				
					if (daysBetween >= frecuency) {
						int id = Integer.parseInt(rutinesList.getString("id"));
						String secction = rutinesList.getString("secction");
						String activity = rutinesList.getString("activity");
						String level = rutinesList.getString("level");
						String type = rutinesList.getString("type");

						Alarm alarm = new Alarm(secction, activity, stringDate, level, type);
						alarm.setAlarmID(id);
						MainWindow.addAlert(alarm);

					}
				}
			}
			checkStockAlarm();
			MainWindow.upDateStatusBar();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	/////
	
	public static void checkStockAlarm() throws ClassNotFoundException, SQLException {
		
		ResultSet rs = new Stock().findRecords();
		
		while(rs.next()) {
			int id = Integer.parseInt(rs.getString("id"));
			String secction = rs.getString("secction");
			String parts = rs.getString("parts");
			String number = rs.getString("number");
			int quantity = Integer.parseInt(rs.getString("quantity"));
			
			if(quantity <= 3) {
				Alarm alarm = new Alarm(secction, parts, number, ""+quantity, "stock");
				alarm.setAlarmID(id);
				MainWindow.addAlert(alarm);
			}
			
		}
		
		
	}
	

}
