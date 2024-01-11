package manteneceParamsForm;

import views.FrameModel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import net.miginfocom.swing.MigLayout;
import utilitys.DateHandler;

import com.toedter.calendar.JDateChooser;

import components.Constants;
import dataBaseModels.ParamMesuresData;
import dataBaseModels.ParamMesuresDates;
import dataBaseModels.ParamMesuresDescriptions;
import dataBaseModels.ParamMesuresOperators;

import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;


public class MantenanceParamsForm extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JTextField txtOperator;
	private JTextField txtInspector;
	private ArrayList<Parameter> list ;
	private JDateChooser date1;
	private JDateChooser date2;
	private JDateChooser date3;
	private JDateChooser date4;
	private JDateChooser date5;
	private JDateChooser date6;
	private JDateChooser date7;

	public MantenanceParamsForm()  {
		super(null, "MEDICION DE PARAMETROS DE FUNCIONAMIENTO", true);
		setPreferredSize(new Dimension(215, 500));
		
		Dimension size = new Dimension(1200, this.getPreferredSize().height);
		this.setSize(size);
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Constants.getSurfaceColor());
		centerPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		getContentPane().add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel titlePanel = new JPanel();
		titlePanel.setAlignmentY(Component.TOP_ALIGNMENT);
		titlePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		titlePanel.setOpaque(false);
		centerPanel.add(titlePanel, BorderLayout.NORTH);
		titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("EQUIPO: Turbocompresor Solar Centauro 40 ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Constants.getTextColor());
		titlePanel.add(lblNewLabel);
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		titlePanel.add(verticalStrut_1);
		
		JPanel panel = new JPanel();
		panel.setForeground(Constants.getTextColor());
		panel.setBackground(Constants.getSurfaceColor());
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		titlePanel.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel("OPERADOR: ");
		lblNewLabel_1.setForeground(Constants.getTextColor());
		panel.add(lblNewLabel_1);
		
		txtOperator = new JTextField();
		panel.add(txtOperator);
		txtOperator.setColumns(10);
		
		Component verticalStrut_2 = Box.createVerticalStrut(5);
		titlePanel.add(verticalStrut_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Constants.getSurfaceColor());
		panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		titlePanel.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_2 = new JLabel("JEFE DE MANTENIMIETO:");
		lblNewLabel_2.setForeground(Constants.getTextColor());
		panel_1.add(lblNewLabel_2);
		
		txtInspector = new JTextField();
		panel_1.add(txtInspector);
		txtInspector.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(10);
		titlePanel.add(verticalStrut);
		
		JPanel descriptionPanel = new JPanel();
		descriptionPanel.setBorder(new MatteBorder(1, 1, 1, 0, Constants.getTextColor()));
		descriptionPanel.setBackground(Constants.getSurfaceColor());
		descriptionPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		titlePanel.add(descriptionPanel);
		descriptionPanel.setLayout(new MigLayout("insets 0, gap 0", "[300px:n,grow,fill][100px:100px:100px][100px:100px:100px][100px:100px:100px][100px:100px:100px][100px:100px:100px][100px:100px:100px][100px:100px:100px][17px:17px:17px]", "[grow]"));
		
		JLabel lblNewLabel_3 = new JLabel("DESCRIPCIÓN");
		lblNewLabel_3.setForeground(Constants.getTextColor());
		lblNewLabel_3.setBorder(null);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		descriptionPanel.add(lblNewLabel_3, "cell 0 0,grow");
		
		date1 = new JDateChooser();
		date1.setBorder(new MatteBorder(0, 1, 0, 0, Constants.getTextColor()));
		descriptionPanel.add(date1, "cell 1 0,grow");
		
		date2 = new JDateChooser();
		date2.setBorder(new MatteBorder(0, 1, 0, 0, Constants.getTextColor()));
		descriptionPanel.add(date2, "cell 2 0,grow");
		
		date3 = new JDateChooser();
		date3.setBorder(new MatteBorder(0, 1, 0, 0, Constants.getTextColor()));
		descriptionPanel.add(date3, "cell 3 0,grow");
		
		date4 = new JDateChooser();
		date4.setBorder(new MatteBorder(0, 1, 0, 0, Constants.getTextColor()));
		descriptionPanel.add(date4, "cell 4 0,grow");
		
		date5 = new JDateChooser();
		date5.setBorder(new MatteBorder(0, 1, 0, 0, Constants.getTextColor()));
		descriptionPanel.add(date5, "cell 5 0,grow");
		
		date6 = new JDateChooser();
		date6.setBorder(new MatteBorder(0, 1, 0, 0, Constants.getTextColor()));
		descriptionPanel.add(date6, "cell 6 0,grow");
		
		date7 = new JDateChooser();
		date7.setBorder(new MatteBorder(0, 1, 0, 1, (Color) new Color(255, 255, 255)));
		descriptionPanel.add(date7, "cell 7 0,grow");
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		descriptionPanel.add(panel_2, "cell 8 0,grow");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBorder(null);
		centerPanel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel paramsPanel = new JPanel();
		paramsPanel.setBorder(null);
		scrollPane.setViewportView(paramsPanel);
		paramsPanel.setLayout(new BoxLayout(paramsPanel, BoxLayout.Y_AXIS));
		
		//llena los parametros
		try {
			list = getParameterDescriptionList();
			paramsPanel.setPreferredSize(new Dimension(10, (list.size() * 50)));
			
			for(Parameter parameter : list) {
				paramsPanel.add(parameter);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
		onAcept(saveData);
	
	}

	

	private ArrayList<Parameter> getParameterDescriptionList() throws ClassNotFoundException, SQLException{
		ArrayList<Parameter> list = new ArrayList<>();
		
		ParamMesuresDescriptions parametersDB = new ParamMesuresDescriptions();
		ResultSet parameters = parametersDB.findRecords();
		
		while(parameters.next()) {
			String id = parameters.getString("id");
			String description = parameters.getString("description");
			list.add(new Parameter(id, description));
		}
		
		return list;
		
	}
	
	ActionListener saveData = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//obtengo los datos
			String reportID = UUID.randomUUID().toString();
			String operator = txtOperator.getText();
			String inspector = txtInspector.getText();
			String date_1 = DateHandler.dateToString(date1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			String date_2 = DateHandler.dateToString(date2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			String date_3 = DateHandler.dateToString(date3.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			String date_4 = DateHandler.dateToString(date4.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			String date_5 = DateHandler.dateToString(date5.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			String date_6 = DateHandler.dateToString(date6.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			String date_7 = DateHandler.dateToString(date7.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			HashMap<String, String> params = null;
			
			try {
				
				//guardar operador e inspector
				params = new HashMap<>();
				params.put("reportID", reportID);
				params.put("operator", operator);
				params.put("inspector", inspector);
				new ParamMesuresOperators().createRecord(params);
				
				//guardar las fechas
				params = new HashMap<>();
				params.put("reportID", reportID);
				params.put("date1", date_1);
				params.put("date2", date_2);
				params.put("date3", date_3);
				params.put("date4", date_4);
				params.put("date5", date_5);
				params.put("date6", date_6);
				params.put("date7", date_7);
				new ParamMesuresDates().createRecord(params);
				
				//guaardando la data
				for (Parameter parameter : list) {
					String descriptionID = parameter.getId();
					HashMap<String, String> data = parameter.getData();
					params = new HashMap<>();
					params.put("reportID", reportID);
					params.put("descriptionID", descriptionID);
					params.put("data1", data.get("data1"));
					params.put("data2", data.get("data2"));
					params.put("data3", data.get("data3"));
					params.put("data4", data.get("data4"));
					params.put("data5", data.get("data5"));
					params.put("data6", data.get("data6"));
					params.put("data7", data.get("data7"));
					new ParamMesuresData().createRecord(params);
					
				}
				
				
			
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			
			
		}
	};
	
	
}
