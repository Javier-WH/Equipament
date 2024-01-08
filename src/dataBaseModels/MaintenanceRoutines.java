package dataBaseModels;

import java.sql.SQLException;

public class MaintenanceRoutines extends AbstractDataBaseModel{

	public MaintenanceRoutines() throws ClassNotFoundException, SQLException {
		super("maintenance_routines");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' INTEGER, 'secction' TEXT NOT NULL, 'activity' TEXT NOT NULL, 'frequency' TEXT NOT NULL, 'level' INTEGER NOT NULL, 'time' TEXT NOT NULL, 'personal' INTEGER NOT NULL, 'total' TEXT NOT NULL, 'piece' TEXT DEFAULT NULL, 'type' INTEGER NOT NULL, 'lastUpdate' DATE NOT NULL, PRIMARY KEY('id' AUTOINCREMENT));");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}

}
