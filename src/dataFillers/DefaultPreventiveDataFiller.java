package dataFillers;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;

import dataBaseModels.MaintenanceRoutines;
import utilitys.DateHandler;

public class DefaultPreventiveDataFiller extends AbstractDataFiller {

	
	public DefaultPreventiveDataFiller() throws ClassNotFoundException, SQLException {
		super(new MaintenanceRoutines());
	}
	 
	 
	public void fillData() throws SQLException {
		LocalDate localDate = LocalDate.now();
		String date = DateHandler.dateToString(localDate);
		HashMap<String, String> params = new HashMap<>();
				
//////////////////////////////Turbocompresor/////////////////////////////////////////////////////
			params.put("secction", "Turbocompresor");
			params.put("activity",
					"Revisar toda la instalación y revisar todas las condiciones anormales de funcionamiento.");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbocompresor");
			params.put("activity",
					"Inspeccionar si los conductos  eléctricos están agrietados, desgastados o descoloridos; verificar si existen fugas de aceite, ruidos o vibraciones.");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbocompresor");
			params.put("activity", "Revisar si hay errajes de fijación sueltos.");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbocompresor");
			params.put("activity", "Registrar el rendimiento de los sistemas de la turbina.");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbocompresor");
			params.put("activity",
					"Revisar todas las tuberías y verificar que estén bien afianzados todos los soportes, dispositivos de fijación y herrajes de las tuberías y ductos.");
			params.put("frequency", "7");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "96");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbocompresor");
			params.put("activity",
					"Limpieza externa de los componentes para retirar partículas de polvo y agentes contaminantes.");
			params.put("frequency", "7");
			params.put("level", "1");
			params.put("time", "1");
			params.put("personal", "1");
			params.put("total", "96");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbocompresor");
			params.put("activity",
					"Registrar el rendimiento de la turbina y del sistema y comparar los resultados con lecturas anteriores.");
			params.put("frequency", "30");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbocompresor");
			params.put("activity",
					"Realizar análisis de vibración en la turbina, en la caja de engranajes de los accesorios y el compresor de gas.");
			params.put("frequency", "182");
			params.put("level", "3");
			params.put("time", "1");
			params.put("personal", "1");
			params.put("total", "2");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbocompresor");
			params.put("activity", "Realizar inspección boroscopica");
			params.put("frequency", "365");
			params.put("level", "3");
			params.put("time", "1");
			params.put("personal", "1");
			params.put("total", "1");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbocompresor");
			params.put("activity",
					"Realizar inspección visual de todo el conjunto para detectar condiciones anormales.");
			params.put("frequency", "7");
			params.put("level", "1");
			params.put("time", "1");
			params.put("personal", "1");
			params.put("total", "48");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Turbina/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Turbina");
			params.put("activity",
					"Inspección visual a las piezas de interconexión para verificar que no estén dañadas.");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbina");
			params.put("activity",
					"Inspección visual de la condición general de los conductos eléctricos preformados de los termopares.");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbina");
			params.put("activity",
					"Realizar inspección visual del exterior de la entrada de aire y del ducto de escape de la turbina.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbina");
			params.put("activity",
					"Inspeccionar y lavar la válvula de purga de la cámara de combustión de la turbina.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Turbina");
			params.put("activity",
					"Revisar el funcionamiento de la válvula de purga de la cámara de combustión de la turbina y el actuador.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Sensores/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Sensores");
			params.put("activity",
					"Revisar las condiciones del sistema de protección contra vibraciones, sondas monitor, traductores de velocidad y acelerómetros.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sensores");
			params.put("activity", "Inspección visual al cableado de los sensores");
			params.put("frequency", "7");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "48");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sensores");
			params.put("activity", "Simulación de velocidad (sensor de velocidad).");
			params.put("frequency", "7");
			params.put("level", "3");
			params.put("time", "1/2");
			params.put("personal", "2");
			params.put("total", "48");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Sistema de admisión de aire/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Sistema de admisión de aire");
			params.put("activity",
					"Verificar las condiciones  generales  de la caseta de filtros (puertas y silenciadores)");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de admisión de aire");
			params.put("activity", "Inspección visual de la parte interna de la voluta de admisión.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de admisión de aire");
			params.put("activity",
					"Verificar las condiciones de los pre-filtros, filtros de la admisión de aire y de la malla de retención contra insectos.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1/2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de admisión de aire");
			params.put("activity",
					"Lavar con desengrasante y agua a presión  la caseta de filtros para desalojar partículas de polvo y otros materiales extraños");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Sistema de combustible/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Sistema de combustible");
			params.put("activity", "Verificar la presión de suministro de gas combustible.");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de combustible");
			params.put("activity", "Inspección visual de los transmisores de gas combustible.");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "10 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de combustible");
			params.put("activity",
					"Desmontar y verificar los inyectores de combustible y verificar su operación correcta.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de combustible");
			params.put("activity", "Inspección visual de la válvula controladora de gas.");
			params.put("frequency", "30");
			params.put("level", "1");
			params.put("time", "10 minutos");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Sistema de aceite de lubricación/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Sistema de aceite de lubricación");
			params.put("activity",
					"Revisar el tubo de vidrio de flujo de aceite lubricante para verificar que este fluye");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de aceite de lubricación");
			params.put("activity", "Verificar si hay degradación del aceite lubricante");
			params.put("frequency", "1");
			params.put("level", "3");
			params.put("time", "5 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de aceite de lubricación");
			params.put("activity", "Inspección visual al indicador de nivel de aceite lubricante.");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de aceite de lubricación");
			params.put("activity",
					"Realizar prueba de funcionamiento de bomba neumática de pre/post lubricación de aceite para verificar que no existan fugas de gas, fugas de aceite, vibraciones y ruidos extraños.");
			params.put("frequency", "14");
			params.put("level", "1, 2, 3");
			params.put("time", "1/2");
			params.put("personal", "2");
			params.put("total", "96");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de aceite de lubricación");
			params.put("activity",
					"Realizar prueba de funcionamiento de bomba de aceite lubricante auxiliar accionada por motor eléctrico para verificación adictiva de ruidos extraños, vibraciones y medición de voltaje.");
			params.put("frequency", "30");
			params.put("level", "1, 2, 3");
			params.put("time", "1/2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de aceite de lubricación");
			params.put("activity",
					"Realizar prueba de funcionamiento de bomba principal  neumática de aceite sello lubricante para verificar que no existan fugas de gas, fugas de aceite, vibraciones y ruidos extraños.");
			params.put("frequency", "30");
			params.put("level", "1, 2, 3");
			params.put("time", "1/2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Enfriador de aceite/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Enfriador de aceite");
			params.put("activity",
					"Realizar inspección visual al enfriador de aceite para verificar que no tenga pernos sueltos y verificar si el radiador está sucio o tapado.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Enfriador de aceite");
			params.put("activity", "Inspeccionar conexiones hidráulicas para verificar que estén bien afianzadas.");
			params.put("frequency", "30");
			params.put("level", "1");
			params.put("time", "20 minutos");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Enfriador de aceite");
			params.put("activity",
					"Quitar la tierra y polvo de la superficie de transferencia de calor cepillando los tubos y aletas y soplando la tierra suelta  con aire comprimido.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Consola de Control/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Consola de Control");
			params.put("activity", "Inspección visual de  todos los indicadores de presión en el tablero.");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "20 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Consola de Control");
			params.put("activity",
					"Revisar las conexiones eléctricas de la consola de control para verificar que estén bien afianzadas.");
			params.put("frequency", "14");
			params.put("level", "2");
			params.put("time", "20 minutos");
			params.put("personal", "1");
			params.put("total", "96");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Consola de Control");
			params.put("activity", "Probar los sistemas de alarma, fallos y deparo.");
			params.put("frequency", "30");
			params.put("level", "2");
			params.put("time", "20 minutos");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Consola de Control");
			params.put("activity", "Realizar limpieza externa del tablero de control.");
			params.put("frequency", "30");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Consola de Control");
			params.put("activity",
					"Revisar las cajas de empalme y verificar la condición general del equipo y si hay señales de condensación.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Consola de Control");
			params.put("activity",
					"Revisar el sistema de fallas y protección, cerciorarse que hay continuidad (perdida de señal) en los puntos de fijación seleccionados");
			params.put("frequency", "7");
			params.put("level", "2");
			params.put("time", "1");
			params.put("personal", "2");
			params.put("total", "48");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Baterías/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Baterías");
			params.put("activity", "Verificar el nivel de electrolito en las Baterías");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "10 minutos");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Baterías");
			params.put("activity", "Medir densidad utilizando densímetro  y voltaje");
			params.put("frequency", "30");
			params.put("level", "2");
			params.put("time", "10 minutos");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Baterías");
			params.put("activity", "Verificar condiciones de los bornes");
			params.put("frequency", "30");
			params.put("level", "1");
			params.put("time", "10 minutos");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Baterías");
			params.put("activity", "Realizar limpieza externa");
			params.put("frequency", "30");
			params.put("level", "1");
			params.put("time", "20 minutos");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Cargador de Baterías/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Cargador de Baterías");
			params.put("activity", "Revisión y ajuste de conexiones");
			params.put("frequency", "30");
			params.put("level", "2");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Cargador de Baterías");
			params.put("activity", "Verificar voltajes de igualación y flotación");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "20 minutos");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Cargador de Baterías");
			params.put("activity", "Realizar limpieza externa");
			params.put("frequency", "30");
			params.put("level", "1");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Sistema de detección de fuego y gas/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Sistema de detección de fuego y gas");
			params.put("activity",
					"Realizar pruebas de detección de fuego en campo y activación de los percutores de CO2.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de detección de fuego y gas");
			params.put("activity", "Realizar pruebas de los percutores tanto local como remoto.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1/2");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de detección de fuego y gas");
			params.put("activity", "Realizar prueba de estación de disparo por emergencia manual de los percutores.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "1/2");
			params.put("personal", "1");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Sistema de detección de fuego y gas");
			params.put("activity",
					"Realizar lazo de corriente para la medición de la señal de salida de los detectores de gas.");
			params.put("frequency", "30");
			params.put("level", "3");
			params.put("time", "20 minutos");
			params.put("personal", "2");
			params.put("total", "12");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

//////////////////////////////Equipo accionado Compresor de gas C304 Solar/////////////////////////////////////////////////////

			params = new HashMap<>();
			params.put("secction", "Equipo accionado Compresor de gas C304 Solar");
			params.put("activity", "Verificaron de parámetro de vibraciones");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Equipo accionado Compresor de gas C304 Solar");
			params.put("activity", "Verificaron de parámetro de presión en la succión del compresor");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Equipo accionado Compresor de gas C304 Solar");
			params.put("activity", "Verificaron de parámetro de temperatura en la succión del compresor");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "2");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Equipo accionado Compresor de gas C304 Solar");
			params.put("activity", "Verificaron de parámetro de presión en la descarga del compresor");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "2");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Equipo accionado Compresor de gas C304 Solar");
			params.put("activity", "Verificaron de parámetro de temperatura en la descarga el compresor");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "2");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Equipo accionado Compresor de gas C304 Solar");
			params.put("activity", "Verificaron de presión de  lubricante");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "2");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Equipo accionado Compresor de gas C304 Solar");
			params.put("activity", "Verificaron de parámetro de temperatura de lubricante");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Equipo accionado Compresor de gas C304 Solar");
			params.put("activity", "Verificaron de parámetro de consumo de lubricante");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "2");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Equipo accionado Compresor de gas C304 Solar");
			params.put("activity",
					"Verificaron visual al conjunto general externo del compresor, y constatar que no exista fugas de aceite y de gas");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);

			params = new HashMap<>();
			params.put("secction", "Equipo accionado Compresor de gas C304 Solar");
			params.put("activity",
					"Inspección visual a las conexiones y tuberías de sonda de vibración y tomas de velocidad y constatar que estén bien afianzadas");
			params.put("frequency", "1");
			params.put("level", "1");
			params.put("time", "5 minutos");
			params.put("personal", "1");
			params.put("total", "365");
			params.put("piece", null);
			params.put("type", "P");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			System.out.println("Se han creado los datos preventivos por defecto de la tabla " + table.getTableName());

		
	}
}
