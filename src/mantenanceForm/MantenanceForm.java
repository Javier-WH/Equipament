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
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;

public class MantenanceForm extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JTextField txtInspector;
	private JTextField textField;
	
	
	
	public MantenanceForm(int alarmID, int alarmIndex) {
		super(null, "Formulario de Manteniniento", true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 10, 10, 10));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel northPanel = new JPanel();
		panel.add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Unidad N°1 Turbocompresora Solar Centauro 40");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setMaximumSize(new Dimension(30000, 14));
		northPanel.add(lblNewLabel);
		
		JPanel inspectorPanel = new JPanel();
		northPanel.add(inspectorPanel);
		inspectorPanel.setLayout(new BoxLayout(inspectorPanel, BoxLayout.X_AXIS));
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(30);
		inspectorPanel.add(horizontalStrut_1);
		
		JLabel lblNewLabel_1 = new JLabel("Encargado de la Inspección: ");
		inspectorPanel.add(lblNewLabel_1);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		inspectorPanel.add(horizontalStrut_3);
		
		txtInspector = new JTextField();
		inspectorPanel.add(txtInspector);
		txtInspector.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(30);
		inspectorPanel.add(horizontalStrut);
		
		JLabel lblNewLabel_2 = new JLabel("Check List de Mantenimiento Correctivo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		northPanel.add(lblNewLabel_2);
		
		Component verticalStrut = Box.createVerticalStrut(10);
		northPanel.add(verticalStrut);
		
		JPanel westPanel = new JPanel();
		westPanel.setBorder(null);
		westPanel.setPreferredSize(new Dimension(120, 10));
		panel.add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.PAGE_AXIS));
		
		JLabel lblNewLabel_3 = new JLabel(" Parte");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setMaximumSize(new Dimension(30000, 50));
		lblNewLabel_3.setMinimumSize(new Dimension(29, 100));
		lblNewLabel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_3.setPreferredSize(new Dimension(400, 100));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setAlignmentY(Component.TOP_ALIGNMENT);
		westPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("<html><center>Sistema de arranque</center></html>");
		lblNewLabel_3_1.setPreferredSize(new Dimension(400, 100));
		lblNewLabel_3_1.setMinimumSize(new Dimension(29, 100));
		lblNewLabel_3_1.setMaximumSize(new Dimension(30000, 30000));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_3_1.setAlignmentY(0.0f);
		westPanel.add(lblNewLabel_3_1);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBorder(null);
		panel.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.PAGE_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.setMaximumSize(new Dimension(32767, 100));
		panel_1.setPreferredSize(new Dimension(10, 100));
		panel_1.setMinimumSize(new Dimension(300000, 100));
		centerPanel.add(panel_1);
		panel_1.setLayout(new MigLayout("insets 0, gap 0", "[grow,fill][160px:160px:160px,fill][140px:140px:140px,fill]", "[100px:100px:100px,center]"));
		
		JLabel lblNewLabel_5 = new JLabel("Descripción");
		lblNewLabel_5.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(64, 64, 64)));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblNewLabel_5, "cell 0 0,grow");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 0, 1, 1, (Color) Color.DARK_GRAY));
		panel_1.add(panel_2, "cell 1 0,grow");
		panel_2.setLayout(new MigLayout("insets 0, gap 0", "[80px:80px:80px,fill][80px:80px:80px,fill]", "[grow,fill][grow,fill]"));
		
		JLabel lblNewLabel_8 = new JLabel("Realizado");
		lblNewLabel_8.setBorder(new MatteBorder(0, 1, 1, 0, (Color) new Color(64, 64, 64)));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_8, "cell 0 0,span 2");
		
		JLabel lblNewLabel_6 = new JLabel("SI");
		lblNewLabel_6.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(64, 64, 64)));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_6, "cell 0 1,grow");
		
		JLabel lblNewLabel_7 = new JLabel("NO");
		lblNewLabel_7.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_7, "cell 1 1,grow");
		
		JLabel lblNewLabel_4 = new JLabel("Fecha");
		lblNewLabel_4.setBorder(new MatteBorder(1, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4, "flowx,cell 2 0,grow");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(null);
		centerPanel.add(scrollPane_1);
		
		JPanel activitiesPanel = new JPanel();
		activitiesPanel.setPreferredSize(new Dimension(10, 1000));
		activitiesPanel.setLayout(new BoxLayout(activitiesPanel, BoxLayout.Y_AXIS));
		activitiesPanel.add(new ActivityPanel());
		activitiesPanel.add(new ActivityPanel());
		activitiesPanel.add(new ActivityPanel());
		activitiesPanel.add(new ActivityPanel());
		activitiesPanel.add(new ActivityPanel());
		activitiesPanel.add(new ActivityPanel());
		activitiesPanel.add(new ActivityPanel());
		activitiesPanel.add(new ActivityPanel());
		activitiesPanel.add(new ActivityPanel());
		activitiesPanel.add(new ActivityPanel());
		scrollPane_1.setViewportView(activitiesPanel);
		
		JPanel southPanel = new JPanel();
		panel.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.Y_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(5, 0, 0, 0));
		southPanel.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		Component horizontalStrut_1_1 = Box.createHorizontalStrut(30);
		panel_3.add(horizontalStrut_1_1);
		
		JLabel lblNewLabel_9 = new JLabel("Técnico u operario encargado del mantenimiento:");
		lblNewLabel_9.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_3.add(lblNewLabel_9);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_2);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(30000, 20));
		panel_3.add(textField);
		textField.setColumns(10);
		
		Component horizontalStrut_1_2 = Box.createHorizontalStrut(30);
		panel_3.add(horizontalStrut_1_2);
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		southPanel.add(verticalStrut_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(new EmptyBorder(0, 25, 0, 25), "Observaciones:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane.setPreferredSize(new Dimension(2, 60));
		southPanel.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
	
		
	}

	

		
}
