package dataBaseModels;

import java.sql.SQLException;

public class ParamMesuresDescriptions extends AbstractDataBaseModel{

	public ParamMesuresDescriptions() throws ClassNotFoundException, SQLException {
		super("ParamMesuresDescriptions");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' INTEGER, 'description' TEXT NOT NULL, PRIMARY KEY('id' AUTOINCREMENT));");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}

}
