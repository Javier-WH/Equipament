package components;

import java.awt.Color;
import java.awt.Font;

public class Constants {

	private static Color mainColor = Color.WHITE;
	private static Color surfaceColor = new Color(44, 62, 80);
	private static Color surfaceColorB = new Color(86, 101, 115);
	private static Color textColor = Color.WHITE;
	private static Color secondaryColor = Color.CYAN;
	private static Color actionColor = new Color(23, 32, 42);
	private static Color decoratorColor = Color.GRAY;
	private static Font mainFont = new Font("Arial", Font.BOLD, 12);
	private static Font tableFont = new Font("Arial", Font.PLAIN, 12);
	private static Color preventiveAlertColor = new Color(9, 54, 219);
	private static Color correctiveAlertColor = new Color(194, 125, 6);
	private static Color puestaAceroAlertColor = new Color(96, 181, 103);
	
	
	
	
	public static Color getPuestaAceroAlertColor() {
		return puestaAceroAlertColor;
	}

	public static Color getCorrectiveAlertColor() {
		return correctiveAlertColor;
	}

	public static Color getPreventiveAlertColor() {
		return preventiveAlertColor;
	}

	public static Font getTableFont() {
		return tableFont;
	}

	public static Color getSurfaceColorB() {
		return surfaceColorB;
	}

	public static Color getDecoratorColor() {
		return decoratorColor;
	}

	public static Color getActionColor() {
		return actionColor;
	}

	public static Color getSecondaryColor() {
		return secondaryColor;
	}

	public static Color getSurfaceColor() {
		return surfaceColor;
	}

	public static Font getMainFont() {
		return mainFont;
	}

	public static Color getTextColor() {
		return textColor;
	}

	public static Color getMainColor() {
		return mainColor;
	}

}
