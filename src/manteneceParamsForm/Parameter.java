package manteneceParamsForm;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.util.HashMap;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import components.Constants;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Box;

public class Parameter extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblParameter;
	private JTextField txtData1;
	private JTextField txtData2;
	private JTextField txtData3;
	private JTextField txtData4;
	private JTextField txtData5;
	private JTextField txtData6;
	private JTextField txtData7;
	private String id = null;

	public Parameter(String id, String description) {
		this.id = id;
		setBackground(Constants.getSurfaceColor());
		setBorder(new MatteBorder(0, 1, 1, 0, Constants.getTextColor()));
		setPreferredSize(new Dimension(1075, 50));
		setMinimumSize(new Dimension(500, 50));
		setMaximumSize(new Dimension(32767, 50));
		setLayout(new MigLayout("insets 0, gap 0", "[300px:n,grow,fill][100px:100px:100px,grow][100px:100px:100px,grow][100px:100px:100px,grow][100px:100px:100px,grow][100px:100px:100px,grow][100px:100px:100px,grow][100px:100px:100px,grow]", "[grow,fill]"));
		
		Component horizontalStrut_14 = Box.createHorizontalStrut(5);
		add(horizontalStrut_14, "flowx,cell 0 0");
		
		lblParameter = new JLabel(description);
		lblParameter.setForeground(Constants.getTextColor());
		lblParameter.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(lblParameter, "cell 0 0,alignx leading,aligny center");
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(panel, "cell 1 0,grow");
		panel.setLayout(new BorderLayout());
		
		txtData1 = new JTextField();
		txtData1.setHorizontalAlignment(JTextField.CENTER);
		
		panel.add(txtData1, BorderLayout.CENTER);
		
		Component horizontalStrut = Box.createHorizontalStrut(5);
		panel.add(horizontalStrut, BorderLayout.EAST);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(5);
		panel.add(horizontalStrut_1, BorderLayout.WEST);
		
		Component verticalStrut = Box.createVerticalStrut(5);
		panel.add(verticalStrut, BorderLayout.SOUTH);
		
		Component verticalStrut_1 = Box.createVerticalStrut(5);
		panel.add(verticalStrut_1, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(panel_1, "cell 2 0,grow");
		panel_1.setLayout(new BorderLayout());
		
		txtData2 = new JTextField();
		txtData2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(txtData2, BorderLayout.CENTER);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(5);
		panel_1.add(horizontalStrut_2, BorderLayout.WEST);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(5);
		panel_1.add(horizontalStrut_3, BorderLayout.EAST);
		
		Component verticalStrut_2 = Box.createVerticalStrut(5);
		panel_1.add(verticalStrut_2, BorderLayout.NORTH);
		
		Component verticalStrut_3 = Box.createVerticalStrut(5);
		panel_1.add(verticalStrut_3, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(panel_2, "cell 3 0,grow");
		panel_2.setLayout(new BorderLayout());
		
		txtData3 = new JTextField();
		txtData3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(txtData3, BorderLayout.CENTER);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(5);
		panel_2.add(horizontalStrut_4, BorderLayout.WEST);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(5);
		panel_2.add(horizontalStrut_5, BorderLayout.EAST);
		
		Component verticalStrut_4 = Box.createVerticalStrut(5);
		panel_2.add(verticalStrut_4, BorderLayout.NORTH);
		
		Component verticalStrut_5 = Box.createVerticalStrut(5);
		panel_2.add(verticalStrut_5, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(panel_4, "cell 4 0,grow");
		panel_4.setLayout(new BorderLayout());
		
		txtData4 = new JTextField();
		txtData4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(txtData4, BorderLayout.CENTER);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(5);
		panel_4.add(horizontalStrut_6, BorderLayout.WEST);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(5);
		panel_4.add(horizontalStrut_7, BorderLayout.EAST);
		
		Component verticalStrut_6 = Box.createVerticalStrut(5);
		panel_4.add(verticalStrut_6, BorderLayout.NORTH);
		
		Component verticalStrut_7 = Box.createVerticalStrut(5);
		panel_4.add(verticalStrut_7, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(panel_3, "cell 5 0,grow");
		panel_3.setLayout(new BorderLayout());
		
		txtData5 = new JTextField();
		txtData5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(txtData5, BorderLayout.CENTER);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(5);
		panel_3.add(horizontalStrut_8, BorderLayout.WEST);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(5);
		panel_3.add(horizontalStrut_9, BorderLayout.EAST);
		
		Component verticalStrut_8 = Box.createVerticalStrut(5);
		panel_3.add(verticalStrut_8, BorderLayout.NORTH);
		
		Component verticalStrut_9 = Box.createVerticalStrut(5);
		panel_3.add(verticalStrut_9, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(panel_5, "cell 6 0,grow");
		panel_5.setLayout(new BorderLayout());
		
		txtData6 = new JTextField();
		txtData6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(txtData6, BorderLayout.CENTER);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(5);
		panel_5.add(horizontalStrut_10, BorderLayout.WEST);
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(5);
		panel_5.add(horizontalStrut_11, BorderLayout.EAST);
		
		Component verticalStrut_10 = Box.createVerticalStrut(5);
		panel_5.add(verticalStrut_10, BorderLayout.NORTH);
		
		Component verticalStrut_11 = Box.createVerticalStrut(5);
		panel_5.add(verticalStrut_11, BorderLayout.SOUTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(panel_6, "cell 7 0,grow");
		panel_6.setLayout(new BorderLayout());
		
		txtData7 = new JTextField();
		txtData7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(txtData7, BorderLayout.CENTER);
		
		Component horizontalStrut_12 = Box.createHorizontalStrut(5);
		panel_6.add(horizontalStrut_12, BorderLayout.WEST);
		
		Component horizontalStrut_13 = Box.createHorizontalStrut(5);
		panel_6.add(horizontalStrut_13, BorderLayout.EAST);
		
		Component verticalStrut_12 = Box.createVerticalStrut(5);
		panel_6.add(verticalStrut_12, BorderLayout.NORTH);
		
		Component verticalStrut_13 = Box.createVerticalStrut(5);
		panel_6.add(verticalStrut_13, BorderLayout.SOUTH);
		
	}
	
	public String getId() {
		return id;
	}
	
	public HashMap<String, String> getData(){
		HashMap<String, String> data = new HashMap<>();
		data.put("data1", txtData1.getText());
		data.put("data2", txtData2.getText());
		data.put("data3", txtData3.getText());
		data.put("data4", txtData4.getText());
		data.put("data5", txtData5.getText());
		data.put("data6", txtData6.getText());
		data.put("data7", txtData7.getText());
		
		return data;
		
	}

}
