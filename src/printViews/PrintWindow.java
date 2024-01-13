package printViews;

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

import components.Constants;
import utilitys.PanelPrinter;
import views.FrameModel;
import java.awt.event.MouseAdapter;
import java.awt.Cursor;
import javax.swing.SpringLayout;
import javax.swing.ScrollPaneConstants;



public class PrintWindow extends FrameModel {

	private static final long serialVersionUID = 1L;
	JTabbedPane tabbedPane = null;
	private JPanel contentPane;

	
	public PrintWindow(JPanel parent, String type, String id) {
		super(parent, "Ventana de Impresión");
		setAlwaysOnTop(false);
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 653, 473);
		contentPane = new JPanel();
		contentPane.setBackground(Constants.getSurfaceColor());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 10));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 5, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 604, SpringLayout.WEST, contentPane);
		panel.setOpaque(false);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Regresar");
		lblNewLabel_1.setForeground(Constants.getTextColor());
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
		lblNewLabel.setForeground(Constants.getTextColor());
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
		lblNewLabel.setIcon(new ImageIcon(PrintWindow.class.getResource("/assets/printIcon.png")));
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollPane, 63, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollPane, 5, SpringLayout.WEST, contentPane);
		contentPane.add(scrollPane);
		
		
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
