package views;

import java.awt.Dimension;
import javax.swing.JPanel;
import components.Constants;
import dataBaseModels.FailureRegisterDataBase;
import dataBaseModels.MaintenanceRoutinesOperators;
import dataBaseModels.ParamMesuresOperators;
import dataBaseModels.WorkOrderDataBase;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import net.miginfocom.swing.MigLayout;
import reportPanels.MesurePanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;





public class ReportFrame extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JPanel reportPanel;
	private JComboBox<String> comboType;
	private JLabel lblDescription;
	private JLabel lblOperator;
	private JLabel lblInspector;
	private JLabel lblFecha;

	public ReportFrame(JPanel parent) {
		super(parent, "Reportes");
		setAlwaysOnTop(false);
		Dimension pSize = new  Dimension(700, 600);
		setSize(pSize);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setAlignmentX(0.0f);
		panel_1.setAlignmentY(0.0f);
		panel_1.setOpaque(false);
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.PAGE_AXIS));
		
		Component verticalStrut_1 = Box.createVerticalStrut(5);
		panel_1.add(verticalStrut_1);
		
		JLabel lblNewLabel = new JLabel("SELECCIONA EL TIPO DE REPORTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Constants.getTextColor());
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(lblNewLabel);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel_1.add(verticalStrut);
		
		comboType = new JComboBox<String>();

		comboType.setMaximumSize(new Dimension(300, 32767));
		comboType.addItem("Medición de parámetros de funcionamiento");
		comboType.addItem("Mantenimiento Preventivo");
		comboType.addItem("Mantenimiento Correctivo");
		comboType.addItem("Ordenes de trabajo");
		comboType.addItem("Registros de Fallas");
		panel_1.add(comboType);
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		panel_1.add(verticalStrut_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
	
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBorder(null);
		panel.add(scrollPane, BorderLayout.CENTER);
		
		reportPanel = new JPanel();
		reportPanel.setBackground(Constants.getSurfaceColor());
		scrollPane.setViewportView(reportPanel);
		reportPanel.setLayout(new BoxLayout(reportPanel, BoxLayout.Y_AXIS));

		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_2.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new MigLayout("insets 0, gap 0", "[150px:n,grow 300,fill][grow,fill][grow,fill][grow,fill][17px:17px:17px]", "[]"));
		
		lblDescription = new JLabel("Descripción");
		lblDescription.setBorder(null);
		lblDescription.setForeground(Constants.getTextColor());
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblDescription, "cell 0 0,growx,aligny center");
		
		lblOperator = new JLabel("Operador");
		lblOperator.setForeground(Constants.getTextColor());
		lblOperator.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOperator.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblOperator, "cell 1 0,growx,aligny center");
		
		lblInspector = new JLabel("Inspector");
		lblInspector.setForeground(Constants.getTextColor());
		lblInspector.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInspector.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblInspector, "cell 2 0,grow");
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(Constants.getTextColor());
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblFecha, "cell 3 0,grow");
		
		try {
			fillReportPanel();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		comboType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fillReportPanel();
				} catch (ClassNotFoundException | SQLException es) {
					es.printStackTrace();
				}
			}
		});
			
	}

	
	private void fillReportPanel() throws ClassNotFoundException, SQLException {
		lblDescription.setText("Descripción");
		lblFecha.setText("Fecha");
		lblOperator.setText("Operador");
		lblInspector.setText("Inspector");
		
		reportPanel.removeAll();
		reportPanel.setPreferredSize(new Dimension(reportPanel.getPreferredSize().width, 50));
		int index = comboType.getSelectedIndex();
		
		int size = 0;
		
		//el cero es la medición de parametros
		if(index == 0) {
			
			ResultSet rs = new ParamMesuresOperators().findRecords();
			
			while(rs.next()) {
				size++;
				String reportID = rs.getString("reportID");
				String type = "Medición de parametros";
				String operator = rs.getString("operator");
				String inspector = rs.getString("inspector");
				String createdAT = rs.getString("createdAT");
				reportPanel.add(new MesurePanel(reportID, type, operator, inspector, createdAT, "0"));
			}
		}else if (index == 1) {
			
			HashMap<String, String> params = new HashMap<>();
			params.put("type", "P");
			ResultSet rs = new MaintenanceRoutinesOperators().findRowOperators("P");
			
			while(rs.next()) {
				size++;
				String secction = rs.getString("secction");
				String operator = rs.getString("operator");
				String inspector = rs.getString("inspector");
				String lastUpdate = rs.getString("lastUpdate");
				reportPanel.add(new MesurePanel(secction, secction, operator, inspector, lastUpdate, "1"));
				
			}
			

		}else if(index == 2) {
			
			HashMap<String, String> params = new HashMap<>();
			params.put("type", "P");
			ResultSet rs = new MaintenanceRoutinesOperators().findRowOperators("C");
			
			while(rs.next()) {
				size++;
				String secction = rs.getString("secction");
				String operator = rs.getString("operator");
				String inspector = rs.getString("inspector");
				String lastUpdate = rs.getString("lastUpdate");
				reportPanel.add(new MesurePanel(secction, secction, operator, inspector, lastUpdate, "2"));
				
			}
			
		}else if(index == 3) {
			
			lblDescription.setText("entregadoPor");
			lblOperator.setText("supervisadoPor");
			lblInspector.setText("recibidoPor");
			lblFecha.setText("Fecha");
			
			ResultSet rs = new WorkOrderDataBase().findRecords();
			while(rs.next()) {
				size++;
				String id = rs.getString("id");
				String entregadoPor = rs.getString("entregadoPor");
				String supervisadoPor = rs.getString("supervisadoPor");
				String recibidoPor = rs.getString("recibidoPor");
				String lastUpdate = rs.getString("updatedAT");
	
				reportPanel.add(new MesurePanel(id, entregadoPor, recibidoPor, supervisadoPor, lastUpdate, "3"));
			}
		}else if(index == 4) {
			
			lblDescription.setText("Solicitante");
			lblOperator.setText("Receptor");
			lblInspector.setText("AprobadoPor");
			lblFecha.setText("Fecha");
			
			ResultSet rs = new FailureRegisterDataBase().findRecords();
			
			while(rs.next()) {
				size++;
				String id = rs.getString("id");
				String nombreSolicitante = rs.getString("nombreSolicitante");
				String nombreReceptor = rs.getString("nombreReceptor");
				String aprobadoPor = rs.getString("aprobadoPor");
				String lastUpdate = rs.getString("updatedAT");
				reportPanel.add(new MesurePanel(id, nombreSolicitante, nombreReceptor, aprobadoPor, lastUpdate, "4"));
			}
			
			
		}
		
		reportPanel.setPreferredSize(new Dimension(reportPanel.getPreferredSize().width, 50 * size));
		reportPanel.revalidate();
		reportPanel.repaint();

	}
	

}
