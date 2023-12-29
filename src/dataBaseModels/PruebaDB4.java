package dataBaseModels;

import java.sql.SQLException;

public class PruebaDB4 extends AbstractDataBaseModel {

	public PruebaDB4() throws ClassNotFoundException, SQLException {
		super("Prueba4");
	
	}

	@Override
	public boolean createTable() {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' INTEGER, 'nombre' TEXT NOT NULL, PRIMARY KEY('id' AUTOINCREMENT));");
		String query = queryBuilder.toString();
		return executeStatement(query);
	}



}
