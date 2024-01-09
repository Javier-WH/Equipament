package dataFillers;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;

import dataBaseModels.MaintenanceRoutines;
import utilitys.DateHandler;

public class DefaultCorrectiveDataFiller extends AbstractDataFiller {

	public DefaultCorrectiveDataFiller() throws ClassNotFoundException, SQLException {
		super(new MaintenanceRoutines());
	
	}

//////////////////////////////Sistema de arranque/////////////////////////////////////////////////////
	
	@Override
	public void fillData() throws SQLException {
		LocalDate localDate = LocalDate.now();
		String date = DateHandler.dateToString(localDate);
		HashMap<String, String> params = new HashMap<>();
		
		params = new HashMap<>();
		params.put("secction", "Sistema de arranque");
		params.put("activity", "Cambio de juntas de motores de arranque");
		params.put("frequency", "365");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "1");
		params.put("piece", "904072C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de arranque");
		params.put("activity", "Cambio de bujía de encendido");
		params.put("frequency", "365");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "1");
		params.put("piece", "903316C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de arranque");
		params.put("activity", "Cambio de alabes del motor de arranque");
		params.put("frequency", "1095");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "8007917R92");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de arranque");
		params.put("activity", "Cambio de cojinetes de rotor y  eje de motores de arranque");
		params.put("frequency", "1095");
		params.put("level", "4");
		params.put("time", "4");
		params.put("personal", "1");
		params.put("total", "-");
		params.put("piece", "8007918R92");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		 
		params = new HashMap<>();
		params.put("secction", "Sistema de arranque");
		params.put("activity", "Cambios de mangueras de suministro de gas de motores neumáticos");
		params.put("frequency", "1095");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "8007918R92");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
//////////////////////////////Compresor Axial/////////////////////////////////////////////////////
		params = new HashMap<>();
		params.put("secction", "Compresor Axial");
		params.put("activity", "Limpieza  de compresor axial, con desengrasante ZOOK");
		params.put("frequency", "30");
		params.put("level", "3");
		params.put("time", "2");
		params.put("personal", "3");
		params.put("total", "12");
		params.put("piece", "125157-100");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor Axial");
		params.put("activity", "Limpieza interna de la válvula purga del compresor");
		params.put("frequency", "30");
		params.put("level", "3");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "12");
		params.put("piece", "125157-100");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor Axial");
		params.put("activity", "Calibración y ajuste de las paletas guías del compresor");
		params.put("frequency", "365");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "1");
		params.put("piece", "116082-402-910");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor Axial");
		params.put("activity", "Cambio de la válvula de aire pulga del compresor");
		params.put("frequency", "1095");
		params.put("level", "4");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "125157-100");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
//////////////////////////////Sistema de gas combustible/////////////////////////////////////////////////////
		
		params = new HashMap<>();
		params.put("secction", "Sistema de gas combustible");
		params.put("activity", "Cambio de elemento filtrante de la válvula de control de combustible");
		params.put("frequency", "30");
		params.put("level", "4");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "12");
		params.put("piece", "46191-1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de gas combustible");
		params.put("activity", "Limpieza de elemento filtrante de válvula de control de combustible con disolvente STODDARD");
		params.put("frequency", "30");
		params.put("level", "3");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "12");
		params.put("piece", "46191-1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de gas combustible");
		params.put("activity", "Cambio de sello de la ranura del elemento de filtro");
		params.put("frequency", "30");
		params.put("level", "4");
		params.put("time", "1");
		params.put("personal", "2");
		params.put("total", "12");
		params.put("piece", "903285C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de gas combustible");
		params.put("activity", "Cambio de juntas de inyectores");
		params.put("frequency", "30");
		params.put("level", "4");
		params.put("time", "1");
		params.put("personal", "1");
		params.put("total", "12");
		params.put("piece", "909745C2");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de gas combustible");
		params.put("activity", "Cambio de sello de válvula de alivio  piloto.");
		params.put("frequency", "30");
		params.put("level", "4");
		params.put("time", "1");
		params.put("personal", "1");
		params.put("total", "12");
		params.put("piece", "903267C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de gas combustible");
		params.put("activity", "Cambio de  juego completo de sellos de válvula de dos vías.");
		params.put("frequency", "30");
		params.put("level", "4");
		params.put("time", "1");
		params.put("personal", "1");
		params.put("total", "12");
		params.put("piece", "8007874R94");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de gas combustible");
		params.put("activity", "Cambio de válvula de gas piloto");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "1");
		params.put("total", "-");
		params.put("piece", "910380C4");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de gas combustible");
		params.put("activity", "Cambio de inyectores");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "1");
		params.put("total", "-");
		params.put("piece", "116311-102");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
