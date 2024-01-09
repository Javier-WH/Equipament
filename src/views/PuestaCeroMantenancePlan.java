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


public class PuestaCeroMantenancePlan extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JTable TurbocompresorTable;
	private JTable TurbinaTable;
	private JTable SensoresTable;
	private JTable SistemaAdmisiónAireTable;
	private JTable SistemaCombustibleTable;


	public PuestaCeroMantenancePlan(JPanel parent, String title) {
		super(parent, title);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JScrollPane TurbocompresorPanel = new JScrollPane();
		tabbedPane.addTab("Sistema de admisión de aire", null, TurbocompresorPanel, null);

		TurbocompresorTable = new JTable();
		TableStyles.setTableStyles(TurbocompresorTable);
		TurbocompresorPanel.setViewportView(TurbocompresorTable);
		TurbocompresorTable.setModel( TableData.getMaintenanceTableData("Sistema de admisión de aire", "PC"));

		JScrollPane TurbinaPanel = new JScrollPane();
		tabbedPane.addTab("Sistema aceite sello", null, TurbinaPanel, null);

		TurbinaTable = new JTable();
		TableStyles.setTableStyles(TurbinaTable);
		TurbinaPanel.setViewportView(TurbinaTable);
		TurbinaTable.setModel(TableData.getMaintenanceTableData("Sistema aceite sello", "PC"));

		JScrollPane SensoresPanel = new JScrollPane();
		tabbedPane.addTab("Sistema de gas combustible", null, SensoresPanel, null);

		SensoresTable = new JTable();
		TableStyles.setTableStyles(SensoresTable);
		SensoresPanel.setViewportView(SensoresTable);
		SensoresTable.setModel(TableData.getMaintenanceTableData("Sistema de gas combustible", "PC"));
 
		JScrollPane SistemaAdmisiónAirePanel = new JScrollPane();
		tabbedPane.addTab("Cabina", null, SistemaAdmisiónAirePanel, null);

		SistemaAdmisiónAireTable = new JTable();
		TableStyles.setTableStyles(SistemaAdmisiónAireTable);
		SistemaAdmisiónAirePanel.setViewportView(SistemaAdmisiónAireTable);
		SistemaAdmisiónAireTable.setModel(TableData.getMaintenanceTableData("Cabina", "PC"));

		JScrollPane SistemaCombustiblePanel = new JScrollPane();
		tabbedPane.addTab("Sistema de Lubricación", null, SistemaCombustiblePanel, null);

		SistemaCombustibleTable = new JTable();
		TableStyles.setTableStyles(SistemaCombustibleTable);
		SistemaCombustiblePanel.setViewportView(SistemaCombustibleTable);
		SistemaCombustibleTable.setModel(TableData.getMaintenanceTableData("Sistema de Lubricación", "PC"));


		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(Constants.getSurfaceColor());
		menuPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		getContentPane().add(menuPanel, BorderLayout.NORTH);
		menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.PAGE_AXIS));

		JLabel lblTitle = new JLabel("PLAN DE MANTENIMIENTO CORRECTIVO EQUIPO PUESTA A CERO ");
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
