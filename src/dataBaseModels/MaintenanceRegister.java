package dataBaseModels;

import java.sql.SQLException;

public class MaintenanceRegister extends AbstractDataBaseModel{

	public MaintenanceRegister() throws ClassNotFoundException, SQLException {
		super("maintenance_registers");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' INTEGER, 'registerID' TEXT NOT NULL, 'routuneID' INTEGER NOT NULL, 'operator' TEXT NOT NULL, 'inspector' TEXT NOT NULL, 'observations' TEXT, 'createdAT' TEXT NOT NULL, PRIMARY KEY('id' AUTOINCREMENT));");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}

}
