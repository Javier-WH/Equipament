package dataBaseModels;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public interface DataBaseModel {

    boolean createTable() throws SQLException;
    boolean dropTable() throws SQLException;
    String getTableName() throws SQLException;
    ResultSet findRecords() throws SQLException;
    ResultSet findRecord(HashMap<String, String> criteria) throws SQLException;
    boolean updateRecord(HashMap<String, String> criteria) throws SQLException;
    boolean deleteRecord(HashMap<String, String> criteria) throws SQLException;
    boolean createRecord(HashMap<String, String> data) throws SQLException;
}