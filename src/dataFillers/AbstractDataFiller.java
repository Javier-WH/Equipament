package dataFillers;

import java.sql.SQLException;
import dataBaseModels.DataBaseModel;


public abstract class AbstractDataFiller implements IDataFiller{

	protected DataBaseModel table;
	protected String name = null;
	
	
	public AbstractDataFiller(DataBaseModel table) throws ClassNotFoundException, SQLException {
		this.table = table;
		this.name = table.getTableName();
	}
	
	
	public String getName() {
		return name;
	}

}
