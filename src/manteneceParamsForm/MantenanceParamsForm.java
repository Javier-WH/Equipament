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
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


public class MantenanceParamsForm extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;


	public MantenanceParamsForm()  {
		super(null, "MEDICION DE PARAMETROS DE FUNCIONAMIENTO", true);
		setPreferredSize(new Dimension(215, 500));
		
		Dimension size = new Dimension(1200, this.getPreferredSize().height);
		this.setSize(size);
		JPanel centerPanel = new JPanel();
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
		titlePanel.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		titlePanel.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel("OPERADOR: ");
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		titlePanel.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_2 = new JLabel("JEFE DE MANTENIMIETO:");
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(10);
		titlePanel.add(verticalStrut);
		
		JPanel descriptionPanel = new JPanel();
		descriptionPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		titlePanel.add(descriptionPanel);
		descriptionPanel.setLayout(new MigLayout("insets 0, gap 0", "[300px:n,grow,fill][100px:100px:100px][100px:100px:100px][100px:100px:100px][100px:100px:100px][100px:100px:100px][100px:100px:100px][100px:100px:100px][17px:17px:17px]", "[grow]"));
		
		JLabel lblNewLabel_3 = new JLabel("DESCRIPTION");
		lblNewLabel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		descriptionPanel.add(lblNewLabel_3, "cell 0 0,grow");
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBorder(new MatteBorder(1, 0, 1, 1, (Color) Color.DARK_GRAY));
		descriptionPanel.add(dateChooser, "cell 1 0,grow");
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		descriptionPanel.add(dateChooser_1, "cell 2 0,grow");
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		descriptionPanel.add(dateChooser_2, "cell 3 0,grow");
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		descriptionPanel.add(dateChooser_3, "cell 4 0,grow");
		
		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		descriptionPanel.add(dateChooser_4, "cell 5 0,grow");
		
		JDateChooser dateChooser_5 = new JDateChooser();
		dateChooser_5.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		descriptionPanel.add(dateChooser_5, "cell 6 0,grow");
		
		JDateChooser dateChooser_6 = new JDateChooser();
		dateChooser_6.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		descriptionPanel.add(dateChooser_6, "cell 7 0,grow");
		
		JPanel panel_2 = new JPanel();
		descriptionPanel.add(panel_2, "cell 8 0,grow");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBorder(null);
		centerPanel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel paramsPanel = new JPanel();
		paramsPanel.setBorder(null);
		scrollPane.setViewportView(paramsPanel);
		paramsPanel.setLayout(new BoxLayout(paramsPanel, BoxLayout.Y_AXIS));
		
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
		paramsPanel.add(new Parameter());
		paramsPanel.setPreferredSize(new Dimension(10, (getPreferredSize().height + 50)));
	}

	

}
