package views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import components.Constants;
import functions.TableData;
import styles.TableStyles;
import java.awt.Dimension;
import java.awt.Font;
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
		TableStyles.setTableStyles(TurbocompresorTable);
		TurbocompresorPanel.setViewportView(TurbocompresorTable);
		TurbocompresorTable.setModel( TableData.getMaintenanceTableData("Turbocompresor", "P"));

		JScrollPane TurbinaPanel = new JScrollPane();
		tabbedPane.addTab("Turbina", null, TurbinaPanel, null);

		TurbinaTable = new JTable();
		TableStyles.setTableStyles(TurbinaTable);
		TurbinaPanel.setViewportView(TurbinaTable);
		TurbinaTable.setModel(TableData.getMaintenanceTableData("Turbina", "P"));

		JScrollPane SensoresPanel = new JScrollPane();
		tabbedPane.addTab("Sensores", null, SensoresPanel, null);

		SensoresTable = new JTable();
		TableStyles.setTableStyles(SensoresTable);
		SensoresPanel.setViewportView(SensoresTable);
		SensoresTable.setModel(TableData.getMaintenanceTableData("Sensores", "P"));

		JScrollPane SistemaAdmisiónAirePanel = new JScrollPane();
		tabbedPane.addTab("Sistema de admisión de aire", null, SistemaAdmisiónAirePanel, null);

		SistemaAdmisiónAireTable = new JTable();
		TableStyles.setTableStyles(SistemaAdmisiónAireTable);
		SistemaAdmisiónAirePanel.setViewportView(SistemaAdmisiónAireTable);
		SistemaAdmisiónAireTable.setModel(TableData.getMaintenanceTableData("Sistema de admisión de aire", "P"));

		JScrollPane SistemaCombustiblePanel = new JScrollPane();
		tabbedPane.addTab("Sistema de combustible", null, SistemaCombustiblePanel, null);

		SistemaCombustibleTable = new JTable();
		TableStyles.setTableStyles(SistemaCombustibleTable);
		SistemaCombustiblePanel.setViewportView(SistemaCombustibleTable);
		SistemaCombustibleTable.setModel(TableData.getMaintenanceTableData("Sistema de combustible", "P"));

		JScrollPane SistemaAceiteLubricacionPanel = new JScrollPane();
		tabbedPane.addTab("Sistema de lubricación", null, SistemaAceiteLubricacionPanel, null);

		SistemaAceiteLubricacionTable = new JTable();
		TableStyles.setTableStyles(SistemaAceiteLubricacionTable);
		SistemaAceiteLubricacionPanel.setViewportView(SistemaAceiteLubricacionTable);
		SistemaAceiteLubricacionTable.setModel(TableData.getMaintenanceTableData("Sistema de lubricación", "P"));

		JScrollPane EnfriadorAceitePanel = new JScrollPane();
		tabbedPane.addTab("Enfriador de Lubricánte", null, EnfriadorAceitePanel, null);

		EnfriadorAceiteTable = new JTable();
		TableStyles.setTableStyles(EnfriadorAceiteTable);
		EnfriadorAceitePanel.setViewportView(EnfriadorAceiteTable);
		EnfriadorAceiteTable.setModel(TableData.getMaintenanceTableData("Enfriador de Lubricánte", "P"));

		JScrollPane ConsolaControlPanel = new JScrollPane();
		tabbedPane.addTab("Consola de Control", null, ConsolaControlPanel, null);

		ConsolaControlTable = new JTable();
		TableStyles.setTableStyles(ConsolaControlTable);
		ConsolaControlPanel.setViewportView(ConsolaControlTable);
		ConsolaControlTable.setModel(TableData.getMaintenanceTableData("Consola de Control", "P"));

		JScrollPane BateriasPanel = new JScrollPane();
		tabbedPane.addTab("Baterías", null, BateriasPanel, null);

		BateriasTable = new JTable();
		TableStyles.setTableStyles(BateriasTable);
		BateriasPanel.setViewportView(BateriasTable);
		BateriasTable.setModel(TableData.getMaintenanceTableData("Baterías", "P"));

		JScrollPane CargadorBateriasPanel = new JScrollPane();
		tabbedPane.addTab("Cargador de Baterías", null, CargadorBateriasPanel, null);

		CargadorBateriasTable = new JTable();
		TableStyles.setTableStyles(CargadorBateriasTable);
		CargadorBateriasPanel.setViewportView(CargadorBateriasTable);
		CargadorBateriasTable.setModel(TableData.getMaintenanceTableData("Cargador de Baterías", "P"));

		JScrollPane SistemaDeteccionFuegoGasPanel = new JScrollPane();
		tabbedPane.addTab("Sistema de detección de fuego y gas", null, SistemaDeteccionFuegoGasPanel, null);

		SistemaDeteccionFuegoGasTable = new JTable();
		TableStyles.setTableStyles(SistemaDeteccionFuegoGasTable);
		SistemaDeteccionFuegoGasPanel.setViewportView(SistemaDeteccionFuegoGasTable);
		SistemaDeteccionFuegoGasTable.setModel(TableData.getMaintenanceTableData("Sistema de detección de fuego y gas", "P"));

		JScrollPane EquipoCompresorC304SolarPanel = new JScrollPane();
		tabbedPane.addTab("Equipo accionado Compresor de gas C304 Solar", null, EquipoCompresorC304SolarPanel, null);

		EquipoCompresorC304SolarTable = new JTable();
		TableStyles.setTableStyles(EquipoCompresorC304SolarTable);
		EquipoCompresorC304SolarPanel.setViewportView(EquipoCompresorC304SolarTable);
		EquipoCompresorC304SolarTable.setModel(TableData.getMaintenanceTableData("Equipo accionado Compresor de gas C304 Solar", "P"));

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

		JLabel lblTurbinaDeGas = new JLabel("Turbina De Gas   N° 1");
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

	

}
