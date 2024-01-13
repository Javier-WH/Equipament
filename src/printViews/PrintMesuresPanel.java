package printViews;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import components.Constants;
import dataBaseModels.ParamMesuresData;
import javax.swing.JLabel;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

public class PrintMesuresPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblOperador;
	private JLabel lblInspector;
	private JLabel lblDate;
	private JLabel lblDate1;
	private JLabel lblDate2;
	private JLabel lblDate3;
	private JLabel lblDate4;
	private JLabel lblDate5;
	private JLabel lblDate6;
	private JLabel lblDate7;
	private JPanel mesuresPanel;

	public PrintMesuresPanel(String id) {
		setPreferredSize(new Dimension(597, 717));

		setBackground(Color.WHITE);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("EQUIPO: Turbocompresor Solar Centauro 40 ");
		lblNewLabel.setBounds(10, 10, 209, 13);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("OPERADOR:");
		lblNewLabel_1.setBounds(10, 32, 58, 13);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("JEFE DE MANTENIMIETO:");
		lblNewLabel_2.setBounds(10, 51, 122, 13);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		add(lblNewLabel_2);

		lblOperador = new JLabel("OPERADOR:");
		lblOperador.setBounds(74, 29, 498, 13);
		lblOperador.setFont(new Font("Tahoma", Font.PLAIN, 10));
		add(lblOperador);

		lblInspector = new JLabel("JEFE DE MANTENIMIETO:");
		lblInspector.setBounds(138, 51, 449, 13);
		lblInspector.setFont(new Font("Tahoma", Font.PLAIN, 10));
		add(lblInspector);

		JLabel lblNewLabel_3 = new JLabel("Fecha:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(391, 9, 93, 14);
		add(lblNewLabel_3);

		lblDate = new JLabel("date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDate.setBounds(428, 9, 116, 14);
		add(lblDate);
		
		mesuresPanel = new JPanel();
		mesuresPanel.setOpaque(false);
		mesuresPanel.setBounds(10, 76, 577, 630);
		add(mesuresPanel);
		mesuresPanel.setLayout(new MigLayout("insets 0, gap 0", "[grow 250,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill]", "[][]"));
		
		JLabel lblNewLabel_4 = new JLabel("DESCRIPCION");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_4.setFont(Constants.getPrintFont());
		mesuresPanel.add(lblNewLabel_4, "cell 0 0,grow, spany 2");
		
		JLabel lblDate1_1 = new JLabel("FECHA");
		lblDate1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate1_1.setFont(new Font("Arial", Font.PLAIN, 7));
		lblDate1_1.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
		mesuresPanel.add(lblDate1_1, "cell 1 0");
		
		JLabel lblDate2_1 = new JLabel("FECHA");
		lblDate2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate2_1.setFont(new Font("Arial", Font.PLAIN, 7));
		lblDate2_1.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
		mesuresPanel.add(lblDate2_1, "cell 2 0");
		
		JLabel lblDate2_2 = new JLabel("FECHA");
		lblDate2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate2_2.setFont(new Font("Arial", Font.PLAIN, 7));
		lblDate2_2.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
		mesuresPanel.add(lblDate2_2, "cell 3 0");
		
		JLabel lblDate2_3 = new JLabel("FECHA");
		lblDate2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate2_3.setFont(new Font("Arial", Font.PLAIN, 7));
		lblDate2_3.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
		mesuresPanel.add(lblDate2_3, "cell 4 0");
		
		JLabel lblDate2_4 = new JLabel("FECHA");
		lblDate2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate2_4.setFont(new Font("Arial", Font.PLAIN, 7));
		lblDate2_4.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
		mesuresPanel.add(lblDate2_4, "cell 5 0");
		
		JLabel lblDate2_5 = new JLabel("FECHA");
		lblDate2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate2_5.setFont(new Font("Arial", Font.PLAIN, 7));
		lblDate2_5.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
		mesuresPanel.add(lblDate2_5, "cell 6 0");
		
		JLabel lblDate2_6 = new JLabel("FECHA");
		lblDate2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate2_6.setFont(new Font("Arial", Font.PLAIN, 7));
		lblDate2_6.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
		mesuresPanel.add(lblDate2_6, "cell 7 0");
		
		lblDate1 = new JLabel("FECHA");
		lblDate1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate1.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(64, 64, 64)));
		lblDate1.setFont(Constants.getPrintFont());
		mesuresPanel.add(lblDate1, "cell 1 1,grow");
		
		lblDate2 = new JLabel("FECHA");
		lblDate2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate2.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblDate2.setFont(Constants.getPrintFont());
		mesuresPanel.add(lblDate2, "cell 2 1,grow");
		
		lblDate3 = new JLabel("FECHA");
		lblDate3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate3.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblDate3.setFont(Constants.getPrintFont());
		mesuresPanel.add(lblDate3, "cell 3 1,grow");
		
		lblDate4 = new JLabel("FECHA");
		lblDate4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate4.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblDate4.setFont(Constants.getPrintFont());
		mesuresPanel.add(lblDate4, "cell 4 1,grow");
		
		lblDate5 = new JLabel("FECHA");
		lblDate5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate5.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblDate5.setFont(Constants.getPrintFont());
		mesuresPanel.add(lblDate5, "cell 5 1,grow");
		
		lblDate6 = new JLabel("FECHA");
		lblDate6.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate6.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblDate6.setFont(Constants.getPrintFont());
		mesuresPanel.add(lblDate6, "cell 6 1,grow");
		
		lblDate7 = new JLabel("FECHA");
		lblDate7.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate7.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblDate7.setFont(Constants.getPrintFont());
		mesuresPanel.add(lblDate7, "cell 7 1,grow");
      
		
		getTableData(id);
	}

	public void getTableData(String reportID) {
	
		HashMap<String, String> params = new HashMap<>();
		params.put("reportID", reportID);

		try {
			ParamMesuresData MD = new ParamMesuresData();
			ResultSet ParamMesuresData = MD.findRowsData(reportID);


			boolean operatorAdded = false;
			boolean datesAdded = false;

			int row = 3;
			
			while (ParamMesuresData.next()) {
				
				String description = ParamMesuresData.getString("description");
				String data1 = ParamMesuresData.getString("data1");
				String data2 = ParamMesuresData.getString("data2");
				String data3 = ParamMesuresData.getString("data3");
				String data4 = ParamMesuresData.getString("data4");
				String data5 = ParamMesuresData.getString("data5");
				String data6 = ParamMesuresData.getString("data6");
				String data7 = ParamMesuresData.getString("data7");
				
				String[] rowList = {description, data1, data2, data3, data4, data5, data6, data7};
				
				for(int i = 0 ; i < rowList.length ; i++) {
					JLabel label = new JLabel(rowList[i] == null ? " " : rowList[i] );
					label.setBorder(new MatteBorder( 0 , i== 0 ? 1 : 0, 1, 1, (Color) Color.DARK_GRAY));
					label.setFont(Constants.getPrintFont());
					mesuresPanel.add(label, "cell "+i+" "+ row);
				}
				
				
				///agregar operador
				if(!operatorAdded) {
					operatorAdded = true;
					String operator = ParamMesuresData.getString("operator");
					String inspector = ParamMesuresData.getString("inspector");
					String createdAT = ParamMesuresData.getString("createdAT");
					lblOperador.setText(operator);
					lblInspector.setText(inspector);
					lblDate.setText(createdAT);
				}
				
				if(!datesAdded) {
					datesAdded = true;
					lblDate1.setText(ParamMesuresData.getString("date1").equals("null") ? " " : ParamMesuresData.getString("date1"));
					lblDate2.setText(ParamMesuresData.getString("date2").equals("null") ? " " : ParamMesuresData.getString("date2"));
					lblDate3.setText(ParamMesuresData.getString("date3").equals("null") ? " " : ParamMesuresData.getString("date3"));
					lblDate4.setText(ParamMesuresData.getString("date4").equals("null") ? " " : ParamMesuresData.getString("date4"));
					lblDate5.setText(ParamMesuresData.getString("date5").equals("null") ? " " : ParamMesuresData.getString("date5"));
					lblDate6.setText(ParamMesuresData.getString("date6").equals("null") ? " " : ParamMesuresData.getString("date6"));
					lblDate7.setText(ParamMesuresData.getString("date7").equals("null") ? " " : ParamMesuresData.getString("date7"));	
				}
				
				
				
				row++;
			

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	
	}
}
