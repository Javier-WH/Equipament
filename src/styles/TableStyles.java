package styles;

import javax.swing.JTable;

import components.Constants;

public class TableStyles {

	public static void setTableStyles(JTable table) {
		//table.setGridColor(Constants.getSurfaceColor());
		table.setRowHeight(30);
		table.setEnabled(false);
		table.setFont(Constants.getTableFont());
		table.setForeground(Constants.getSurfaceColor());
	}
}
