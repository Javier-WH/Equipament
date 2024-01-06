package views;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import components.Constants;
import panels.CompresorAxial;
import panels.CompresorDeProceso;
import panels.ProductorDeGas;
import panels.TurbinaYpotencia;
import panels.TurboCompresoraN1;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Component;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SwingConstants;





public class EquipamentsFrame extends FrameModel {

	private static final long serialVersionUID = 1L;
	JTabbedPane tabbedPane = null;

	public EquipamentsFrame(JPanel parent) {
		super(parent, "Equipos");
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		UIManager.put("TabbedPane.selected", Constants.getMainColor());
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//limpia el color de letra de los tabs
				for (int i = 0; i < tabbedPane.getTabCount(); i++) {
					tabbedPane.setForegroundAt(i, Constants.getTextColor());
				}

				int index = tabbedPane.getSelectedIndex();
				tabbedPane.setForegroundAt(index, Constants.getSurfaceColor());
			}
		});
		tabbedPane.setBackground(Constants.getSurfaceColor());
		tabbedPane.setForeground(Constants.getTextColor());
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel descriptionPanel = new JPanel();
		descriptionPanel.setBorder(null);
		descriptionPanel.setBackground(Constants.getSurfaceColor());
		tabbedPane.addTab("Descripción del equipo", null, descriptionPanel, null);
		descriptionPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBackground(Constants.getSurfaceColor());
		
	
		descriptionPanel.add(scrollPane, BorderLayout.CENTER);
		
		JTextPane txtDescription = new JTextPane();
		txtDescription.setBorder(new EmptyBorder(5, 10, 0, 10));
		
		txtDescription.setBackground(Constants.getSurfaceColor());
		txtDescription.setForeground(Constants.getTextColor());
		txtDescription.setEditable(false);
		txtDescription.setText("\tEl  Turbocompresor Marca Solar, Modelo Centauro 40  trabaja a 15500 rpm (revoluciones por minuto) a una potencia de 4500 hp manejando un volumen de gas de 200 MMPCND (millones de pies cúbicos normales diarios), un compresor centrifugo de gas y una consola de control todos ellos instalados sobre un patín. \r\n\r\n\tLa turbina industrial CENTAURO de dos ejes, es un actuador primario auto contenido y completamente integrado; lo cual está compuesta por tres secciones funcionales básica: el compresor, el combustor y la turbina de potencia. \r\n\r\n\tLa turbina a gas produce aire comprimido en la sección de compresión, combustión dentro de la cámara de combustión y potencia en la sección de la turbina. El diseño Aero térmico de flujo axial de la sección de comprensión contribuye a incrementar la eficiencia. \r\nCabe destacar que, la sección de la turbina de potencia es mecánicamente independiente de la sección del productor de gas permitiendo así un amplio rango de velocidades a fuerza completa y mejor economía a carga parcial. Las primeras dos etapas de la configuración es llamada la turbina del productor de gas e impulsan a la sección de compresión y equipos auxiliares como bombas, entre otros.\r\n\r\n\tDe modo que, la energía remanente es absorbida por la turbina de potencia para dar vuelta al eje de salida; la velocidad del productor de gas está asociada al nivel de fuerza de la turbina.  En consecuencia, se utiliza un control de velocidad en el eje del productor de gas para controlar el nivel de fuerza, ya que la velocidad de la turbina depende únicamente de la carga aplicada, la misma es protegida contra sobre velocidad por un gobernador de tope y luego un (01) interruptor de tope, en el caso que la carga sea removido. Se usa un enfriamiento en la sección de la turbina para que las temperaturas del metal permanezcan a niveles conservadores.\r\n\r\n\tEstas temperaturas bajas del metal son posibles por el uso de aire de enfriamiento y prolongan la vida útil de la sección de la turbina; el compresor Centrífugo 35 del gas de proceso está alineado y acoplado a la turbina gasógeno (posicionado por clavijas) y produce comprensión mediante la aplicación de fuerzas inerciales al gas, las cuales se transmiten por medio de un impulsor o impelente (una serie de aletas en una rueda giratoria) el cual mediante movimiento centrífugo dinámico, agrega energía de velocidad al acelerar el gas. Este fluye del impulsor hacia un difusor donde se desacelera y la energía de velocidad se transforma en energía de presión. \r\n\r\n\tLa combinación de álabe guía de admisión, impelente y difusor (o estator) se denomina “etapa”, una sola etapa centrífuga tiene relativamente baja capacidad para aumentar la presión, por lo que los compresores de la Planta Compresora  Altagracia están provistos de tres (03) etapas en serie cada uno. \r\n\r\n\tEl flujo del compresor puede controlarse o variarse modificando la presión diferencial a través del compresor o al cambiar el nivel de potencia a la máquina (que depende de la velocidad del productor de gas). Si la presión o la potencia permanecen constantes mientras se reduce el flujo, se llega a un punto en que la operación estable o pareja del compresor ya no es posible. \r\n\r\n\tEste límite se llama límite de bombeo (surge) y es una característica de todos los compresores de tipo dinámico, es una interacción entre las aletas del impelente y el gas. El gas se vuelve aerodinámicamente inestable, el impulsor no puede entonces proveer la energía requerida para superar la contrapresión en el sistema y se produce una inversión momentánea de flujo.\r\n\r\n\tEste proceso se hace cíclico en toda la gama de frecuencias y amplitudes provocando altas temperaturas y severos daños a la máquina. Para evitar esta contingencia, el paquete está dotado de un “Sistema de Recirculación” que evita el funcionamiento del compresor en este estado de bombeo. \r\n\r\n\tAntes de la succión y después de la descarga del compresor centrífugo, cada paquete está dotado de un “patín de válvulas y tuberías” compuesto por: válvula de succión por la cual entra el gas desde la cámara “U” y permite el aislamiento de la máquina de dicha instalación. \r\n\r\n\tExiste además otra válvula en serie con la anterior y no está interconectada con la lógica de arranque/parada de la máquina. Luego se dispone de un desvío de la válvula de succión denominado válvula de carga y se utiliza para purgar el aire que pudiera introducirse al compresor durante la parada anterior, así como también, para presurizar las tuberías y el compresor del proceso. Posee una válvula de descarga que aísla cada compresor de los 36 cabezales de alta y baja presión. \r\n\r\n\tTambién está dotada de una válvula de retención localizada aguas debajo de la descarga del compresor centrífugo, del desvío y del venteo y aguas arriba de la válvula de descarga. Esta válvula de retención impide que el gas del proceso de la Planta fluya en sentido contrario hacia el compresor centrífugo. \r\n\r\n\tExiste en el mismo patín, una válvula de venteo para purgar el aire hacia la línea venteo durante el arranque, así como el gas atrapado durante la parada. Por última contiene una válvula de control, la cual desvía el gas de la descarga hacia la succión y su forma de operación varía durante el arranque, parada y funcionamiento nominal de la turbo-maquinaria.\r\n\r\n\tEl paquete está dotado además, de un intercambiador de calor (enfriado por aire) para bajar la temperatura del gas y un separador para retener cualquier tipo de líquidos (aceite, condensados, entre otros.) propios del proceso. Una vez que el gas es tomado desde la cámara de succión, elevada la presión, enfriado por el intercambiador de calor y depurado por el separador de líquidos, fluye por una tubería  12” para ser descargado en cualquiera de los dos (02) cabezales de descarga (alta o baja presión) de acuerdo a los requerimientos momentáneos de demanda de Los clientes conectados al Sistema de Transmisión");
		txtDescription.setCaretPosition(0);
		scrollPane.setViewportView(txtDescription);
		
		
		
		JLabel lblNewLabel = new JLabel("Turbocompresor Marca Solar, Modelo Centauro 40  ");
		lblNewLabel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
		lblNewLabel.setPreferredSize(new Dimension(247, 30));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Constants.getSurfaceColor());
		lblNewLabel.setForeground(Constants.getTextColor());
		scrollPane.setColumnHeaderView(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(EquipamentsFrame.class.getResource("/assets/Picture1.png")));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Constants.getSurfaceColor());
		scrollPane.setRowHeaderView(lblNewLabel_3);

		JPanel techViewPanel = new JPanel();
		techViewPanel.setBorder(null);
		techViewPanel.setBackground(Constants.getSurfaceColor());
		tabbedPane.addTab("Ficha técica", null, techViewPanel, null);
		techViewPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		techViewPanel.add(scrollPane_1, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 1100));
		panel.setMaximumSize(new Dimension(32767, 10));
		scrollPane_1.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		JPanel workingParamsPanel = new JPanel();
		workingParamsPanel.setBorder(null);
		workingParamsPanel.setBackground(Constants.getSurfaceColor());
		panel.setBackground(Constants.getSurfaceColor());
		panel.add(new TurboCompresoraN1());
		panel.add(Box.createVerticalStrut(20));
		panel.add(new CompresorAxial());
		panel.add(Box.createVerticalStrut(20));
		panel.add(new ProductorDeGas());
		panel.add(Box.createVerticalStrut(20));
		panel.add(new TurbinaYpotencia());
		panel.add(Box.createVerticalStrut(20));
		panel.add(new CompresorDeProceso());
		tabbedPane.addTab("Parámetros de funcionamiento", null, workingParamsPanel, null);
		workingParamsPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		workingParamsPanel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.PAGE_AXIS));
		panel_1.setBackground(Constants.getSurfaceColor());
		
		JLabel lblNewLabel_1 = new JLabel("Parámetros Normales");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Constants.getTextColor());
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Constants.getSurfaceColor());
		panel_2.setForeground(Constants.getTextColor());
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre del equiupo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Constants.getTextColor());
		
		JLabel lblNewLabel_4 = new JLabel("Turbina De Gas N°1");
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(Constants.getTextColor());
		
		Component horizontalStrut = Box.createHorizontalStrut(30);
		panel_2.add(horizontalStrut);
		
		JLabel lblNewLabel_2_1 = new JLabel("Marca:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(Constants.getTextColor());
		
		
		JLabel lblNewLabel_4_1 = new JLabel("Solar");
		panel_2.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setForeground(Constants.getTextColor());
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(30);
		panel_2.add(horizontalStrut_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Modelo:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setForeground(Constants.getTextColor());
		
		
		JLabel lblNewLabel_5 = new JLabel("Centauro 40");
		panel_2.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Constants.getTextColor());
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setMaximumSize(new Dimension(32767, 500));
		scrollPane_2.setBorder(null);
		workingParamsPanel.add(scrollPane_2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setMinimumSize(new Dimension(10, 500));
		panel_3.setMaximumSize(new Dimension(500, 500));
		panel_3.setAlignmentX(Component.LEFT_ALIGNMENT);
		scrollPane_2.setViewportView(panel_3);
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("10dlu"),
				FormSpecs.PREF_COLSPEC,
				ColumnSpec.decode("75px:grow"),
				ColumnSpec.decode("46px:grow"),
				ColumnSpec.decode("75px:grow"),
				ColumnSpec.decode("10px"),},
			new RowSpec[] {
				RowSpec.decode("20dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("30dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),
				RowSpec.decode("15dlu"),}));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setOpaque(true);
		panel_3.add(lblNewLabel_10, "1, 1, fill, fill");
		lblNewLabel_10.setBackground(Constants.getSurfaceColor());
		
		JLabel lblNewLabel_6 = new JLabel("Descripción");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(Constants.getSurfaceColor());
		lblNewLabel_6.setForeground(Constants.getTextColor());
		panel_3.add(lblNewLabel_6, "2, 1, fill, fill");
		
		JLabel lblNewLabel_7 = new JLabel("Alarma");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBackground(Constants.getSurfaceColor());
		lblNewLabel_7.setForeground(Constants.getTextColor());
		panel_3.add(lblNewLabel_7, "3, 1, fill, fill");
		
		JLabel lblNewLabel_8 = new JLabel("Parada");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setBackground(Constants.getSurfaceColor());
		lblNewLabel_8.setForeground(Constants.getTextColor());
		panel_3.add(lblNewLabel_8, "4, 1, fill, fill");
		
		JLabel lblNewLabel_9 = new JLabel("Rangos Normales de operación ");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setBackground(Constants.getSurfaceColor());
		lblNewLabel_9.setForeground(Constants.getTextColor());
		panel_3.add(lblNewLabel_9, "5, 1, fill, fill");
		
		JLabel lblNewLabel_10_1 = new JLabel("");
		lblNewLabel_10_1.setOpaque(true);
		lblNewLabel_10_1.setBackground(Constants.getSurfaceColor());
		panel_3.add(lblNewLabel_10_1, "6, 1, fill, fill");
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15, "1, 2, fill, fill");
		
		JLabel lblNewLabel_11 = new JLabel("Temperatura en la entrada de aire en la turbina");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setForeground(Constants.getSurfaceColor());
		lblNewLabel_11.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_11, "2, 2, fill, fill");
		
		JLabel lblNewLabel_12 = new JLabel("120°F(Baja)");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12, "3, 2, fill, fill");
		
		JLabel lblNewLabel_13 = new JLabel("No Aplica");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13, "4, 2, fill, fill");
		
		JLabel lblNewLabel_14 = new JLabel("75°F a 85°F");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14, "5, 2, fill, fill");
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16, "6, 2, fill, fill");
		
		JLabel lblNewLabel_15_1 = new JLabel("");
		lblNewLabel_15_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_1.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_1.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_1, "1, 3, fill, fill");
		
		JLabel lblNewLabel_12_1 = new JLabel("Temperatura en la descarga de compresor");
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_1.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_1.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_1, "2, 3, fill, fill");
		
		JLabel lblNewLabel_17 = new JLabel("215°F (Baja)");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_17.setForeground(Constants.getSurfaceColor());
		lblNewLabel_17.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_17, "3, 3, fill, fill");
		
		JLabel lblNewLabel_13_1 = new JLabel("220°F(Alta)");
		lblNewLabel_13_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_1.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_1.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_1, "4, 3, fill, fill");
		
		JLabel lblNewLabel_14_1 = new JLabel("115°F a 125°F");
		lblNewLabel_14_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_1.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_1.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_1, "5, 3, fill, fill");
		
		JLabel lblNewLabel_16_1 = new JLabel("");
		lblNewLabel_16_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_1.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_1.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_1, "6, 3, fill, fill");
		
		JLabel lblNewLabel_15_2 = new JLabel("");
		lblNewLabel_15_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_2.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_2.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_2, "1, 4, fill, fill");
		
		JLabel lblNewLabel_12_2 = new JLabel("Temperatura de aceite de lubricante en cabezal ");
		lblNewLabel_12_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_2.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_2.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_2, "2, 4, fill, fill");
		
		JLabel lblNewLabel_18 = new JLabel("170°F ");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18, "3, 4, fill, fill");
		
		JLabel lblNewLabel_13_2 = new JLabel("180°F(Alta)");
		lblNewLabel_13_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_2.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_2.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_2, "4, 4, default, fill");
		
		JLabel lblNewLabel_14_2 = new JLabel("130°F a 150° F");
		lblNewLabel_14_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_2.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_2.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_2, "5, 4, fill, fill");
		
		JLabel lblNewLabel_16_2 = new JLabel("");
		lblNewLabel_16_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_2.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_2.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_2, "6, 4, fill, fill");
		
		JLabel lblNewLabel_15_3 = new JLabel("");
		lblNewLabel_15_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_3.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_3.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_3, "1, 5, fill, fill");
		
		JLabel lblNewLabel_12_3 = new JLabel("Temperatura de aceite de lubricante a la salida de los enfriadores");
		lblNewLabel_12_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_3.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_3.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_3, "2, 5, fill, fill");
		
		JLabel lblNewLabel_18_1 = new JLabel("160°F ");
		lblNewLabel_18_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_1.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_1.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_1, "3, 5, fill, fill");
		
		JLabel lblNewLabel_13_3 = new JLabel("No Aplica");
		lblNewLabel_13_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_3.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_3.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_3, "4, 5, fill, fill");
		
		JLabel lblNewLabel_14_3 = new JLabel("95°F a 110°F");
		lblNewLabel_14_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_3.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_3.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_3, "5, 5, fill, fill");
		
		JLabel lblNewLabel_16_3 = new JLabel("");
		lblNewLabel_16_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_3.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_3.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_3, "6, 5, fill, fill");
		
		JLabel lblNewLabel_15_4 = new JLabel("");
		lblNewLabel_15_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_4.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_4.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_4, "1, 6, fill, fill");
		
		JLabel lblNewLabel_12_4 = new JLabel("Presión de succión del compresor  ");
		lblNewLabel_12_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_4.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_4.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_4, "2, 6, fill, fill");
		
		JLabel lblNewLabel_18_2 = new JLabel("420 PSI ");
		lblNewLabel_18_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_2.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_2.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_2, "3, 6, fill, fill");
		
		JLabel lblNewLabel_13_4 = new JLabel("400 PSI(Baja)");
		lblNewLabel_13_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_4.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_4.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_4, "4, 6, default, fill");
		
		JLabel lblNewLabel_14_4 = new JLabel("480 PSI a 600 PSI");
		lblNewLabel_14_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_4.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_4.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_4, "5, 6, default, fill");
		
		JLabel lblNewLabel_16_4 = new JLabel("");
		lblNewLabel_16_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_4.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_4.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_4, "6, 6, fill, fill");
		
		JLabel lblNewLabel_15_5 = new JLabel("");
		lblNewLabel_15_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_5.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_5.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_5, "1, 7, fill, fill");
		
		JLabel lblNewLabel_12_5 = new JLabel("Presión de descarga del compresor");
		lblNewLabel_12_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_5.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_5.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_5, "2, 7, default, fill");
		
		JLabel lblNewLabel_18_3 = new JLabel("980 PSI (Alta)");
		lblNewLabel_18_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_3.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_3.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_3, "3, 7, fill, fill");
		
		JLabel lblNewLabel_13_5 = new JLabel("990 PSI(Alta)");
		lblNewLabel_13_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_5.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_5.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_5, "4, 7, fill, fill");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(64, 64, 64)));
		panel_3.add(panel_4, "5, 7");
		panel_4.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				RowSpec.decode("15dlu:grow"),
				RowSpec.decode("15dlu:grow"),}));
		
		JLabel lblNewLabel_20 = new JLabel("Cámara de alta");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_20.setForeground(Constants.getSurfaceColor());
		lblNewLabel_20.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.add(lblNewLabel_20, "1, 1, fill, fill");
		
		JLabel lblNewLabel_21 = new JLabel("Cámara de baja");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_21.setForeground(Constants.getSurfaceColor());
		lblNewLabel_21.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_4.add(lblNewLabel_21, "2, 1, fill, fill");
		
		JLabel lblNewLabel_19 = new JLabel("650PSI a 800 PSI");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_19.setForeground(Constants.getSurfaceColor());
		lblNewLabel_19.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getSurfaceColor()));
		panel_4.add(lblNewLabel_19, "1, 2, fill, fill");
		
		JLabel lblNewLabel_19_1 = new JLabel("650PSI a 720PSI");
		lblNewLabel_19_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_19_1.setForeground(Constants.getSurfaceColor());
		panel_4.add(lblNewLabel_19_1, "2, 2, default, fill");
		
		JLabel lblNewLabel_16_5 = new JLabel("");
		lblNewLabel_16_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_5.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_5.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_5, "6, 7, fill, fill");
		
		JLabel lblNewLabel_15_6 = new JLabel("");
		lblNewLabel_15_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_6.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_6.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_6, "1, 8, fill, fill");
		
		JLabel lblNewLabel_12_6 = new JLabel("Presión de aceite lubricante");
		lblNewLabel_12_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6, "2, 8, default, fill");
		
		JLabel lblNewLabel_18_4 = new JLabel("41 PSI ");
		lblNewLabel_18_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_4.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_4.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_4, "3, 8, fill, fill");
		
		JLabel lblNewLabel_13_6 = new JLabel("25 PSI (Baja)");
		lblNewLabel_13_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_6.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_6.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_6, "4, 8, default, fill");
		
		JLabel lblNewLabel_14_6 = new JLabel("50 PSI a 60PSI");
		lblNewLabel_14_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_6.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_6.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_6, "5, 8, default, fill");
		
		JLabel lblNewLabel_16_6 = new JLabel("");
		lblNewLabel_16_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_6.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_6.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_6, "6, 8, fill, fill");
		
		JLabel lblNewLabel_15_7 = new JLabel("");
		lblNewLabel_15_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_7.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_7.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_7, "1, 9, fill, fill");
		
		JLabel lblNewLabel_12_6_1 = new JLabel("Presión de gas combustible ");
		lblNewLabel_12_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_1.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_1.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_1, "2, 9, default, fill");
		
		JLabel lblNewLabel_18_5 = new JLabel("200 PSI(Alta)");
		lblNewLabel_18_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_5.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_5.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_5, "3, 9, fill, fill");
		
		JLabel lblNewLabel_13_7 = new JLabel("205 PSI (Alta)");
		lblNewLabel_13_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_7.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_7.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_7, "4, 9, default, fill");
		
		JLabel lblNewLabel_14_7 = new JLabel("175 PSI a 185 PSI");
		lblNewLabel_14_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_7.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_7.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_7, "5, 9, default, fill");
		
		JLabel lblNewLabel_16_7 = new JLabel("");
		lblNewLabel_16_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_7.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_7.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_7, "6, 9, fill, fill");
		
		JLabel lblNewLabel_15_8 = new JLabel("");
		lblNewLabel_15_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_8.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_8.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_8, "1, 10, fill, fill");
		
		JLabel lblNewLabel_12_6_2 = new JLabel("Presión de gas combustible ");
		lblNewLabel_12_6_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_2.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_2.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_2, "2, 10, default, fill");
		
		JLabel lblNewLabel_18_6 = new JLabel("160PSI (Baja)");
		lblNewLabel_18_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_6.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_6.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_6, "3, 10, fill, fill");
		
		JLabel lblNewLabel_13_8 = new JLabel("155 PSI (Baja)");
		lblNewLabel_13_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_8.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_8.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_8, "4, 10, default, fill");
		
		JLabel lblNewLabel_14_8 = new JLabel("175 PSI a 185 PSI");
		lblNewLabel_14_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_8.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_8.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_8, "5, 10, fill, fill");
		
		JLabel lblNewLabel_16_8 = new JLabel("");
		lblNewLabel_16_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_8.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_8.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_8, "6, 10, fill, fill");
		
		JLabel lblNewLabel_15_9 = new JLabel("");
		lblNewLabel_15_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_9.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_9.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_9, "1, 11, fill, fill");
		
		JLabel lblNewLabel_12_6_3 = new JLabel("Presión diferencial de gas Buffer");
		lblNewLabel_12_6_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_3.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_3.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_3, "2, 11, default, fill");
		
		JLabel lblNewLabel_18_7 = new JLabel("7 PSID (Baja)");
		lblNewLabel_18_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_7.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_7.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_7, "3, 11, fill, fill");
		
		JLabel lblNewLabel_13_9 = new JLabel("4 PSID (Baja)");
		lblNewLabel_13_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_9.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_9.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_9, "4, 11, default, fill");
		
		JLabel lblNewLabel_14_9 = new JLabel("15 PSID a 25 PSID");
		lblNewLabel_14_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_9.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_9.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_9, "5, 11, default, fill");
		
		JLabel lblNewLabel_16_9 = new JLabel("");
		lblNewLabel_16_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_9.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_9.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_9, "6, 11, fill, fill");
		
		JLabel lblNewLabel_15_10 = new JLabel("");
		lblNewLabel_15_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_10.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_10.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_10, "1, 12, fill, fill");
		
		JLabel lblNewLabel_12_6_4 = new JLabel("Presión diferencial de aceite sellos");
		lblNewLabel_12_6_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_4.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_4.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_4, "2, 12, default, fill");
		
		JLabel lblNewLabel_18_8 = new JLabel("7  PSID (Baja)");
		lblNewLabel_18_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_8.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_8.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_8, "3, 12, fill, fill");
		
		JLabel lblNewLabel_13_10 = new JLabel("8  Pulgadas. H2O (Alta)");
		lblNewLabel_13_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_10.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_10.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_10, "4, 12, default, fill");
		
		JLabel lblNewLabel_14_10 = new JLabel("0  Pulgadas. H2O a  3 Pulgadas. H2O");
		lblNewLabel_14_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_10.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_10.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_10, "5, 12, default, fill");
		
		JLabel lblNewLabel_16_10 = new JLabel("");
		lblNewLabel_16_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10, "6, 12, fill, fill");
		
		JLabel lblNewLabel_15_11 = new JLabel("");
		lblNewLabel_15_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_11.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_11.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_11, "1, 13, fill, fill");
		
		JLabel lblNewLabel_12_6_5 = new JLabel("Presión diferencial en el filtro aceite-sello");
		lblNewLabel_12_6_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_5.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_5.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_5, "2, 13, default, fill");
		
		JLabel lblNewLabel_18_9 = new JLabel("50 PSID (Alta)");
		lblNewLabel_18_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_9.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_9.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_9, "3, 13, fill, fill");
		
		JLabel lblNewLabel_13_11 = new JLabel("No Aplica ");
		lblNewLabel_13_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_11.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_11.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_11, "4, 13, default, fill");
		
		JLabel lblNewLabel_14_11 = new JLabel("0 PSID a 15 PSID");
		lblNewLabel_14_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_11.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_11.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_11, "5, 13, default, fill");
		
		JLabel lblNewLabel_16_10_1 = new JLabel("");
		lblNewLabel_16_10_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10_1.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10_1.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10_1, "6, 13, fill, fill");
		
		JLabel lblNewLabel_15_12 = new JLabel("");
		lblNewLabel_15_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_12.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_12.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_12, "1, 14, fill, fill");
		
		JLabel lblNewLabel_12_6_6 = new JLabel("Presión diferencial en el filtro de aceite lubricante");
		lblNewLabel_12_6_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_6.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_6.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_6, "2, 14, default, fill");
		
		JLabel lblNewLabel_18_10 = new JLabel("30 PSID (Alta)");
		lblNewLabel_18_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_10.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_10.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_10, "3, 14, fill, fill");
		
		JLabel lblNewLabel_13_12 = new JLabel("No Aplica");
		lblNewLabel_13_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_12.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_12.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_12, "4, 14, default, fill");
		
		JLabel lblNewLabel_14_12 = new JLabel("0 PSID a 15 PSID");
		lblNewLabel_14_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_12.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_12.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_12, "5, 14, default, fill");
		
		JLabel lblNewLabel_16_10_2 = new JLabel("");
		lblNewLabel_16_10_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10_2.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10_2.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10_2, "6, 14, fill, fill");
		
		JLabel lblNewLabel_15_13 = new JLabel("");
		lblNewLabel_15_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_13.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_13.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_13, "1, 15, fill, fill");
		
		JLabel lblNewLabel_12_6_7 = new JLabel("Velocidad del productor de gas");
		lblNewLabel_12_6_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_7.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_7.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_7, "2, 15, default, fill");
		
		JLabel lblNewLabel_18_11 = new JLabel("No Aplica");
		lblNewLabel_18_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_11.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_11.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_11, "3, 15, fill, fill");
		
		JLabel lblNewLabel_13_13 = new JLabel("102,50% (Alta)");
		lblNewLabel_13_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_13.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_13.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_13, "4, 15, default, fill");
		
		JLabel lblNewLabel_14_13 = new JLabel(" 91% a 100%");
		lblNewLabel_14_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_13.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_13.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_13, "5, 15, default, fill");
		
		JLabel lblNewLabel_16_10_3 = new JLabel("");
		lblNewLabel_16_10_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10_3.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10_3.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10_3, "6, 15, fill, fill");
		
		JLabel lblNewLabel_15_14 = new JLabel("");
		lblNewLabel_15_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_14.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_14.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_14, "1, 16, fill, fill");
		
		JLabel lblNewLabel_12_6_8 = new JLabel("Velocidad turbina de potencia");
		lblNewLabel_12_6_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_8.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_8.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_8, "2, 16, default, fill");
		
		JLabel lblNewLabel_18_12 = new JLabel("No Aplica");
		lblNewLabel_18_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_12.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_12.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_12, "3, 16, fill, fill");
		
		JLabel lblNewLabel_13_14 = new JLabel("106.00% (Alta)");
		lblNewLabel_13_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_14.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_14.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_14, "4, 16, default, fill");
		
		JLabel lblNewLabel_14_14 = new JLabel("70% a 80%");
		lblNewLabel_14_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_14.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_14.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_14, "5, 16, default, fill");
		
		JLabel lblNewLabel_16_10_4 = new JLabel("");
		lblNewLabel_16_10_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10_4.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10_4.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10_4, "6, 16, fill, fill");
		
		JLabel lblNewLabel_15_15 = new JLabel("");
		lblNewLabel_15_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_15.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_15.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_15, "1, 17, fill, fill");
		
		JLabel lblNewLabel_12_6_9 = new JLabel("Vibración en la caja de accesorio ");
		lblNewLabel_12_6_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_9.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_9.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_9, "2, 17, default, fill");
		
		JLabel lblNewLabel_18_13 = new JLabel("10 GRMS (Baja)");
		lblNewLabel_18_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_13.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_13.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_13, "3, 17, fill, fill");
		
		JLabel lblNewLabel_13_15 = new JLabel("15 GRMS (Alta)");
		lblNewLabel_13_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_15.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_15.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_15, "4, 17, default, fill");
		
		JLabel lblNewLabel_14_15 = new JLabel("1  GRMS a 2.5  GRMS");
		lblNewLabel_14_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_15.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_15.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_15, "5, 17, default, fill");
		
		JLabel lblNewLabel_16_10_5 = new JLabel("");
		lblNewLabel_16_10_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10_5.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10_5.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10_5, "6, 17, fill, fill");
		
		JLabel lblNewLabel_15_16 = new JLabel("");
		lblNewLabel_15_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_16.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_16.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_16, "1, 18, fill, fill");
		
		JLabel lblNewLabel_12_6_10 = new JLabel("Vibración del productor de gas");
		lblNewLabel_12_6_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_10.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_10.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_10, "2, 18, default, fill");
		
		JLabel lblNewLabel_18_14 = new JLabel("0.35 IN/RMS (Alta)");
		lblNewLabel_18_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_14.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_14.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_14, "3, 18, fill, fill");
		
		JLabel lblNewLabel_13_16 = new JLabel("0.50 IN/ RMS");
		lblNewLabel_13_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_16.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_16.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_16, "4, 18, default, fill");
		
		JLabel lblNewLabel_14_16 = new JLabel("0 IN/RMS a 0.1  IN/RMS");
		lblNewLabel_14_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_16.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_16.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_16, "5, 18, default, fill");
		
		JLabel lblNewLabel_16_10_6 = new JLabel("");
		lblNewLabel_16_10_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10_6.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10_6.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10_6, "6, 18, fill, fill");
		
		JLabel lblNewLabel_15_17 = new JLabel("");
		lblNewLabel_15_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_17.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_17.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_17, "1, 19, fill, fill");
		
		JLabel lblNewLabel_12_6_11 = new JLabel("Vibración en la turbina de potencia");
		lblNewLabel_12_6_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_11.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_11.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_11, "2, 19, default, fill");
		
		JLabel lblNewLabel_18_15 = new JLabel("0.50 IN/RMS");
		lblNewLabel_18_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_15.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_15.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_15, "3, 19, fill, fill");
		
		JLabel lblNewLabel_13_17 = new JLabel("0.80  IN/RMS");
		lblNewLabel_13_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_17.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_17.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_17, "4, 19, default, fill");
		
		JLabel lblNewLabel_14_17 = new JLabel("0  IN/RMS  0.1 IN/RMS");
		lblNewLabel_14_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_17.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_17.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_17, "5, 19, default, fill");
		
		JLabel lblNewLabel_16_10_7 = new JLabel("");
		lblNewLabel_16_10_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10_7.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10_7.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10_7, "6, 19, fill, fill");
		
		JLabel lblNewLabel_15_18 = new JLabel("");
		lblNewLabel_15_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_18.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_18.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_18, "1, 20, default, fill");
		
		JLabel lblNewLabel_12_6_12 = new JLabel("Vibración en la succión del comprensor ");
		lblNewLabel_12_6_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_12.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_12.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_12, "2, 20, default, fill");
		
		JLabel lblNewLabel_18_16 = new JLabel("2.00 IN/RMS  (Alta)");
		lblNewLabel_18_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_16.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_16.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_16, "3, 20, fill, fill");
		
		JLabel lblNewLabel_13_18 = new JLabel("2.50  IN/RMS(Alta)");
		lblNewLabel_13_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_18.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_18.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_18, "4, 20, default, fill");
		
		JLabel lblNewLabel_14_18 = new JLabel("0  IN/RMS a 0.7  IN/RMS");
		lblNewLabel_14_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_18.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_18.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_18, "5, 20, default, fill");
		
		JLabel lblNewLabel_16_10_8 = new JLabel("");
		lblNewLabel_16_10_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10_8.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10_8.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10_8, "6, 20, fill, fill");
		
		JLabel lblNewLabel_15_19 = new JLabel("");
		lblNewLabel_15_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_19.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_19.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_19, "1, 21, fill, fill");
		
		JLabel lblNewLabel_12_6_13 = new JLabel("Vibración en la descarga del compresor");
		lblNewLabel_12_6_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_13.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_13.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_13, "2, 21, default, fill");
		
		JLabel lblNewLabel_18_17 = new JLabel("2.00  IN/RMS  (Alta)");
		lblNewLabel_18_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_17.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_17.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_17, "3, 21, fill, fill");
		
		JLabel lblNewLabel_13_19 = new JLabel("2.50  IN/RMS (Alta)");
		lblNewLabel_13_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_19.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_19.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_19, "4, 21, default, fill");
		
		JLabel lblNewLabel_14_19 = new JLabel("0  IN/RMS a 0.7  IN/RMS");
		lblNewLabel_14_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_19.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_19.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_19, "5, 21, default, fill");
		
		JLabel lblNewLabel_16_10_9 = new JLabel("");
		lblNewLabel_16_10_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10_9.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10_9.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10_9, "6, 21, fill, fill");
		
		JLabel lblNewLabel_15_20 = new JLabel("");
		lblNewLabel_15_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15_20.setForeground(Constants.getSurfaceColor());
		lblNewLabel_15_20.setBorder(new MatteBorder(0, 1, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_15_20, "1, 22, fill, fill");
		
		JLabel lblNewLabel_12_6_14 = new JLabel("Volume de gas comprimido");
		lblNewLabel_12_6_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12_6_14.setForeground(Constants.getSurfaceColor());
		lblNewLabel_12_6_14.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_12_6_14, "2, 22, default, fill");
		
		JLabel lblNewLabel_18_18 = new JLabel("No Aplica");
		lblNewLabel_18_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18_18.setForeground(Constants.getSurfaceColor());
		lblNewLabel_18_18.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_18_18, "3, 22, fill, fill");
		
		JLabel lblNewLabel_13_20 = new JLabel("No Aplica");
		lblNewLabel_13_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13_20.setForeground(Constants.getSurfaceColor());
		lblNewLabel_13_20.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_13_20, "4, 22, default, fill");
		
		JLabel lblNewLabel_14_20 = new JLabel("140MMPCED ");
		lblNewLabel_14_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14_20.setForeground(Constants.getSurfaceColor());
		lblNewLabel_14_20.setBorder(new MatteBorder(0, 0, 1, 0, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_14_20, "5, 22, default, fill");
		
		JLabel lblNewLabel_16_10_10 = new JLabel("");
		lblNewLabel_16_10_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_16_10_10.setForeground(Constants.getSurfaceColor());
		lblNewLabel_16_10_10.setBorder(new MatteBorder(0, 0, 1, 1, Constants.getSurfaceColor()));
		panel_3.add(lblNewLabel_16_10_10, "6, 22, fill, fill");
		
		
	}
}
