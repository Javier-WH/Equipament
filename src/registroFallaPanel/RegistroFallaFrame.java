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




public class RegistroFallaFrame extends FrameModel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;


	public RegistroFallaFrame(JPanel parent) {
		super(parent, "Regristro de Fallas");
		setAlwaysOnTop(false);
		Dimension pSize = new  Dimension(700, 600);
		setSize(pSize);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("insets 0, gap 0", "[grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill]", "[][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Requiere parada");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel, "cell 0 11 4 2,alignx center,aligny center");
		
		JLabel lblNewLabel_1 = new JLabel("Requiere parada");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		panel.add(lblNewLabel_1, "cell 4 11 6 1");
		
		JLabel lblNewLabel_1_1 = new JLabel("Requiere parada");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		panel.add(lblNewLabel_1_1, "cell 10 11 6 1");
		
		JLabel lblD = new JLabel("D");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setForeground(Color.WHITE);
		panel.add(lblD, "cell 4 12 2 1");
		
		JLabel lblM = new JLabel("M");
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setForeground(Color.WHITE);
		panel.add(lblM, "cell 6 12 2 1");
		
		JLabel lblA = new JLabel("A");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setForeground(Color.WHITE);
		panel.add(lblA, "cell 8 12 2 1");
		
		JLabel lblD_1 = new JLabel("D");
		lblD_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblD_1.setForeground(Color.WHITE);
		panel.add(lblD_1, "cell 10 12 2 1");
		
		JLabel lblM_1 = new JLabel("M");
		lblM_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblM_1.setForeground(Color.WHITE);
		panel.add(lblM_1, "cell 12 12 2 1");
		
		JLabel lblA_1 = new JLabel("A");
		lblA_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblA_1.setForeground(Color.WHITE);
		panel.add(lblA_1, "cell 14 12 2 1");
		
		textField = new JTextField();
		panel.add(textField, "cell 0 13 4 1,growx");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel.add(textField_1, "cell 4 13 2 1,growx");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel.add(textField_2, "cell 6 13 2 1,growx");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel.add(textField_3, "cell 8 13 2 1,growx");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel.add(textField_4, "cell 10 13 2 1,growx");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel.add(textField_5, "cell 12 13 2 1,growx");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel.add(textField_6, "cell 14 13 2 1,growx");
		
		
			
	}

	
	
}
