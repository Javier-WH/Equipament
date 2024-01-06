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




public class EquipamentsFrame extends FrameModel {

	private static final long serialVersionUID = 1L;
	JTabbedPane tabbedPane = null;

	public EquipamentsFrame(JPanel parent) {
		super(parent, "Equipos");
		setPreferredSize(new Dimension(2000, 600));
		setType(Type.POPUP);
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
		
		JPanel panel_3 = new JPanel();
		workingParamsPanel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("10dlu"),
				ColumnSpec.decode("46px:grow"),
				ColumnSpec.decode("75px:grow"),
				ColumnSpec.decode("46px:grow"),
				ColumnSpec.decode("75px:grow"),
				ColumnSpec.decode("10px"),},
			new RowSpec[] {
				RowSpec.decode("48px"),
				RowSpec.decode("14px"),}));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setOpaque(true);
		panel_3.add(lblNewLabel_10, "1, 1, fill, fill");
		lblNewLabel_10.setBackground(Constants.getSurfaceColor());
		
		JLabel lblNewLabel_6 = new JLabel("Descripción");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(Constants.getSurfaceColor());
		lblNewLabel_6.setForeground(Constants.getTextColor());
		panel_3.add(lblNewLabel_6, "2, 1, fill, fill");
		
		JLabel lblNewLabel_7 = new JLabel("Alarma");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBackground(Constants.getSurfaceColor());
		lblNewLabel_7.setForeground(Constants.getTextColor());
		panel_3.add(lblNewLabel_7, "3, 1, fill, fill");
		
		JLabel lblNewLabel_8 = new JLabel("Parada");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setBackground(Constants.getSurfaceColor());
		lblNewLabel_8.setForeground(Constants.getTextColor());
		panel_3.add(lblNewLabel_8, "4, 1, fill, fill");
		
		JLabel lblNewLabel_9 = new JLabel("Rangos Normales de operación ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setBackground(Constants.getSurfaceColor());
		lblNewLabel_9.setForeground(Constants.getTextColor());
		panel_3.add(lblNewLabel_9, "5, 1, fill, fill");
		
		JLabel lblNewLabel_10_1 = new JLabel("");
		lblNewLabel_10_1.setOpaque(true);
		lblNewLabel_10_1.setBackground(Constants.getSurfaceColor());
		panel_3.add(lblNewLabel_10_1, "6, 1, fill, fill");
		
		JLabel lblNewLabel_11 = new JLabel("Temperatura en la entrada de aire en la turbina");
		panel_3.add(lblNewLabel_11, "2, 2, fill, fill");
		
	}
}
