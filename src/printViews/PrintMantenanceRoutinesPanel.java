package printViews;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import dataBaseModels.MaintenanceRoutinesOperators;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;

public class PrintMantenanceRoutinesPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel activityPanel;
	private JLabel lblInspector;
	private JLabel lblOperator;
	private JTextPane textObservations;
	private JLabel lblTitle;

	public PrintMantenanceRoutinesPanel(String secction, String date, String cat) {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(597, 717));
		setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(10, 60));
		add(panel, BorderLayout.NORTH);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("Unidad N°1 Turbocompresora Solar Centauro 40");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, panel);
		panel.add(lblNewLabel);
		
		JLabel lblEncargadoDeLa = new JLabel("Encargado de la Inspección:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblEncargadoDeLa, 5, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblEncargadoDeLa, 0, SpringLayout.WEST, panel);
		lblEncargadoDeLa.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblEncargadoDeLa);
		
		lblInspector = new JLabel("Inspector");
		sl_panel.putConstraint(SpringLayout.WEST, lblInspector, 192, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblInspector, 0, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblEncargadoDeLa, -6, SpringLayout.WEST, lblInspector);
		sl_panel.putConstraint(SpringLayout.NORTH, lblInspector, 5, SpringLayout.SOUTH, lblNewLabel);
		lblInspector.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblInspector);
		
		
		String title = cat=="1" ? "Preventivo" : "Correctivo";
		lblTitle = new JLabel("Check List de Mantenimiento "+title);
		sl_panel.putConstraint(SpringLayout.NORTH, lblTitle, 5, SpringLayout.SOUTH, lblEncargadoDeLa);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel.putConstraint(SpringLayout.WEST, lblTitle, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblTitle, 0, SpringLayout.EAST, lblNewLabel);
		panel.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setPreferredSize(new Dimension(10, 70));
		add(panel_1, BorderLayout.SOUTH);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblTcnicoUOperario = new JLabel("Técnico u operario encargado del mantenimiento:");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblTcnicoUOperario, 0, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblTcnicoUOperario, 0, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblTcnicoUOperario, 325, SpringLayout.WEST, panel_1);
		lblTcnicoUOperario.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblTcnicoUOperario);
		
		lblOperator = new JLabel("Técnico ");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblOperator, 0, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblOperator, 329, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblOperator, 539, SpringLayout.WEST, panel_1);
		lblOperator.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblOperator);
		
		textObservations = new JTextPane();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textObservations, 26, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, textObservations, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, textObservations, 65, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textObservations, 587, SpringLayout.WEST, panel_1);
		textObservations.setPreferredSize(new Dimension(7, 15));
		textObservations.setEditable(false);
		textObservations.setBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "Observaciones:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(textObservations);
		
		activityPanel = new JPanel();
		activityPanel.setOpaque(false);
		add(activityPanel, BorderLayout.CENTER);
		activityPanel.setLayout(new MigLayout("insets 0, gap 0", "[100px:100px:100px,fill][250px:250px:250px,fill][grow 25,fill][grow,fill]", "[]"));
		
		JLabel lblNewLabel_2 = new JLabel("Parte");
		lblNewLabel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		activityPanel.add(lblNewLabel_2, "cell 0 0,grow");
		
		JLabel lblNewLabel_3 = new JLabel("Descripción");
		lblNewLabel_3.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		activityPanel.add(lblNewLabel_3, "cell 1 0,grow");
		
		JLabel lblNewLabel_4 = new JLabel("Realizado");
		lblNewLabel_4.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		activityPanel.add(lblNewLabel_4, "cell 2 0,grow");
		
		JLabel lblNewLabel_5 = new JLabel("Fecha");
		lblNewLabel_5.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		activityPanel.add(lblNewLabel_5, "cell 3 0,grow");

		try {
			inserData(secction, date, cat);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void inserData(String _secction, String _date, String _type) throws ClassNotFoundException, SQLException {
		
		String type = _type == "1" ? "P" : "C";
		
		ResultSet rs = new MaintenanceRoutinesOperators().getPrintInfo(_secction, _date, type);
		
		boolean isSecctionAdded = false;
		boolean isObservationsAdded = false;
		boolean isOperatorAdded = false;
		boolean isInspectorAdded = false;
		
		String secction = null;
		String observations = null;
		String operator = null;
		String inspector = null;
		
		int row = 1;
		while(rs.next()) {
			if(!isSecctionAdded) {
				secction = rs.getString("secction");
				isSecctionAdded = true;
			}
			if(!isObservationsAdded) {
				observations = rs.getString("observations");
				isObservationsAdded = true;
			}
			if(!isOperatorAdded) {
				operator = rs.getString("operator");
				isOperatorAdded = true;				
			}
			if(!isInspectorAdded) {
				inspector = rs.getString("inspector");
				isInspectorAdded = true;
			}
			

			String activity = rs.getString("activity");
			String date = rs.getString("date");
			
			String[] rowList = {activity, "Realizado", date};
			
			for(int i = 0 ; i < rowList.length ; i++) {
				JLabel label = new JLabel("<html>"+rowList[i]+"</html>" );
				label.setBorder(new MatteBorder( 0 , i== 0 ? 1 : 0, 1, 1, (Color) Color.DARK_GRAY));
				//label.setFont(Constants.getPrintFont());
				activityPanel.add(label, "cell "+(i+1)+" "+ row +", grow");
			}
			
			row++;
				
		}
		
		if(isSecctionAdded) {
			JLabel lblSecction = new JLabel("<html>"+secction+"</html>" );
			lblSecction.setHorizontalAlignment(SwingConstants.CENTER);
			lblSecction.setBorder(new MatteBorder( 0 , 1, 1, 0, (Color) Color.DARK_GRAY));
			activityPanel.add(lblSecction, "cell 0 1, grow, spany "+row);
			
		}
		
		if(isObservationsAdded) {
			textObservations.setText(observations);
		}
		if(isOperatorAdded) {
			lblOperator.setText(operator);		
		}
		if(isInspectorAdded) {
			lblInspector.setText(inspector);
		}
		
	}
}
