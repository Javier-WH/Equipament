package reportPanels;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SpringLayout;
import javax.swing.border.MatteBorder;

import components.Constants;

import java.awt.Color;
import java.awt.Cursor;

public class MesurePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public MesurePanel() {
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setBackground(Constants.getSurfaceColor());
		setMinimumSize(new Dimension(10, 50));
		setMaximumSize(new Dimension(32767, 50));
		setLayout(new MigLayout("insets 0, gap 0", "[grow 300,fill][grow,fill][grow,fill][grow,fill]", "[grow,fill]"));
		
		JPanel typePanel = new JPanel();
		typePanel.setOpaque(false);
		typePanel.setBackground(Constants.getSurfaceColor());
		typePanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(typePanel, "cell 0 0,grow");
		SpringLayout sl_typePanel = new SpringLayout();
		typePanel.setLayout(sl_typePanel);
		
		JLabel lblType = new JLabel("Un elefante se balanceaba sobre la tela de una arana, como ve[ia que resist[ia fue a llamar a otro elefante");
		lblType.setForeground(Constants.getTextColor());
		sl_typePanel.putConstraint(SpringLayout.NORTH, lblType, 5, SpringLayout.NORTH, typePanel);
		sl_typePanel.putConstraint(SpringLayout.WEST, lblType, 5, SpringLayout.WEST, typePanel);
		sl_typePanel.putConstraint(SpringLayout.SOUTH, lblType, -6, SpringLayout.SOUTH, typePanel);
		sl_typePanel.putConstraint(SpringLayout.EAST, lblType, 340, SpringLayout.EAST, typePanel);
		typePanel.add(lblType);
		
		JPanel operatorPanel = new JPanel();
		operatorPanel.setOpaque(false);
		operatorPanel.setBackground(Constants.getSurfaceColor());
		operatorPanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(operatorPanel, "cell 1 0,grow");
		SpringLayout sl_operatorPanel = new SpringLayout();
		operatorPanel.setLayout(sl_operatorPanel);
		
		JLabel lblOperator = new JLabel("Simon Bolivar");
		lblOperator.setForeground(Constants.getTextColor());
		lblOperator.setBorder(null);
		sl_operatorPanel.putConstraint(SpringLayout.NORTH, lblOperator, 0, SpringLayout.NORTH, operatorPanel);
		sl_operatorPanel.putConstraint(SpringLayout.WEST, lblOperator, 10, SpringLayout.WEST, operatorPanel);
		sl_operatorPanel.putConstraint(SpringLayout.SOUTH, lblOperator, 0, SpringLayout.SOUTH, operatorPanel);
		sl_operatorPanel.putConstraint(SpringLayout.EAST, lblOperator, 0, SpringLayout.EAST, operatorPanel);
		operatorPanel.add(lblOperator);
		
		JPanel inspectorPanel = new JPanel();
		inspectorPanel.setOpaque(false);
		inspectorPanel.setBackground(Constants.getSurfaceColor());
		inspectorPanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
		add(inspectorPanel, "cell 2 0,grow");
		SpringLayout sl_inspectorPanel = new SpringLayout();
		inspectorPanel.setLayout(sl_inspectorPanel);
		
		JLabel lblInspector = new JLabel("Simon Bolivar");
		lblInspector.setForeground(Constants.getTextColor());
		sl_inspectorPanel.putConstraint(SpringLayout.NORTH, lblInspector, 0, SpringLayout.NORTH, inspectorPanel);
		sl_inspectorPanel.putConstraint(SpringLayout.WEST, lblInspector, 10, SpringLayout.WEST, inspectorPanel);
		sl_inspectorPanel.putConstraint(SpringLayout.SOUTH, lblInspector, 0, SpringLayout.SOUTH, inspectorPanel);
		sl_inspectorPanel.putConstraint(SpringLayout.EAST, lblInspector, -1, SpringLayout.EAST, inspectorPanel);
		lblInspector.setBorder(null);
		inspectorPanel.add(lblInspector);
		
		JPanel datePanel = new JPanel();
		datePanel.setOpaque(false);
		datePanel.setBackground(Constants.getSurfaceColor());
		datePanel.setBorder(new MatteBorder(0, 0, 0, 0, Constants.getTextColor()));
		add(datePanel, "cell 3 0,grow");
		SpringLayout sl_datePanel = new SpringLayout();
		datePanel.setLayout(sl_datePanel);
		
		JLabel lblDate = new JLabel("Simon Bolivar");
		lblDate.setForeground(Constants.getTextColor());
		sl_datePanel.putConstraint(SpringLayout.NORTH, lblDate, 0, SpringLayout.NORTH, datePanel);
		sl_datePanel.putConstraint(SpringLayout.WEST, lblDate, 10, SpringLayout.WEST, datePanel);
		sl_datePanel.putConstraint(SpringLayout.SOUTH, lblDate, 0, SpringLayout.SOUTH, datePanel);
		sl_datePanel.putConstraint(SpringLayout.EAST, lblDate, 0, SpringLayout.EAST, datePanel);
		lblDate.setBorder(null);
		datePanel.add(lblDate);
		
		addMouseListener(new MouseAdapter() {
					
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(Constants.getSurfaceColor());
				lblType.setForeground(Constants.getTextColor());
				lblOperator.setForeground(Constants.getTextColor());
				lblInspector.setForeground(Constants.getTextColor());
				lblDate.setForeground(Constants.getTextColor());
				
				typePanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
				operatorPanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
				inspectorPanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
				datePanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getTextColor()));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(Constants.getTextColor());
				lblType.setForeground(Constants.getSurfaceColor());
				lblOperator.setForeground(Constants.getSurfaceColor());
				lblInspector.setForeground(Constants.getSurfaceColor());
				lblDate.setForeground(Constants.getSurfaceColor());
				
				typePanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getSurfaceColor()));
				operatorPanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getSurfaceColor()));
				inspectorPanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getSurfaceColor()));
				datePanel.setBorder(new MatteBorder(0, 0, 0, 1, Constants.getSurfaceColor()));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hola soy una marmota");
				
			}
		});

	}
}
