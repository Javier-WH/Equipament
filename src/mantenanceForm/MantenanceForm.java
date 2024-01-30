package mantenanceForm;

import views.FrameModel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.TitledBorder;
import components.Cmessage;
import components.Constants;
import dataBaseModels.MaintenanceRoutines;
import dataBaseModels.MaintenanceRoutinesOperators;
import main.AlterThread;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MantenanceForm extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JTextField txtInspector;
	private JTextField txtTencician;
	JTextPane txtObservastions;
	private static JPanel activitiesPanel = new JPanel();
	private ArrayList<ActivityPanel> activityList = new ArrayList<>();
	private int alarmID;
	private JLabel lblSecction;
	private JLabel lblTitle;
	private MaintenanceRoutines MR = null;
	private String type = null;
	
	
	public MantenanceForm(int alarmID, String type) throws ClassNotFoundException, SQLException {
		super(null, "Formulario de Manteniniento", true);
		this.type = type;
		getContentPane().setBackground(Constants.getSurfaceColor());

		this.alarmID = alarmID;
	

		MR = new MaintenanceRoutines();

		JPanel panel = new JPanel();
		panel.setBackground(Constants.getSurfaceColor());
		panel.setBorder(new EmptyBorder(0, 10, 10, 10));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel northPanel = new JPanel();
		northPanel.setBackground(Constants.getSurfaceColor());
		panel.add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));

		JLabel lblNewLabel = new JLabel("Unidad N°1 Turbocompresora Solar Centauro 40");
		lblNewLabel.setForeground(Constants.getTextColor());
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setMaximumSize(new Dimension(30000, 14));
		northPanel.add(lblNewLabel);

		JPanel inspectorPanel = new JPanel();
		inspectorPanel.setBackground(Constants.getSurfaceColor());
		northPanel.add(inspectorPanel);
		inspectorPanel.setLayout(new BoxLayout(inspectorPanel, BoxLayout.X_AXIS));

		Component horizontalStrut_1 = Box.createHorizontalStrut(30);
		inspectorPanel.add(horizontalStrut_1);

		JLabel lblNewLabel_1 = new JLabel("Encargado de la Inspección: ");
		lblNewLabel_1.setForeground(Constants.getTextColor());
		inspectorPanel.add(lblNewLabel_1);

		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		inspectorPanel.add(horizontalStrut_3);

		txtInspector = new JTextField();
		inspectorPanel.add(txtInspector);
		txtInspector.setColumns(10);

		Component horizontalStrut = Box.createHorizontalStrut(30);
		inspectorPanel.add(horizontalStrut);

		lblTitle = new JLabel("");
		lblTitle.setForeground(Constants.getTextColor());
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		northPanel.add(lblTitle);

		Component verticalStrut = Box.createVerticalStrut(10);
		northPanel.add(verticalStrut);

		JPanel westPanel = new JPanel();
		westPanel.setBackground(Constants.getSurfaceColor());
		westPanel.setBorder(null);
		westPanel.setPreferredSize(new Dimension(120, 10));
		panel.add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.PAGE_AXIS));

		JLabel lblNewLabel_3 = new JLabel(" Parte");
		lblNewLabel_3.setForeground(Constants.getTextColor());
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setMaximumSize(new Dimension(30000, 50));
		lblNewLabel_3.setMinimumSize(new Dimension(29, 100));
		lblNewLabel_3.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getTextColor()));
		lblNewLabel_3.setPreferredSize(new Dimension(400, 100));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setAlignmentY(Component.TOP_ALIGNMENT);
		westPanel.add(lblNewLabel_3);

		lblSecction = new JLabel("<html><center>Sistema de arranque</center></html>");
		lblSecction.setForeground(Constants.getTextColor());
		lblSecction.setPreferredSize(new Dimension(400, 100));
		lblSecction.setMinimumSize(new Dimension(29, 100));
		lblSecction.setMaximumSize(new Dimension(30000, 30000));
		lblSecction.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecction.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSecction.setBorder(new MatteBorder(0, 1, 1, 1,Constants.getTextColor()));
		lblSecction.setAlignmentY(0.0f);
		westPanel.add(lblSecction);

		JPanel centerPanel = new JPanel();
		centerPanel.setBorder(null);
		panel.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.PAGE_AXIS));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Constants.getSurfaceColor());
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.setMaximumSize(new Dimension(32767, 100));
		panel_1.setPreferredSize(new Dimension(10, 100));
		panel_1.setMinimumSize(new Dimension(300000, 100));
		centerPanel.add(panel_1);
		panel_1.setLayout(new MigLayout("insets 0, gap 0",
				"[grow,fill][160px:160px:160px,fill][140px:140px:140px,fill]", "[100px:100px:100px,center]"));

		JLabel lblNewLabel_5 = new JLabel("Descripción");
		lblNewLabel_5.setForeground(Constants.getTextColor());
		lblNewLabel_5.setBorder(new MatteBorder(1, 0, 1, 0, Constants.getTextColor()));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblNewLabel_5, "cell 0 0,grow");

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Constants.getSurfaceColor());
		panel_2.setBorder(new MatteBorder(1, 0, 1, 1,Constants.getTextColor()));
		panel_1.add(panel_2, "cell 1 0,grow");
		panel_2.setLayout(new MigLayout("insets 0, gap 0", "[80px:80px:80px,fill][80px:80px:80px,fill]",
				"[grow,fill][grow,fill]"));

		JLabel lblNewLabel_8 = new JLabel("Realizado");
		lblNewLabel_8.setForeground(Constants.getTextColor());
		lblNewLabel_8.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getTextColor()));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_8, "cell 0 0,span 2");

		JLabel lblNewLabel_6 = new JLabel("SI");
		lblNewLabel_6.setForeground(Constants.getTextColor());
		lblNewLabel_6.setBorder(new MatteBorder(0, 1, 0, 0, Constants.getTextColor()));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_6, "cell 0 1,grow");

		JLabel lblNewLabel_7 = new JLabel("NO");
		lblNewLabel_7.setForeground(Constants.getTextColor());
		lblNewLabel_7.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_7, "cell 1 1,grow");

		JLabel lblNewLabel_4 = new JLabel("Fecha");
		lblNewLabel_4.setForeground(Constants.getTextColor());
		lblNewLabel_4.setBorder(new MatteBorder(1, 0, 1, 1,Constants.getTextColor()));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4, "flowx,cell 2 0,grow");

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBorder(null);
		centerPanel.add(scrollPane_1);
		////////////////////////////////////////////////////////////////
		activitiesPanel.setPreferredSize(new Dimension(10, 50));
		activitiesPanel.setLayout(new BoxLayout(activitiesPanel, BoxLayout.Y_AXIS));
		scrollPane_1.setViewportView(activitiesPanel);

		JPanel southPanel = new JPanel();
		southPanel.setBackground(Constants.getSurfaceColor());
		panel.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.Y_AXIS));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Constants.getSurfaceColor());
		panel_3.setBorder(new EmptyBorder(5, 0, 0, 0));
		southPanel.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));

		Component horizontalStrut_1_1 = Box.createHorizontalStrut(30);
		panel_3.add(horizontalStrut_1_1);

		JLabel lblNewLabel_9 = new JLabel("Técnico u operario encargado del mantenimiento:");
		lblNewLabel_9.setForeground(Constants.getTextColor());
		lblNewLabel_9.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_3.add(lblNewLabel_9);

		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_2);

		txtTencician = new JTextField();
		txtTencician.setPreferredSize(new Dimension(30000, 20));
		panel_3.add(txtTencician);
		txtTencician.setColumns(10);

		Component horizontalStrut_1_2 = Box.createHorizontalStrut(30);
		panel_3.add(horizontalStrut_1_2);

		Component verticalStrut_1 = Box.createVerticalStrut(10);
		southPanel.add(verticalStrut_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Constants.getSurfaceColor());
		scrollPane.setBorder(new TitledBorder(new EmptyBorder(0, 25, 0, 25), "Observaciones:", TitledBorder.LEADING, TitledBorder.TOP, null, Constants.getTextColor()));
		scrollPane.setPreferredSize(new Dimension(2, 60));
		southPanel.add(scrollPane);

		txtObservastions = new JTextPane();
		scrollPane.setViewportView(txtObservastions);

