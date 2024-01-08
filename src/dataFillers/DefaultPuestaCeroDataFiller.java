package dataFillers;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;

import dataBaseModels.MaintenanceRoutines;
import utilitys.DateHandler;

public class DefaultPuestaCeroDataFiller extends AbstractDataFiller {

	
	public DefaultPuestaCeroDataFiller() throws ClassNotFoundException, SQLException {
		super(new MaintenanceRoutines());
	}
	 
	 
	public void fillData() throws SQLException {
		LocalDate localDate = LocalDate.now();
		String date = DateHandler.dateToString(localDate);
		HashMap<String, String> params = new HashMap<>();
				
//////////////////////////////Sistema de admisión de aire/////////////////////////////////////////////////////
			params.put("secction", "Sistema de admisión de aire");
			params.put("activity","Limpieza de compuertas y caseta de filtros");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "2");
			params.put("personal", "3");
			params.put("total", "12");
			params.put("piece", "-");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de admisión de aire");
			params.put("activity","Limpieza de la voluta de admisión.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", "130890-101");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de admisión de aire");
			params.put("activity","Limpieza  de compresor axial, con desengrasante ZOOK");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", "125157-100");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params.put("secction", "Sistema de admisión de aire");
			params.put("activity","Limpieza interna de la válvula purga del compresor");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", "125157-100");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de admisión de aire");
			params.put("activity","Limpieza de malla de retención de insectos");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "2");
			params.put("personal", "3");
			params.put("total", "12");
			params.put("piece", "-");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de admisión de aire");
			params.put("activity","Cambio de pre-filtros y filtros");
			params.put("frequency", "90");
			params.put("level", "4");
			params.put("time", "2");
			params.put("personal", "3");
			params.put("total", "4");
			params.put("piece", "951339C17 / AX-4005");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
//////////////////////////////Sistema de gas combustible/////////////////////////////////////////////////////
			
			params.put("secction", "Sistema de gas combustible");
			params.put("activity","Cambio de elemento Filtrante de la válvula de control de combustible");
			params.put("frequency", "30");
			params.put("level", "4");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", "46191-1");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de gas combustible");
			params.put("activity","Cambio de sello de válvulas de dos vías");
			params.put("frequency", "30");
			params.put("level", "4");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", "9135");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de gas combustible");
			params.put("activity","Limpieza interna de todos los componentes de las válvulas de dos vías");
			params.put("frequency", "30");
			params.put("level", "4");
			params.put("time", "3");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", "-");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de gas combustible");
			params.put("activity","Cambio de sello de válvula de alivio piloto");
			params.put("frequency", "30");
			params.put("level", "4");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", "910380C4");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
//////////////////////////////Sistema aceite sello/////////////////////////////////////////////////////
			
			params.put("secction", "Sistema aceite sello");
			params.put("activity","Limpieza de válvula de control de presión diferencial entre el gas sello y el gas de succión");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", "916356C1");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema aceite sello");
			params.put("activity","Limpieza de trampa aceite sello");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "-");
			params.put("personal", "-");
			params.put("total", "12");
			params.put("piece", "918629C1");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			
			params.put("secction", "Sistema aceite sello");
			params.put("activity","Limpieza de las líneas de suministro  aceite sello");
			params.put("frequency", "90");
			params.put("level", "3");
			params.put("time", "3");
			params.put("personal", "2");
			params.put("total", "4");
			params.put("piece", "918629C1");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			
//////////////////////////////Cabina/////////////////////////////////////////////////////
			
			params.put("secction", "Sistema aceite sello");
			params.put("activity","Aplicación de pintura anti corrosiva a las partes de la cabina que lo requiera");
			params.put("frequency", "365");
			params.put("level", "4");
			params.put("time", "3");
			params.put("personal", "2");
			params.put("total", "1");
			params.put("piece", "-");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema aceite sello");
			params.put("activity","Cambio de detectores de fuego");
			params.put("frequency", "1825");
			params.put("level", "4");
			params.put("time", "3");
			params.put("personal", "2");
			params.put("total", "1");
			params.put("piece", "120803-3");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema aceite sello");
			params.put("activity","Cambio de gomas de hermeticidad de las puertas por deterioro (sueltas/agrietamiento)");
			params.put("frequency", "1825");
			params.put("level", "4");
			params.put("time", "3");
			params.put("personal", "2");
			params.put("total", "1");
			params.put("piece", "967990C1");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
//////////////////////////////Sistema de Lubricación/////////////////////////////////////////////////////
			
			params.put("secction", "Sistema de Lubricación");
			params.put("activity","Cambio de elemento Filtrante y junta de elemento filtrante de bomba de pre y post lubricación.");
			params.put("frequency", "30");
			params.put("level", "4");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", "917646C91 / 903646C1");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de Lubricación");
			params.put("activity","Cambio de retenes y sellos de elementos filtrantes");
			params.put("frequency", "30");
			params.put("level", "4");
			params.put("time", "-");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", "918646C91 / 923646C1");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de Lubricación");
			params.put("activity","Lavado interno de todas la tuberías de lubricación");
			params.put("frequency", "90");
			params.put("level", "3");
			params.put("time", "3");
			params.put("personal", "2");
			params.put("total", "4");
			params.put("piece", "128614-200 / 130552-2007115982-100-901");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de Lubricación");
			params.put("activity","Lavado tanque de aceite");
			params.put("frequency", "365");
			params.put("level", "3");
			params.put("time", "3");
			params.put("personal", "2");
			params.put("total", "1");
			params.put("piece", "128600-104");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de Lubricación");
			params.put("activity","Cambio de aceite");
			params.put("frequency", "365");
			params.put("level", "1");
			params.put("time", "3");
			params.put("personal", "3");
			params.put("total", "1");
			params.put("piece", "-");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de Lubricación");
			params.put("activity","Cambio de sellos de motores neumáticos de enfriadores de aceite");
			params.put("frequency", "730");
			params.put("level", "4");
			params.put("time", "3");
			params.put("personal", "2");
			params.put("total", "-");
			params.put("piece", "910474C1");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params.put("secction", "Sistema de Lubricación");
			params.put("activity","Cambio de sello de válvula de control de lubricación ");
			params.put("frequency", "730");
			params.put("level", "4");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "-");
			params.put("piece", "912474C1");
			params.put("type", "PC");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			System.out.println("Se han creado los datos puesta a cero por defecto de la tabla " + table.getTableName());

		
	}
}