//////////////////////////////Sistema de control eléctrico/////////////////////////////////////////////////////
		
		params = new HashMap<>();
		params.put("secction", "Sistema de control eléctrico");
		params.put("activity", "Añadir electrolitos a la batería");
		params.put("frequency", "90");
		params.put("level", "1");
		params.put("time", "1");
		params.put("personal", "2");
		params.put("total", "4");
		params.put("piece", "-");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de control eléctrico");
		params.put("activity", "Cambio de baterías de Niquel/cadmio de 24 Vcc");
		params.put("frequency", "730");
		params.put("level", "4");
		params.put("time", "2");
		params.put("personal", "1");
		params.put("total", "-");
		params.put("piece", "120798-100");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
//////////////////////////////Sistema aceite sello/////////////////////////////////////////////////////
		
		params = new HashMap<>();
		params.put("secction", "Sistema aceite sello");
		params.put("activity", "Limpieza de válvula de control de presión diferencial entre el gas sello y gas de succión");
		params.put("frequency", "30");
		params.put("level", "3");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "12");
		params.put("piece", "916356C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema aceite sello");
		params.put("activity", "Limpieza de la línea aceite sello");
		params.put("frequency", "90");
		params.put("level", "3");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "4");
		params.put("piece", "917507C2");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema aceite sello");
		params.put("activity", "Cambio de sello de las conexiones de entrada y salida de las mangueras");
		params.put("frequency", "360");
		params.put("level", "4");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "1");
		params.put("piece", "950232C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema aceite sello");
		params.put("activity", "Cambio de trampa aceite sello");
		params.put("frequency", "1095");
		params.put("level", "4");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "120376-3");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema aceite sello");
		params.put("activity", "Cambio de mangueras de suministro de aceite sello.");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "912510C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema aceite sello");
		params.put("activity", "Cambio de engranajes de bomba(juego de reparación completo N/P 800787GR91)");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "800787GR91");
		params.put("type", "C"); 
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		
//////////////////////////////Cabina/////////////////////////////////////////////////////
		
		params = new HashMap<>();
		params.put("secction", "Cabina");
		params.put("activity", "Aplicación de pintura anti corrosiva a las partes de la cabina que lo requiera");
		params.put("frequency", "365");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "1");
		params.put("piece", "-");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Cabina");
		params.put("activity", "Cambio de detectores de fuego");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "120803-3");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Cabina");
		params.put("activity", "Cambio de gomas de hermeticidad de las puertas por deterioro (sueltas/agrietamiento)");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "967990C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
//////////////////////////////Sistema de lubricación/////////////////////////////////////////////////////
		
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de elementos filtrantes  y juntas de elementos filtrantes.");
		params.put("frequency", "30");
		params.put("level", "4");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "12");
		params.put("piece", "917646C91 / 903646C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Lavado interno y externo de radiadores con desengrasante");
		params.put("frequency", "90");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "4");
		params.put("piece", "946829C3");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Lavado interno de todas las tuberías de lubricación");
		params.put("frequency", "365");
		params.put("level", "3");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "1");
		params.put("piece", "128614-200 / 130552-200 / 115982-100-901");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de sellos “O”  y de (REBORDES) de bomba de pre/post lubricación  accionada por motor neumático");
		params.put("frequency", "730");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "172206-1 / 951147C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de sello de válvula de control de lubricación");
		params.put("frequency", "730");
		params.put("level", "4");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "-");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de sellos de motores, ventiladores, enfriadores de aceite");
		params.put("frequency", "730");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "910474C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de válvula de ultimo alivio de presión");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "913739C2");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de válvula de control de temperatura");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "-");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de cojinetes de bomba de pre y post lubricación  accionada por motor neumático");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "8007877R91");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de eje de la bomba de pre/post lubricación  accionada por motor neumático.");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "951152C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de engranaje de bomba de pre y post lubricación  accionada por motor neumático.");
		params.put("frequency", "1825");
		params.put("level", "4");
		params.put("time", "2");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "8007877R91");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		
