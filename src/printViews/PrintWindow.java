package printViews;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import components.Constants;
import dataBaseModels.FailureRegisterDataBase;
import dataBaseModels.WorkOrderDataBase;
import registroFallaPanel.RegistroFallaFrame;
import utilitys.PanelPrinter;
import views.FrameModel;
import workOrder.WorkOrder;

import java.awt.event.MouseAdapter;
import java.awt.Cursor;
import javax.swing.SpringLayout;

public class PrintWindow extends FrameModel {

	private static final long serialVersionUID = 1L;
	JTabbedPane tabbedPane = null;
	private JPanel contentPane;

	public PrintWindow(JPanel parent, String type, String id, String cat, String date) {
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

		JPanel printPanel = getPrintPanel(cat, id, date);
		scrollPane.setViewportView(printPanel);

		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelPrinter pp = null;
				if(cat.equals("3") || cat.equals("4")) {
					pp = new PanelPrinter(printPanel, 0.5);
				}else {
					pp = new PanelPrinter(printPanel);
				}
				pp.printPanel();
			}
		});
	}

	private JPanel getPrintPanel(String cat, String id, String date) {
		if (cat.equals("0")) {
			return new PrintMesuresPanel(id);
		} else if (cat.equals("1")) {
			return new PrintMantenanceRoutinesPanel(id, date, "1");
		} else if (cat.equals("2")) {
			return new PrintMantenanceRoutinesPanel(id, date, "2");

		} else if (cat.equals("3")) {
			HashMap<String, String> params = new HashMap<>();
			params.put("id", id);

			ResultSet rs;
			try {
				rs = new WorkOrderDataBase().findRecord(params);
				if (rs.next()) {

					HashMap<String, String> data = new HashMap<>();

					data.put("codigoA", rs.getString("codigoA"));
					data.put("fecha", rs.getString("fecha"));
					data.put("version", rs.getString("version"));
					data.put("pagina", rs.getString("pagina"));
					data.put("numeroOrden", rs.getString("numeroOrden"));
					data.put("equipo", rs.getString("equipo"));
					data.put("codigoB", rs.getString("codigoB"));
					data.put("fichaTecnica", rs.getString("fichaTecnica"));
					data.put("hojaVida", rs.getString("hojaVida"));
					data.put("lubricacion", rs.getString("lubricacion"));
					data.put("electrico", rs.getString("electrico"));
					data.put("mecanico", rs.getString("mecanico"));
					data.put("instrumentacion", rs.getString("instrumentacion"));
					data.put("preventivo", rs.getString("preventivo"));
					data.put("correctivo", rs.getString("correctivo"));
					data.put("responsable", rs.getString("responsable"));
					data.put("dia1", rs.getString("dia1"));
					data.put("mes1", rs.getString("mes1"));
					data.put("ano1", rs.getString("ano1"));
					data.put("dia2", rs.getString("dia2"));
					data.put("mes2", rs.getString("mes2"));
					data.put("ano2", rs.getString("ano2"));
					data.put("codigo1", rs.getString("codigo1"));
					data.put("codigo2", rs.getString("codigo2"));
					data.put("codigo3", rs.getString("codigo3"));
					data.put("codigo4", rs.getString("codigo4"));
					data.put("codigo5", rs.getString("codigo5"));
					data.put("codigo6", rs.getString("codigo6"));
					data.put("codigo7", rs.getString("codigo7"));
					data.put("descripcion1", rs.getString("descripcion1"));
					data.put("descripcion2", rs.getString("descripcion2"));
					data.put("descripcion3", rs.getString("descripcion3"));
					data.put("descripcion4", rs.getString("descripcion4"));
					data.put("descripcion5", rs.getString("descripcion5"));
					data.put("descripcion6", rs.getString("descripcion6"));
					data.put("descripcion7", rs.getString("descripcion7"));
					data.put("herramientas1", rs.getString("herramientas1"));
					data.put("herramientas2", rs.getString("herramientas2"));
					data.put("herramientas3", rs.getString("herramientas3"));
					data.put("herramientas4", rs.getString("herramientas4"));
					data.put("herramientas5", rs.getString("herramientas5"));
					data.put("herramientas6", rs.getString("herramientas6"));
					data.put("herramientas7", rs.getString("herramientas7"));
					data.put("materiales1", rs.getString("materiales1"));
					data.put("materiales2", rs.getString("materiales2"));
					data.put("materiales3", rs.getString("materiales3"));
					data.put("materiales4", rs.getString("materiales4"));
					data.put("materiales5", rs.getString("materiales5"));
					data.put("materiales6", rs.getString("materiales6"));
					data.put("materiales7", rs.getString("materiales7"));
					data.put("repuestos1", rs.getString("repuestos1"));
					data.put("repuestos2", rs.getString("repuestos2"));
					data.put("repuestos3", rs.getString("repuestos3"));
					data.put("repuestos4", rs.getString("repuestos4"));
					data.put("repuestos5", rs.getString("repuestos5"));
					data.put("repuestos6", rs.getString("repuestos6"));
					data.put("repuestos7", rs.getString("repuestos7"));
					data.put("horas1", rs.getString("horas1"));
					data.put("horas2", rs.getString("horas2"));
					data.put("horas3", rs.getString("horas3"));
					data.put("horas4", rs.getString("horas4"));
					data.put("horas5", rs.getString("horas5"));
					data.put("horas6", rs.getString("horas6"));
					data.put("horas7", rs.getString("horas7"));
					data.put("observaciones1", rs.getString("observaciones1"));
					data.put("observaciones2", rs.getString("observaciones2"));
					data.put("observaciones3", rs.getString("observaciones3"));
					data.put("observaciones4", rs.getString("observaciones4"));
					data.put("observaciones5", rs.getString("observaciones5"));
					data.put("observaciones6", rs.getString("observaciones6"));
					data.put("observaciones7", rs.getString("observaciones7"));
					data.put("entregadoPor", rs.getString("entregadoPor"));
					data.put("supervisadoPor", rs.getString("supervisadoPor"));
					data.put("aprobadoPorA", rs.getString("aprobadoPorA"));
					data.put("aprobadoPorB", rs.getString("aprobadoPorB"));
					data.put("elaboradoPor", rs.getString("elaboradoPor"));
					data.put("revisadoPor", rs.getString("revisadoPor"));

					return new WorkOrder(data).getWorkOrderPanel();

				} else {
					return new WorkOrder((JPanel) null).getWorkOrderPanel();
				}

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}else if (cat.equals("4")) {
			HashMap<String, String> params = new HashMap<>();
			params.put("id", id);
			
			try {
				ResultSet rs = new FailureRegisterDataBase().findRecord(params);
				
				HashMap<String, String> data = new HashMap<>();
				
				if(rs.next()) {
					data.put("codigoA", rs.getString("codigoA"));
					data.put("fecha", rs.getString("fecha"));
					data.put("version", rs.getString("version"));
					data.put("pagina", rs.getString("pagina"));
					data.put("dia1", rs.getString("dia1"));
					data.put("mes1", rs.getString("mes1"));
					data.put("ano1", rs.getString("ano1"));
					data.put("numeroSolicitud", rs.getString("numeroSolicitud"));
					data.put("codigoB", rs.getString("codigoB"));
					data.put("fichaTecnica", rs.getString("fichaTecnica"));
					data.put("hojaVida", rs.getString("hojaVida"));
					data.put("dano", rs.getString("dano"));
					data.put("falla", rs.getString("falla"));
					data.put("averia", rs.getString("averia"));
					data.put("otra", rs.getString("otra"));
					data.put("detalleMotivo", rs.getString("detalleMotivo"));
					data.put("analisisCausas", rs.getString("analisisCausas"));
					data.put("observaciones", rs.getString("observaciones"));
					data.put("si", rs.getString("si"));
					data.put("no", rs.getString("no"));
					data.put("dia2", rs.getString("dia2"));
					data.put("mes2", rs.getString("mes2"));
					data.put("ano2", rs.getString("ano2"));
					data.put("dia3", rs.getString("dia3"));
					data.put("mes3", rs.getString("mes3"));
					data.put("ano3", rs.getString("ano3"));
					data.put("nombreSolicitante", rs.getString("nombreSolicitante"));
					data.put("nombreReceptor", rs.getString("nombreReceptor"));
					data.put("elaboradoPor", rs.getString("elaboradoPor"));
					data.put("revisadoPor", rs.getString("revisadoPor"));
					data.put("aprobadoPor", rs.getString("aprobadoPor"));
					data.put("updatedAT", rs.getString("updatedAT"));
					
					return new RegistroFallaFrame(data).getPrintPanel();
				}else {
					return new RegistroFallaFrame((JPanel)null).getPrintPanel();
				}
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

		return null;
	}
}
