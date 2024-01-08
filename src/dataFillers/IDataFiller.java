package dataFillers;

import java.sql.SQLException;

public interface IDataFiller {

	String getName();
	
	void fillData() throws SQLException;
}