//////////////////////////////Sistema de lubricación/////////////////////////////////////////////////////
		
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de filtro.");
		params.put("frequency", "30");
		params.put("level", "4");
		params.put("time", "1");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "945732C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de filtro (Elemento lavable).");
		params.put("frequency", "365");
		params.put("level", "4");
		params.put("time", "1");
		params.put("personal", "1");
		params.put("total", "-");
		params.put("piece", "914567C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio juegos  de sellos de bomba accionada por motor eléctrico.");
		params.put("frequency", "730");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "960329C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio de juego de reacondicionamiento de motor.");
		params.put("frequency", "1095");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "94616C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Sistema de lubricación");
		params.put("activity", "Cambio Bomba de reserva de pos lubricación accionada por motor eléctrico.");
		params.put("frequency", "2555");
		params.put("level", "4");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "946413C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		
//////////////////////////////Compresor de Gas Natural: Conjunto final del compresor/////////////////////////////////////////////////////
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de sello “O”(SAE-392)");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "912083C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de sello “O”");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "909782C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de sello “O(SAE-262)");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "908280C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de sello “O” (SAE265)");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "90361C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de sello “O” (SAE240)");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "908231C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Sello de laberinto");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "908231C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de Sello de laberinto");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "945592c1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de Sonda de Vibración ");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "946083c4");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de Sello “O”");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "903268C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de Sello “O”");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "903307C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de  Sello “O”(SAE219)");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "903509C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de  Sello “O (SAE256)");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "908057C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de  Sello “O(SAE263)");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "908058C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto final del compresor");
		params.put("activity", "Cambio de  Sello “O (SAE916)");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "903270C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
//////////////////////////////Compresor de Gas Natural: Conjunto de rotor de compresor/////////////////////////////////////////////////////
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de impulsor etapa 1");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "122746-103");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de impulsor etapa 2");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "122745-103");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de impulsor etapa 3");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "122744-103");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de impulsor etapa 4");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "122743-103");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de impulsor etapa 5");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "122742-103");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de impulsor etapa 6");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "122741-103");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de conjunto de eje corto de succión");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "113623-102");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de conjunto de eje corto de descarga");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "945601C2");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de conjunto de eje corto de acoplamiento");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "954925C2");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de collar de empuje");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "902224C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de llave de eje de entada");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "909765C3");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de rotor de compresor");
		params.put("activity", "Cambio de llave de eje de salida");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "4");
		params.put("total", "-");
		params.put("piece", "909766C3");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
//////////////////////////////Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión/////////////////////////////////////////////////////
		
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de sello de aceite de separación controlada");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "902215C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de anillo de retención interna");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "606495C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de sello de aceite de separación controlada");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "949519C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de conjunto de cojinete de zapatas basculantes");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "946194C94");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de cojinete de potencia de salida");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "902222C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de espaciador de cojinete de empuje");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "902223C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de collar de empuje");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "902224C2");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de cojinete de empuje de entrada");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "130589-101");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de contra tuerca de cojinete");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "902228C2");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de sello “O”");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "918375C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de sello “O”(SAE-912)");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "903269C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de sello y de cojinete extremo de succión");
		params.put("activity", "Cambio de tapón 0.75");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "23383R1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
//////////////////////////////Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga/////////////////////////////////////////////////////
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga");
		params.put("activity", "Cambio de sello de aceite de separación controlada");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "902215C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga");
		params.put("activity", "Cambio de anillo de retención interna");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "606495C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga");
		params.put("activity", "Cambio de sello de aceite de separación controlada");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "949519C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga");
		params.put("activity", "Cambio de conjunto de cojinete de descarga de zapatas basculantes");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "946105C93");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga");
		params.put("activity", "Cambio de Reten de cojinete");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "2");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "90223C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga");
		params.put("activity", "Cambio de contratuerca de cojinete");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "902228C2");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga");
		params.put("activity", "Cambio sello “O”");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "918375C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga");
		params.put("activity", "Cambio de sello “O” SA-912");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "903269C1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga");
		params.put("activity", "Cambio de Tapon0,75");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "2");
		params.put("total", "-");
		params.put("piece", "23383R1");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		params = new HashMap<>();
		params.put("secction", "Compresor de Gas Natural: Conjunto de Cojinete y sello de descarga");
		params.put("activity", "Cambio de contra tuerca de cojinete");
		params.put("frequency", "2555");
		params.put("level", "5");
		params.put("time", "3");
		params.put("personal", "3");
		params.put("total", "-");
		params.put("piece", "902228C2");
		params.put("type", "C");
		params.put("lastUpdate", date);
		table.createRecord(params);
		
		
		System.out.println("Se han creado los datos correctivos por defecto de la tabla " + table.getTableName());
	}

}
