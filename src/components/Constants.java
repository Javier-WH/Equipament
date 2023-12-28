package components;

import java.awt.Color;
import java.awt.Font;

public class Constants {

	private static Color mainColor = Color.BLUE;
	private static Color surfaceColor = Color.WHITE;
	private static Color textColor = Color.WHITE;
	private static Color secondaryColor = Color.CYAN;
	private static Color actionColor = Color.BLACK; 
	private static Font mainFont =  new Font("Arial", Font.BOLD, 12);
	
	
	
	
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
