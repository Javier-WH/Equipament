package dataBaseModels;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Stock extends AbstractDataBaseModel{

	public Stock() throws ClassNotFoundException, SQLException {
		super("stock");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' INTEGER, 'secction' TEXT NOT NULL, 'parts' TEXT NOT NULL, 'number' TEXT NOT NULL, 'quantity' INTEGER NOT NULL, 'lastUpdate' DATE NOT NULL, PRIMARY KEY('id' AUTOINCREMENT));");
		String query = queryBuilder.toString();
		return executeStatement(query);
	}
	
	public ResultSet findSections() throws SQLException {
		String query = "SELECT DISTINCT secction FROM stock";
		Statement statement = connection.createStatement();
		return statement.executeQuery(query);
	}
	
	
}
