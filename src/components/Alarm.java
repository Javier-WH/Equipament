package components;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.Cursor;
import javax.swing.UIManager;

import mantenanceForm.MantenanceForm;
import views.StockFrame;

import java.awt.Dimension;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;


public class Alarm extends JPanel implements AlarmSchema {

	private static final long serialVersionUID = 1L;

	private int alarmIndex;
	private int alarmID;

	public Alarm(String Section, String Activity, String LastUpdate, String Level, String type) {
		setBorder(null);
		setMaximumSize(new Dimension(32767, 100));
		setPreferredSize(new Dimension(800, 100));
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setLayout(null);

		if(type.equals("P")) {
			setBackground(Constants.getPreventiveAlertColor());			
		}else if(type.equals("C")) {
			setBackground(Constants.getCorrectiveAlertColor());	
		}else if(type.equals("PC")) {
			setBackground(Constants.getPuestaAceroAlertColor());	
		}else {
			setBackground(Color.RED);	
		}
		
	
		
		JLabel lblLogo = new JLabel();
		lblLogo.setPreferredSize(new Dimension(322, 147));
		lblLogo.setBounds(0, -38, 268, 182);
		ImageIcon icon = new ImageIcon(Alarm.class.getResource("/assets/logoB.png"));
		Image image = icon.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(image);
		lblLogo.setIcon(scaledIcon);

		add(lblLogo);
		JLabel lblSecction = new JLabel(Section);
		lblSecction.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSecction.setForeground(Color.WHITE);
		lblSecction.setBackground(new Color(240, 240, 240));
		lblSecction.setBounds(258, -2, 535, 26);
		add(lblSecction);

		JLabel lblActivity = new JLabel(Activity);
		lblActivity.setForeground(Color.WHITE);
		lblActivity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblActivity.setBackground(UIManager.getColor("Button.background"));
		lblActivity.setBounds(265, 50, 491, 26);
		add(lblActivity);

		JLabel lblLastUpdate = new JLabel(LastUpdate);
		lblLastUpdate.setForeground(Color.WHITE);
		lblLastUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastUpdate.setBackground(UIManager.getColor("Button.background"));
		lblLastUpdate.setBounds(431, 70, 296, 26);
		add(lblLastUpdate);
		
		JLabel lblUltimoMantenimiento = new JLabel("Ultimo mantenimiento:");
		lblUltimoMantenimiento.setText(type.equals("stock") ? (Section.equals("Consumibles") ? "Litros" : "N° de pieza" ) : "Ultimo mantenimiento:");
		lblUltimoMantenimiento.setForeground(Color.WHITE);
		lblUltimoMantenimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUltimoMantenimiento.setBackground(UIManager.getColor("Button.background"));
		lblUltimoMantenimiento.setBounds(265, 70, 183, 26);
		add(lblUltimoMantenimiento);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(255, 23, 545, 33);
		add(panel);
		panel.setLayout(new MigLayout("", "[][grow,fill]", "[grow,fill]"));
		
		JLabel lblsdsds = new JLabel("Nivel:");
		panel.add(lblsdsds, "flowx,cell 0 0,grow");
		lblsdsds.setHorizontalAlignment(SwingConstants.LEFT);
		lblsdsds.setText(type.equals("stock") ? "Quedan" : "Nivel:");
		lblsdsds.setForeground(Color.WHITE);
		lblsdsds.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblsdsds.setBackground(UIManager.getColor("Button.background"));
		
		JLabel lblNivel = new JLabel(Level);
		panel.add(lblNivel, "cell 1 0,grow");
		lblNivel.setForeground(Color.WHITE);
		lblNivel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNivel.setBackground(UIManager.getColor("Button.background"));
		
		addMouseListener(new MouseAdapter() {
			@Override
		    public void mouseClicked(MouseEvent e) {
		
				try {
					if(type.equals("P") || type.equals("C") || type.equals("PC")) {
						MantenanceForm MF = new MantenanceForm(alarmID);
						MF.setVisible(true);						
					}else if(type.equals("stock")) {
						new StockFrame(null, Section).setVisible(true);
					}
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});

	}

	public int getAlarmIndex() {
		return alarmIndex;
	}

	public void setAlarmIndex(int alarmIndex) {
		this.alarmIndex = alarmIndex;

	}
	
	public void setAlarmID(int alarmID) {
		this.alarmID = alarmID;

	}
}
