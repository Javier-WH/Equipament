package dataBaseModels;

import java.sql.SQLException;

public class ParamMesuresOperators extends AbstractDataBaseModel{

	public ParamMesuresOperators() throws ClassNotFoundException, SQLException {
		super("ParamMesuresOperators");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('reportID' TEXT NOT NULL, 'operator' TEXT NOT NULL, 'inspector' TEXT NOT NULL, 'createdAT' TEXT NOT NULL);");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}

}
