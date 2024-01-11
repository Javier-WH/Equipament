package dataBaseModels;

import java.sql.SQLException;

public class ParamMesuresData extends AbstractDataBaseModel{

	public ParamMesuresData() throws ClassNotFoundException, SQLException {
		super("ParamMesuresData");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('descriptionID' INTEGER, reportID TEXT NOT NULL, 'data1' TEXT, 'data2' TEXT, 'data3' TEXT , 'data4' TEXT, 'data5' TEXT, 'data6' TEXT, 'data7' TEXT);");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}

}
