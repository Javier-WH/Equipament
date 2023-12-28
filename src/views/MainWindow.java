package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import components.CButton;
import components.Constants;
import functions.Exit;
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
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;


public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public MainWindow() {
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/assets/icon.gif")));
		setTitle("Mantenimiento de Equipos");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 678, 503);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Constants.getSurfaceColor());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(5, 10));

		JScrollPane leftScrollPane = new JScrollPane();
		leftScrollPane.setBorder(null);
		leftScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(leftScrollPane, BorderLayout.WEST);

		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(Constants.getSurfaceColor());
		menuPanel.setMinimumSize(new Dimension(500, 10));
		menuPanel.setMaximumSize(new Dimension(500, 32767));
		menuPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuPanel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		leftScrollPane.setViewportView(menuPanel);

		JLabel lblTitle = new JLabel("Mantenimiento de Equipos");
		lblTitle.setPreferredSize(new Dimension(125, 50));
		lblTitle.setForeground(Constants.getMainColor());
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle, BorderLayout.NORTH);

		JScrollPane centerScrollPane = new JScrollPane();
		centerScrollPane.setBorder(null);
		contentPane.add(centerScrollPane, BorderLayout.CENTER);

		JPanel alertPanel = new JPanel();
		alertPanel.setBorder(new MatteBorder(0, 1, 0, 0, Constants.getDecoratorColor()));
		
		alertPanel.setBackground(Constants.getSurfaceColor());
		centerScrollPane.setViewportView(alertPanel);
		alertPanel.setLayout(new BoxLayout(alertPanel, BoxLayout.X_AXIS));

		JLabel lblStatusBar = new JLabel("No hay alertas");
		lblStatusBar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatusBar.setForeground(Constants.getMainColor());
		contentPane.add(lblStatusBar, BorderLayout.SOUTH);
		menuPanel.setLayout(new MigLayout("", "[100px]", "[40][40][40][40][40][grow][40][40]"));

		addWindowListener(new Exit());

		JButton btnRegistro = new CButton("Registro");
		menuPanel.add(btnRegistro, "cell 0 0,grow");

		JButton btnRutinas = new CButton("Rutinas de mantenimiento");
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
		btnSalir.addActionListener(new Exit());
	}
}
