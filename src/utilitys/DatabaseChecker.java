package utilitys;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dataBaseModels.DataBaseModel;
import dataBaseModels.MaintenanceRegister;
//import dataBaseModels.DateTest;
import dataBaseModels.MaintenanceRoutines;
import dataBaseModels.MaintenanceRoutinesOperators;
import dataBaseModels.ParamMesuresData;
import dataBaseModels.ParamMesuresDates;
import dataBaseModels.ParamMesuresDescriptions;
import dataBaseModels.ParamMesuresOperators;
import dataBaseModels.Stock;
import dataBaseModels.WorkOrderDataBase;
import dbConection.*;

public class DatabaseChecker {

	private Connection connection = null;
	private ArrayList<DataBaseModel> TableList = new ArrayList<DataBaseModel>();
	private DataChecker dataChecker = null;

	public DatabaseChecker() throws ClassNotFoundException, SQLException {
		dataChecker = new DataChecker();
		connection = SQLiteConnection.getConnection();
		TableList.add(new MaintenanceRoutines());
		TableList.add(new ParamMesuresDescriptions());
		TableList.add(new ParamMesuresDates());
		TableList.add(new ParamMesuresData());
		TableList.add(new ParamMesuresOperators());
		TableList.add(new MaintenanceRegister());
		TableList.add(new MaintenanceRoutinesOperators());
		TableList.add(new Stock());
		TableList.add(new WorkOrderDataBase());
	}

	public boolean checkDatabaseList() throws SQLException {
	
		ArrayList<String> currentTableList = new ArrayList<String>();

		DatabaseMetaData metaData = connection.getMetaData();
		ResultSet tables = metaData.getTables(null, null, null, new String[] { "TABLE" });
		while (tables.next()) {
			String tableName = tables.getString("TABLE_NAME");
			currentTableList.add(tableName);
		}

		for (DataBaseModel table : TableList) {
			String name = table.getTableName();
	
			if (!currentTableList.contains(name)) {
				if (table.createTable()) {
					System.out.println("la tabla " + name + " se ha creado");
					dataChecker.checkData(name);
				}else {
					System.out.println("error al crear la tabla");
				}
			}
		}

		return true;
	}

}