/////////////////////////////////////////////////////////////////////////////////////

		fillActivityList();
		fillActivitiesPanel();

		onAcept(aceptAction);

	}

	ActionListener aceptAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			boolean someOneDone = false; 
			
			for (ActivityPanel activity : activityList) {
				someOneDone = activity.isDone();	
				if(someOneDone) {
					break;
				}
			}
			
			if(!someOneDone) {
				new Cmessage("Aceptar", null, "No hay cambios que actualizar", null).setVisible(true);
				return;
			}
			
			if(txtInspector.getText().isEmpty()) {
				new Cmessage("Aceptar", null, "No ha suministrado un encargado de la inspección", null).setVisible(true);
				return;
			}
			
			if(txtTencician.getText().isEmpty()) {
				new Cmessage("Aceptar", null, "No ha suministrado un técnico u operario", null).setVisible(true);
				return;
			}
			

			//aqui se hace el update
			for (ActivityPanel activity : activityList) {
				boolean isDone = activity.isDone();
				if (isDone) {
					String id = activity.getId();
					String lastUpdate = activity.getDate();

					HashMap<String, String> params = new HashMap<>();
					params.put("id", id);
					params.put("lastUpdate", lastUpdate);

					try {
						MR.updateRecord(params);
						//////nuevo 
						
						HashMap<String, String> paramsOperator = new HashMap<>();
						paramsOperator.put("inspector", txtInspector.getText());
						paramsOperator.put("operator", txtTencician.getText());
						paramsOperator.put("observations", txtObservastions.getText());
						paramsOperator.put("routineID", id);
						paramsOperator.put("date", lastUpdate);
						new MaintenanceRoutinesOperators().createRecord(paramsOperator);
						
					
						/////
						
						AlterThread.refreshAlarms();
						dispose();
					} catch (SQLException | ClassNotFoundException e1) {
						e1.printStackTrace();
					}
				}
			}
			
			
		}
	};

	private void fillActivityList() {
		activityList = new ArrayList<>();
		// parametros para obtener los datos de la fila
		HashMap<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(alarmID));

		try {
			// obtener los datos de la fila
			MaintenanceRoutines routinesTable = new MaintenanceRoutines();
			ResultSet activityRow = routinesTable.findRecord(params);
			
			//System.out.println(type);
			
			String secction = null;
			String type = null;

			if (activityRow.next()) {
				secction = activityRow.getString("secction");
				type = this.type == null ? activityRow.getString("type") : this.type;
			}

			if (secction == null || type == null) {
				throw new Exception("No existe el activity");
			}

			// cambia el titulo dependiendo el tipo de alerta
			lblTitle.setText("Check List de Mantenimiento "
					+ (type.equals("P") ? "Preventivo" : type.equals("C") ? "Correctivo" : "Correctivo Puesta a Cero"));

			// nombre de la etiqueta seccion
			lblSecction.setText("<html><center>" + secction + "</center></html>");

			// buscar todos los activitys de esa seccion
			params = new HashMap<>();
			params.put("secction", secction);
			params.put("type", type);
			
	
			
			ResultSet activities = routinesTable.findRecord(params);

			while (activities.next()) {
				int id = Integer.parseInt(activities.getString("id"));
				String activity = activities.getString("activity");
				activityList.add(new ActivityPanel(id, activity));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void fillActivitiesPanel() {
		activitiesPanel.removeAll();
		Dimension size = new Dimension(50, (activityList.size() * 50));
		activitiesPanel.setPreferredSize(size);
		for (ActivityPanel activity : activityList) {
			activitiesPanel.add(activity);
		}
	}

}
