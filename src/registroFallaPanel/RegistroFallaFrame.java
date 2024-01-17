package registroFallaPanel;

import java.awt.Dimension;
import javax.swing.JPanel;
import views.FrameModel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;

import components.Constants;

import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Cursor;




public class RegistroFallaFrame extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JTextField txtRequiereParada;
	private JTextField txtDia2;
	private JTextField txtMes2;
	private JTextField txtAno2;
	private JTextField txtDia3;
	private JTextField txtMes3;
	private JTextField txtAno3;
	private JTextField txtNombreSolicitante;
	private JTextField txtNombreReceptor;
	private JTextField txtElaboradoPor;
	private JTextField txtRecibidoPor;
	private JTextField txtAprobadoPor;
	private JTextField txtDano;
	private JTextField txtFalla;
	private JTextField txtAveria;
	private JTextField txtOtra;
	private JTextField txtDia1;
	private JTextField txtMes1;
	private JTextField txtAno1;
	private JTextField txtNumeroSolucitud;
	private JTextField txtEquipo;
	private JTextField txtCodigoB;
	private JTextField txtFichaTecnica;
	private JTextField txtHojaVida;
	private JTextField txtCodigoA;
	private JTextField txtFecha;
	private JTextField txtVersion;
	private JTextField txtPagina;
	private JPanel printPanel;


	public RegistroFallaFrame(JPanel parent) {
		super(parent, "Regristro de Fallas", true);
		setAlwaysOnTop(false);
		Dimension pSize = new  Dimension(1150, 600);
		setSize(pSize);
		
		printPanel = new JPanel();
		printPanel.setBackground(Color.WHITE);
		printPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(printPanel, BorderLayout.WEST);
		printPanel.setLayout(new MigLayout("insets 0, gap 0", "[grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill]", "[][][][][][fill][][][][][][::50px,grow][][::50px,grow][][::50px,grow][][][][][][][][]"));
		
		JLabel lblRegistroDeFalla = new JLabel("Registro de Falla");
		lblRegistroDeFalla.setBackground(Constants.getSurfaceColorB());
		lblRegistroDeFalla.setOpaque(true);
		lblRegistroDeFalla.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblRegistroDeFalla.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegistroDeFalla.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroDeFalla.setForeground(Color.WHITE);
		printPanel.add(lblRegistroDeFalla, "cell 0 0 14 4,grow");
		
		JLabel lblCdigo_1 = new JLabel("Código:");
		lblCdigo_1.setBackground(Constants.getSurfaceColor());
		lblCdigo_1.setOpaque(true);
		lblCdigo_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblCdigo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo_1.setForeground(Color.WHITE);
		printPanel.add(lblCdigo_1, "cell 14 0,alignx left,growy");
		
		txtCodigoA = new JTextField();
		txtCodigoA.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(64, 64, 64)));
		txtCodigoA.setColumns(10);
		printPanel.add(txtCodigoA, "cell 15 0 2 1,grow");
		
		JLabel lblFecha_1 = new JLabel("Fecha:");
		lblFecha_1.setBackground(Constants.getSurfaceColor());
		lblFecha_1.setOpaque(true);
		lblFecha_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblFecha_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha_1.setForeground(Color.WHITE);
		printPanel.add(lblFecha_1, "cell 14 1,alignx left,growy");
		
		txtFecha = new JTextField();
		txtFecha.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtFecha.setColumns(10);
		printPanel.add(txtFecha, "cell 15 1 2 1,grow");
		
		JLabel lblVersin = new JLabel("Versión:");
		lblVersin.setBackground(Constants.getSurfaceColor());
		lblVersin.setOpaque(true);
		lblVersin.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblVersin.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersin.setForeground(Color.WHITE);
		printPanel.add(lblVersin, "cell 14 2,alignx left,growy");
		
		txtVersion = new JTextField();
		txtVersion.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtVersion.setColumns(10);
		printPanel.add(txtVersion, "cell 15 2 2 1,grow");
		
		JLabel lblPgina = new JLabel("Página:");
		lblPgina.setBackground(Constants.getSurfaceColor());
		lblPgina.setOpaque(true);
		lblPgina.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblPgina.setHorizontalAlignment(SwingConstants.CENTER);
		lblPgina.setForeground(Color.WHITE);
		printPanel.add(lblPgina, "cell 14 3,alignx left,growy");
		
		txtPagina = new JTextField();
		txtPagina.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtPagina.setColumns(10);
		printPanel.add(txtPagina, "cell 15 3 2 1,grow");
		
		JLabel lblDatosDelEquipo = new JLabel("DATOS DEL EQUIPO");
		lblDatosDelEquipo.setBackground(Constants.getSurfaceColor());
		lblDatosDelEquipo.setOpaque(true);
		lblDatosDelEquipo.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblDatosDelEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDelEquipo.setForeground(Color.WHITE);
		printPanel.add(lblDatosDelEquipo, "cell 0 4 17 1,grow");
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBackground(Constants.getSurfaceColorB());
		lblFecha.setOpaque(true);
		lblFecha.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setForeground(Color.WHITE);
		printPanel.add(lblFecha, "cell 0 5 3 1,grow");
		
		JLabel lblNDeSolicitud = new JLabel("N° de Solicitud");
		lblNDeSolicitud.setBackground(Constants.getSurfaceColorB());
		lblNDeSolicitud.setOpaque(true);
		lblNDeSolicitud.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNDeSolicitud.setHorizontalAlignment(SwingConstants.CENTER);
		lblNDeSolicitud.setForeground(Color.WHITE);
		printPanel.add(lblNDeSolicitud, "cell 3 5 2 2,grow");
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBackground(Constants.getSurfaceColorB());
		lblEquipo.setOpaque(true);
		lblEquipo.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo.setForeground(Color.WHITE);
		printPanel.add(lblEquipo, "cell 5 5 2 2,grow");
		
		JLabel lblCdigo = new JLabel("Código");
		lblCdigo.setBackground(Constants.getSurfaceColorB());
		lblCdigo.setOpaque(true);
		lblCdigo.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblCdigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo.setForeground(Color.WHITE);
		printPanel.add(lblCdigo, "cell 7 5 2 2,grow");
		
		JLabel lblFichaTcnica = new JLabel("Ficha Técnica");
		lblFichaTcnica.setBackground(Constants.getSurfaceColorB());
		lblFichaTcnica.setOpaque(true);
		lblFichaTcnica.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblFichaTcnica.setHorizontalAlignment(SwingConstants.CENTER);
		lblFichaTcnica.setForeground(Color.WHITE);
		printPanel.add(lblFichaTcnica, "cell 9 5 2 2,grow");
		
		JLabel lblHojaDeVida = new JLabel("Hoja de Vida");
		lblHojaDeVida.setBackground(Constants.getSurfaceColorB());
		lblHojaDeVida.setOpaque(true);
		lblHojaDeVida.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblHojaDeVida.setHorizontalAlignment(SwingConstants.CENTER);
		lblHojaDeVida.setForeground(Color.WHITE);
		printPanel.add(lblHojaDeVida, "cell 11 5 6 2,grow");
		
		JLabel lblD_2 = new JLabel("D");
		lblD_2.setBackground(Constants.getSurfaceColorB());
		lblD_2.setOpaque(true);
		lblD_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblD_2.setForeground(Color.WHITE);
		lblD_2.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(64, 64, 64)));
		printPanel.add(lblD_2, "cell 0 6,grow");
		
		JLabel lblM_2 = new JLabel("M");
		lblM_2.setBackground(Constants.getSurfaceColorB());
		lblM_2.setOpaque(true);
		lblM_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblM_2.setForeground(Color.WHITE);
		lblM_2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		printPanel.add(lblM_2, "cell 1 6,grow");
		
		JLabel lblA_2 = new JLabel("A");
		lblA_2.setBackground(Constants.getSurfaceColorB());
		lblA_2.setOpaque(true);
		lblA_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblA_2.setForeground(Color.WHITE);
		lblA_2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		printPanel.add(lblA_2, "cell 2 6,grow");
		
		txtDia1 = new JTextField();
		txtDia1.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(64, 64, 64)));
		txtDia1.setColumns(10);
		printPanel.add(txtDia1, "cell 0 7,grow");
		
		txtMes1 = new JTextField();
		txtMes1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtMes1.setColumns(10);
		printPanel.add(txtMes1, "cell 1 7,grow");
		
		txtAno1 = new JTextField();
		txtAno1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtAno1.setColumns(10);
		printPanel.add(txtAno1, "cell 2 7,grow");
		
		txtNumeroSolucitud = new JTextField();
		txtNumeroSolucitud.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtNumeroSolucitud.setColumns(10);
		printPanel.add(txtNumeroSolucitud, "cell 3 7 2 1,grow");
		
		txtEquipo = new JTextField();
		txtEquipo.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtEquipo.setColumns(10);
		printPanel.add(txtEquipo, "cell 5 7 2 1,grow");
		
		txtCodigoB = new JTextField();
		txtCodigoB.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtCodigoB.setColumns(10);
		printPanel.add(txtCodigoB, "cell 7 7 2 1,grow");
		
		txtFichaTecnica = new JTextField();
		txtFichaTecnica.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtFichaTecnica.setColumns(10);
		printPanel.add(txtFichaTecnica, "cell 9 7 2 1,grow");
		
		txtHojaVida = new JTextField();
		txtHojaVida.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtHojaVida.setColumns(10);
		printPanel.add(txtHojaVida, "cell 11 7 6 1,grow");
		
		JLabel lblMotivoDeSolicitud = new JLabel("Motivo de solicitud");
		lblMotivoDeSolicitud.setBackground(Constants.getSurfaceColor());
		lblMotivoDeSolicitud.setOpaque(true);
		lblMotivoDeSolicitud.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblMotivoDeSolicitud.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotivoDeSolicitud.setForeground(Color.WHITE);
		printPanel.add(lblMotivoDeSolicitud, "cell 0 8 17 1,grow");
		
		JLabel lblDao = new JLabel("Daño");
		lblDao.setBackground(Constants.getSurfaceColor());
		lblDao.setOpaque(true);
		lblDao.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblDao.setHorizontalAlignment(SwingConstants.CENTER);
		lblDao.setForeground(Color.WHITE);
		printPanel.add(lblDao, "cell 0 9 5 1,grow");
		
		JLabel lblFalla = new JLabel("Falla");
		lblFalla.setBackground(Constants.getSurfaceColor());
		lblFalla.setOpaque(true);
		lblFalla.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblFalla.setHorizontalAlignment(SwingConstants.CENTER);
		lblFalla.setForeground(Color.WHITE);
		printPanel.add(lblFalla, "cell 5 9 4 1,grow");
		
		JLabel lblAvera = new JLabel("Avería");
		lblAvera.setBackground(Constants.getSurfaceColor());
		lblAvera.setOpaque(true);
		lblAvera.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblAvera.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvera.setForeground(Color.WHITE);
		printPanel.add(lblAvera, "cell 9 9 4 1,grow");
		
		JLabel lblOtra = new JLabel("Otra");
		lblOtra.setBackground(Constants.getSurfaceColor());
		lblOtra.setOpaque(true);
		lblOtra.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblOtra.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtra.setForeground(Color.WHITE);
		printPanel.add(lblOtra, "cell 13 9 4 1,grow");
		
		txtDano = new JTextField();
		txtDano.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		txtDano.setColumns(10);
		printPanel.add(txtDano, "cell 0 10 5 1,growx");
		
		txtFalla = new JTextField();
		txtFalla.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtFalla.setColumns(10);
		printPanel.add(txtFalla, "cell 5 10 4 1,growx");
		
		txtAveria = new JTextField();
		txtAveria.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtAveria.setColumns(10);
		printPanel.add(txtAveria, "cell 9 10 4 1,growx");
		
		txtOtra = new JTextField();
		txtOtra.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtOtra.setColumns(10);
		printPanel.add(txtOtra, "cell 13 10 4 1,growx");
		
		JEditorPane txtDetalleMotivo = new JEditorPane();
		txtDetalleMotivo.setMaximumSize(new Dimension(2147483647, 30000000));
		txtDetalleMotivo.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(64, 64, 64)), "Detalle del Motivo: ", TitledBorder.LEADING, TitledBorder.BELOW_TOP, null, new Color(64, 64, 64)));
		printPanel.add(txtDetalleMotivo, "cell 0 11 17 2,grow");
		
		JEditorPane txtAnalisisCausas = new JEditorPane();
		txtAnalisisCausas.setMaximumSize(new Dimension(2147483647, 30000000));
		txtAnalisisCausas.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(64, 64, 64)), "An\u00E1lisis de las causas del motivo:", TitledBorder.LEADING, TitledBorder.BELOW_TOP, null, new Color(64, 64, 64)));
		printPanel.add(txtAnalisisCausas, "cell 0 13 17 2,grow");
		
		JEditorPane txtObservaciones = new JEditorPane();
		txtObservaciones.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(64, 64, 64)), "Observaciones: ", TitledBorder.LEADING, TitledBorder.BELOW_TOP, null, new Color(64, 64, 64)));
		txtObservaciones.setMaximumSize(new Dimension(2147483647, 30000000));
		printPanel.add(txtObservaciones, "cell 0 15 17 2,grow");
		
		JLabel lblNewLabel = new JLabel("Requiere parada");
		lblNewLabel.setBackground(new Color(70, 130, 180));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		printPanel.add(lblNewLabel, "cell 0 17 5 2,grow");
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de Parada");
		lblNewLabel_1.setBackground(new Color(70, 130, 180));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(64, 64, 64)));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		printPanel.add(lblNewLabel_1, "cell 5 17 6 1,grow");
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha de Arranque");
		lblNewLabel_1_1.setBackground(new Color(70, 130, 180));
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(64, 64, 64)));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		printPanel.add(lblNewLabel_1_1, "cell 11 17 6 1,grow");
		
		JLabel lblD = new JLabel("D");
		lblD.setBackground(new Color(70, 130, 180));
		lblD.setOpaque(true);
		lblD.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setForeground(Color.WHITE);
		printPanel.add(lblD, "cell 5 18 2 1,grow");
		
		JLabel lblM = new JLabel("M");
		lblM.setBackground(new Color(70, 130, 180));
		lblM.setOpaque(true);
		lblM.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setForeground(Color.WHITE);
		printPanel.add(lblM, "cell 7 18 2 1,grow");
		
		JLabel lblA = new JLabel("A");
		lblA.setBackground(new Color(70, 130, 180));
		lblA.setOpaque(true);
		lblA.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setForeground(Color.WHITE);
		printPanel.add(lblA, "cell 9 18 2 1,grow");
		
		JLabel lblD_1 = new JLabel("D");
		lblD_1.setBackground(new Color(70, 130, 180));
		lblD_1.setOpaque(true);
		lblD_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblD_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblD_1.setForeground(Color.WHITE);
		printPanel.add(lblD_1, "cell 11 18 2 1,grow");
		
		JLabel lblM_1 = new JLabel("M");
		lblM_1.setBackground(new Color(70, 130, 180));
		lblM_1.setOpaque(true);
		lblM_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblM_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblM_1.setForeground(Color.WHITE);
		printPanel.add(lblM_1, "cell 13 18 2 1,grow");
		
		JLabel lblA_1 = new JLabel("A");
		lblA_1.setBackground(new Color(70, 130, 180));
		lblA_1.setOpaque(true);
		lblA_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblA_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblA_1.setForeground(Color.WHITE);
		printPanel.add(lblA_1, "cell 15 18 2 1,grow");
		
		txtRequiereParada = new JTextField();
		txtRequiereParada.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		printPanel.add(txtRequiereParada, "cell 0 19 5 1,grow");
		txtRequiereParada.setColumns(10);
		
		txtDia2 = new JTextField();
		txtDia2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtDia2.setColumns(10);
		printPanel.add(txtDia2, "cell 5 19 2 1,grow");
		
		txtMes2 = new JTextField();
		txtMes2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtMes2.setColumns(10);
		printPanel.add(txtMes2, "cell 7 19 2 1,grow");
		
		txtAno2 = new JTextField();
		txtAno2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtAno2.setColumns(10);
		printPanel.add(txtAno2, "cell 9 19 2 1,grow");
		
		txtDia3 = new JTextField();
		txtDia3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtDia3.setColumns(10);
		printPanel.add(txtDia3, "cell 11 19 2 1,grow");
		
		txtMes3 = new JTextField();
		txtMes3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtMes3.setColumns(10);
		printPanel.add(txtMes3, "cell 13 19 2 1,grow");
		
		txtAno3 = new JTextField();
		txtAno3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtAno3.setColumns(10);
		printPanel.add(txtAno3, "cell 15 19 2 1,grow");
		
		JLabel lblRequiereParada = new JLabel("NOMBRE Y APELLIDO DEL SOLICITANTE");
		lblRequiereParada.setBackground(Constants.getSurfaceColor());
		lblRequiereParada.setOpaque(true);
		lblRequiereParada.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblRequiereParada.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequiereParada.setForeground(Color.WHITE);
		printPanel.add(lblRequiereParada, "cell 0 20 9 1,grow");
		
		JLabel lblRequiereParada_1 = new JLabel("NOMBRE Y APELLIDO DEL RECEPTOR");
		lblRequiereParada_1.setBackground(Constants.getSurfaceColor());
		lblRequiereParada_1.setOpaque(true);
		lblRequiereParada_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblRequiereParada_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequiereParada_1.setForeground(Color.WHITE);
		printPanel.add(lblRequiereParada_1, "cell 9 20 8 1,grow");
		
		txtNombreSolicitante = new JTextField();
		txtNombreSolicitante.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		txtNombreSolicitante.setColumns(10);
		printPanel.add(txtNombreSolicitante, "cell 0 21 9 1,grow");
		
		txtNombreReceptor = new JTextField();
		txtNombreReceptor.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtNombreReceptor.setColumns(10);
		printPanel.add(txtNombreReceptor, "cell 9 21 8 1,grow");
		
		JLabel lblNewLabel_1_2 = new JLabel("Elaborado por: ");
		lblNewLabel_1_2.setBackground(Constants.getSurfaceColor());
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		printPanel.add(lblNewLabel_1_2, "cell 0 22 7 1,grow");
		
		JLabel lblNewLabel_1_3 = new JLabel("Revisado por:");
		lblNewLabel_1_3.setBackground(Constants.getSurfaceColor());
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		printPanel.add(lblNewLabel_1_3, "cell 7 22 5 1,grow");
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Aprobado por:");
		lblNewLabel_1_3_1.setBackground(Constants.getSurfaceColor());
		lblNewLabel_1_3_1.setOpaque(true);
		lblNewLabel_1_3_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		printPanel.add(lblNewLabel_1_3_1, "cell 12 22 5 1,grow");
		
		txtElaboradoPor = new JTextField();
		txtElaboradoPor.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.DARK_GRAY));
		txtElaboradoPor.setColumns(10);
		printPanel.add(txtElaboradoPor, "cell 0 23 7 1,grow");
		
		txtRecibidoPor = new JTextField();
		txtRecibidoPor.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtRecibidoPor.setColumns(10);
		printPanel.add(txtRecibidoPor, "cell 7 23 5 1,grow");
		
		txtAprobadoPor = new JTextField();
		txtAprobadoPor.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		txtAprobadoPor.setColumns(10);
		printPanel.add(txtAprobadoPor, "cell 12 23 5 1,grow");
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("Guardar");
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setIcon(new ImageIcon(RegistroFallaFrame.class.getResource("/assets/save.png")));
		panel.add(lblNewLabel_2);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setToolTipText("Imprimir");
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.setIcon(new ImageIcon(RegistroFallaFrame.class.getResource("/assets/print2.png")));
		panel.add(lblNewLabel_3);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setToolTipText("Limpiar Formulario");
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setIcon(new ImageIcon(RegistroFallaFrame.class.getResource("/assets/clean.png")));
		panel.add(lblNewLabel_4);
		
		
			
	}

	public JPanel getPrintPanel() {
		return printPanel;
	}
	
}
