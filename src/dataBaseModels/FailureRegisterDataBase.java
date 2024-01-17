package dataBaseModels;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class FailureRegisterDataBase extends AbstractDataBaseModel{

	public FailureRegisterDataBase() throws ClassNotFoundException, SQLException {
		super("failures_register");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
		.append(" ('id' TEXT NOT NULL, "+
		"'codigoA' TEXT NOT NULL, "+
		"'fecha' TEXT NOT NULL, "+
		"'version' TEXT NOT NULL, "+
		"'pagina' TEXT NOT NULL, "+
		"'dia1' TEXT NOT NULL, "+
		"'mes1' TEXT NOT NULL, "+
		"'ano1' TEXT NOT NULL, "+
		"'numeroSolicitud' TEXT NOT NULL, "+
		"'equipo' TEXT NOT NULL, "+
		"'codigoB' TEXT NOT NULL, "+
		"'fichaTecnica' TEXT NOT NULL, "+
		"'hojaVida' TEXT NOT NULL, "+
		"'dano' TEXT NOT NULL, "+
		"'falla' TEXT NOT NULL, "+
		"'averia' TEXT NOT NULL, "+
		"'otra' TEXT NOT NULL, "+
		"'detalleMotivo' TEXT NOT NULL, "+
		"'analisisCausas' TEXT NOT NULL, "+
		"'observaciones' TEXT NOT NULL, "+
		"'si' TEXT NOT NULL, "+
		"'no' TEXT NOT NULL, "+
		"'dia2' TEXT NOT NULL, "+
		"'mes2' TEXT NOT NULL, "+
		"'ano2' TEXT NOT NULL, "+
		"'dia3' TEXT NOT NULL, "+
		"'mes3' TEXT NOT NULL, "+
		"'ano3' TEXT NOT NULL, "+
		"'nombreSolicitante' TEXT NOT NULL, "+
		"'nombreReceptor' TEXT NOT NULL, "+
		"'elaboradoPor' TEXT NOT NULL, "+
		"'revisadoPor' TEXT NOT NULL, "+
		"'aprobadoPor' TEXT NOT NULL, "+
		"'updatedAT' TEXT NOT NULL );");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}

	
	public boolean registerExists(String id) throws SQLException {
	    String query = "SELECT id FROM failures_register WHERE id = ?;";
	    PreparedStatement statement = connection.prepareStatement(query);
	    statement.setString(1, id);
	    ResultSet rs = statement.executeQuery();

	    if (rs.next()) {
	        return true;
	    }

	    return false;
	}
}
