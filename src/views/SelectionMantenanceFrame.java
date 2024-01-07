package views;

import javax.swing.JPanel;

import components.Constants;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;


public class SelectionMantenanceFrame extends FrameModel  {
	private static final long serialVersionUID = 1L;

	public SelectionMantenanceFrame(JPanel parent, String title) {
		super(parent, title);
		
		int imageWidth = (this.getSize().width) / 5;
		int imageHeight = imageWidth;
//		int imageHeight = (int) (this.getSize().height * 0.4);
	
//		int imageWidth = 260;
//		int imageHeight = 260;
			
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Constants.getSurfaceColor());
		panel.setOpaque(false);
		panel_1.add(panel, BorderLayout.CENTER);
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
	
		
		JLabel lblLeft = new JLabel("");		
		lblLeft.setOpaque(true);
		lblLeft.setBackground(Constants.getSurfaceColor());
		lblLeft.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Constants.getSurfaceColor()));
		lblLeft.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLeft.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeft.setSize(imageWidth, imageHeight);
		ImageIcon iconLeft = new ImageIcon(SelectionMantenanceFrame.class.getResource("/assets/preventiveIcon.png"));
		Image imageLeft = iconLeft.getImage();
		Image scaledImageLeft = imageLeft.getScaledInstance(lblLeft.getWidth(), lblLeft.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIconLeft = new ImageIcon(scaledImageLeft);
		panel.setLayout(new MigLayout("", "[grow,fill][fill][fill][fill][grow,fill]", "[grow,fill][][19px][fill][grow,fill]"));
		lblLeft.setIcon(scaledIconLeft);
		lblLeft.addMouseListener(mouseOver);
		
		JLabel lblNewLabel = new JLabel("Selecciona el tiipo de manteniemito");
		lblNewLabel.setForeground(Constants.getTextColor());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "cell 2 0,growx,aligny center");
		panel.add(lblLeft, "cell 1 2,grow");
		
		JLabel lblRight = new JLabel("");
		lblRight.setOpaque(true);
		lblRight.setBackground(Constants.getSurfaceColor());
		lblRight.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Constants.getSurfaceColor()));
		lblRight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRight.setHorizontalAlignment(SwingConstants.CENTER);
		lblRight.setSize(imageWidth, imageHeight);
		ImageIcon icon = new ImageIcon(SelectionMantenanceFrame.class.getResource("/assets/correctiveIcon.png"));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(lblRight.getWidth(), lblRight.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(scaledImage);
		lblRight.setIcon(scaledIcon);
		lblRight.addMouseListener(mouseOver);
		panel.add(lblRight, "cell 3 2,grow");
		
		JLabel lblRunning = new JLabel("");
		lblRunning.setOpaque(true);
		lblRunning.setBackground(Constants.getSurfaceColor());
		lblRunning.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Constants.getSurfaceColor()));
		lblRunning.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRunning.setHorizontalAlignment(SwingConstants.CENTER);
		lblRunning.setSize(imageWidth, imageHeight);
		ImageIcon iconRunning = new ImageIcon(SelectionMantenanceFrame.class.getResource("/assets/running.png"));
		Image imageRunning = iconRunning.getImage();
		Image scaledImageRunning = imageRunning.getScaledInstance(lblRunning.getWidth(), lblRunning.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIconRunning = new ImageIcon(scaledImageRunning);
		lblRunning.addMouseListener(mouseOver);
		lblRunning.setIcon(scaledIconRunning);
		
		
		panel.add(lblRunning, "cell 2 2,grow");
		
		JLabel lblTextLeft = new JLabel("Mantenimiento Preventivo");
		lblTextLeft.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTextLeft.setForeground(Constants.getTextColor());
		lblTextLeft.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblTextLeft, "cell 1 3,alignx center");
		
		JLabel lblTextRunning = new JLabel(" Puesta en Marcha");
		lblTextRunning.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextRunning.setForeground(Color.WHITE);
		lblTextRunning.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblTextRunning, "cell 2 3,grow");
		
		JLabel lblTextRight = new JLabel("Mantenimiento Correctivo");
		lblTextRight.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextRight.setForeground(Color.WHITE);
		lblTextRight.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblTextRight, "cell 3 3,grow");

	}
	
	
	MouseAdapter mouseOver = new MouseAdapter() {
	    @Override
	    public void mouseEntered(MouseEvent e) {
	        Object source = e.getSource();
	        if (source instanceof Component) {
	            Component component = (Component) source;
	            if (component instanceof JLabel) {
	                JLabel label = (JLabel) component;
	                label.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Constants.getTextColor()));
	                label.setBackground(Constants.getTextColor());
	                label.repaint(); 
	            }
	        }
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {
	        Object source = e.getSource();
	        if (source instanceof Component) {
	            Component component = (Component) source;
	            if (component instanceof JLabel) {
	                JLabel label = (JLabel) component;
	                label.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Constants.getSurfaceColor()));
	                label.setBackground(Constants.getSurfaceColor());
	                label.repaint(); // Repintar el JLabel para eliminar el borde
	            }
	        }
	    }
	};

	
	
}
