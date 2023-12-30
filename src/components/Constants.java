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
	private static Font mainFont =  new Font("Arial", Font.BOLD, 12);
	
	
	
	
	
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
