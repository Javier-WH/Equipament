package views;

import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import components.Constants;
import dataBaseModels.Stock;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class StockFrame extends FrameModel {
	private static final long serialVersionUID = 1L;


	public StockFrame(JPanel parent) {
		super(parent, "Panel de Stock", true);
		setAlwaysOnTop(false);
		Dimension pSize = new  Dimension(700, 600);
		setSize(pSize);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 80));
		panel_1.setOpaque(false);
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new MigLayout("", "[grow,fill][::450px,grow 150,fill][grow,fill]", "[][][]"));
		
		JLabel lblTitle = new JLabel("Stock y Consumibles");
		lblTitle.setMaximumSize(new Dimension(30000, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblTitle, "cell 1 0");
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel_1.add(verticalStrut, "cell 1 1");
		
		JComboBox<String> comboBox = new JComboBox<String>();
		try {
			fillComboBox(comboBox);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		panel_1.add(comboBox, "cell 1 2,growx,aligny center");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panelStock = new JPanel();
		panelStock.setBackground(Constants.getSurfaceColor());
		scrollPane.setViewportView(panelStock);
		
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());
				
			}
		});
		
	}
	
	
	private void fillComboBox(JComboBox<String> comboBox ) throws ClassNotFoundException, SQLException {
		ResultSet rs = new Stock().findSections();
		
		while(rs.next()) {
			String secction = rs.getString("secction");
			comboBox.addItem(secction);
		}
	
	}
}
