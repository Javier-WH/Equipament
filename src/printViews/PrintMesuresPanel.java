package printViews;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JTable;
import javax.swing.SpringLayout;

public class PrintMesuresPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	public PrintMesuresPanel() {
		setPreferredSize(new Dimension(618, 708));
       
        
		setBackground(Color.LIGHT_GRAY);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		table = new JTable();
		springLayout.putConstraint(SpringLayout.NORTH, table, 140, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, table, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, table, 698, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, table, 608, SpringLayout.WEST, this);
		add(table);

	}
}
