package utilitys;

import java.sql.SQLException;
import java.util.ArrayList;

import dataFillers.DefaultCorrectiveDataFiller;
import dataFillers.DefaultPreventiveDataFiller;
import dataFillers.DefaultPuestaCeroDataFiller;
import dataFillers.IDataFiller;

public class DataChecker {

	private ArrayList<IDataFiller> datafiller = null;


	public DataChecker() throws ClassNotFoundException, SQLException {

		datafiller = new ArrayList<>();
		datafiller.add(new DefaultPreventiveDataFiller());
		datafiller.add(new DefaultCorrectiveDataFiller());
		datafiller.add(new DefaultPuestaCeroDataFiller());

	}


	public boolean checkData(String dataBaseName) throws SQLException {

		for (IDataFiller filler : datafiller) {
			String fillerName = filler.getName();
			if (fillerName.equals(dataBaseName)) {
				filler.fillData();
			} else {
				System.err.println("ERROR, tabla "+ dataBaseName +" no encontrada");
				return false;
			}
		}
		return true;
	}
 
}
