package tests;

import java.sql.SQLException;

import org.junit.Test;

import dataFillers.DefaultCorrectiveDataFiller;
import dataFillers.DefaultPreventiveDataFiller;

public class DBActivitiesInsertions {

	@Test
	public void CreateRecord() {
		try {
			//DefaultPreventiveDataFiller DPDF = new DefaultPreventiveDataFiller();
			//DPDF.fillData();
			DefaultCorrectiveDataFiller DCDF = new DefaultCorrectiveDataFiller();
			DCDF.fillData();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
