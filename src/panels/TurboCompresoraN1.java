package panels;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import components.Constants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class TurboCompresoraN1 extends JPanel {

	private static final long serialVersionUID = 1L;

	public TurboCompresoraN1() {
		setMaximumSize(new Dimension(32767, 160));
		setMinimumSize(new Dimension(10, 20));
		setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setPreferredSize(new Dimension(170, 100));
		lblNewLabel_5.setBackground(Constants.getSurfaceColor());
		lblNewLabel_5.setOpaque(true);

		java.net.URL imageUrl = getClass().getResource("/assets/Picture1.png");

		// Crear un ImageIcon con la imagen
		ImageIcon icon = new ImageIcon(imageUrl);

		// Escalar el ImageIcon al tamaño deseado
		Image scaledImage = icon.getImage().getScaledInstance(lblNewLabel_5.getPreferredSize().width, lblNewLabel_5.getPreferredSize().height, Image.SCALE_SMOOTH);

		// Crear un nuevo ImageIcon con la imagen escalada
		ImageIcon scaledIcon = new ImageIcon(scaledImage);

		// Establecer el icono en el JLabel
		lblNewLabel_5.setIcon(scaledIcon);

		add(lblNewLabel_5, BorderLayout.EAST);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(Constants.getSurfaceColor());
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("CARACTERÍSTICAS DE LA UNIDAD");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(Constants.getTextColor());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);

		JLabel lblNewLabel_1 = new JLabel("TURBOCOMPRESORA N° 01");
		lblNewLabel_1.setForeground(Constants.getTextColor());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1, BorderLayout.SOUTH);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(Constants.getSurfaceColor());
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblNewLabel_2 = new JLabel("DESCRICIÓN");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setForeground(Constants.getTextColor());
		lblNewLabel_2.setBackground(Constants.getSurfaceColor());
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("CARACTERÍSTICAS");
		lblNewLabel_3.setBorder(null);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setAlignmentY(0.0f);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(Constants.getTextColor());
		lblNewLabel_3.setBackground(Constants.getSurfaceColor());
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_6_1 = new JLabel("MARCA");
		lblNewLabel_6_1.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setOpaque(true);
		lblNewLabel_6_1.setBackground(Color.WHITE);
		lblNewLabel_6_1.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_6_1);

		JLabel lblNewLabel_8 = new JLabel("SOLAR");
		lblNewLabel_8.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_8);

		JLabel lblNewLabel_6_2 = new JLabel("MODELO");
		lblNewLabel_6_2.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setOpaque(true);
		lblNewLabel_6_2.setBackground(Color.WHITE);
		lblNewLabel_6_2.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_6_2);

		JLabel lblNewLabel_9 = new JLabel("CSS 3000");
		lblNewLabel_9.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setBackground(Color.WHITE);
		lblNewLabel_9.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_9);

		JLabel lblNewLabel_6_3 = new JLabel("SERIAL DEL PAQUETE");
		lblNewLabel_6_3.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3.setOpaque(true);
		lblNewLabel_6_3.setBackground(Color.WHITE);
		lblNewLabel_6_3.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_6_3);

		JLabel lblNewLabel_10 = new JLabel("S-3020215");
		lblNewLabel_10.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_10);

		JLabel lblNewLabel_6_4 = new JLabel("ARREGLO");
		lblNewLabel_6_4.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_4.setOpaque(true);
		lblNewLabel_6_4.setBackground(Color.WHITE);
		lblNewLabel_6_4.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_6_4);

		JLabel lblNewLabel_11 = new JLabel("2-07063");
		lblNewLabel_11.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setBackground(Color.WHITE);
		lblNewLabel_11.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_11);

		JLabel lblNewLabel_6_5 = new JLabel("FECHA PUESTA EN SERVICIO");
		lblNewLabel_6_5.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_6_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5.setOpaque(true);
		lblNewLabel_6_5.setBackground(Color.WHITE);
		lblNewLabel_6_5.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_6_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_6_5);

		JLabel lblNewLabel_12 = new JLabel("03/10/1997");
		lblNewLabel_12.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBackground(Color.WHITE);
		lblNewLabel_12.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_12);

		JLabel lblNewLabel_6_6 = new JLabel("HORAS DE OPERACIÓN A LA FECHA");
		lblNewLabel_6_6.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_6_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_6.setOpaque(true);
		lblNewLabel_6_6.setBackground(Color.WHITE);
		lblNewLabel_6_6.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_6_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_6_6);

		JLabel lblNewLabel_13 = new JLabel("45.962");
		lblNewLabel_13.setBorder(new MatteBorder(1, 1, 1, 1, Constants.getSurfaceColor()));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setBackground(Color.WHITE);
		lblNewLabel_13.setPreferredSize(new Dimension(0, 50));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_13);

	}

}
