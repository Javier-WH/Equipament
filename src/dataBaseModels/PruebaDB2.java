package dataBaseModels;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class PruebaDB2 implements DataBaseModel {
	private Connection connection = null;
	private String dataTableName = null;

	public PruebaDB2() throws ClassNotFoundException, SQLException {
		connection = dbConection.SQLiteConnection.getConnection();
		dataTableName = "Prueba2";
	}

	@Override
	public boolean createTable() {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' INTEGER, 'nombre' TEXT NOT NULL, PRIMARY KEY('id' AUTOINCREMENT));");
		String query = queryBuilder.toString();
		return executeStatement(query);
	}

	@Override
	public boolean dropTable() {
		StringBuilder queryBuilder = new StringBuilder("DROP TABLE IF EXISTS ").append(dataTableName).append(";");
		String query = queryBuilder.toString();
		return executeStatement(query);
	}

	@Override
	public String getTableName() {
		return dataTableName;
	}

	@Override
	public ResultSet findRecords() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("SELECT * FROM ").append(dataTableName).append(";");
		String query = queryBuilder.toString();
		Statement statement = connection.createStatement();
		return statement.executeQuery(query);
	}

	@Override
	public ResultSet findRecord(HashMap<String, String> criteria) throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("SELECT * FROM ").append(dataTableName).append(" WHERE ");
		ArrayList<String> conditions = new ArrayList<>();

		for (Entry<String, String> entry : criteria.entrySet()) {
			String column = entry.getKey();
			String value = entry.getValue();
			String condition = column + " = '" + value + "'";
			conditions.add(condition);
		}

		queryBuilder.append(String.join(" AND ", conditions)).append(";");
		String query = queryBuilder.toString();

		Statement statement = connection.createStatement();
		return statement.executeQuery(query);
	}

	@Override
	public boolean updateRecord(HashMap<String, String> criteria) throws SQLException {

		StringBuilder queryBuilder = new StringBuilder("UPDATE ").append(dataTableName).append(" SET ");

		ArrayList<String> updates = new ArrayList<>();

		for (Entry<String, String> entry : criteria.entrySet()) {
			String column = entry.getKey();
			String value = entry.getValue();
			String update = column + " = '" + value + "'";
			updates.add(update);
		}

		queryBuilder.append(String.join(", ", updates)).append(" WHERE id = ").append(criteria.get("id")).append(";");

		String query = queryBuilder.toString();

		Statement statement = connection.createStatement();
		int rowsUpdated = statement.executeUpdate(query);
		return rowsUpdated > 0;

	}

	@Override
	public boolean deleteRecord(HashMap<String, String> criteria) throws SQLException {

		StringBuilder queryBuilder = new StringBuilder("DELETE FROM ").append(dataTableName).append(" WHERE id = ")
				.append(criteria.get("id")).append(";");

		String query = queryBuilder.toString();

		Statement statement = connection.createStatement();
		int rowsDeleted = statement.executeUpdate(query);
		return rowsDeleted > 0;

	}

	@Override
	public boolean createRecord(HashMap<String, String> data) throws SQLException {

		StringBuilder queryBuilder = new StringBuilder("INSERT INTO ").append(dataTableName)
				.append(" (nombre) VALUES ('").append(data.get("nombre")).append("');");

		String query = queryBuilder.toString();

		Statement statement = connection.createStatement();
		int rowsInserted = statement.executeUpdate(query);
		return rowsInserted > 0;

	}

	private boolean executeStatement(String query) {
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(query);
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

}
