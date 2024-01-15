package views;


import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;

public class InfoPanel extends FrameModel {
	private static final long serialVersionUID = 1L;



	public InfoPanel(JPanel parent) {
		super(parent, "Información");
		setResizable(false);
		this.setSize(new Dimension(684, 383));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(InfoPanel.class.getResource("/assets/logoB.png")));
		lblNewLabel.setBounds(24, 25, 318, 286);
		getContentPane().add(lblNewLabel);
		
		JLabel lblTurbocompresorMarcaSolar = new JLabel("<html>Programa Integral de Mantenimiento a la Unidad #1</html> ");
		lblTurbocompresorMarcaSolar.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTurbocompresorMarcaSolar.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTurbocompresorMarcaSolar.setHorizontalAlignment(SwingConstants.LEFT);
		lblTurbocompresorMarcaSolar.setForeground(Color.WHITE);
		lblTurbocompresorMarcaSolar.setFont(new Font("Californian FB", Font.BOLD, 23));
		lblTurbocompresorMarcaSolar.setBounds(335, 11, 305, 72);
		getContentPane().add(lblTurbocompresorMarcaSolar);
		
		JLabel lblTitle = new JLabel("Turbo Compresora Solar, Centauro 40.");
		lblTitle.setVerticalAlignment(SwingConstants.TOP);
		lblTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Californian FB", Font.BOLD, 13));
		lblTitle.setBounds(335, 84, 280, 20);
		getContentPane().add(lblTitle);
		
		JLabel lblVersionBeta = new JLabel("Version beta 1.0.0");
		lblVersionBeta.setVerticalAlignment(SwingConstants.TOP);
		lblVersionBeta.setHorizontalTextPosition(SwingConstants.CENTER);
		lblVersionBeta.setHorizontalAlignment(SwingConstants.LEFT);
		lblVersionBeta.setForeground(Color.WHITE);
		lblVersionBeta.setFont(new Font("Californian FB", Font.BOLD, 18));
		lblVersionBeta.setBounds(293, 291, 280, 20);
		getContentPane().add(lblVersionBeta);
		
		JLabel lblCreadoPor = new JLabel("Creado por:");
		lblCreadoPor.setVerticalAlignment(SwingConstants.TOP);
		lblCreadoPor.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCreadoPor.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreadoPor.setForeground(Color.WHITE);
		lblCreadoPor.setFont(new Font("Californian FB", Font.BOLD, 14));
		lblCreadoPor.setBounds(352, 127, 280, 20);
		getContentPane().add(lblCreadoPor);
		
		JLabel lblLuisCarlosBorges = new JLabel("Luis Carlos Borges Hernández");
		lblLuisCarlosBorges.setVerticalAlignment(SwingConstants.TOP);
		lblLuisCarlosBorges.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLuisCarlosBorges.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuisCarlosBorges.setForeground(Color.WHITE);
		lblLuisCarlosBorges.setFont(new Font("Californian FB", Font.BOLD, 18));
		lblLuisCarlosBorges.setBounds(352, 144, 280, 20);
		getContentPane().add(lblLuisCarlosBorges);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(352, 191, 92, 89);
		
	    ImageIcon icono = new ImageIcon(InfoPanel.class.getResource("/assets/IUPSM Logo2.png"));
        Image imagen = icono.getImage();

        // Ajusta la imagen al tamaño del JLabel
        Image imagenEscalada = imagen.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);

        // Crea un nuevo ImageIcon con la imagen escalada
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

        // Establece el icono escalado en el JLabel
        lblNewLabel_1.setIcon(iconoEscalado);
		
		
		
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblInstitutoUniversitarioPolitcnico = new JLabel("<html>Proyecto de grado del Instituto Universitario Politécnico Santiago Mariño</html>");
		lblInstitutoUniversitarioPolitcnico.setVerticalAlignment(SwingConstants.TOP);
		lblInstitutoUniversitarioPolitcnico.setHorizontalTextPosition(SwingConstants.CENTER);
		lblInstitutoUniversitarioPolitcnico.setHorizontalAlignment(SwingConstants.LEFT);
		lblInstitutoUniversitarioPolitcnico.setForeground(Color.WHITE);
		lblInstitutoUniversitarioPolitcnico.setFont(new Font("Californian FB", Font.BOLD, 14));
		lblInstitutoUniversitarioPolitcnico.setBounds(450, 205, 181, 75);
		getContentPane().add(lblInstitutoUniversitarioPolitcnico);
		
		JLabel lblDeEnero = new JLabel("15 de enero del 2024");
		lblDeEnero.setVerticalAlignment(SwingConstants.TOP);
		lblDeEnero.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDeEnero.setHorizontalAlignment(SwingConstants.LEFT);
		lblDeEnero.setForeground(Color.WHITE);
		lblDeEnero.setFont(new Font("Californian FB", Font.BOLD, 10));
		lblDeEnero.setBounds(293, 313, 280, 20);
		getContentPane().add(lblDeEnero);
			
	}
}