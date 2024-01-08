package views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import components.Constants;
import dataBaseModels.MaintenanceRoutines;
import functions.Translate;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class PreventiveMantenancePlan extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JTable TurbocompresorTable;
	private JTable TurbinaTable;
	private JTable SensoresTable;
	private JTable SistemaAdmisiónAireTable;
	private JTable SistemaCombustibleTable;
	private JTable SistemaAceiteLubricacionTable;
	private JTable EnfriadorAceiteTable;
	private JTable ConsolaControlTable;
	private JTable BateriasTable;
	private JTable CargadorBateriasTable;
	private JTable SistemaDeteccionFuegoGasTable;
	private JTable EquipoCompresorC304SolarTable;

	public PreventiveMantenancePlan(JPanel parent, String title) {
		super(parent, title);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JScrollPane TurbocompresorPanel = new JScrollPane();
		tabbedPane.addTab("Turbocompresor", null, TurbocompresorPanel, null);

		TurbocompresorTable = new JTable();
		setTableStyles(TurbocompresorTable);
		TurbocompresorPanel.setViewportView(TurbocompresorTable);
		TurbocompresorTable.setModel(getTableData("Turbocompresor"));

		JScrollPane TurbinaPanel = new JScrollPane();
		tabbedPane.addTab("Turbina", null, TurbinaPanel, null);

		TurbinaTable = new JTable();
		setTableStyles(TurbinaTable);
		TurbinaPanel.setViewportView(TurbinaTable);
		TurbinaTable.setModel(getTableData("Turbina"));

		JScrollPane SensoresPanel = new JScrollPane();
		tabbedPane.addTab("Sensores", null, SensoresPanel, null);

		SensoresTable = new JTable();
		setTableStyles(SensoresTable);
		SensoresPanel.setViewportView(SensoresTable);
		SensoresTable.setModel(getTableData("Sensores"));

		JScrollPane SistemaAdmisiónAirePanel = new JScrollPane();
		tabbedPane.addTab("Sistema de admisión de aire", null, SistemaAdmisiónAirePanel, null);

		SistemaAdmisiónAireTable = new JTable();
		setTableStyles(SistemaAdmisiónAireTable);
		SistemaAdmisiónAirePanel.setViewportView(SistemaAdmisiónAireTable);
		SistemaAdmisiónAireTable.setModel(getTableData("Sistema de admisión de aire"));

		JScrollPane SistemaCombustiblePanel = new JScrollPane();
		tabbedPane.addTab("Sistema de combustible", null, SistemaCombustiblePanel, null);

		SistemaCombustibleTable = new JTable();
		setTableStyles(SistemaCombustibleTable);
		SistemaCombustiblePanel.setViewportView(SistemaCombustibleTable);
		SistemaCombustibleTable.setModel(getTableData("Sistema de combustible"));

		JScrollPane SistemaAceiteLubricacionPanel = new JScrollPane();
		tabbedPane.addTab("Sistema de aceite de lubricación", null, SistemaAceiteLubricacionPanel, null);

		SistemaAceiteLubricacionTable = new JTable();
		setTableStyles(SistemaAceiteLubricacionTable);
		SistemaAceiteLubricacionPanel.setViewportView(SistemaAceiteLubricacionTable);
		SistemaAceiteLubricacionTable.setModel(getTableData("Sistema de aceite de lubricación"));

		JScrollPane EnfriadorAceitePanel = new JScrollPane();
		tabbedPane.addTab("Enfriador de aceite", null, EnfriadorAceitePanel, null);

		EnfriadorAceiteTable = new JTable();
		setTableStyles(EnfriadorAceiteTable);
		EnfriadorAceitePanel.setViewportView(EnfriadorAceiteTable);
		EnfriadorAceiteTable.setModel(getTableData("Enfriador de aceite"));

		JScrollPane ConsolaControlPanel = new JScrollPane();
		tabbedPane.addTab("Consola de Control", null, ConsolaControlPanel, null);

		ConsolaControlTable = new JTable();
		setTableStyles(ConsolaControlTable);
		ConsolaControlPanel.setViewportView(ConsolaControlTable);
		ConsolaControlTable.setModel(getTableData("Consola de Control"));

		JScrollPane BateriasPanel = new JScrollPane();
		tabbedPane.addTab("Baterías", null, BateriasPanel, null);

		BateriasTable = new JTable();
		setTableStyles(BateriasTable);
		BateriasPanel.setViewportView(BateriasTable);
		BateriasTable.setModel(getTableData("Baterías"));

		JScrollPane CargadorBateriasPanel = new JScrollPane();
		tabbedPane.addTab("Cargador de Baterías", null, CargadorBateriasPanel, null);

		CargadorBateriasTable = new JTable();
		setTableStyles(CargadorBateriasTable);
		CargadorBateriasPanel.setViewportView(CargadorBateriasTable);
		CargadorBateriasTable.setModel(getTableData("Cargador de Baterías"));

		JScrollPane SistemaDeteccionFuegoGasPanel = new JScrollPane();
		tabbedPane.addTab("Sistema de detección de fuego y gas", null, SistemaDeteccionFuegoGasPanel, null);

		SistemaDeteccionFuegoGasTable = new JTable();
		setTableStyles(SistemaDeteccionFuegoGasTable);
		SistemaDeteccionFuegoGasPanel.setViewportView(SistemaDeteccionFuegoGasTable);
		SistemaDeteccionFuegoGasTable.setModel(getTableData("Sistema de detección de fuego y gas"));

		JScrollPane EquipoCompresorC304SolarPanel = new JScrollPane();
		tabbedPane.addTab("Equipo accionado Compresor de gas C304 Solar", null, EquipoCompresorC304SolarPanel, null);

		EquipoCompresorC304SolarTable = new JTable();
		setTableStyles(EquipoCompresorC304SolarTable);
		EquipoCompresorC304SolarPanel.setViewportView(EquipoCompresorC304SolarTable);
		EquipoCompresorC304SolarTable.setModel(getTableData("Equipo accionado Compresor de gas C304 Solar"));

		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(Constants.getSurfaceColor());
		menuPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		getContentPane().add(menuPanel, BorderLayout.NORTH);
		menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.PAGE_AXIS));

		JLabel lblTitle = new JLabel("PLAN DE MANTENIMIENTO PREVENTIVO");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setForeground(Constants.getTextColor());
		lblTitle.setMaximumSize(new Dimension(30000, 30000));
		lblTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		menuPanel.add(lblTitle);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		menuPanel.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JLabel lblNewLabel = new JLabel("Nombre Del Equipo: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setForeground(Constants.getTextColor());
		panel.add(lblNewLabel);

		JLabel lblTurbinaDeGas = new JLabel("Turbina De Gas   N° 5   Y N°3");
		lblTurbinaDeGas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTurbinaDeGas.setForeground(Constants.getTextColor());
		panel.add(lblTurbinaDeGas);

		Component horizontalStrut = Box.createHorizontalStrut(30);
		panel.add(horizontalStrut);

		JLabel lblMarca = new JLabel("Marca: ");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMarca.setForeground(Constants.getTextColor());
		panel.add(lblMarca);

		JLabel lblSolar = new JLabel("Solar");
		lblSolar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSolar.setForeground(Constants.getTextColor());
		panel.add(lblSolar);

		Component horizontalStrut_1 = Box.createHorizontalStrut(30);
		panel.add(horizontalStrut_1);

		JLabel lblModelo = new JLabel("Modelo: ");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblModelo.setForeground(Constants.getTextColor());
		panel.add(lblModelo);

		JLabel lblCentauro = new JLabel("Centauro  40");
		lblCentauro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCentauro.setForeground(Constants.getTextColor());
		panel.add(lblCentauro);
	}

	private void setTableStyles(JTable table) {
		//table.setGridColor(Constants.getSurfaceColor());
		table.setRowHeight(30);
		table.setEnabled(false);
		table.setFont(Constants.getTableFont());
		table.setForeground(Constants.getSurfaceColor());
	}

	private DefaultTableModel getTableData(String secction) {
		DefaultTableModel model = new DefaultTableModel();
		HashMap<String, String> params = new HashMap<>();
		params.put("secction", secction);
		params.put("type", "P");

		try {
			MaintenanceRoutines MR = new MaintenanceRoutines();
			ResultSet TCData = MR.findRecord(params);

			model.addColumn("Actividad De Mantenimiento");
			model.addColumn("Frecuencia");
			model.addColumn("Nivel De Mantenimiento");
			model.addColumn("Horas");
			model.addColumn("Personal");
			model.addColumn("N° Al Año");
			model.addColumn("Fecha");

			while (TCData.next()) {

				String activity = TCData.getString("activity");
				String frequency = Translate.translateFrequency(TCData.getString("frequency"));
				String level = TCData.getString("level");
				String time = TCData.getString("time");
				String personal = TCData.getString("personal");
				String total = TCData.getString("total");
				String lastUpdate = TCData.getString("lastUpdate");

				model.addRow(new Object[] { activity, frequency, level, time, personal, total, lastUpdate });
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return model;
	}

}
