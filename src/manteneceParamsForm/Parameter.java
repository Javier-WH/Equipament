package manteneceParamsForm;

import javax.swing.JPanel;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Parameter extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public Parameter() {
		setPreferredSize(new Dimension(1075, 50));
		setMinimumSize(new Dimension(500, 50));
		setMaximumSize(new Dimension(32767, 50));
		setLayout(new MigLayout("insets 0, gap 0", "[300px:n,grow,fill][100px:100px:100px,grow][100px:100px:100px,grow][100px:100px:100px,grow][100px:100px:100px,grow][100px:100px:100px,grow][100px:100px:100px,grow][100px:100px:100px,grow]", "[grow,fill]"));
		
		JLabel lblParameter = new JLabel("Temperatura en la entrada de aire en la turbina");
		lblParameter.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		add(lblParameter, "cell 0 0,alignx leading,aligny center");
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		add(textField, "cell 1 0,grow");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		add(textField_1, "cell 2 0,grow");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		add(textField_2, "cell 3 0,grow");
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		add(textField_3, "cell 4 0,grow");
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		add(textField_4, "cell 5 0,grow");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		add(textField_5, "cell 6 0,grow");
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		add(textField_6, "cell 7 0,grow");
		textField_6.setColumns(10);

	}

}
