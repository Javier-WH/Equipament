package utilitys;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dataBaseModels.DataBaseModel;
import dataBaseModels.DateTest;
import dataBaseModels.PruebaDB3;
import dataBaseModels.PruebaDB4;
import dbConection.*;

public class DatabaseChecker {

	private Connection connection = null;
	private ArrayList<DataBaseModel> TableList = new ArrayList<DataBaseModel>();

	public DatabaseChecker() throws ClassNotFoundException, SQLException {
		connection = SQLiteConnection.getConnection();
		TableList.add(new PruebaDB3());
		TableList.add(new PruebaDB4());
		TableList.add(new DateTest());
		

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
				}
			}
		}

		return true;
	}

}
