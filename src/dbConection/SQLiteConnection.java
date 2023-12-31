package dbConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import systemsUtilitys.*;

public class SQLiteConnection {

	private static Connection connection;
	private static String homeFolder = CrearteHomeFolder.createFolderInDocuments("DataBases");

	private SQLiteConnection() {
		connection = null;
	}

	private static void startConection() throws ClassNotFoundException, SQLException {

		Class.forName("org.sqlite.JDBC");
		String dbUrl = "jdbc:sqlite:" + homeFolder + "/dataBase.db";
		connection = DriverManager.getConnection(dbUrl);
		System.out.println("Conexión exitosa a la base de datos SQLite.");
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		if (connection == null) {
			startConection();
		}
		return connection;
	}

	public static void closeConnection() throws SQLException {

		if (connection != null) {
			connection.close();
			connection = null;
			System.out.println("se ha cerrado la conexion");
		}

	}

}
