package dataFillers;

import java.sql.SQLException;
import java.util.HashMap;
import dataBaseModels.ParamMesuresDescriptions;


public class ParamMesuresDescriptionDataFiller extends AbstractDataFiller {

	public ParamMesuresDescriptionDataFiller() throws ClassNotFoundException, SQLException {
		super(new ParamMesuresDescriptions());
	
	}

//////////////////////////////Sistema de arranque/////////////////////////////////////////////////////
	
	@Override
	public void fillData() throws SQLException {

		HashMap<String, String> params = new HashMap<>();
		
		params = new HashMap<>();
		params.put("description", "Temperatura en la entrada de aire en la turbina");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Temperatura de escape");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Temperatura en la descarga de compresor");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Temperatura de aceite de lubricante en cabezal");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Temperatura de aceite de lubricante a la salida de los enfriadores");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Presión de succión del compresor");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Presión de descarga del compresor");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Presión de aceite lubricante");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Presión de gas combustible ");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Velocidad turbina de potencia");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Vibración en la caja de accesorio ");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Vibración del productor de gas");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Vibración en la turbina de potencia");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Vibración en la succión del comprensor");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Vibración en la descarga del compresor");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Volumen de gas comprimido");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Presión de gas combustible");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Presión diferencial de gas Buffer");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Presión diferencial de aceite sellos");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Presión diferencial de los filtros de aire a la turbina");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Presión diferencial en el filtro aceite-sello");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Presión diferencial en el filtro de aceite lubricante");
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("description", "Velocidad del productor de gas");
		table.createRecord(params);
		
		System.out.println("Se han creado los datos correctivos por defecto de la tabla " + table.getTableName());
	}

}
