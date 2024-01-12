package printViews;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import utilitys.PanelPrinter;
import views.FrameModel;
import java.awt.event.MouseAdapter;
import java.awt.Cursor;



public class PrintWindow extends FrameModel {

	private static final long serialVersionUID = 1L;
	JTabbedPane tabbedPane = null;
	private JPanel contentPane;

	
	public PrintWindow(JPanel parent, String type, String id) {
		super(parent, "Ventana de Impresión");
		setAlwaysOnTop(false);
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 609, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 10));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Regresar");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(PrintWindow.class.getResource("/assets/back.png")));
		panel.add(lblNewLabel_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(100);
		panel.add(horizontalStrut);
		
		JLabel lblNewLabel = new JLabel("Imprimir");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
		lblNewLabel.setIcon(new ImageIcon(PrintWindow.class.getResource("/assets/printIcon.png")));
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		
		JLabel lblNewLabel_2 = new JLabel("Hola, esto es una prueba");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(85, 41, 215, 96);
		
		JPanel printPanel = getPrintPanel(type, id);
		scrollPane.setViewportView(printPanel);
		
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelPrinter pp = new PanelPrinter(printPanel);
				pp.printPanel();
			}
		});
	}
	
	private JPanel getPrintPanel(String type, String id) {
		return new PrintMesuresPanel(id);
	}
}