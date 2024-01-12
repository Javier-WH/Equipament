package dataBaseModels;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
	public ResultSet findRowsData(String reportID) throws SQLException {
		String query = "SELECT " +
		        "ParamMesuresDescriptions.description, " +
		        "ParamMesuresData.data1, " +
		        "ParamMesuresData.data2, " +
		        "ParamMesuresData.data3, " +
		        "ParamMesuresData.data4, " +
		        "ParamMesuresData.data5, " +
		        "ParamMesuresData.data6, " +
		        "ParamMesuresData.data7, " +
		        "ParamMesuresDates.date1, " +
		        "ParamMesuresDates.date2, " +
		        "ParamMesuresDates.date3, " +
		        "ParamMesuresDates.date4, " +
		        "ParamMesuresDates.date5, " +
		        "ParamMesuresDates.date6, " +
		        "ParamMesuresDates.date7, " +
		        "ParamMesuresOperators.operator, " +
		        "ParamMesuresOperators.inspector, " +
		        "ParamMesuresOperators.createdAT " +
		        "FROM ParamMesuresData " +
		        "JOIN ParamMesuresDates ON ParamMesuresData.reportID = ParamMesuresDates.reportID " +
		        "JOIN ParamMesuresOperators ON ParamMesuresData.reportID = ParamMesuresOperators.reportID " +
		        "JOIN ParamMesuresDescriptions ON ParamMesuresData.descriptionID = ParamMesuresDescriptions.id " +
		        "WHERE ParamMesuresData.reportID = '"+reportID+"'";
		
		Statement statement = connection.createStatement();
		return statement.executeQuery(query);
	}

}
