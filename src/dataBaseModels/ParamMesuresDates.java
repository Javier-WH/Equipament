package dataBaseModels;

import java.sql.SQLException;

public class ParamMesuresDates extends AbstractDataBaseModel{

	public ParamMesuresDates() throws ClassNotFoundException, SQLException {
		super("ParamMesuresDates");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' INTEGER, reportID TEXT NOT NULL, 'date1' TEXT, 'date2' TEXT, 'date3' TEXT, 'date4' TEXT, 'date5' TEXT, 'date6' TEXT, 'date7' TEXT, PRIMARY KEY('id' AUTOINCREMENT));");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}

}
