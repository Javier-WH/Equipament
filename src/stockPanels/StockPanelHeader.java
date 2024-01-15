package stockPanels;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

public class StockPanelHeader extends JPanel {

	private static final long serialVersionUID = 1L;

	
	public StockPanelHeader(String selectedItem) {

		setOpaque(false);
		setMaximumSize(new Dimension(32767, 50));
		setLayout(new MigLayout("insets 0, gap 0", "[grow,fill][200px:200px:200px,fill][120px:120px:120px,grow]", "[grow]"));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		add(horizontalStrut, "flowx,cell 0 0");
		
		JLabel lblParts = new JLabel("Parte");
		lblParts.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblParts.setForeground(Color.WHITE);
		add(lblParts, "cell 0 0,grow");
		
		JLabel lblNumber = new JLabel("N° de pieza");
	
		lblNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNumber.setForeground(Color.WHITE);
		add(lblNumber, "cell 1 0,grow");
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(lblCantidad, "cell 2 0,grow");

		if(selectedItem.equals("Consumibles")) {
			lblNumber.setText("Litros");
			lblParts.setText("Item");
		}
	}
	

}


