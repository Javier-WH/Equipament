package dataBaseModels;

import java.sql.SQLException;

public class PruebaDB3 extends AbstractDataBaseModel {

	public PruebaDB3() throws ClassNotFoundException, SQLException {
		super("Prueba3");

	}

	@Override
	public boolean createTable() {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' INTEGER, 'nombre' TEXT NOT NULL, PRIMARY KEY('id' AUTOINCREMENT));");
		String query = queryBuilder.toString();
		return executeStatement(query);
	}

}
