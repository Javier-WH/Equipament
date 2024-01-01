package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import components.Alarm;
import components.AlarmSchema;
import components.CButton;
import components.Constants;
import functions.Exit;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Color;


public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JPanel alertPanel = new JPanel();
	private static JLabel lblAlerts = null;
	private static ArrayList<AlarmSchema> alarmList = null;

	public MainWindow() {
		// setExtendedState(JFrame.MAXIMIZED_BOTH);
		alarmList = new ArrayList<AlarmSchema>();
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/assets/logoF.png")));
		setTitle("Mantenimiento de Equipos");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 885, 503);
		setLocationRelativeTo(null);
		addWindowListener(new Exit());
		
		contentPane = new JPanel();
		contentPane.setBackground(Constants.getSurfaceColor());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(5, 0));
		setContentPane(contentPane);
		
		alertPanel.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(86, 101, 115)));
		alertPanel.setMinimumSize(new Dimension(1000, 1000));
		alertPanel.setAutoscrolls(true);
		alertPanel.setBackground(Constants.getSurfaceColor());
		alertPanel.setLayout(new BoxLayout(alertPanel, BoxLayout.Y_AXIS));

		JScrollPane leftScrollPane = new JScrollPane();
		leftScrollPane.setBorder(null);
		leftScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(leftScrollPane, BorderLayout.WEST);

		JPanel menuPanel = new JPanel();
		menuPanel.setPreferredSize(new Dimension(190, 320));
		menuPanel.setBackground(Constants.getSurfaceColor());
		menuPanel.setMinimumSize(new Dimension(500, 200));
		menuPanel.setMaximumSize(new Dimension(500, 32767));
		menuPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuPanel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		leftScrollPane.setViewportView(menuPanel);

		JLabel lblStatusBar = new JLabel("Actualizado el 24 diciembre del 2023 a las 3:14pm");
		lblStatusBar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatusBar.setForeground(Constants.getTextColor());
		contentPane.add(lblStatusBar, BorderLayout.SOUTH);
		menuPanel.setLayout(new MigLayout("", "[100px]", "[40][40][40][40][40][grow][40][40]"));

		JPanel northPanel = new JPanel();
		northPanel.setBackground(Constants.getSurfaceColor());
		northPanel.setPreferredSize(new Dimension(20, 100));
		contentPane.add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new BorderLayout(5, 0));

		JLabel lblLogo = new JLabel("");
		lblLogo.setBorder(new EmptyBorder(0, 30, 0, 30));
		lblLogo.setAlignmentX(60.0f);
		lblLogo.setSize(190, 100);
		ImageIcon icon = new ImageIcon(MainWindow.class.getResource("/assets/logoB.png"));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(lblLogo.getWidth() - 60, lblLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(scaledImage);
		lblLogo.setIcon(scaledIcon);
		northPanel.add(lblLogo, BorderLayout.WEST);

		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Constants.getSurfaceColor());
		northPanel.add(titlePanel, BorderLayout.CENTER);
		titlePanel.setLayout(new BorderLayout(0, 0));

		JLabel lblTitle = new JLabel("    Mantenimiento de Equipos");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitle.setForeground(Constants.getTextColor());
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		titlePanel.add(lblTitle, BorderLayout.CENTER);

		lblAlerts = new JLabel("");
		lblAlerts.setForeground(Constants.getTextColor());
		lblAlerts.setHorizontalAlignment(SwingConstants.RIGHT);
		titlePanel.add(lblAlerts, BorderLayout.SOUTH);
		updateAlertsMessage();

		JButton btnRegistro = new CButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addAlert(new Alarm());
			}
		});
		menuPanel.add(btnRegistro, "cell 0 0,grow");

		JButton btnRutinas = new CButton("Rutinas de mantenimiento");
		btnRutinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAlert(0);
			}
		});
		menuPanel.add(btnRutinas, "cell 0 1,grow");

		JButton btnStock = new CButton("Stock de repuestos");
		menuPanel.add(btnStock, "cell 0 2,grow");

		JButton btnNuevo = new CButton("Nuevo mantenimiento");
		menuPanel.add(btnNuevo, "cell 0 3,grow");

		JButton btnHistorial = new CButton("Historial");
		menuPanel.add(btnHistorial, "cell 0 4,grow");
		JButton btnInfo = new CButton("Información");
		menuPanel.add(btnInfo, "cell 0 6,grow");

		JButton btnSalir = new CButton("Salir");
		menuPanel.add(btnSalir, "cell 0 7,grow");

		JScrollPane centralScrollpane = new JScrollPane();
		centralScrollpane.setBorder(null);
		centralScrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		centralScrollpane.setBackground(Constants.getSurfaceColor());
		contentPane.add(centralScrollpane, BorderLayout.CENTER);
		centralScrollpane.setViewportView(alertPanel);

		btnSalir.addActionListener(new Exit());
	}

	private static void refreshAlertPanel() {

		alertPanel.removeAll();
		alertPanel.setSize(alertPanel.getSize().width, 1);

		for (int i = 0; i < alarmList.size(); i++) {
			AlarmSchema alarm =  alarmList.get(i);
			alarm.setAlarmIndex(i);
			JPanel panelAlarm = (JPanel) alarm; 
			alertPanel.add(panelAlarm);
			alertPanel.add(Box.createVerticalStrut(3));
			setAlertPanelSize(panelAlarm.getSize().height, i);

		}
		updateAlertsMessage();
		alertPanel.revalidate();
		alertPanel.repaint();

	}

	private static void updateAlertsMessage() {
		int alertsCuantity = alarmList.size();
		if (alertsCuantity == 0) {
			lblAlerts.setText("No hay alertas");
			return;
		}

		lblAlerts.setText("Se encontraron " + alertsCuantity + " alertas pendientes");

	}

	private static void setAlertPanelSize(double alarmHeight, int index) {
		alertPanel.setSize(alertPanel.getSize().width, (int) (alarmHeight * index));

	}

	public static void addAlert(Alarm alarm) {
		alarmList.add(alarm);
		refreshAlertPanel();
	}

	public static void removeAlert(int index) {
		if (alarmList.size() == 0) {
			return;
		}
		alarmList.remove(index);
		refreshAlertPanel();
	}
}
