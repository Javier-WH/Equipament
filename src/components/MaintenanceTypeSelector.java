package components;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import mantenanceForm.MantenanceForm;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollPane;

public class MaintenanceTypeSelector extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel optionsPanel = new JPanel();
	private JScrollPane scrollPane_1;

	public MaintenanceTypeSelector(String type) {
		setSize(new Dimension(500, 400));
		setPreferredSize(new Dimension(800, 600));
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(MaintenanceTypeSelector.class.getResource("/assets/logoF.png")));

		setTitle(type.equals("P") ? "Mantenimiento Preventivo" : "Mantenimiento Correctivo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Constants.getSurfaceColor());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 10));

		JLabel lblNewLabel = new JLabel("Escoge la Parte");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(null);
		scrollPane_1.setOpaque(false);
		contentPane.add(scrollPane_1, BorderLayout.CENTER);
		optionsPanel.setBorder(null);
		scrollPane_1.setViewportView(optionsPanel);
		optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
		optionsPanel.setBackground(Constants.getSurfaceColor());

		try {
			getSecctionList(type);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private void getSecctionList(String type) throws ClassNotFoundException, SQLException {
		//el tamaño del panel sin bontones
		optionsPanel.setPreferredSize(new Dimension(10, 30));

		// setiene que buscar todas las actividades del mismo tipo, para hacer un boton por actividad
		String query = "SELECT DISTINCT secction FROM maintenance_routines WHERE type = '" + type + "'";
		Connection connection = dbConection.SQLiteConnection.getConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);

		//se haace un boton por actividad
		while (rs.next()) {	
			String secction = rs.getString("secction");
			CButton secctionButton = new CButton(secction);
			secctionButton.setToolTipText(secction);
			secctionButton.setMaximumSize(new Dimension(300, 50));
			secctionButton.setAlignmentX(Component.CENTER_ALIGNMENT);

			//la ventana MantenanceForm necesita un id de actividad, aqui se usa la sección para obtener el primer id de la activity
			String IDquery = "SELECT id FROM maintenance_routines WHERE secction = '" + secction + "' LIMIT 1";
			Statement IDstatemen = connection.createStatement();
			ResultSet IDrs = IDstatemen.executeQuery(IDquery);


			if (IDrs.next()) {
				String id = IDrs.getString("id");

				if (id != null) {
					secctionButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								//System.out.println(type);
								new MantenanceForm(Integer.parseInt(id), type).setVisible(true);
								dispose();
							} catch (NumberFormatException | ClassNotFoundException | SQLException e1) {
								e1.printStackTrace();
							}

						}
					});
				}
			}

			optionsPanel.add(secctionButton);
			optionsPanel.setPreferredSize(new Dimension(10, optionsPanel.getPreferredSize().height + 50)); //el tamaño del panel debe aumentar

		}

	}

}
