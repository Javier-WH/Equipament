package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import components.AlarmSchema;
import components.CButton;
import components.Constants;
import components.MaintenanceTypeSelector;
import functions.Exit;
import manteneceParamsForm.MantenanceParamsForm;
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
import workOrder.WorkOrder;

import javax.swing.SwingConstants;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JPanel alertPanel = new JPanel();
	private static JLabel lblAlerts = null;
	private static ArrayList<AlarmSchema> alarmList = null;
	private static JLabel lblStatusBar = new JLabel("");

	public MainWindow() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
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

		lblStatusBar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatusBar.setForeground(Constants.getTextColor());
		contentPane.add(lblStatusBar, BorderLayout.SOUTH);
		menuPanel.setLayout(new MigLayout("", "[100px]", "[40][40][40][40][40][40][grow][40][40]"));

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

		lblAlerts = new JLabel("");
		lblAlerts.setForeground(Constants.getTextColor());
		lblAlerts.setHorizontalAlignment(SwingConstants.RIGHT);
		titlePanel.add(lblAlerts, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		titlePanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel lblSistemaDeAlertas = new JLabel("Sistema de alertas");
		lblSistemaDeAlertas.setVerticalAlignment(SwingConstants.TOP);
		lblSistemaDeAlertas.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSistemaDeAlertas.setHorizontalAlignment(SwingConstants.LEFT);
		lblSistemaDeAlertas.setForeground(Color.WHITE);
		lblSistemaDeAlertas.setFont(new Font("Californian FB", Font.BOLD, 15));
		panel.add(lblSistemaDeAlertas);

		JLabel lblTurbocompresorMarcaSolar = new JLabel("Programa Integral de Mantenimiento a la Unidad #1 ");
		panel.add(lblTurbocompresorMarcaSolar);
		lblTurbocompresorMarcaSolar.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTurbocompresorMarcaSolar.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTurbocompresorMarcaSolar.setHorizontalAlignment(SwingConstants.LEFT);
		lblTurbocompresorMarcaSolar.setForeground(Color.WHITE);
		lblTurbocompresorMarcaSolar.setFont(new Font("Californian FB", Font.BOLD, 27));

		JLabel lblTitle = new JLabel("Turbo Compresora Solar, Centauro 40.");
		panel.add(lblTitle);
		lblTitle.setVerticalAlignment(SwingConstants.TOP);
		lblTitle.setFont(new Font("Californian FB", Font.BOLD, 17));
		lblTitle.setForeground(Constants.getTextColor());
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		updateAlertsMessage();

		JButton btnRegistro = new CButton("Registro");
		btnRegistro.setText("Equipo");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EquipamentsFrame EF = new EquipamentsFrame(contentPane);
				EF.setVisible(true);
			}
		});
		menuPanel.add(btnRegistro, "cell 0 0,grow");

		JButton btnRutinas = new CButton("Rutinas de mantenimiento");
		btnRutinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectionMantenanceFrame SMF = new SelectionMantenanceFrame(contentPane, "Rutinas de mantenimiento");
				SMF.setVisible(true);
			}
		});
		menuPanel.add(btnRutinas, "cell 0 1,grow");

	
/////////////
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		popupMenu.setBackground(Constants.getSurfaceColor());
		
		
/////////////////
		
		CButton btnNuevo = new CButton("Nuevo mantenimiento");
		menuPanel.add(btnNuevo, "cell 0 2,grow");
		
		addPopup(btnNuevo, popupMenu);
		
		JPanel popupPanel = new JPanel();
		popupPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		popupPanel.setBackground(Constants.getSurfaceColor());
		popupMenu.add(popupPanel);
		popupPanel.setLayout(new BoxLayout(popupPanel, BoxLayout.Y_AXIS));
		
		CButton btnPreventivo = new CButton("Mantenimiento Preventivo");
		btnPreventivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MaintenanceTypeSelector("P").setVisible(true);
			}
		});
		btnPreventivo.setPreferredSize(new Dimension(165, 40));
		btnPreventivo.setMinimumSize(new Dimension(165, 50));
		btnPreventivo.setMaximumSize(new Dimension(30000, 100));
		btnPreventivo.setAlignmentX(Component.CENTER_ALIGNMENT);
		popupPanel.add(btnPreventivo);
		
		Component verticalStrut = Box.createVerticalStrut(10);
		popupPanel.add(verticalStrut);
		
		CButton btnCorrectivo = new CButton("Manteniviento Correctivo");
		btnCorrectivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MaintenanceTypeSelector("C").setVisible(true);
			}
		});
		btnCorrectivo.setPreferredSize(new Dimension(159, 40));
		btnCorrectivo.setMaximumSize(new Dimension(30000, 23));
		btnCorrectivo.setAlignmentX(Component.CENTER_ALIGNMENT);
		popupPanel.add(btnCorrectivo);
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		popupPanel.add(verticalStrut_1);
		
		CButton btnParametrosFunc = new CButton("Medicion de parametros de funcionamiento");
		btnParametrosFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MantenanceParamsForm().setVisible(true);
			}
		});
		btnParametrosFunc.setPreferredSize(new Dimension(264, 40));
		btnParametrosFunc.setMaximumSize(new Dimension(3000, 23));
		btnParametrosFunc.setAlignmentX(Component.CENTER_ALIGNMENT);
		popupPanel.add(btnParametrosFunc);
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = btnNuevo.getX() + btnNuevo.getWidth();
		        int y = 5;

		        popupMenu.show(btnNuevo, x, y);
			}
		});
		
		JButton btnStock = new CButton("Stock de repuestos");
		btnStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StockFrame(contentPane).setVisible(true);
			}
		});
		menuPanel.add(btnStock, "cell 0 4,grow");

		JButton btnHistorial = new CButton("Historial");
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ReportFrame(contentPane).setVisible(true);
			}
		});
		btnHistorial.setText("Reportes");
		menuPanel.add(btnHistorial, "cell 0 3,grow");
		JButton btnInfo = new CButton("Información");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InfoPanel(contentPane).setVisible(true);
			}
		});
		
		CButton btnOrdenDeTrabajo = new CButton("Historial");
		btnOrdenDeTrabajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WorkOrder(contentPane).setVisible(true);
			}
		});
		btnOrdenDeTrabajo.setPreferredSize(new Dimension(129, 14));
		btnOrdenDeTrabajo.setText("Orden de Trabajo");
		menuPanel.add(btnOrdenDeTrabajo, "cell 0 5,grow");
		menuPanel.add(btnInfo, "cell 0 7,grow");

		JButton btnSalir = new CButton("Salir");
		menuPanel.add(btnSalir, "cell 0 8,grow");

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
			AlarmSchema alarm = alarmList.get(i);
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

	public static void addAlert(AlarmSchema alarm) {
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

	public static void resetAlarms() {
		alarmList = new ArrayList<>();
		refreshAlertPanel();
	}

	public static void upDateStatusBar() {
		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(calendar.getTime());

		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
		String time = timeFormat.format(calendar.getTime());

		lblStatusBar.setText("Actualizado el " + date + " a las " + time);
	}


	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
