package functions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.swing.table.DefaultTableModel;

import dataBaseModels.MaintenanceRoutines;

public class TableData {
	
	public static DefaultTableModel getMaintenanceTableData(String secction, String type) {
		DefaultTableModel model = new DefaultTableModel();
		HashMap<String, String> params = new HashMap<>();
		params.put("secction", secction);
		params.put("type", type);

		try {
			MaintenanceRoutines MR = new MaintenanceRoutines();
			ResultSet TCData = MR.findRecord(params);

			model.addColumn("Actividad De Mantenimiento");
			model.addColumn("Frecuencia");
			model.addColumn("Nivel De Mantenimiento");
			model.addColumn("Horas");
			model.addColumn("Personal");
			model.addColumn("N° Al Año");
			
			if(type.equals("C") || type.equals("PC")) {
				model.addColumn("N° Pieza");
			}
			 
			model.addColumn("Fecha");

			while (TCData.next()) {

				String activity = TCData.getString("activity");
				String frequency = Translate.translateFrequency(TCData.getString("frequency"));
				String level = TCData.getString("level");
				String time = TCData.getString("time");
				String personal = TCData.getString("personal");
				String total = TCData.getString("total");
				String lastUpdate = TCData.getString("lastUpdate");
				String piece =  TCData.getString("piece");
				
				
				if(type.equals("C") || type.equals("PC")) {
					model.addRow(new Object[] { activity, frequency, level, time, personal, total, piece, lastUpdate });
				}else {
					model.addRow(new Object[] { activity, frequency, level, time, personal, total, lastUpdate });
				}
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return model;
	}
	
}
