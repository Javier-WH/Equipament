package views;

import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import components.Constants;
import dataBaseModels.Stock;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import net.miginfocom.swing.MigLayout;
import stockPanels.StockPanel;
import stockPanels.StockPanelHeader;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;

public class StockFrame extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JPanel panelStock;
	private JLabel lblMessage;
	ArrayList<StockPanel> list;

	public StockFrame(JPanel parent) {
		super(parent, "Panel de Stock", true);
		setAlwaysOnTop(false);
		Dimension pSize = new Dimension(900, 600);
		setSize(pSize);
		onAcept(saveData);

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

		comboBox_1 = new JComboBox<String>();
		try {
			fillComboBox(comboBox_1);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		panel_1.add(comboBox_1, "cell 1 2,growx,aligny center");

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane, BorderLayout.CENTER);

		panelStock = new JPanel();
		panelStock.setBackground(Constants.getSurfaceColor());
		scrollPane.setViewportView(panelStock);
		panelStock.setLayout(new BoxLayout(panelStock, BoxLayout.Y_AXIS));

		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setPreferredSize(new Dimension(10, 20));
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		lblMessage = new JLabel("Cambios almacenados correctamente");
		lblMessage.setVisible(false);
		lblMessage.setForeground(Color.GREEN);
		lblMessage.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setMaximumSize(new Dimension(30000, 14));
		panel_2.add(lblMessage);

		String selectedItem = comboBox_1.getSelectedItem().toString();
		list = getPanelStockList(selectedItem);
		fillPanelStock(list);

		comboBox_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedItem = comboBox_1.getSelectedItem().toString();
				list = getPanelStockList(selectedItem);
				fillPanelStock(list);
			}
		});

	}

	private void fillPanelStock(ArrayList<StockPanel> list) {
		panelStock.removeAll();
		panelStock.add(new StockPanelHeader(comboBox_1.getSelectedItem().toString()));

		for (StockPanel panel : list) {
			panelStock.add(panel);
		}

		panelStock.setPreferredSize(new Dimension(panelStock.getPreferredSize().width, list.size() * 50));
		panelStock.revalidate();
		panelStock.repaint();
	}

	private ArrayList<StockPanel> getPanelStockList(String secction) {

		ArrayList<StockPanel> list = new ArrayList<>();
		ResultSet rs;
		try {
			rs = new Stock().findSeccionParts(secction);
			while (rs.next()) {
				String id = rs.getString("id");
				String parts = rs.getString("parts");
				String number = rs.getString("number");
				String quantity = rs.getString("quantity");

				list.add(new StockPanel(id, parts, number, quantity));

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	private void fillComboBox(JComboBox<String> comboBox) throws ClassNotFoundException, SQLException {
		ResultSet rs = new Stock().findSections();

		while (rs.next()) {
			String secction = rs.getString("secction");
			comboBox.addItem(secction);
		}

	}

	public void showMessage() {
		lblMessage.setVisible(true);

		Timer timer = new Timer(3000, e -> {
			lblMessage.setVisible(false);
		});
		timer.setRepeats(false);
		timer.start();
	}

	ActionListener saveData = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			for (StockPanel item : list) {
				HashMap<String, String> params = new HashMap<>();
				params.put("id", item.getID());
				params.put("quantity", item.getValue());
				try {
					new Stock().updateRecord(params);
					showMessage();
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}

		}
	};
	private JComboBox<String> comboBox_1;

}
