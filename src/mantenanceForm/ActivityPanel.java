package mantenanceForm;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Component;

public class ActivityPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public ActivityPanel() {
		setPreferredSize(new Dimension(751, 50));
		setAlignmentY(Component.TOP_ALIGNMENT);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.DARK_GRAY));
		setMaximumSize(new Dimension(32767, 50));
		setMinimumSize(new Dimension(32767, 50));
		setLayout(new MigLayout("insets 0, gap 0", "[grow,fill][80px:80px:80px,fill][80px:80px:80px,fill][122px:122px:122px,fill]", "[grow]"));
		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(64, 64, 64)));
		add(panel, "cell 0 0,grow");
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_1.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(64, 64, 64)));
		add(panel_1, "cell 1 0,grow");
		
		JPanel panel_2 = new JPanel();
		panel_2.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_2.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_2.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		add(panel_2, "cell 2 0,grow");
		
		JPanel panel_3 = new JPanel();
		panel_3.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_3.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_3.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		add(panel_3, "cell 3 0,grow");
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);

	}

}
