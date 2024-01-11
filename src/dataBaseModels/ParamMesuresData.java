package dataBaseModels;

import java.sql.SQLException;

public class ParamMesuresData extends AbstractDataBaseModel{

	public ParamMesuresData() throws ClassNotFoundException, SQLException {
		super("ParamMesuresData");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('descriptionID' INTEGER, reportID TEXT NOT NULL, 'data1' TEXT NOT NULL, 'data2' TEXT NOT NULL, 'data3' TEXT NOT NULL, 'data4' TEXT NOT NULL, 'data5' TEXT NOT NULL, 'data6' TEXT NOT NULL, 'data7' TEXT NOT NULL);");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}

}
