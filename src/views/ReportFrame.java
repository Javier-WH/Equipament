package views;

import java.awt.Dimension;
import javax.swing.JPanel;
import components.Constants;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import net.miginfocom.swing.MigLayout;
import reportPanels.MesurePanel;
import javax.swing.SwingConstants;




public class ReportFrame extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JPanel reportPanel;
	private JComboBox<String> comboType;

	public ReportFrame(JPanel parent) {
		super(parent, "Reportes");
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
		
		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setForeground(Constants.getTextColor());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1, "cell 0 0,growx,aligny center");
		
		JLabel lblNewLabel_2 = new JLabel("Operador");
		lblNewLabel_2.setForeground(Constants.getTextColor());
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_2, "cell 1 0,growx,aligny center");
		
		JLabel lblNewLabel_3 = new JLabel("Inspector");
		lblNewLabel_3.setForeground(Constants.getTextColor());
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_3, "cell 2 0,grow");
		
		JLabel lblNewLabel_4 = new JLabel("Fecha");
		lblNewLabel_4.setForeground(Constants.getTextColor());
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_4, "cell 3 0,grow");
		
		fillReportPanel();
		
	}

	
	private void fillReportPanel() {
		//Dimension pz = new Dimension(reportPanel.getPreferredSize().width, 50 * 20);
		//reportPanel.setPreferredSize(pz);
		
		reportPanel.add(new MesurePanel());
		reportPanel.add(new MesurePanel());
		reportPanel.add(new MesurePanel());
	
		
	}
	
		
		
	
}
