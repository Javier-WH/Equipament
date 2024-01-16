package dataBaseModels;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class WorkOrderDataBase extends AbstractDataBaseModel{

	public WorkOrderDataBase() throws ClassNotFoundException, SQLException {
		super("work_order");
	}

	@Override
	public boolean createTable() throws SQLException {
		StringBuilder queryBuilder = new StringBuilder("CREATE TABLE ").append(dataTableName)
				.append(" ('id' TEXT NOT NULL, "+
		"'codigoA' TEXT NOT NULL, "+
		"'fecha' TEXT NOT NULL, "+
		"'version' TEXT NOT NULL, "+
		"'pagina' TEXT NOT NULL, "+
		"'numeroOrden' TEXT NOT NULL, "+
		"'equipo' TEXT NOT NULL, "+
		"'codigoB' TEXT NOT NULL, "+
		"'fichaTecnica' TEXT NOT NULL, "+
		"'hojaVida' TEXT NOT NULL, "+
		"'lubricacion' TEXT NOT NULL, "+
		"'electrico' TEXT NOT NULL, "+
		"'mecanico' TEXT NOT NULL, "+
		"'instrumentacion' TEXT NOT NULL, "+
		"'preventivo' TEXT NOT NULL, "+
		"'correctivo' TEXT NOT NULL, "+
		"'responsable' TEXT NOT NULL, "+
		"'dia1' TEXT NOT NULL, "+
		"'mes1' TEXT NOT NULL, "+
		"'ano1' TEXT NOT NULL, "+
		"'dia2' TEXT NOT NULL, "+
		"'mes2' TEXT NOT NULL, "+
		"'ano2' TEXT NOT NULL, "+
		"'codigo1' TEXT NOT NULL, "+
		"'codigo2' TEXT NOT NULL, "+
		"'codigo3' TEXT NOT NULL, "+
		"'codigo4' TEXT NOT NULL, "+
		"'codigo5' TEXT NOT NULL, "+
		"'codigo6' TEXT NOT NULL, "+
		"'codigo7' TEXT NOT NULL, "+
		"'descripcion1' TEXT NOT NULL, "+
		"'descripcion2' TEXT NOT NULL, "+
		"'descripcion3' TEXT NOT NULL, "+
		"'descripcion4' TEXT NOT NULL, "+
		"'descripcion5' TEXT NOT NULL, "+
		"'descripcion6' TEXT NOT NULL, "+
		"'descripcion7' TEXT NOT NULL, "+
		"'herramientas1' TEXT NOT NULL, "+
		"'herramientas2' TEXT NOT NULL, "+
		"'herramientas3' TEXT NOT NULL, "+
		"'herramientas4' TEXT NOT NULL, "+
		"'herramientas5' TEXT NOT NULL, "+
		"'herramientas6' TEXT NOT NULL, "+
		"'herramientas7' TEXT NOT NULL, "+
		"'materiales1' TEXT NOT NULL, "+
		"'materiales2' TEXT NOT NULL, "+
		"'materiales3' TEXT NOT NULL, "+
		"'materiales4' TEXT NOT NULL, "+
		"'materiales5' TEXT NOT NULL, "+
		"'materiales6' TEXT NOT NULL, "+
		"'materiales7' TEXT NOT NULL, "+
		"'repuestos1' TEXT NOT NULL, "+
		"'repuestos2' TEXT NOT NULL, "+
		"'repuestos3' TEXT NOT NULL, "+
		"'repuestos4' TEXT NOT NULL, "+
		"'repuestos5' TEXT NOT NULL, "+
		"'repuestos6' TEXT NOT NULL, "+
		"'repuestos7' TEXT NOT NULL, "+
		"'horas1' TEXT NOT NULL, "+
		"'horas2' TEXT NOT NULL, "+
		"'horas3' TEXT NOT NULL, "+
		"'horas4' TEXT NOT NULL, "+
		"'horas5' TEXT NOT NULL, "+
		"'horas6' TEXT NOT NULL, "+
		"'horas7' TEXT NOT NULL, "+
		"'observaciones1' TEXT NOT NULL, "+
		"'observaciones2' TEXT NOT NULL, "+
		"'observaciones3' TEXT NOT NULL, "+
		"'observaciones4' TEXT NOT NULL, "+
		"'observaciones5' TEXT NOT NULL, "+
		"'observaciones6' TEXT NOT NULL, "+
		"'observaciones7' TEXT NOT NULL, "+
		"'entregadoPor' TEXT NOT NULL, "+
		"'recibidoPor' TEXT NOT NULL, "+
		"'supervisadoPor' TEXT NOT NULL, "+
		"'aprobadoPorA' TEXT NOT NULL, "+
		"'aprobadoPorB' TEXT NOT NULL, "+
		"'elaboradoPor' TEXT NOT NULL, "+
		"'revisadoPor' TEXT NOT NULL, " +
		"'updatedAT' TEXT NOT NULL );");
		String query = queryBuilder.toString();
		return executeStatement(query);
	
	}

	
	public boolean registerExists(String id) throws SQLException {
	    String query = "SELECT id FROM work_order WHERE id = ?;";
	    PreparedStatement statement = connection.prepareStatement(query);
	    statement.setString(1, id);
	    ResultSet rs = statement.executeQuery();

	    if (rs.next()) {
	        return true;
	    }

	    return false;
	}
}
