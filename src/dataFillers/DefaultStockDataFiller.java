package dataFillers;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import dataBaseModels.Stock;
import utilitys.DateHandler;

public class DefaultStockDataFiller extends AbstractDataFiller {

	
	public DefaultStockDataFiller() throws ClassNotFoundException, SQLException {
		super(new Stock());
	}
	 
	 
	public void fillData() throws SQLException {
		LocalDate localDate = LocalDate.now();
		String date = DateHandler.dateToString(localDate);
		HashMap<String, String> params = new HashMap<>();
			
//////////////////////////////Sistema de Arranque/////////////////////////////////////////////////////
			params.put("secction", "Sistema de Arranque");
			params.put("parts","Juntas de motores de arranque");
			params.put("number", "904072C1");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de Arranque");
			params.put("parts","Bujía de encendido");
			params.put("number", "903316C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de Arranque");
			params.put("parts","Juego de alabes de motores de arranque");
			params.put("number", "8007917R92");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de Arranque");
			params.put("parts","Cojinetes de rotor  de motores de arranque");
			params.put("number", "8007918R92");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de Arranque");
			params.put("parts","Eje de motores de arranque");
			params.put("number", "8917617R93 ");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de Arranque");
			params.put("parts","Juego  mangueras de suministro de gas de motores neumáticos");
			params.put("number", "T24C1425B14");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
//////////////////////////////Compresor Axial /////////////////////////////////////////////////////
			
			params = new HashMap<>();
			params.put("secction", "Compresor Axial");
			params.put("parts","Válvula de aire  purga del compresor");
			params.put("number", "125157-100");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			
//////////////////////////////Sistema de gas combustible/////////////////////////////////////////////////////
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","Elemento filtrante de la válvula de control de combustible");
			params.put("number", "46191-1");
			params.put("quantity", "15");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","Sello de la ranura del elemento de filtro");
			params.put("number", "903285C1");
			params.put("quantity", "15");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","Juntas de inyectores");
			params.put("number", "909745C2");
			params.put("quantity", "15");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","Sello de válvula de alivio  piloto");
			params.put("number", "903267C1");
			params.put("quantity", "15");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","Juego completo de sellos de válvula de dos vías");
			params.put("number", "8007874R94");
			params.put("quantity", "15");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","Válvula de gas piloto");
			params.put("number", "910380C4");
			params.put("quantity", "2");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","juego inyectores");
			params.put("number", "-");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			
//////////////////////////////Sistema aceite sello/////////////////////////////////////////////////////
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","Juego de sello de las conexiones de entrada y salida de las mangueras");
			params.put("number", "950232C1");
			params.put("quantity", "2");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","Filtro lavable (trampa) aceite sello ");
			params.put("number", "120376-3");
			params.put("quantity", "2");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","Manguera de suministro aceite sello");
			params.put("number", "912510C1");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de gas combustible");
			params.put("parts","Engranaje de bomba (juego de reparación completo N/P ");
			params.put("number", "800787GR91");
			params.put("quantity", "2");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			
//////////////////////////////Cabina/////////////////////////////////////////////////////
			
			params = new HashMap<>();
			params.put("secction", "Cabina");
			params.put("parts","Juego de detectores de fuego");
			params.put("number", "120803-3");
			params.put("quantity", "2");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Cabina");
			params.put("parts","Juego de gomas de hermeticidad");
			params.put("number", "967990C1");
			params.put("quantity", "2");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
//////////////////////////////Sistema de lubricación/////////////////////////////////////////////////////
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Elementos filtrantes");
			params.put("number", "917646C91/");
			params.put("quantity", "15");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Juntas de elementos filtrantes");
			params.put("number", "903646C1");
			params.put("quantity", "15");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","sellos “O”");
			params.put("number", "172206-1");
			params.put("quantity", "7");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Sellos de (REBORDES) de bomba de pre/post lubricación");
			params.put("number", "951147C1");
			params.put("quantity", "7");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Sello de válvula de control de lubricación");
			params.put("number", "-");
			params.put("quantity", "0");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Juego sellos de motores, ventiladores ,enfriadores de aceite");
			params.put("number", "910474C1");
			params.put("quantity", "7");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Válvula de ultimo alivio de presión");
			params.put("number", "913739C2");
			params.put("quantity", "3");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Válvula de control de temperatura");
			params.put("number", "914739C2");
			params.put("quantity", "1");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Juego de cojinetes de bomba de pre y post lubricación  accionada por motor neumático");
			params.put("number", "8007877R91");
			params.put("quantity", "3");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Juego de cojinetes de motores ventiladores enfriadores de aceite");
			params.put("number", "909740C1 ");
			params.put("quantity", "2");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Engranajes de bomba de pre y post lubricación  accionada por motor neumático.");
			params.put("number", "8007877R91");
			params.put("quantity", "2");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Elemento filtrante");
			params.put("number", "945732C1");
			params.put("quantity", "15");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Filtro (Elemento lavable)");
			params.put("number", "914567C1");
			params.put("quantity", "2");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Juegos  de sellos de bomba accionada por motor eléctrico");
			params.put("number", "960329C1");
			params.put("quantity", "2");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Sistema de lubricación");
			params.put("parts","Bomba de reserva de pos lubricación accionada por motor eléctrico. ");
			params.put("number", "946413C1");
			params.put("quantity", "1");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			
//////////////////////////////Sistema de admisión de aire/////////////////////////////////////////////////////
			
			params = new HashMap<>();
			params.put("secction", "Sistema de admisión de aire");
			params.put("parts","Juego de pre filtros");
			params.put("number", "951339C17");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params = new HashMap<>();
			params.put("secction", "Sistema de admisión de aire");
			params.put("parts","Juego de  filtros");
			params.put("number", "AX-4005");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			
//////////////////////////////Compresor de Gas Natural Conjunto final del compresor////////////////////////////////////////////////////
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello “O” ");
			params.put("number", "909782C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello “O(SAE-262)");
			params.put("number", "908280C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello “O” (SAE265)");
			params.put("number", "90361C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello “O” (SAE240)");
			params.put("number", "908231C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello de laberinto");
			params.put("number", "902212c1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello de laberinto");
			params.put("number", "945592c1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sonda de Vibración");
			params.put("number", "946083c4");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello “O”");
			params.put("number", "903268C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello “O”");
			params.put("number", "903307C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello “O”(SAE219)");
			params.put("number", "903509C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello “O (SAE256)");
			params.put("number", "908057C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello “O(SAE263)");
			params.put("number", "908058C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto final del compresor");
			params.put("parts","Sello “O (SAE916)");
			params.put("number", "903270C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			
//////////////////////////////Compresor de Gas Natural Conjunto de rotor de compresor////////////////////////////////////////////////////	
			
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Impulsor etapa 1");
			params.put("number", "-");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Impulsor etapa 2");
			params.put("number", "-");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Impulsor etapa 3");
			params.put("number", "-");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Impulsor etapa 4");
			params.put("number", "-");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Impulsor etapa 5");
			params.put("number", "-");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Impulsor etapa 6");
			params.put("number", "-");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Conjunto de eje corto de succión");
			params.put("number", "-");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Conjunto de eje corto de descarga");
			params.put("number", "-");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Sello “O2(SAE-129)");
			params.put("number", "-");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Conjunto de eje corto de acoplamiento ");
			params.put("number", "-");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Collar de empuje");
			params.put("number", "-");
			params.put("quantity", "5");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Llave de eje de entada");
			params.put("number", "-");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
						
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de rotor de compresor");
			params.put("parts","Llave de eje de salida");
			params.put("number", "-");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
//////////////////////////////Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión ////////////////////////////////////////////////////			
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Sello de aceite de separación controlada ");
			params.put("number", "902215C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Anillo de retención interna");
			params.put("number", "606495C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Anillo de retención interna");
			params.put("number", "606495C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Sello de aceite de separación controlada");
			params.put("number", "949519C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Conjunto de cojinete de zapatas basculantes");
			params.put("number", "946194C94");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Cojinete de potencia de salida");
			params.put("number", "902222C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Espaciador de cojinete de empuje");
			params.put("number", "902223C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Collar de empuje");
			params.put("number", "902224C2");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Cojinete de empuje de entrada");
			params.put("number", "919530C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Conjunto de placa de cojinete de empuje");
			params.put("number", "130589-101");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Tuerca de cojinete");
			params.put("number", "902228C2");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Sello “O”");
			params.put("number", "918375C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Sello “O”(SAE-912)");
			params.put("number", "903269C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de sello y de cojinete extremo de succión");
			params.put("parts","Tapón 0.75");
			params.put("number", "23383R1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			
////////////////////////////// Compresor de Gas Natural Conjunto de Cojinete y sello de descarga ////////////////////////////////////////////////////	
			
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de Cojinete y sello de descarga");
			params.put("parts","Sello de aceite de separación controlada");
			params.put("number", "902215C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de Cojinete y sello de descarga");
			params.put("parts","606495C1");
			params.put("number", "23383R1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de Cojinete y sello de descarga");
			params.put("parts","Sello de aceite de separación controlada ");
			params.put("number", "949519C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de Cojinete y sello de descarga");
			params.put("parts","Conjunto de cojinete de descarga de zapatas basculantes");
			params.put("number", "946105C93");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de Cojinete y sello de descarga");
			params.put("parts","Reten de cojinete");
			params.put("number", "90223C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de Cojinete y sello de descarga");
			params.put("parts","Contratuerca de cojinete");
			params.put("number", "902228C2");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de Cojinete y sello de descarga");
			params.put("parts","Sello “O”");
			params.put("number", "918 375 C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de Cojinete y sello de descarga");
			params.put("parts","Sello “O” SA-912");
			params.put("number", "903269C1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de Cojinete y sello de descarga");
			params.put("parts","Tapon0,75");
			params.put("number", "23383R1");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			params = new HashMap<>();
			params.put("secction", "Compresor de Gas Natural Conjunto de Cojinete y sello de descarga");
			params.put("parts","Contra tuerca de cojinete");
			params.put("number", "902228C2");
			params.put("quantity", "10");
			params.put("lastUpdate", date);
			table.createRecord(params);
			
			
			
			System.out.println("Se han creado los datos puesta a cero por defecto de la tabla " + table.getTableName());

		
	}
}
