package systemsUtilitys;

import java.io.File;

import javax.swing.JOptionPane;

public class CrearteHomeFolder {

	public static String createFolderInDocuments(String folderName) {
		String userHome = System.getProperty("user.home");
		String documentsPath = userHome + File.separator + "Documents";
		String folderPath = documentsPath + File.separator + folderName;
		File folder = new File(folderPath);
		if (!folder.exists()) {
			boolean created = folder.mkdirs();
			if (created) {
				return folderPath;
			} else {
				JOptionPane.showMessageDialog(null, "No se puede encontrar la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
				System.exit(1);
				return null;
			}
		} else {
			return folderPath;
		}
	}
}
