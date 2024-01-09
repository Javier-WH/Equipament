package mantenanceForm;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import utilitys.DateHandler;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import javax.swing.border.MatteBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BoxLayout;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;



public class ActivityPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private final ButtonGroup doneBTNgroup = new ButtonGroup();
	private JRadioButton rbtnSi = new JRadioButton("");
	private JRadioButton rbtnNo = new JRadioButton("");
	private JDateChooser dateChooser = new JDateChooser();
	private String activity;
	private int alarmID;
	
	
	public ActivityPanel(int alarmID, String activity) {
		
		this.alarmID = alarmID;
		this.activity = activity;
		
		setPreferredSize(new Dimension(751, 50));
		setAlignmentY(Component.TOP_ALIGNMENT);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.DARK_GRAY));
		setMaximumSize(new Dimension(32767, 50));
		setMinimumSize(new Dimension(32767, 50));
		setLayout(new MigLayout("insets 0, gap 0",
				"[grow,fill][80px:80px:80px,fill][80px:80px:80px,fill][122px:122px:122px,fill]", "[grow]"));

		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(64, 64, 64)));
		add(panel, "cell 0 0,grow");
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		Component horizontalStrut = Box.createHorizontalStrut(10);
		panel.add(horizontalStrut);
		
		JLabel lblActivity = new JLabel(this.activity);
		lblActivity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblActivity.setMaximumSize(new Dimension(30000, 30000));
		panel.add(lblActivity);

		JPanel panel_1 = new JPanel();
		panel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_1.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(64, 64, 64)));
		add(panel_1, "cell 1 0,grow");
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		
		doneBTNgroup.add(rbtnSi);
		rbtnSi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rbtnSi.setSelectedIcon(new ImageIcon(ActivityPanel.class.getResource("/assets/selectedRadio.png")));
		rbtnSi.setIcon(new ImageIcon(ActivityPanel.class.getResource("/assets/unselectedRadio.png")));
		rbtnSi.setMaximumSize(new Dimension(30000, 30000));
		rbtnSi.setHorizontalAlignment(SwingConstants.CENTER);
		rbtnSi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(rbtnSi);

		JPanel panel_2 = new JPanel();
		panel_2.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_2.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_2.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		add(panel_2, "cell 2 0,grow");
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		rbtnNo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rbtnNo.setIcon(new ImageIcon(ActivityPanel.class.getResource("/assets/unselectedRadio.png")));
		rbtnNo.setSelected(true);
		rbtnNo.setSelectedIcon(new ImageIcon(ActivityPanel.class.getResource("/assets/selectedRadio2.png")));
		rbtnNo.setHorizontalAlignment(SwingConstants.CENTER);
		rbtnNo.setMaximumSize(new Dimension(30000, 30000));
		doneBTNgroup.add(rbtnNo);
		panel_2.add(rbtnNo);

		JPanel panel_3 = new JPanel();
		panel_3.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_3.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_3.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		add(panel_3, "cell 3 0,grow");
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		dateChooser.setEnabled(false);
		dateChooser.setBorder(null);
		dateChooser.getCalendarButton().setBorder(null);
		dateChooser.getCalendarButton().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dateChooser.setLocale(new Locale("es"));
		panel_3.add(dateChooser);
		
		radioButonsEvents();
	
	}
	
	private void radioButonsEvents() {
		
		rbtnSi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dateChooser.setEnabled(true);
				dateChooser.setDate(new Date());
				
			}
		});
		
		rbtnNo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dateChooser.setEnabled(false);
				dateChooser.setDate(null);
				
			}
		});
	}
	
	
	public int getId() {
		return alarmID;
	}
	
	public boolean isDone() {
		return rbtnSi.isSelected();
	}
	
	public String getDate() {
		Date date = dateChooser.getDate();
		Instant instant = date.toInstant();
        LocalDate localdate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        return DateHandler.dateToString(localdate);
	}
}
