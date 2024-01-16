package workOrder;

import views.FrameModel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import utilitys.DateHandler;
import utilitys.PanelPrinter;

import javax.swing.border.MatteBorder;

import components.Cmessage;
import components.Constants;
import dataBaseModels.WorkOrderDataBase;
import javax.swing.JLabel;

import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.UUID;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BoxLayout;
import java.awt.Cursor;

public class WorkOrder extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JTextField txtPreventivo;
	private JTextField txtCorrectivo;
	private JTextField txtDia1;
	private JTextField txtMes1;
	private JTextField txtAno1;
	private JTextField txtDia2;
	private JTextField txtMes2;
	private JTextField txtAno2;
	private JTextField txtResponsableEjecucion;
	private JTextField txtLubricacion;
	private JTextField txtElectrico;
	private JTextField txtMecanico;
	private JTextField txtInstrumentacion;
	private JTextField txtOtro;
	private JTextField txtNumeroOrden;
	private JTextField txtEquipo;
	private JTextField txtCodigoB;
	private JTextField txtFichaTecnica;
	private JTextField txtHojaVida;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JTextField txtCodigoA;
	private JTextField txtFecha;
	private JTextField txtVersion;
	private JTextField txtPagina;
	private JTextField txtCodigo1;
	private JTextField txtCodigo2;
	private JTextField txtCodigo3;
	private JTextField txtCodigo4;
	private JTextField txtCodigo5;
	private JTextField txtCodigo6;
	private JTextField txtCodigo7;
	private JTextField txtDescription1;
	private JTextField txtDescription2;
	private JTextField txtDescription3;
	private JTextField txtDescription4;
	private JTextField txtDescription5;
	private JTextField txtDescription6;
	private JTextField txtDescription7;
	private JTextField txtHerramientas1;
	private JTextField txtHerramientas2;
	private JTextField txtHerramientas3;
	private JTextField txtHerramientas4;
	private JTextField txtHerramientas5;
	private JTextField txtHerramientas6;
	private JTextField txtHerramientas7;
	private JTextField txtMateriales1;
	private JTextField txtMateriales2;
	private JTextField txtMateriales3;
	private JTextField txtMateriales4;
	private JTextField txtMateriales5;
	private JTextField txtMateriales6;
	private JTextField txtRepuestos1;
	private JTextField txtRepuestos2;
	private JTextField txtRepuestos3;
	private JTextField txtRepuestos4;
	private JTextField txtRepuestos5;
	private JTextField txtRepuestos6;
	private JTextField txtRepuestos7;
	private JTextField txtHoras1;
	private JTextField txtHoras2;
	private JTextField txtHoras3;
	private JTextField txtHoras4;
	private JTextField txtHoras5;
	private JTextField txtHoras6;
	private JTextField txtHoras7;
	private JTextField txtObservaciones1;
	private JTextField txtObservaciones2;
	private JTextField txtObservaciones3;
	private JTextField txtObservaciones4;
	private JTextField txtObservaciones5;
	private JTextField txtObservaciones6;
	private JTextField txtObservaciones7;
	private JTextField txtEntregadoPor;
	private JTextField txtRecibidoPor;
	private JTextField txtAprobadoPorA;
	private JPanel workOrderPanel;
	private JTextField txtSupervisadoPor;
	private JTextField txtElaboradoPor;
	private JTextField txtRevisadoPor;
	private JTextField txtAprobadoPorB;
	private JTextField txtMateriales7;
	private JPanel panel;
	private JLabel lblNewLabel_39;
	private JLabel lblNewLabel_40;
	private JLabel lblNewLabel_41;
	private Component horizontalStrut;
	private Component horizontalStrut_1;
	private JLabel lblMessage;
	private Component horizontalStrut_2;
	private Component horizontalStrut_3;
	private String uuid = null;

	public WorkOrder(HashMap<String, String> data) {
		this((JPanel) null);

		if (data.containsKey("codigoA")) {
			txtCodigoA.setText(data.get("codigoA"));
		}
		if (data.containsKey("fecha")) {
			txtFecha.setText(data.get("fecha"));
		}
		if (data.containsKey("version")) {
			txtVersion.setText(data.get("version"));
		}
		if (data.containsKey("pagina")) {
			txtPagina.setText(data.get("pagina"));
		}
		if (data.containsKey("codigoB")) {
			txtCodigoB.setText(data.get("codigoB"));
		}
		if (data.containsKey("codigo1")) {
			txtCodigo1.setText(data.get("codigo1"));
		}
		if (data.containsKey("codigo2")) {
			txtCodigo2.setText(data.get("codigo2"));
		}
		if (data.containsKey("codigo3")) {
			txtCodigo3.setText(data.get("codigo3"));
		}
		if (data.containsKey("codigo4")) {
			txtCodigo4.setText(data.get("codigo4"));
		}
		if (data.containsKey("codigo5")) {
			txtCodigo5.setText(data.get("codigo5"));
		}
		if (data.containsKey("codigo6")) {
			txtCodigo6.setText(data.get("codigo6"));
		}
		if (data.containsKey("codigo7")) {
			txtCodigo6.setText(data.get("codigo7"));
		}
		if (data.containsKey("numeroOrden")) {
			txtNumeroOrden.setText(data.get("numeroOrden"));
		}
		if (data.containsKey("equipo")) {
			txtEquipo.setText(data.get("equipo"));
		}
		if (data.containsKey("fichaTecnica")) {
			txtFichaTecnica.setText(data.get("fichaTecnica"));
		}
		if (data.containsKey("hojaVida")) {
			txtHojaVida.setText(data.get("hojaVida"));
		}
		if (data.containsKey("lubricacion")) {
			txtLubricacion.setText(data.get("libricacion"));
		}
		if (data.containsKey("electrico")) {
			txtElectrico.setText(data.get("electrico"));
		}
		if (data.containsKey("mecanico")) {
			txtMecanico.setText(data.get("mecanico"));
		}
		if (data.containsKey("instrumentacion")) {
			txtInstrumentacion.setText(data.get("instrumentacion"));
		}
		if (data.containsKey("otro")) {
			txtOtro.setText(data.get("otro"));
		}
		if (data.containsKey("preventivo")) {
			txtPreventivo.setText(data.get("preventivo"));
		}
		if (data.containsKey("correctivo")) {
			txtCorrectivo.setText(data.get("correctivo"));
		}
		if (data.containsKey("responsable")) {
			txtResponsableEjecucion.setText(data.get("responsable"));
		}
		if (data.containsKey("dia1")) {
			txtDia1.setText(data.get("dia1"));
		}
		if (data.containsKey("mes1")) {
			txtMes1.setText(data.get("mes1"));
		}
		if (data.containsKey("ano1")) {
			txtAno1.setText(data.get("ano1"));
		}
		if (data.containsKey("dia2")) {
			txtDia2.setText(data.get("dia2"));
		}
		if (data.containsKey("mes2")) {
			txtMes2.setText(data.get("mes2"));
		}
		if (data.containsKey("ano2")) {
			txtAno2.setText(data.get("ano2"));
		}

		if (data.containsKey("descripcion1")) {
			txtDescription1.setText(data.get("descripcion1"));
		}
		if (data.containsKey("descripcion2")) {
			txtDescription2.setText(data.get("descripcion2"));
		}
		if (data.containsKey("descripcion3")) {
			txtDescription3.setText(data.get("descripcion3"));
		}
		if (data.containsKey("descripcion4")) {
			txtDescription4.setText(data.get("descripcion4"));
		}
		if (data.containsKey("descripcion5")) {
			txtDescription5.setText(data.get("descripcion5"));
		}
		if (data.containsKey("descripcion6")) {
			txtDescription6.setText(data.get("descripcion6"));
		}
		if (data.containsKey("descripcion7")) {
			txtDescription7.setText(data.get("descripcion7"));
		}

		if (data.containsKey("herramientas1")) {
			txtHerramientas1.setText(data.get("herramientas1"));
		}
		if (data.containsKey("herramientas2")) {
			txtHerramientas2.setText(data.get("herramientas2"));
		}
		if (data.containsKey("herramientas3")) {
			txtHerramientas3.setText(data.get("herramientas3"));
		}
		if (data.containsKey("herramientas4")) {
			txtHerramientas4.setText(data.get("herramientas4"));
		}
		if (data.containsKey("herramientas5")) {
			txtHerramientas5.setText(data.get("herramientas5"));
		}
		if (data.containsKey("herramientas6")) {
			txtHerramientas6.setText(data.get("herramientas6"));
		}
		if (data.containsKey("herramientas7")) {
			txtHerramientas7.setText(data.get("herramientas7"));
		}

		if (data.containsKey("materiales1")) {
			txtMateriales1.setText(data.get("materiales1"));
		}
		if (data.containsKey("materiales2")) {
			txtMateriales2.setText(data.get("materiales2"));
		}
		if (data.containsKey("materiales3")) {
			txtMateriales3.setText(data.get("materiales3"));
		}
		if (data.containsKey("materiales4")) {
			txtMateriales4.setText(data.get("materiales4"));
		}
		if (data.containsKey("materiales5")) {
			txtMateriales5.setText(data.get("materiales5"));
		}
		if (data.containsKey("materiales6")) {
			txtMateriales6.setText(data.get("materiales6"));
		}
		if (data.containsKey("materiales7")) {
			txtMateriales7.setText(data.get("materiales7"));
		}

		if (data.containsKey("repuestos1")) {
			txtRepuestos1.setText(data.get("repuestos1"));
		}
		if (data.containsKey("repuestos2")) {
			txtRepuestos2.setText(data.get("repuestos2"));
		}
		if (data.containsKey("repuestos3")) {
			txtRepuestos3.setText(data.get("repuestos3"));
		}
		if (data.containsKey("repuestos4")) {
			txtRepuestos4.setText(data.get("repuestos4"));
		}
		if (data.containsKey("repuestos5")) {
			txtRepuestos5.setText(data.get("repuestos5"));
		}
		if (data.containsKey("repuestos6")) {
			txtRepuestos6.setText(data.get("repuestos6"));
		}
		if (data.containsKey("repuestos7")) {
			txtRepuestos7.setText(data.get("repuestos7"));
		}

		if (data.containsKey("horas1")) {
			txtHoras1.setText(data.get("horas1"));
		}
		if (data.containsKey("horas2")) {
			txtHoras2.setText(data.get("horas2"));
		}
		if (data.containsKey("horas3")) {
			txtHoras3.setText(data.get("horas3"));
		}
		if (data.containsKey("horas4")) {
			txtHoras4.setText(data.get("horas4"));
		}
		if (data.containsKey("horas5")) {
			txtHoras5.setText(data.get("horas5"));
		}
		if (data.containsKey("horas6")) {
			txtHoras6.setText(data.get("horas6"));
		}
		if (data.containsKey("horas7")) {
			txtHoras7.setText(data.get("horas7"));
		}
		if (data.containsKey("observaciones1")) {
			txtObservaciones1.setText(data.get("observaciones1"));
		}
		if (data.containsKey("observaciones2")) {
			txtObservaciones2.setText(data.get("observaciones2"));
		}
		if (data.containsKey("observaciones3")) {
			txtObservaciones3.setText(data.get("observaciones3"));
		}
		if (data.containsKey("observaciones4")) {
			txtObservaciones4.setText(data.get("observaciones4"));
		}
		if (data.containsKey("observaciones5")) {
			txtObservaciones5.setText(data.get("observaciones5"));
		}
		if (data.containsKey("observaciones6")) {
			txtObservaciones6.setText(data.get("observaciones6"));
		}
		if (data.containsKey("observaciones7")) {
			txtObservaciones7.setText(data.get("observaciones7"));
		}
		if (data.containsKey("entregadoPor")) {
			txtEntregadoPor.setText(data.get("entregadoPor"));
		}
		if (data.containsKey("recibidoPor")) {
			txtRecibidoPor.setText(data.get("recibidoPor"));
		}
		if (data.containsKey("supervisadoPor")) {
			txtSupervisadoPor.setText(data.get("supervisadoPor"));
		}
		if (data.containsKey("aprobadoPorA")) {
			txtAprobadoPorA.setText(data.get("aprobadoPorA"));
		}
		if (data.containsKey("aprobadoPorB")) {
			txtAprobadoPorB.setText(data.get("aprobadoPorB"));
		}
		if (data.containsKey("elaboradoPor")) {
			txtElaboradoPor.setText(data.get("elaboradoPor"));
		}
		if (data.containsKey("revisadoPor")) {
			txtRevisadoPor.setText(data.get("revisadoPor"));
		}

		txtPreventivo.setEditable(false);
		txtCorrectivo.setEditable(false);
		txtDia1.setEditable(false);
		txtMes1.setEditable(false);
		txtAno1.setEditable(false);
		txtDia2.setEditable(false);
		txtMes2.setEditable(false);
		txtAno2.setEditable(false);
		txtResponsableEjecucion.setEditable(false);
		txtLubricacion.setEditable(false);
		txtElectrico.setEditable(false);
		txtMecanico.setEditable(false);
		txtInstrumentacion.setEditable(false);
		txtOtro.setEditable(false);
		txtNumeroOrden.setEditable(false);
		txtEquipo.setEditable(false);
		txtCodigoB.setEditable(false);
		txtFichaTecnica.setEditable(false);
		txtHojaVida.setEditable(false);
		txtCodigoA.setEditable(false);
		txtFecha.setEditable(false);
		txtVersion.setEditable(false);
		txtPagina.setEditable(false);
		txtCodigo1.setEditable(false);
		txtCodigo2.setEditable(false);
		txtCodigo3.setEditable(false);
		txtCodigo4.setEditable(false);
		txtCodigo5.setEditable(false);
		txtCodigo6.setEditable(false);
		txtCodigo7.setEditable(false);
		txtDescription1.setEditable(false);
		txtDescription2.setEditable(false);
		txtDescription3.setEditable(false);
		txtDescription4.setEditable(false);
		txtDescription5.setEditable(false);
		txtDescription6.setEditable(false);
		txtDescription7.setEditable(false);
		txtHerramientas1.setEditable(false);
		txtHerramientas2.setEditable(false);
		txtHerramientas3.setEditable(false);
		txtHerramientas4.setEditable(false);
		txtHerramientas5.setEditable(false);
		txtHerramientas6.setEditable(false);
		txtHerramientas7.setEditable(false);
		txtMateriales1.setEditable(false);
		txtMateriales2.setEditable(false);
		txtMateriales3.setEditable(false);
		txtMateriales4.setEditable(false);
		txtMateriales5.setEditable(false);
		txtMateriales6.setEditable(false);
		txtRepuestos1.setEditable(false);
		txtRepuestos2.setEditable(false);
		txtRepuestos3.setEditable(false);
		txtRepuestos4.setEditable(false);
		txtRepuestos5.setEditable(false);
		txtRepuestos6.setEditable(false);
		txtRepuestos7.setEditable(false);
		txtHoras1.setEditable(false);
		txtHoras2.setEditable(false);
		txtHoras3.setEditable(false);
		txtHoras4.setEditable(false);
		txtHoras5.setEditable(false);
		txtHoras6.setEditable(false);
		txtHoras7.setEditable(false);
		txtObservaciones1.setEditable(false);
		txtObservaciones2.setEditable(false);
		txtObservaciones3.setEditable(false);
		txtObservaciones4.setEditable(false);
		txtObservaciones5.setEditable(false);
		txtObservaciones6.setEditable(false);
		txtObservaciones7.setEditable(false);
		txtEntregadoPor.setEditable(false);
		txtRecibidoPor.setEditable(false);
		txtAprobadoPorA.setEditable(false);
		txtSupervisadoPor.setEditable(false);
		txtElaboradoPor.setEditable(false);
		txtRevisadoPor.setEditable(false);
		txtAprobadoPorB.setEditable(false);
		txtMateriales7.setEditable(false);

	}

	/**
	 * @wbp.parser.constructor
	 */
	public WorkOrder(JPanel parent) {
		super(parent, "ORDEN DE TRABAJO", true);
		setAlwaysOnTop(false);
		uuid = UUID.randomUUID().toString();
		workOrderPanel = new JPanel();
		workOrderPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		workOrderPanel.setBackground(Color.WHITE);
		getContentPane().add(workOrderPanel, BorderLayout.CENTER);
		workOrderPanel.setLayout(new MigLayout("insets 0, gap 0",
				"[grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill]",
				"[][][][][][][][][][][][][][][][][][][][][][][][][]"));

		JLabel lblNewLabel_22 = new JLabel("ORDEN DE TRABAJO");
		lblNewLabel_22.setForeground(Constants.getTextColor());
		lblNewLabel_22.setOpaque(true);
		lblNewLabel_22.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_22.setMaximumSize(new Dimension(3000, 3000));
		lblNewLabel_22.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_22, "cell 0 0 9 5,grow");

		JLabel lblNewLabel_21 = new JLabel("Código:");
		lblNewLabel_21.setForeground(Constants.getTextColor());
		lblNewLabel_21.setOpaque(true);
		lblNewLabel_21.setBackground(Constants.getSurfaceColor());
		lblNewLabel_21.setBorder(new MatteBorder(1, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.LEFT);
		workOrderPanel.add(lblNewLabel_21, "cell 9 1,grow");

		txtCodigoA = new JTextField();
		txtCodigoA.setOpaque(false);
		txtCodigoA.setColumns(10);
		txtCodigoA.setBorder(new MatteBorder(1, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtCodigoA, "cell 10 1,growx");

		JLabel lblNewLabel_20 = new JLabel("Fecha:");
		lblNewLabel_20.setForeground(Constants.getTextColor());
		lblNewLabel_20.setOpaque(true);
		lblNewLabel_20.setBackground(Constants.getSurfaceColor());
		lblNewLabel_20.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.LEFT);
		workOrderPanel.add(lblNewLabel_20, "cell 9 2,grow");

		txtFecha = new JTextField();
		txtFecha.setOpaque(false);
		txtFecha.setColumns(10);
		txtFecha.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		workOrderPanel.add(txtFecha, "cell 10 2,growx");

		JLabel lblNewLabel_19 = new JLabel("Versión:");
		lblNewLabel_19.setForeground(Constants.getTextColor());
		lblNewLabel_19.setOpaque(true);
		lblNewLabel_19.setBackground(Constants.getSurfaceColor());
		lblNewLabel_19.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.LEFT);
		workOrderPanel.add(lblNewLabel_19, "cell 9 3,grow");

		txtVersion = new JTextField();
		txtVersion.setOpaque(false);
		txtVersion.setColumns(10);
		txtVersion.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		workOrderPanel.add(txtVersion, "cell 10 3,growx");

		JLabel lblNewLabel_18 = new JLabel("Página:");
		lblNewLabel_18.setForeground(Constants.getTextColor());
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setBackground(Constants.getSurfaceColor());
		lblNewLabel_18.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.LEFT);
		workOrderPanel.add(lblNewLabel_18, "cell 9 4,grow");

		txtPagina = new JTextField();
		txtPagina.setOpaque(false);
		txtPagina.setColumns(10);
		txtPagina.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		workOrderPanel.add(txtPagina, "cell 10 4,growx");

		lblNewLabel_13 = new JLabel("N° Orden");
		lblNewLabel_13.setForeground(Constants.getTextColor());
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setBackground(Constants.getSurfaceColor());
		lblNewLabel_13.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_13, "cell 0 5,grow");

		lblNewLabel_14 = new JLabel("Equipo");
		lblNewLabel_14.setForeground(Constants.getTextColor());
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setBackground(Constants.getSurfaceColor());
		lblNewLabel_14.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_14, "cell 1 5 2 1,grow");

		lblNewLabel_15 = new JLabel("Código");
		lblNewLabel_15.setForeground(Constants.getTextColor());
		lblNewLabel_15.setOpaque(true);
		lblNewLabel_15.setBackground(Constants.getSurfaceColor());
		lblNewLabel_15.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_15, "cell 3 5,grow");

		lblNewLabel_16 = new JLabel("Ficha Técnica");
		lblNewLabel_16.setForeground(Constants.getTextColor());
		lblNewLabel_16.setOpaque(true);
		lblNewLabel_16.setBackground(Constants.getSurfaceColor());
		lblNewLabel_16.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_16, "cell 4 5,grow");

		lblNewLabel_17 = new JLabel("Hoja de Vida");
		lblNewLabel_17.setForeground(Constants.getTextColor());
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setBackground(Constants.getSurfaceColor());
		lblNewLabel_17.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_17, "cell 5 5 6 1,grow");

		txtNumeroOrden = new JTextField();
		txtNumeroOrden.setOpaque(false);
		txtNumeroOrden.setColumns(10);
		txtNumeroOrden.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(txtNumeroOrden, "cell 0 6,growx");

		txtEquipo = new JTextField();
		txtEquipo.setOpaque(false);
		txtEquipo.setColumns(10);
		txtEquipo.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtEquipo, "cell 1 6 2 1,growx");

		txtCodigoB = new JTextField();
		txtCodigoB.setOpaque(false);
		txtCodigoB.setColumns(10);
		txtCodigoB.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtCodigoB, "cell 3 6,growx");

		txtFichaTecnica = new JTextField();
		txtFichaTecnica.setOpaque(false);
		txtFichaTecnica.setColumns(10);
		txtFichaTecnica.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtFichaTecnica, "cell 4 6,growx,aligny top");

		txtHojaVida = new JTextField();
		txtHojaVida.setOpaque(false);
		txtHojaVida.setColumns(10);
		txtHojaVida.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHojaVida, "cell 5 6 6 1,growx");

		JLabel lblNewLabel_12 = new JLabel("Tipo de Mantenimiento");
		lblNewLabel_12.setForeground(Constants.getTextColor());
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBackground(Constants.getSurfaceColor());
		lblNewLabel_12.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_12, "cell 0 7 11 1,grow");

		JLabel lblNewLabel_7 = new JLabel("Lubricación");
		lblNewLabel_7.setForeground(Constants.getTextColor());
		lblNewLabel_7.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_7, "cell 0 8 2 1,growx,aligny center");

		JLabel lblNewLabel_8 = new JLabel("Eléctrico");
		lblNewLabel_8.setForeground(Constants.getTextColor());
		lblNewLabel_8.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_8, "cell 2 8 2 1,grow");

		JLabel lblNewLabel_9 = new JLabel("Mecánico");
		lblNewLabel_9.setForeground(Constants.getTextColor());
		lblNewLabel_9.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_9, "cell 4 8 2 1,grow");

		JLabel lblNewLabel_10 = new JLabel("Instrumentación");
		lblNewLabel_10.setForeground(Constants.getTextColor());
		lblNewLabel_10.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_10, "cell 6 8 2 1,growx");

		JLabel lblNewLabel_11 = new JLabel("Otro");
		lblNewLabel_11.setForeground(Constants.getTextColor());
		lblNewLabel_11.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_11, "cell 8 8 3 1,growx");

		txtLubricacion = new JTextField();
		txtLubricacion.setOpaque(false);
		txtLubricacion.setColumns(10);
		txtLubricacion.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(txtLubricacion, "cell 0 9 2 1,growx");

		txtElectrico = new JTextField();
		txtElectrico.setOpaque(false);
		txtElectrico.setColumns(10);
		txtElectrico.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtElectrico, "cell 2 9 2 1,growx");

		txtMecanico = new JTextField();
		txtMecanico.setOpaque(false);
		txtMecanico.setColumns(10);
		txtMecanico.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtMecanico, "cell 4 9 2 1,growx");

		txtInstrumentacion = new JTextField();
		txtInstrumentacion.setOpaque(false);
		txtInstrumentacion.setColumns(10);
		txtInstrumentacion.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtInstrumentacion, "cell 6 9 2 1,growx");

		txtOtro = new JTextField();
		txtOtro.setOpaque(false);
		txtOtro.setColumns(10);
		txtOtro.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtOtro, "cell 8 9 3 1,growx");

		JLabel lblClase = new JLabel("Clase");
		lblClase.setForeground(Constants.getTextColor());
		lblClase.setOpaque(true);
		lblClase.setBackground(Constants.getSurfaceColor());
		lblClase.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblClase.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblClase, "cell 0 10 2 1,grow");

		JLabel lblNewLabel = new JLabel("Responsable de ejecución ");
		lblNewLabel.setForeground(Constants.getTextColor());
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Constants.getSurfaceColor());
		lblNewLabel.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel, "cell 2 10 3 2,grow");

		JLabel lblFechaInicio = new JLabel("Fecha de Inicio");
		lblFechaInicio.setForeground(Constants.getTextColor());
		lblFechaInicio.setOpaque(true);
		lblFechaInicio.setBackground(Constants.getSurfaceColor());
		lblFechaInicio.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblFechaInicio.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblFechaInicio, "cell 5 10 3 1,growx,aligny center");

		JLabel lblFechaDeCierre = new JLabel("Fecha de Cierre o Culminacióm");
		lblFechaDeCierre.setForeground(Constants.getTextColor());
		lblFechaDeCierre.setOpaque(true);
		lblFechaDeCierre.setBackground(Constants.getSurfaceColor());
		lblFechaDeCierre.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblFechaDeCierre.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblFechaDeCierre, "cell 8 10 3 1,grow");

		JLabel lblNewLabel_30 = new JLabel("Preventivo");
		lblNewLabel_30.setForeground(Constants.getTextColor());
		lblNewLabel_30.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_30.setOpaque(true);
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(lblNewLabel_30, "cell 0 11,grow");

		JLabel lblNewLabel_34 = new JLabel("Correctivo");
		lblNewLabel_34.setForeground(Constants.getTextColor());
		lblNewLabel_34.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_34.setOpaque(true);
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_34.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(lblNewLabel_34, "cell 1 11,grow");

		JLabel lblNewLabel_1 = new JLabel("Dia");
		lblNewLabel_1.setForeground(Constants.getTextColor());
		lblNewLabel_1.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_1, "cell 5 11,growx,aligny center");

		JLabel lblNewLabel_2 = new JLabel("Mes");
		lblNewLabel_2.setForeground(Constants.getTextColor());
		lblNewLabel_2.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_2, "cell 6 11,grow");

		JLabel lblNewLabel_3 = new JLabel("Año");
		lblNewLabel_3.setForeground(Constants.getTextColor());
		lblNewLabel_3.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_3, "cell 7 11,grow");

		JLabel lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setForeground(Constants.getTextColor());
		lblNewLabel_4.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_4, "cell 8 11,grow");

		JLabel lblNewLabel_5 = new JLabel("Mes");
		lblNewLabel_5.setForeground(Constants.getTextColor());
		lblNewLabel_5.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_5, "cell 9 11,growx,aligny center");

		JLabel lblNewLabel_6 = new JLabel("Año");
		lblNewLabel_6.setForeground(Constants.getTextColor());
		lblNewLabel_6.setBackground(Constants.getSurfaceColorB());
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_6, "cell 10 11,grow");

		txtPreventivo = new JTextField();
		txtPreventivo.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		txtPreventivo.setOpaque(false);
		workOrderPanel.add(txtPreventivo, "cell 0 12,grow");
		txtPreventivo.setColumns(10);

		txtCorrectivo = new JTextField();
		txtCorrectivo.setOpaque(false);
		txtCorrectivo.setColumns(10);
		txtCorrectivo.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtCorrectivo, "cell 1 12,growx");

		txtResponsableEjecucion = new JTextField();
		txtResponsableEjecucion.setOpaque(false);
		txtResponsableEjecucion.setColumns(10);
		txtResponsableEjecucion.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtResponsableEjecucion, "cell 2 12,growx, spanx 3");

		txtDia1 = new JTextField();
		txtDia1.setOpaque(false);
		txtDia1.setColumns(10);
		txtDia1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtDia1, "cell 5 12,growx");

		txtMes1 = new JTextField();
		txtMes1.setOpaque(false);
		txtMes1.setColumns(10);
		txtMes1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtMes1, "cell 6 12,growx");

		txtAno1 = new JTextField();
		txtAno1.setOpaque(false);
		txtAno1.setColumns(10);
		txtAno1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtAno1, "cell 7 12,growx");

		txtDia2 = new JTextField();
		txtDia2.setOpaque(false);
		txtDia2.setColumns(10);
		txtDia2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtDia2, "cell 8 12,growx");

		txtMes2 = new JTextField();
		txtMes2.setOpaque(false);
		txtMes2.setColumns(10);
		txtMes2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtMes2, "cell 9 12,growx");

		txtAno2 = new JTextField();
		txtAno2.setOpaque(false);
		txtAno2.setColumns(10);
		txtAno2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtAno2, "cell 10 12,growx");

		JLabel lblNewLabel_23 = new JLabel("Código de ");
		lblNewLabel_23.setForeground(Constants.getTextColor());
		lblNewLabel_23.setOpaque(true);
		lblNewLabel_23.setBackground(Constants.getSurfaceColor());
		lblNewLabel_23.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_23, "cell 0 13,grow");

		JLabel lblNewLabel_24 = new JLabel("Descripción");
		lblNewLabel_24.setForeground(Constants.getTextColor());
		lblNewLabel_24.setOpaque(true);
		lblNewLabel_24.setBackground(Constants.getSurfaceColor());
		lblNewLabel_24.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_24, "cell 1 13 2 1,grow");

		JLabel lblNewLabel_25 = new JLabel("Herramientas");
		lblNewLabel_25.setForeground(Constants.getTextColor());
		lblNewLabel_25.setOpaque(true);
		lblNewLabel_25.setBackground(Constants.getSurfaceColor());
		lblNewLabel_25.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_25, "cell 3 13,grow");

		JLabel lblNewLabel_26 = new JLabel("Materiales");
		lblNewLabel_26.setForeground(Constants.getTextColor());
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setBackground(Constants.getSurfaceColor());
		lblNewLabel_26.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_26, "cell 4 13,grow");

		JLabel lblNewLabel_27 = new JLabel("Repuestos");
		lblNewLabel_27.setForeground(Constants.getTextColor());
		lblNewLabel_27.setOpaque(true);
		lblNewLabel_27.setBackground(Constants.getSurfaceColor());
		lblNewLabel_27.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_27, "cell 5 13 2 1,grow");

		JLabel lblNewLabel_28 = new JLabel("Horas-Hombre");
		lblNewLabel_28.setForeground(Constants.getTextColor());
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setBackground(Constants.getSurfaceColor());
		lblNewLabel_28.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_28, "cell 7 13,grow");

		JLabel lblNewLabel_29 = new JLabel("Observaciones");
		lblNewLabel_29.setForeground(Constants.getTextColor());
		lblNewLabel_29.setOpaque(true);
		lblNewLabel_29.setBackground(Constants.getSurfaceColor());
		lblNewLabel_29.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		workOrderPanel.add(lblNewLabel_29, "cell 8 13 3 1,grow");

		txtCodigo1 = new JTextField();
		txtCodigo1.setOpaque(false);
		txtCodigo1.setColumns(10);
		txtCodigo1.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtCodigo1, "cell 0 14,grow");

		txtDescription1 = new JTextField();
		txtDescription1.setOpaque(false);
		txtDescription1.setColumns(10);
		txtDescription1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtDescription1, "cell 1 14 2 1,grow");

		txtHerramientas1 = new JTextField();
		txtHerramientas1.setOpaque(false);
		txtHerramientas1.setColumns(10);
		txtHerramientas1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHerramientas1, "cell 3 14,grow");

		txtMateriales1 = new JTextField();
		txtMateriales1.setOpaque(false);
		txtMateriales1.setColumns(10);
		txtMateriales1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtMateriales1, "cell 4 14,grow");

		txtRepuestos1 = new JTextField();
		txtRepuestos1.setOpaque(false);
		txtRepuestos1.setColumns(10);
		txtRepuestos1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtRepuestos1, "cell 5 14 2 1,grow");

		txtHoras1 = new JTextField();
		txtHoras1.setOpaque(false);
		txtHoras1.setColumns(10);
		txtHoras1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHoras1, "cell 7 14,grow");

		txtObservaciones1 = new JTextField();
		txtObservaciones1.setOpaque(false);
		txtObservaciones1.setColumns(10);
		txtObservaciones1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtObservaciones1, "cell 8 14 3 1,grow");

		txtCodigo2 = new JTextField();
		txtCodigo2.setOpaque(false);
		txtCodigo2.setColumns(10);
		txtCodigo2.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtCodigo2, "cell 0 15,grow");

		txtDescription2 = new JTextField();
		txtDescription2.setOpaque(false);
		txtDescription2.setColumns(10);
		txtDescription2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtDescription2, "cell 1 15 2 1,grow");

		txtHerramientas2 = new JTextField();
		txtHerramientas2.setOpaque(false);
		txtHerramientas2.setColumns(10);
		txtHerramientas2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHerramientas2, "cell 3 15,grow");

		txtMateriales2 = new JTextField();
		txtMateriales2.setOpaque(false);
		txtMateriales2.setColumns(10);
		txtMateriales2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtMateriales2, "cell 4 15,grow");

		txtRepuestos2 = new JTextField();
		txtRepuestos2.setOpaque(false);
		txtRepuestos2.setColumns(10);
		txtRepuestos2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtRepuestos2, "cell 5 15 2 1,grow");

		txtHoras2 = new JTextField();
		txtHoras2.setOpaque(false);
		txtHoras2.setColumns(10);
		txtHoras2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHoras2, "cell 7 15,grow");

		txtObservaciones2 = new JTextField();
		txtObservaciones2.setOpaque(false);
		txtObservaciones2.setColumns(10);
		txtObservaciones2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtObservaciones2, "cell 8 15 3 1,grow");

		txtCodigo3 = new JTextField();
		txtCodigo3.setOpaque(false);
		txtCodigo3.setColumns(10);
		txtCodigo3.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtCodigo3, "cell 0 16,grow");

		txtDescription3 = new JTextField();
		txtDescription3.setOpaque(false);
		txtDescription3.setColumns(10);
		txtDescription3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtDescription3, "cell 1 16 2 1,grow");

		txtHerramientas3 = new JTextField();
		txtHerramientas3.setOpaque(false);
		txtHerramientas3.setColumns(10);
		txtHerramientas3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHerramientas3, "cell 3 16,grow");

		txtMateriales3 = new JTextField();
		txtMateriales3.setOpaque(false);
		txtMateriales3.setColumns(10);
		txtMateriales3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtMateriales3, "cell 4 16,grow");

		txtRepuestos3 = new JTextField();
		txtRepuestos3.setOpaque(false);
		txtRepuestos3.setColumns(10);
		txtRepuestos3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtRepuestos3, "cell 5 16 2 1,grow");

		txtHoras3 = new JTextField();
		txtHoras3.setOpaque(false);
		txtHoras3.setColumns(10);
		txtHoras3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHoras3, "cell 7 16,grow");

		txtObservaciones3 = new JTextField();
		txtObservaciones3.setOpaque(false);
		txtObservaciones3.setColumns(10);
		txtObservaciones3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtObservaciones3, "cell 8 16 3 1,grow");

		txtCodigo4 = new JTextField();
		txtCodigo4.setOpaque(false);
		txtCodigo4.setColumns(10);
		txtCodigo4.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtCodigo4, "cell 0 17,grow");

		txtDescription4 = new JTextField();
		txtDescription4.setOpaque(false);
		txtDescription4.setColumns(10);
		txtDescription4.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtDescription4, "cell 1 17 2 1,grow");

		txtHerramientas4 = new JTextField();
		txtHerramientas4.setOpaque(false);
		txtHerramientas4.setColumns(10);
		txtHerramientas4.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHerramientas4, "cell 3 17,grow");

		txtMateriales4 = new JTextField();
		txtMateriales4.setOpaque(false);
		txtMateriales4.setColumns(10);
		txtMateriales4.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtMateriales4, "cell 4 17,grow");

		txtRepuestos4 = new JTextField();
		txtRepuestos4.setOpaque(false);
		txtRepuestos4.setColumns(10);
		txtRepuestos4.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(txtRepuestos4, "cell 5 17 2 1,grow");

		txtHoras4 = new JTextField();
		txtHoras4.setOpaque(false);
		txtHoras4.setColumns(10);
		txtHoras4.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHoras4, "cell 7 17,grow");

		txtObservaciones4 = new JTextField();
		txtObservaciones4.setOpaque(false);
		txtObservaciones4.setColumns(10);
		txtObservaciones4.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtObservaciones4, "cell 8 17 3 1,grow");

		txtCodigo5 = new JTextField();
		txtCodigo5.setOpaque(false);
		txtCodigo5.setColumns(10);
		txtCodigo5.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtCodigo5, "cell 0 18,grow");

		txtDescription5 = new JTextField();
		txtDescription5.setOpaque(false);
		txtDescription5.setColumns(10);
		txtDescription5.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(txtDescription5, "cell 1 18 2 1,grow");

		txtHerramientas5 = new JTextField();
		txtHerramientas5.setOpaque(false);
		txtHerramientas5.setColumns(10);
		txtHerramientas5.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHerramientas5, "cell 3 18,grow");

		txtMateriales5 = new JTextField();
		txtMateriales5.setOpaque(false);
		txtMateriales5.setColumns(10);
		txtMateriales5.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtMateriales5, "cell 4 18,grow");

		txtRepuestos5 = new JTextField();
		txtRepuestos5.setOpaque(false);
		txtRepuestos5.setColumns(10);
		txtRepuestos5.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtRepuestos5, "cell 5 18 2 1,grow");

		txtHoras5 = new JTextField();
		txtHoras5.setOpaque(false);
		txtHoras5.setColumns(10);
		txtHoras5.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHoras5, "cell 7 18,grow");

		txtObservaciones5 = new JTextField();
		txtObservaciones5.setOpaque(false);
		txtObservaciones5.setColumns(10);
		txtObservaciones5.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtObservaciones5, "cell 8 18 3 1,grow");

		txtCodigo6 = new JTextField();
		txtCodigo6.setOpaque(false);
		txtCodigo6.setColumns(10);
		txtCodigo6.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtCodigo6, "cell 0 19,grow");

		txtDescription6 = new JTextField();
		txtDescription6.setOpaque(false);
		txtDescription6.setColumns(10);
		txtDescription6.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtDescription6, "cell 1 19 2 1,grow");

		txtHerramientas6 = new JTextField();
		txtHerramientas6.setOpaque(false);
		txtHerramientas6.setColumns(10);
		txtHerramientas6.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHerramientas6, "cell 3 19,grow");

		txtMateriales6 = new JTextField();
		txtMateriales6.setOpaque(false);
		txtMateriales6.setColumns(10);
		txtMateriales6.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtMateriales6, "cell 4 19,grow");

		txtRepuestos6 = new JTextField();
		txtRepuestos6.setOpaque(false);
		txtRepuestos6.setColumns(10);
		txtRepuestos6.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtRepuestos6, "cell 5 19 2 1,grow");

		txtHoras6 = new JTextField();
		txtHoras6.setOpaque(false);
		txtHoras6.setColumns(10);
		txtHoras6.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHoras6, "cell 7 19,grow");

		txtObservaciones6 = new JTextField();
		txtObservaciones6.setOpaque(false);
		txtObservaciones6.setColumns(10);
		txtObservaciones6.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtObservaciones6, "cell 8 19 3 1,grow");

		txtCodigo7 = new JTextField();
		txtCodigo7.setOpaque(false);
		txtCodigo7.setColumns(10);
		txtCodigo7.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtCodigo7, "cell 0 20,grow");

		txtDescription7 = new JTextField();
		txtDescription7.setOpaque(false);
		txtDescription7.setColumns(10);
		txtDescription7.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtDescription7, "cell 1 20 2 1,grow");

		txtHerramientas7 = new JTextField();
		txtHerramientas7.setOpaque(false);
		txtHerramientas7.setColumns(10);
		txtHerramientas7.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHerramientas7, "cell 3 20,grow");

		txtMateriales7 = new JTextField();
		txtMateriales7.setOpaque(false);
		txtMateriales7.setColumns(10);
		txtMateriales7.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtMateriales7, "cell 4 20,grow");

		txtRepuestos7 = new JTextField();
		txtRepuestos7.setOpaque(false);
		txtRepuestos7.setColumns(10);
		txtRepuestos7.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtRepuestos7, "cell 5 20 2 1,grow");

		txtHoras7 = new JTextField();
		txtHoras7.setOpaque(false);
		txtHoras7.setColumns(10);
		txtHoras7.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtHoras7, "cell 7 20,grow");

		txtObservaciones7 = new JTextField();
		txtObservaciones7.setOpaque(false);
		txtObservaciones7.setColumns(10);
		txtObservaciones7.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtObservaciones7, "cell 8 20 3 1,grow");

		JLabel lblNewLabel_31 = new JLabel("Entregado por:");
		lblNewLabel_31.setForeground(Constants.getTextColor());
		lblNewLabel_31.setOpaque(true);
		lblNewLabel_31.setBackground(Constants.getSurfaceColor());
		lblNewLabel_31.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(lblNewLabel_31, "cell 0 21 4 1,grow");

		JLabel lblNewLabel_32 = new JLabel("Recibido por:");
		lblNewLabel_32.setForeground(Constants.getTextColor());
		lblNewLabel_32.setOpaque(true);
		lblNewLabel_32.setBackground(Constants.getSurfaceColor());
		lblNewLabel_32.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		workOrderPanel.add(lblNewLabel_32, "cell 4 21 3 1,grow");

		JLabel lblNewLabel_35 = new JLabel("Supervisado por");
		lblNewLabel_35.setOpaque(true);
		lblNewLabel_35.setForeground(Color.WHITE);
		lblNewLabel_35.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_35.setBackground(new Color(44, 62, 80));
		workOrderPanel.add(lblNewLabel_35, "cell 7 21 2 1,grow");

		JLabel lblNewLabel_33 = new JLabel("Aprobado por:");
		lblNewLabel_33.setForeground(Constants.getTextColor());
		lblNewLabel_33.setOpaque(true);
		lblNewLabel_33.setBackground(Constants.getSurfaceColor());
		lblNewLabel_33.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(lblNewLabel_33, "cell 9 21 2 1");

		txtEntregadoPor = new JTextField();
		txtEntregadoPor.setOpaque(false);
		txtEntregadoPor.setColumns(10);
		txtEntregadoPor.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtEntregadoPor, "cell 0 22 4 1,growx");

		txtRecibidoPor = new JTextField();
		txtRecibidoPor.setOpaque(false);
		txtRecibidoPor.setColumns(10);
		txtRecibidoPor.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(txtRecibidoPor, "cell 4 22 3 1,growx");

		txtSupervisadoPor = new JTextField();
		txtSupervisadoPor.setOpaque(false);
		txtSupervisadoPor.setColumns(10);
		txtSupervisadoPor.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(txtSupervisadoPor, "cell 7 22 2 1,growx");

		txtAprobadoPorA = new JTextField();
		txtAprobadoPorA.setOpaque(false);
		txtAprobadoPorA.setColumns(10);
		txtAprobadoPorA.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(txtAprobadoPorA, "cell 9 22 2 1,growx");

		JLabel lblNewLabel_36 = new JLabel("Elaborado por: ");
		lblNewLabel_36.setOpaque(true);
		lblNewLabel_36.setForeground(Color.WHITE);
		lblNewLabel_36.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(64, 64, 64)));
		lblNewLabel_36.setBackground(new Color(44, 62, 80));
		workOrderPanel.add(lblNewLabel_36, "cell 0 23 4 1");

		JLabel lblNewLabel_37 = new JLabel("Revisado por:");
		lblNewLabel_37.setOpaque(true);
		lblNewLabel_37.setForeground(Color.WHITE);
		lblNewLabel_37.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_37.setBackground(new Color(44, 62, 80));
		workOrderPanel.add(lblNewLabel_37, "cell 4 23 3 1");

		JLabel lblNewLabel_38 = new JLabel("Aprobado por:");
		lblNewLabel_38.setOpaque(true);
		lblNewLabel_38.setForeground(Color.WHITE);
		lblNewLabel_38.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_38.setBackground(new Color(44, 62, 80));
		workOrderPanel.add(lblNewLabel_38, "cell 7 23 4 1");

		txtElaboradoPor = new JTextField();
		txtElaboradoPor.setOpaque(false);
		txtElaboradoPor.setColumns(10);
		txtElaboradoPor.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		workOrderPanel.add(txtElaboradoPor, "cell 0 24 4 1,growx");

		txtRevisadoPor = new JTextField();
		txtRevisadoPor.setOpaque(false);
		txtRevisadoPor.setColumns(10);
		txtRevisadoPor.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(txtRevisadoPor, "cell 4 24 3 1,growx");

		txtAprobadoPorB = new JTextField();
		txtAprobadoPorB.setOpaque(false);
		txtAprobadoPorB.setColumns(10);
		txtAprobadoPorB.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		workOrderPanel.add(txtAprobadoPorB, "cell 7 24 4 1,growx");

		panel = new JPanel();
		panel.setOpaque(false);
		getContentPane().add(panel, BorderLayout.NORTH);

		lblNewLabel_39 = new JLabel("");
		lblNewLabel_39.setToolTipText("Guardar");
		lblNewLabel_39.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				saveData();
			}
		});
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_3);
		lblNewLabel_39.setIcon(new ImageIcon(WorkOrder.class.getResource("/assets/save.png")));
		panel.add(lblNewLabel_39);

		horizontalStrut = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut);

		lblNewLabel_40 = new JLabel("");
		lblNewLabel_40.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_40.setToolTipText("Imprimir");
		lblNewLabel_40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				new PanelPrinter(workOrderPanel, 0.5).printPanel();
				;

			}
		});
		lblNewLabel_40.setIcon(new ImageIcon(WorkOrder.class.getResource("/assets/print2.png")));
		panel.add(lblNewLabel_40);

		horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_1);

		lblNewLabel_41 = new JLabel("");
		lblNewLabel_41.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_41.setToolTipText("Limpiar Formulario");
		lblNewLabel_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cleanData();
			}
		});
		lblNewLabel_41.setIcon(new ImageIcon(WorkOrder.class.getResource("/assets/clean.png")));
		panel.add(lblNewLabel_41);

		horizontalStrut_2 = Box.createHorizontalStrut(100);
		panel.add(horizontalStrut_2);

		lblMessage = new JLabel("Los cambios fuerón guardados con exíto");
		lblMessage.setVisible(false);
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMessage.setForeground(Color.WHITE);
		panel.add(lblMessage);

		onAcept(acept);

	}

	public JPanel getWorkOrderPanel() {
		return workOrderPanel;
	}

	ActionListener acept = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(!isDataComplete()) {
				new Cmessage("aceptar", null, "Los datos no están completos", null).setVisible(true);;
				return;
			}
			saveData();
			dispose();
		}
	};

	private void saveData() {
		if(!isDataComplete()) {
			new Cmessage("aceptar", null, "Los datos no están completos", null).setVisible(true);;
			return;
		}
		HashMap<String, String> params = new HashMap<>();
		params.put("id", uuid);
		params.put("codigoA", txtCodigoA.getText());
		params.put("fecha", txtFecha.getText());
		params.put("version", txtVersion.getText());
		params.put("pagina", txtPagina.getText());
		params.put("numeroOrden", txtNumeroOrden.getText());
		params.put("equipo", txtEquipo.getText());
		params.put("codigoB", txtCodigoB.getText());
		params.put("fichaTecnica", txtFichaTecnica.getText());
		params.put("hojaVida", txtHojaVida.getText());
		params.put("lubricacion", txtLubricacion.getText());
		params.put("electrico", txtElectrico.getText());
		params.put("mecanico", txtMecanico.getText());
		params.put("instrumentacion", txtInstrumentacion.getText());
		params.put("preventivo", txtPreventivo.getText());
		params.put("correctivo", txtCorrectivo.getText());
		params.put("responsable", txtResponsableEjecucion.getText());
		params.put("dia1", txtDia1.getText());
		params.put("mes1", txtMes1.getText());
		params.put("ano1", txtAno1.getText());
		params.put("dia2", txtDia2.getText());
		params.put("mes2", txtMes2.getText());
		params.put("ano2", txtAno2.getText());
		params.put("codigo1", txtCodigo1.getText());
		params.put("codigo2", txtCodigo2.getText());
		params.put("codigo3", txtCodigo3.getText());
		params.put("codigo4", txtCodigo4.getText());
		params.put("codigo5", txtCodigo5.getText());
		params.put("codigo6", txtCodigo6.getText());
		params.put("codigo7", txtCodigo7.getText());
		params.put("descripcion1", txtDescription1.getText());
		params.put("descripcion2", txtDescription2.getText());
		params.put("descripcion3", txtDescription3.getText());
		params.put("descripcion4", txtDescription4.getText());
		params.put("descripcion5", txtDescription5.getText());
		params.put("descripcion6", txtDescription6.getText());
		params.put("descripcion7", txtDescription7.getText());
		params.put("herramientas1", txtHerramientas1.getText());
		params.put("herramientas2", txtHerramientas2.getText());
		params.put("herramientas3", txtHerramientas3.getText());
		params.put("herramientas4", txtHerramientas4.getText());
		params.put("herramientas5", txtHerramientas5.getText());
		params.put("herramientas6", txtHerramientas6.getText());
		params.put("herramientas7", txtHerramientas7.getText());
		params.put("materiales1", txtMateriales1.getText());
		params.put("materiales2", txtMateriales2.getText());
		params.put("materiales3", txtMateriales3.getText());
		params.put("materiales4", txtMateriales4.getText());
		params.put("materiales5", txtMateriales5.getText());
		params.put("materiales6", txtMateriales6.getText());
		params.put("materiales7", txtMateriales7.getText());
		params.put("repuestos1", txtRepuestos1.getText());
		params.put("repuestos2", txtRepuestos2.getText());
		params.put("repuestos3", txtRepuestos3.getText());
		params.put("repuestos4", txtRepuestos4.getText());
		params.put("repuestos5", txtRepuestos5.getText());
		params.put("repuestos6", txtRepuestos6.getText());
		params.put("repuestos7", txtRepuestos7.getText());
		params.put("horas1", txtHoras1.getText());
		params.put("horas2", txtHoras2.getText());
		params.put("horas3", txtHoras3.getText());
		params.put("horas4", txtHoras4.getText());
		params.put("horas5", txtHoras5.getText());
		params.put("horas6", txtHoras6.getText());
		params.put("horas7", txtHoras7.getText());
		params.put("observaciones1", txtObservaciones1.getText());
		params.put("observaciones2", txtObservaciones2.getText());
		params.put("observaciones3", txtObservaciones3.getText());
		params.put("observaciones4", txtObservaciones4.getText());
		params.put("observaciones5", txtObservaciones5.getText());
		params.put("observaciones6", txtObservaciones6.getText());
		params.put("observaciones7", txtObservaciones7.getText());
		params.put("entregadoPor", txtEntregadoPor.getText());
		params.put("recibidoPor", txtRecibidoPor.getText());
		params.put("supervisadoPor", txtSupervisadoPor.getText());
		params.put("aprobadoPorA", txtAprobadoPorA.getText());
		params.put("aprobadoPorB", txtAprobadoPorB.getText());
		params.put("elaboradoPor", txtElaboradoPor.getText());
		params.put("revisadoPor", txtRevisadoPor.getText());
		params.put("updatedAT", DateHandler.dateToString(LocalDate.now()));

		try {
			WorkOrderDataBase wodb = new WorkOrderDataBase();
			if (wodb.registerExists(uuid)) {
				wodb.updateRecord(params);
			} else {
				wodb.createRecord(params);
			}

			lblMessage.setVisible(true);
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					lblMessage.setVisible(false);
				}
			}, 3000);

		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}

	}

	private void cleanData() {
		uuid = UUID.randomUUID().toString();
		txtPreventivo.setText("");
		txtCorrectivo.setText("");
		txtDia1.setText("");
		txtMes1.setText("");
		txtAno1.setText("");
		txtDia2.setText("");
		txtMes2.setText("");
		txtAno2.setText("");
		txtResponsableEjecucion.setText("");
		txtLubricacion.setText("");
		txtElectrico.setText("");
		txtMecanico.setText("");
		txtInstrumentacion.setText("");
		txtOtro.setText("");
		txtNumeroOrden.setText("");
		txtEquipo.setText("");
		txtCodigoB.setText("");
		txtFichaTecnica.setText("");
		txtHojaVida.setText("");
		txtCodigoA.setText("");
		txtFecha.setText("");
		txtVersion.setText("");
		txtPagina.setText("");
		txtCodigo1.setText("");
		txtCodigo2.setText("");
		txtCodigo3.setText("");
		txtCodigo4.setText("");
		txtCodigo5.setText("");
		txtCodigo6.setText("");
		txtCodigo7.setText("");
		txtDescription1.setText("");
		txtDescription2.setText("");
		txtDescription3.setText("");
		txtDescription4.setText("");
		txtDescription5.setText("");
		txtDescription6.setText("");
		txtDescription7.setText("");
		txtHerramientas1.setText("");
		txtHerramientas2.setText("");
		txtHerramientas3.setText("");
		txtHerramientas4.setText("");
		txtHerramientas5.setText("");
		txtHerramientas6.setText("");
		txtHerramientas7.setText("");
		txtMateriales1.setText("");
		txtMateriales2.setText("");
		txtMateriales3.setText("");
		txtMateriales4.setText("");
		txtMateriales5.setText("");
		txtMateriales6.setText("");
		txtRepuestos1.setText("");
		txtRepuestos2.setText("");
		txtRepuestos3.setText("");
		txtRepuestos4.setText("");
		txtRepuestos5.setText("");
		txtRepuestos6.setText("");
		txtRepuestos7.setText("");
		txtHoras1.setText("");
		txtHoras2.setText("");
		txtHoras3.setText("");
		txtHoras4.setText("");
		txtHoras5.setText("");
		txtHoras6.setText("");
		txtHoras7.setText("");
		txtObservaciones1.setText("");
		txtObservaciones2.setText("");
		txtObservaciones3.setText("");
		txtObservaciones4.setText("");
		txtObservaciones5.setText("");
		txtObservaciones6.setText("");
		txtObservaciones7.setText("");
		txtEntregadoPor.setText("");
		txtRecibidoPor.setText("");
		txtAprobadoPorA.setText("");
		txtSupervisadoPor.setText("");
		txtElaboradoPor.setText("");
		txtRevisadoPor.setText("");
		txtAprobadoPorB.setText("");
		txtMateriales7.setText("");

	}

	
	
	private boolean isDataComplete() {

		if(     txtPreventivo.getText().isEmpty() ||
				txtCorrectivo.getText().isEmpty() ||
				txtDia1.getText().isEmpty() ||
				txtMes1.getText().isEmpty() ||
				txtAno1.getText().isEmpty() ||
				txtDia2.getText().isEmpty() ||
				txtMes2.getText().isEmpty() ||
				txtAno2.getText().isEmpty() ||
				txtResponsableEjecucion.getText().isEmpty() ||
				txtLubricacion.getText().isEmpty() ||
				txtElectrico.getText().isEmpty() ||
				txtMecanico.getText().isEmpty() ||
				txtInstrumentacion.getText().isEmpty() ||
				txtOtro.getText().isEmpty() ||
				txtNumeroOrden.getText().isEmpty() ||
				txtEquipo.getText().isEmpty() ||
				txtCodigoB.getText().isEmpty() ||
				txtFichaTecnica.getText().isEmpty() ||
				txtHojaVida.getText().isEmpty() ||
				txtCodigoA.getText().isEmpty() ||
				txtFecha.getText().isEmpty() ||
				txtVersion.getText().isEmpty() ||
				txtPagina.getText().isEmpty() ||
				txtEntregadoPor.getText().isEmpty() ||
				txtRecibidoPor.getText().isEmpty() ||
				txtAprobadoPorA.getText().isEmpty() ||
				txtSupervisadoPor.getText().isEmpty() ||
				txtElaboradoPor.getText().isEmpty() ||
				txtRevisadoPor.getText().isEmpty() ||
				txtAprobadoPorB.getText().isEmpty()) {
			
			return false;
		}

		return true;
	}
}
