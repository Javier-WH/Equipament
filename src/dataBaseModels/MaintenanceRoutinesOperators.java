package dataBaseModels;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MaintenanceRoutinesOperators extends AbstractDataBaseModel{

	public MaintenanceRoutinesOperators() throws ClassNotFoundException, SQLException {
		super("maintenance_routines_operators");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' INTEGER, 'inspector' TEXT NOT NULL, 'operator' TEXT NOT NULL, 'observations' TEXT, routineID INTEGER, 'date' TEXT NOT NULL, PRIMARY KEY('id' AUTOINCREMENT));");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}
	


	
	public ResultSet findRowOperators(String Type) throws SQLException {
	    String query = "SELECT DISTINCT " +
	            "maintenance_routines.secction, " +
	            "maintenance_routines_operators.inspector, " +
	            "maintenance_routines_operators.operator, " +
	            "maintenance_routines_operators.date as 'lastUpdate'" +
	            "FROM " +
	            "maintenance_routines " +
	            "JOIN maintenance_routines_operators ON maintenance_routines_operators.routineID = maintenance_routines.id " +
	            "WHERE maintenance_routines.type = ?";
	    PreparedStatement statement = connection.prepareStatement(query);
	    statement.setString(1, Type);
	    return statement.executeQuery();
	}
	
	public ResultSet getPrintInfo(String secction, String date, String type) throws SQLException {
	    String query = "SELECT " +
	            "maintenance_routines.secction, " +
	            "maintenance_routines.activity, " +
	            "maintenance_routines_operators.date, " +
	            "maintenance_routines_operators.observations, " +
	            "maintenance_routines_operators.operator, " +
	            "maintenance_routines_operators.inspector " +
	            "FROM maintenance_routines " +
	            "JOIN maintenance_routines_operators ON maintenance_routines_operators.routineID = maintenance_routines.id " +
	            "WHERE maintenance_routines.secction = ? AND maintenance_routines_operators.date = ? AND maintenance_routines.type = ?";
	    PreparedStatement statement = connection.prepareStatement(query);
	    statement.setString(1, secction);
	    statement.setString(2, date);
	    statement.setString(3, type);
	    return statement.executeQuery();
	}
	
}
