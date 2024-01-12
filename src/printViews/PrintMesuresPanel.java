package printViews;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import dataBaseModels.ParamMesuresData;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;

public class PrintMesuresPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblOperador;
	private JLabel lblInspector;
	private JLabel lblDate;

	public PrintMesuresPanel(String id) {
		setPreferredSize(new Dimension(597, 717));

		setBackground(Color.WHITE);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 707, SpringLayout.NORTH, this);
		scrollPane.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, this);
		scrollPane.setBorder(null);
		add(scrollPane);

		JLabel lblNewLabel = new JLabel("EQUIPO: Turbocompresor Solar Centauro 40 ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, this);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("OPERADOR:");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 32, SpringLayout.NORTH, this);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, this);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("JEFE DE MANTENIMIETO:");
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 6, SpringLayout.SOUTH, lblNewLabel_1);
		add(lblNewLabel_2);

		lblOperador = new JLabel("OPERADOR:");
		springLayout.putConstraint(SpringLayout.NORTH, lblOperador, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblOperador, 6, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, lblOperador, 504, SpringLayout.EAST, lblNewLabel_1);
		lblOperador.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblOperador);

		lblInspector = new JLabel("JEFE DE MANTENIMIETO:");
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, lblInspector);
		springLayout.putConstraint(SpringLayout.NORTH, lblInspector, 0, SpringLayout.NORTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.WEST, lblInspector, 6, SpringLayout.EAST, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.EAST, lblInspector, -10, SpringLayout.EAST, this);
		lblInspector.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblInspector);

		JLabel lblNewLabel_3 = new JLabel("Fecha:");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 2, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 176, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_3, -109, SpringLayout.EAST, this);
		add(lblNewLabel_3);

		lblDate = new JLabel("date");
		springLayout.putConstraint(SpringLayout.WEST, lblDate, 490, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, lblDate, 2, SpringLayout.NORTH, lblNewLabel);
		add(lblDate);

		JTable table = new JTable();
		table.setBackground(Color.WHITE);
		table.setModel(getTableData(id));
	    Font tableFont = table.getFont();
        Font newFont = tableFont.deriveFont(9f); // Tamaño de fuente deseado en puntos
        table.setFont(newFont);
        JTableHeader header = table.getTableHeader();
        Font headerFont = header.getFont();
        Font newFontHeader = headerFont.deriveFont(9f); // Tamaño de fuente deseado en puntos
        header.setFont(newFontHeader);
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		scrollPane.setViewportView(table);
		

	}

	public DefaultTableModel getTableData(String reportID) {
		DefaultTableModel model = new DefaultTableModel();
		HashMap<String, String> params = new HashMap<>();
		params.put("reportID", reportID);

		try {
			ParamMesuresData MD = new ParamMesuresData();
			ResultSet ParamMesuresData = MD.findRowsData(reportID);

			model.addColumn("DESCRIPCION");
//			model.addColumn("FECHA");
//			model.addColumn("FECHA");
//			model.addColumn("FECHA");
//			model.addColumn("FECHA");
//			model.addColumn("FECHA");
//			model.addColumn("FECHA");
//			model.addColumn("FECHA");

			boolean columsAdded = false;
			boolean operatorAdded = false;

			while (ParamMesuresData.next()) {

				String description = ParamMesuresData.getString("description");
				String data1 = ParamMesuresData.getString("data1");
				String data2 = ParamMesuresData.getString("data2");
				String data3 = ParamMesuresData.getString("data3");
				String data4 = ParamMesuresData.getString("data4");
				String data5 = ParamMesuresData.getString("data5");
				String data6 = ParamMesuresData.getString("data6");
				String data7 = ParamMesuresData.getString("data7");
				model.addRow(new Object[] { description, data1, data2, data3, data4, data5, data6, data7 });
				
				if(!operatorAdded) {
					operatorAdded = true;
					String operator = ParamMesuresData.getString("operator");
					String inspector = ParamMesuresData.getString("inspector");
					String createdAT = ParamMesuresData.getString("createdAT");
					lblOperador.setText(operator);
					lblInspector.setText(inspector);
					lblDate.setText(createdAT);
				}
				
				if(!columsAdded) {
					columsAdded = true;
					String date1 = ParamMesuresData.getString("date1");
					String date2 = ParamMesuresData.getString("date2");
					String date3 = ParamMesuresData.getString("date3");
					String date4 = ParamMesuresData.getString("date4");
					String date5 = ParamMesuresData.getString("date5");
					String date6 = ParamMesuresData.getString("date6");
					String date7 = ParamMesuresData.getString("date7");
					
					model.addColumn(date1.equals("null") ? "" : date1);
					model.addColumn(date2.equals("null") ? "" : date2);
					model.addColumn(date3.equals("null") ? "" : date3);
					model.addColumn(date4.equals("null") ? "" : date4);
					model.addColumn(date5.equals("null") ? "" : date5);
					model.addColumn(date6.equals("null") ? "" : date6);
					model.addColumn(date7.equals("null") ? "" : date7);
					
				}

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return model;
	}
}
