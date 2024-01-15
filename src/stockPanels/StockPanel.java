package stockPanels;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSpinner;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class StockPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private String id;
	private JSpinner txtQuantity;

	public StockPanel(String id, String part, String number, String quantity) {
		this.id = id;
		setOpaque(false);
		setMaximumSize(new Dimension(32767, 50));
		setLayout(new MigLayout("insets 0, gap 0",
				"[400px:n,grow,fill][100px:n:300px][][200px:200px:200px,fill][120px:120px:120px,grow]", "[grow]"));

		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		add(horizontalStrut_3, "flowx,cell 0 0");

		JLabel lblParts = new JLabel(part);
		lblParts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParts.setForeground(Color.WHITE);
		add(lblParts, "cell 0 0,grow");

		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		add(horizontalStrut_2, "cell 2 0");

		JLabel lblNumber = new JLabel(number);
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumber.setForeground(Color.WHITE);
		add(lblNumber, "cell 3 0,alignx trailing");

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		add(panel, "cell 4 0,grow");
		panel.setLayout(new BorderLayout(0, 0));

		Component verticalStrut = Box.createVerticalStrut(5);
		panel.add(verticalStrut, BorderLayout.NORTH);

		Component verticalStrut_1 = Box.createVerticalStrut(5);
		panel.add(verticalStrut_1, BorderLayout.SOUTH);

		Component horizontalStrut = Box.createHorizontalStrut(5);
		panel.add(horizontalStrut, BorderLayout.WEST);

		Component horizontalStrut_1 = Box.createHorizontalStrut(5);
		panel.add(horizontalStrut_1, BorderLayout.EAST);

		txtQuantity = new JSpinner();
		setNumericSpiner(txtQuantity);
		txtQuantity.setValue(Integer.parseInt(quantity));
		panel.add(txtQuantity, BorderLayout.CENTER);

	}

	private static void setNumericSpiner(JSpinner spinner) {
		spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int value = (int) spinner.getValue();
				if (value < 0) {
					spinner.setValue(0);
				}
			}
		});
	}

	public String getID() {
		return id;
	}

	public String getValue() {
		return txtQuantity.getValue().toString();
	}

}
