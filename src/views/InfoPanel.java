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
		this.setSize(new Dimension(560, 387));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(24, 11, 181, 153);
        ImageIcon imageIcon = new ImageIcon(InfoPanel.class.getResource("/assets/logoB.png"));
        Image image = imageIcon.getImage().getScaledInstance(lblNewLabel.getSize().width, lblNewLabel.getSize().height, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(image));
        getContentPane().add(lblNewLabel);
		
		JLabel lblTurbocompresorMarcaSolar = new JLabel("<html>Programa Integral de Mantenimiento a la Unidad #1</html> ");
		lblTurbocompresorMarcaSolar.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTurbocompresorMarcaSolar.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTurbocompresorMarcaSolar.setHorizontalAlignment(SwingConstants.LEFT);
		lblTurbocompresorMarcaSolar.setForeground(Color.WHITE);
		lblTurbocompresorMarcaSolar.setFont(new Font("Californian FB", Font.BOLD, 23));
		lblTurbocompresorMarcaSolar.setBounds(215, 11, 290, 72);
		getContentPane().add(lblTurbocompresorMarcaSolar);
		
		JLabel lblTitle = new JLabel("Turbo Compresora Solar, Centauro 40.");
		lblTitle.setVerticalAlignment(SwingConstants.TOP);
		lblTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Californian FB", Font.BOLD, 13));
		lblTitle.setBounds(215, 81, 280, 20);
		getContentPane().add(lblTitle);
		
		JLabel lblVersionBeta = new JLabel("Version beta 1.0.0");
		lblVersionBeta.setVerticalAlignment(SwingConstants.TOP);
		lblVersionBeta.setHorizontalTextPosition(SwingConstants.CENTER);
		lblVersionBeta.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersionBeta.setForeground(Color.WHITE);
		lblVersionBeta.setFont(new Font("Californian FB", Font.BOLD, 18));
		lblVersionBeta.setBounds(0, 292, 544, 20);
		getContentPane().add(lblVersionBeta);
		
		JLabel lblCreadoPor = new JLabel("Creado por:");
		lblCreadoPor.setVerticalAlignment(SwingConstants.TOP);
		lblCreadoPor.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCreadoPor.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreadoPor.setForeground(Color.WHITE);
		lblCreadoPor.setFont(new Font("Californian FB", Font.BOLD, 14));
		lblCreadoPor.setBounds(215, 128, 280, 20);
		getContentPane().add(lblCreadoPor);
		
		JLabel lblLuisCarlosBorges = new JLabel("Luis Carlos Borges Hernández");
		lblLuisCarlosBorges.setVerticalAlignment(SwingConstants.TOP);
		lblLuisCarlosBorges.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLuisCarlosBorges.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuisCarlosBorges.setForeground(Color.WHITE);
		lblLuisCarlosBorges.setFont(new Font("Californian FB", Font.BOLD, 18));
		lblLuisCarlosBorges.setBounds(215, 144, 280, 20);
		getContentPane().add(lblLuisCarlosBorges);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(55, 162, 134, 130);
		
	    ImageIcon icono = new ImageIcon(InfoPanel.class.getResource("/assets/IUPSM Logo2.png"));
        Image imagen = icono.getImage();

        // Ajusta la imagen al tamaño del JLabel
        Image imagenEscalada = imagen.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);

        // Crea un nuevo ImageIcon con la imagen escalada
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

        // Establece el icono escalado en el JLabel
        lblNewLabel_1.setIcon(iconoEscalado);
		
		
		
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblInstitutoUniversitarioPolitcnico = new JLabel("<html>Proyecto de grado del Instituto Universitario Politécnico Santiago Mariño, extensión Caracas.</html>");
		lblInstitutoUniversitarioPolitcnico.setVerticalAlignment(SwingConstants.TOP);
		lblInstitutoUniversitarioPolitcnico.setHorizontalTextPosition(SwingConstants.CENTER);
		lblInstitutoUniversitarioPolitcnico.setHorizontalAlignment(SwingConstants.LEFT);
		lblInstitutoUniversitarioPolitcnico.setForeground(Color.WHITE);
		lblInstitutoUniversitarioPolitcnico.setFont(new Font("Californian FB", Font.PLAIN, 16));
		lblInstitutoUniversitarioPolitcnico.setBounds(215, 195, 229, 75);
		getContentPane().add(lblInstitutoUniversitarioPolitcnico);
		
		JLabel lblDeEnero = new JLabel("15 de enero del 2024");
		lblDeEnero.setVerticalAlignment(SwingConstants.TOP);
		lblDeEnero.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDeEnero.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeEnero.setForeground(Color.WHITE);
		lblDeEnero.setFont(new Font("Californian FB", Font.BOLD, 10));
		lblDeEnero.setBounds(0, 313, 544, 20);
		getContentPane().add(lblDeEnero);
		
		JLabel lblLicenciaMit = new JLabel("Licencia MIT");
		lblLicenciaMit.setVerticalAlignment(SwingConstants.TOP);
		lblLicenciaMit.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLicenciaMit.setHorizontalAlignment(SwingConstants.CENTER);
		lblLicenciaMit.setForeground(Color.WHITE);
		lblLicenciaMit.setFont(new Font("Californian FB", Font.BOLD, 14));
		lblLicenciaMit.setBounds(0, 329, 544, 20);
		getContentPane().add(lblLicenciaMit);
			
	}
}
