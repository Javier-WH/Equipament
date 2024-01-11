package styles;

import java.awt.Color;

import com.toedter.calendar.IDateEditor;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

import components.Constants;

public class DateChooserStyles {

	public static void setStyle(JDateChooser date) {
		IDateEditor dateEditor = date.getDateEditor();
		if (dateEditor instanceof JTextFieldDateEditor) {
			JTextFieldDateEditor txtFld = (JTextFieldDateEditor) dateEditor;
			txtFld.setEditable(false);
			txtFld.setBackground(Constants.getSurfaceColor());
			txtFld.addPropertyChangeListener("foreground", event -> {
				if (Color.BLACK.equals(event.getNewValue())) {
					txtFld.setForeground(Constants.getTextColor());
				}
			});
		}
	}
	
	public static void setStyle2(JDateChooser date) {
		IDateEditor dateEditor = date.getDateEditor();
		if (dateEditor instanceof JTextFieldDateEditor) {
			JTextFieldDateEditor txtFld = (JTextFieldDateEditor) dateEditor;
			txtFld.setEditable(false);
			txtFld.setBackground(Constants.getTextColor());
			txtFld.addPropertyChangeListener("foreground", event -> {
				if (Color.BLACK.equals(event.getNewValue())) {
					txtFld.setForeground(Constants.getSurfaceColor());
				}
			});
		}

	}

}
