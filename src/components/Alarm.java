package components;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Cursor;
import javax.swing.UIManager;
import java.awt.Dimension;

public class Alarm extends JPanel {

	private static final long serialVersionUID = 1L;

	private int alarmIndex;

	public Alarm() {
		setMaximumSize(new Dimension(32767, 100));
		setPreferredSize(new Dimension(800, 100));
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setBackground(new Color(255, 0, 0));
		setLayout(null);

		

		JLabel lblLogo = new JLabel();
		lblLogo.setPreferredSize(new Dimension(322, 147));
		lblLogo.setBounds(0, -38, 268, 182);
		ImageIcon icon = new ImageIcon(Alarm.class.getResource("/assets/logoB.png"));
		Image image = icon.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(image);
		lblLogo.setIcon(scaledIcon);

		add(lblLogo);
		JLabel lblAlertTitle = new JLabel("Alerta Mantenimiento");
		lblAlertTitle.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAlertTitle.setForeground(Color.WHITE);
		lblAlertTitle.setBackground(new Color(240, 240, 240));
		lblAlertTitle.setBounds(256, 3, 458, 26);
		add(lblAlertTitle);

		JLabel lblEquipName = new JLabel("Equipo de seguridad");
		lblEquipName.setForeground(Color.WHITE);
		lblEquipName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEquipName.setBackground(UIManager.getColor("Button.background"));
		lblEquipName.setBounds(264, 34, 491, 26);
		add(lblEquipName);

		JLabel lblLastUpdate = new JLabel("Ultimo mantenimiento el 14-02-2024");
		lblLastUpdate.setForeground(Color.WHITE);
		lblLastUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastUpdate.setBackground(UIManager.getColor("Button.background"));
		lblLastUpdate.setBounds(256, 63, 491, 26);
		add(lblLastUpdate);

	}

	public int getAlarmIndex() {
		return alarmIndex;
	}

	public void setAlarmIndex(int alarmIndex) {
		this.alarmIndex = alarmIndex;
	}

}
