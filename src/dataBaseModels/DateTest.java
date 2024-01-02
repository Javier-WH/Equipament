package dataBaseModels;

import java.sql.SQLException;

public class DateTest extends AbstractDataBaseModel{

	public DateTest() throws ClassNotFoundException, SQLException {
		super("DateTest");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' INTEGER, 'fecha' DATE NOT NULL, PRIMARY KEY('id' AUTOINCREMENT));");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}

}
