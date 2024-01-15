package workOrder;

import views.FrameModel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class WorkOrder extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtDia;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_2;
	private JTextField textField_7;
	private JTextField txtResponsable;
	private JLabel lblClase;
	private JLabel lblNewLabel;
	private JLabel lblFechaInicio;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblFechaDeCierre;
	private JTextField textField_3;
	private JTextField textField_9;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;

	public WorkOrder(JPanel parent) {
		super(parent, "ORDEN DE TRABAJO");
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tablePanel.setBackground(Color.WHITE);
		getContentPane().add(tablePanel, BorderLayout.CENTER);
		tablePanel.setLayout(new MigLayout("insets 0, gap 0", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]", "[][][][][][][][][][][][][][][][][][][][][]"));
		
		lblNewLabel_22 = new JLabel("ORDEN DE TRABAJO");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_22, "cell 0 0 9 5,grow");
		
		lblNewLabel_21 = new JLabel("Código:");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_21, "cell 9 1,alignx trailing");
		
		textField_17 = new JTextField();
		textField_17.setOpaque(false);
		textField_17.setColumns(10);
		textField_17.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_17, "cell 10 1,growx");
		
		lblNewLabel_20 = new JLabel("Fecha:");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_20, "cell 9 2,alignx trailing");
		
		textField_18 = new JTextField();
		textField_18.setOpaque(false);
		textField_18.setColumns(10);
		textField_18.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_18, "cell 10 2,growx");
		
		lblNewLabel_19 = new JLabel("Versión:");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_19, "cell 9 3,alignx trailing");
		
		textField_19 = new JTextField();
		textField_19.setOpaque(false);
		textField_19.setColumns(10);
		textField_19.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_19, "cell 10 3,growx");
		
		lblNewLabel_18 = new JLabel("Página:");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_18, "cell 9 4,alignx trailing");
		
		textField_20 = new JTextField();
		textField_20.setOpaque(false);
		textField_20.setColumns(10);
		textField_20.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_20, "cell 10 4,growx");
		
		lblNewLabel_13 = new JLabel("N° Orden");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_13, "cell 0 5,grow");
		
		lblNewLabel_14 = new JLabel("Equipo");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_14, "cell 1 5 2 1,grow");
		
		lblNewLabel_15 = new JLabel("Código");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_15, "cell 3 5,grow");
		
		lblNewLabel_16 = new JLabel("Ficha Técnica");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_16, "cell 4 5,grow");
		
		lblNewLabel_17 = new JLabel("Hoja de Vida");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_17, "cell 5 5 6 1,grow");
		
		textField_12 = new JTextField();
		textField_12.setOpaque(false);
		textField_12.setColumns(10);
		textField_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_12, "cell 0 6,growx");
		
		textField_13 = new JTextField();
		textField_13.setOpaque(false);
		textField_13.setColumns(10);
		textField_13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_13, "cell 1 6 2 1,growx");
		
		textField_14 = new JTextField();
		textField_14.setOpaque(false);
		textField_14.setColumns(10);
		textField_14.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_14, "cell 3 6,growx");
		
		textField_15 = new JTextField();
		textField_15.setOpaque(false);
		textField_15.setColumns(10);
		textField_15.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_15, "cell 4 6,growx");
		
		textField_16 = new JTextField();
		textField_16.setOpaque(false);
		textField_16.setColumns(10);
		textField_16.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_16, "cell 5 6 6 1,growx");
		
		lblNewLabel_12 = new JLabel("Tipo de Mantenimiento");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_12, "cell 0 7 11 1,grow");
		
		lblNewLabel_7 = new JLabel("Lubricación");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_7, "cell 0 8 2 1,growx,aligny center");
		
		lblNewLabel_8 = new JLabel("Eléctrico");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_8, "cell 2 8 2 1,grow");
		
		lblNewLabel_9 = new JLabel("Mecánico");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_9, "cell 4 8 2 1,grow");
		
		lblNewLabel_10 = new JLabel("Instrumentación");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_10, "cell 6 8 2 1,growx");
		
		lblNewLabel_11 = new JLabel("Otro");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_11, "cell 8 8 3 1,growx");
		
		textField_3 = new JTextField();
		textField_3.setOpaque(false);
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_3, "cell 0 9 2 1,growx");
		
		textField_9 = new JTextField();
		textField_9.setOpaque(false);
		textField_9.setColumns(10);
		textField_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_9, "cell 2 9 2 1,growx");
		
		textField_8 = new JTextField();
		textField_8.setOpaque(false);
		textField_8.setColumns(10);
		textField_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_8, "cell 4 9 2 1,growx");
		
		textField_10 = new JTextField();
		textField_10.setOpaque(false);
		textField_10.setColumns(10);
		textField_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_10, "cell 6 9 2 1,growx");
		
		textField_11 = new JTextField();
		textField_11.setOpaque(false);
		textField_11.setColumns(10);
		textField_11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_11, "cell 8 9 3 1,growx");
		
		lblClase = new JLabel("Clase");
		lblClase.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblClase, "cell 0 10 2 2,growx");
		
		lblNewLabel = new JLabel("Responsable de ejecución ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel, "cell 2 10 3 2,grow");
		
		lblFechaInicio = new JLabel("Fecha de Inicio");
		lblFechaInicio.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblFechaInicio, "cell 5 10 3 1,growx,aligny center");
		
		lblFechaDeCierre = new JLabel("Fecha de Cierre o Culminacióm");
		lblFechaDeCierre.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblFechaDeCierre, "cell 8 10 3 1,grow");
		
		lblNewLabel_1 = new JLabel("Dia");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_1, "cell 5 11,growx,aligny center");
		
		lblNewLabel_2 = new JLabel("Mes");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_2, "cell 6 11,grow");
		
		lblNewLabel_3 = new JLabel("Año");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_3, "cell 7 11,grow");
		
		lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_4, "cell 8 11,grow");
		
		lblNewLabel_5 = new JLabel("Mes");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_5, "cell 9 11,growx,aligny center");
		
		lblNewLabel_6 = new JLabel("Año");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_6, "cell 10 11,grow");
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		textField.setOpaque(false);
		tablePanel.add(textField, "cell 0 12,grow");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_1, "cell 1 12,growx");
		
		txtResponsable = new JTextField();
		txtResponsable.setOpaque(false);
		txtResponsable.setColumns(10);
		txtResponsable.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(txtResponsable, "cell 2 12,growx, spanx 3");
		
		txtDia = new JTextField();
		txtDia.setOpaque(false);
		txtDia.setColumns(10);
		txtDia.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(txtDia, "cell 5 12,growx");
		
		textField_4 = new JTextField();
		textField_4.setOpaque(false);
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_4, "cell 6 12,growx");
		
		textField_5 = new JTextField();
		textField_5.setOpaque(false);
		textField_5.setColumns(10);
		textField_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_5, "cell 7 12,growx");
		
		textField_6 = new JTextField();
		textField_6.setOpaque(false);
		textField_6.setColumns(10);
		textField_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_6, "cell 8 12,growx");
		
		textField_2 = new JTextField();
		textField_2.setOpaque(false);
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_2, "cell 9 12,growx");
		
		textField_7 = new JTextField();
		textField_7.setOpaque(false);
		textField_7.setColumns(10);
		textField_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_7, "cell 10 12,growx");
		
		lblNewLabel_23 = new JLabel("Código de ");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_23, "cell 0 13,grow");
		
		lblNewLabel_24 = new JLabel("Descripción");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_24, "cell 1 13 2 1,grow");
		
		lblNewLabel_25 = new JLabel("Herramientas");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_25, "cell 3 13,grow");
		
		lblNewLabel_26 = new JLabel("Materiales");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_26, "cell 4 13,grow");
		
		lblNewLabel_27 = new JLabel("Repuestos");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_27, "cell 5 13,grow");
		
		lblNewLabel_28 = new JLabel("Horas-Hombre");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_28, "cell 7 13,grow");
		
		lblNewLabel_29 = new JLabel("Observaciones");
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		tablePanel.add(lblNewLabel_29, "cell 8 13 3 1,grow");
		
		textField_21 = new JTextField();
		textField_21.setOpaque(false);
		textField_21.setColumns(10);
		textField_21.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_21, "cell 0 14,growx");
		
		textField_28 = new JTextField();
		textField_28.setOpaque(false);
		textField_28.setColumns(10);
		textField_28.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_28, "cell 1 14 2 1,growx");
		
		textField_35 = new JTextField();
		textField_35.setOpaque(false);
		textField_35.setColumns(10);
		textField_35.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_35, "cell 3 14,growx");
		
		textField_42 = new JTextField();
		textField_42.setOpaque(false);
		textField_42.setColumns(10);
		textField_42.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_42, "cell 4 14,growx");
		
		textField_49 = new JTextField();
		textField_49.setOpaque(false);
		textField_49.setColumns(10);
		textField_49.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_49, "cell 5 14 2 1,growx");
		
		textField_56 = new JTextField();
		textField_56.setOpaque(false);
		textField_56.setColumns(10);
		textField_56.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_56, "cell 7 14,growx");
		
		textField_63 = new JTextField();
		textField_63.setOpaque(false);
		textField_63.setColumns(10);
		textField_63.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_63, "cell 8 14 3 1,growx");
		
		textField_22 = new JTextField();
		textField_22.setOpaque(false);
		textField_22.setColumns(10);
		textField_22.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_22, "cell 0 15,growx");
		
		textField_29 = new JTextField();
		textField_29.setOpaque(false);
		textField_29.setColumns(10);
		textField_29.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_29, "cell 1 15 2 1,growx");
		
		textField_36 = new JTextField();
		textField_36.setOpaque(false);
		textField_36.setColumns(10);
		textField_36.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_36, "cell 3 15,growx");
		
		textField_43 = new JTextField();
		textField_43.setOpaque(false);
		textField_43.setColumns(10);
		textField_43.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_43, "cell 4 15,growx");
		
		textField_50 = new JTextField();
		textField_50.setOpaque(false);
		textField_50.setColumns(10);
		textField_50.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_50, "cell 5 15 2 1,growx");
		
		textField_57 = new JTextField();
		textField_57.setOpaque(false);
		textField_57.setColumns(10);
		textField_57.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_57, "cell 7 15,growx");
		
		textField_64 = new JTextField();
		textField_64.setOpaque(false);
		textField_64.setColumns(10);
		textField_64.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_64, "cell 8 15 3 1,growx");
		
		textField_23 = new JTextField();
		textField_23.setOpaque(false);
		textField_23.setColumns(10);
		textField_23.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_23, "cell 0 16,growx");
		
		textField_30 = new JTextField();
		textField_30.setOpaque(false);
		textField_30.setColumns(10);
		textField_30.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_30, "cell 1 16 2 1,growx");
		
		textField_37 = new JTextField();
		textField_37.setOpaque(false);
		textField_37.setColumns(10);
		textField_37.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_37, "cell 3 16,growx");
		
		textField_44 = new JTextField();
		textField_44.setOpaque(false);
		textField_44.setColumns(10);
		textField_44.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_44, "cell 4 16,growx");
		
		textField_51 = new JTextField();
		textField_51.setOpaque(false);
		textField_51.setColumns(10);
		textField_51.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_51, "cell 5 16 2 1,growx");
		
		textField_58 = new JTextField();
		textField_58.setOpaque(false);
		textField_58.setColumns(10);
		textField_58.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_58, "cell 7 16,growx");
		
		textField_65 = new JTextField();
		textField_65.setOpaque(false);
		textField_65.setColumns(10);
		textField_65.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_65, "cell 8 16 3 1,growx");
		
		textField_24 = new JTextField();
		textField_24.setOpaque(false);
		textField_24.setColumns(10);
		textField_24.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_24, "cell 0 17,growx");
		
		textField_31 = new JTextField();
		textField_31.setOpaque(false);
		textField_31.setColumns(10);
		textField_31.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_31, "cell 1 17 2 1,growx");
		
		textField_38 = new JTextField();
		textField_38.setOpaque(false);
		textField_38.setColumns(10);
		textField_38.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_38, "cell 3 17,growx");
		
		textField_45 = new JTextField();
		textField_45.setOpaque(false);
		textField_45.setColumns(10);
		textField_45.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_45, "cell 4 17,growx");
		
		textField_52 = new JTextField();
		textField_52.setOpaque(false);
		textField_52.setColumns(10);
		textField_52.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_52, "cell 5 17 2 1,growx");
		
		textField_59 = new JTextField();
		textField_59.setOpaque(false);
		textField_59.setColumns(10);
		textField_59.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_59, "cell 7 17,growx");
		
		textField_66 = new JTextField();
		textField_66.setOpaque(false);
		textField_66.setColumns(10);
		textField_66.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_66, "cell 8 17 3 1,growx");
		
		textField_25 = new JTextField();
		textField_25.setOpaque(false);
		textField_25.setColumns(10);
		textField_25.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_25, "cell 0 18,growx");
		
		textField_32 = new JTextField();
		textField_32.setOpaque(false);
		textField_32.setColumns(10);
		textField_32.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_32, "cell 1 18 2 1,growx");
		
		textField_39 = new JTextField();
		textField_39.setOpaque(false);
		textField_39.setColumns(10);
		textField_39.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_39, "cell 3 18,growx");
		
		textField_46 = new JTextField();
		textField_46.setOpaque(false);
		textField_46.setColumns(10);
		textField_46.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_46, "cell 4 18,growx");
		
		textField_53 = new JTextField();
		textField_53.setOpaque(false);
		textField_53.setColumns(10);
		textField_53.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_53, "cell 5 18 2 1,growx");
		
		textField_60 = new JTextField();
		textField_60.setOpaque(false);
		textField_60.setColumns(10);
		textField_60.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_60, "cell 7 18,growx");
		
		textField_67 = new JTextField();
		textField_67.setOpaque(false);
		textField_67.setColumns(10);
		textField_67.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_67, "cell 8 18 3 1,growx");
		
		textField_26 = new JTextField();
		textField_26.setOpaque(false);
		textField_26.setColumns(10);
		textField_26.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_26, "cell 0 19,growx");
		
		textField_33 = new JTextField();
		textField_33.setOpaque(false);
		textField_33.setColumns(10);
		textField_33.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_33, "cell 1 19 2 1,growx");
		
		textField_40 = new JTextField();
		textField_40.setOpaque(false);
		textField_40.setColumns(10);
		textField_40.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_40, "cell 3 19,growx");
		
		textField_47 = new JTextField();
		textField_47.setOpaque(false);
		textField_47.setColumns(10);
		textField_47.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_47, "cell 4 19,growx");
		
		textField_54 = new JTextField();
		textField_54.setOpaque(false);
		textField_54.setColumns(10);
		textField_54.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_54, "cell 5 19 2 1,growx");
		
		textField_61 = new JTextField();
		textField_61.setOpaque(false);
		textField_61.setColumns(10);
		textField_61.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_61, "cell 7 19,growx");
		
		textField_68 = new JTextField();
		textField_68.setOpaque(false);
		textField_68.setColumns(10);
		textField_68.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_68, "cell 8 19 3 1,growx");
		
		textField_27 = new JTextField();
		textField_27.setOpaque(false);
		textField_27.setColumns(10);
		textField_27.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_27, "cell 0 20,growx");
		
		textField_34 = new JTextField();
		textField_34.setOpaque(false);
		textField_34.setColumns(10);
		textField_34.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_34, "cell 1 20 2 1,growx");
		
		textField_41 = new JTextField();
		textField_41.setOpaque(false);
		textField_41.setColumns(10);
		textField_41.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_41, "cell 3 20,growx");
		
		textField_48 = new JTextField();
		textField_48.setOpaque(false);
		textField_48.setColumns(10);
		textField_48.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_48, "cell 4 20,growx");
		
		textField_55 = new JTextField();
		textField_55.setOpaque(false);
		textField_55.setColumns(10);
		textField_55.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_55, "cell 5 20 2 1,growx");
		
		textField_62 = new JTextField();
		textField_62.setOpaque(false);
		textField_62.setColumns(10);
		textField_62.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_62, "cell 7 20,growx");
		
		textField_69 = new JTextField();
		textField_69.setOpaque(false);
		textField_69.setColumns(10);
		textField_69.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		tablePanel.add(textField_69, "cell 8 20 3 1,growx");
				
	}
}
