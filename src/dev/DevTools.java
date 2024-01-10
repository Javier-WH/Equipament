package dev;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import dataBaseModels.MaintenanceRoutines;
import utilitys.DateHandler;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;

public class DevTools extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDateChooser dateChooser = new JDateChooser();

	public DevTools() {
		setResizable(false);
		setTitle("DevTool");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 108);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.NORTH, dateChooser, 11, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, dateChooser, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, dateChooser, 33, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, dateChooser, 166, SpringLayout.WEST, contentPane);
		contentPane.setLayout(sl_contentPane);
		contentPane.add(dateChooser);
		
		JButton btnNewButton = new JButton("Fijar fecha");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 18, SpringLayout.EAST, dateChooser);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, 33, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, contentPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				Date date = dateChooser.getDate();
				
				if(date == null) {
					return;
				}
			
				
				Instant instant = date.toInstant();
		        LocalDate localdate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
		        String dateS = DateHandler.dateToString(localdate);
				
		        
		        HashMap<String, String> hashMap = new HashMap<>();
		        hashMap.put("lastUpdate", dateS);
		        try {
					new MaintenanceRoutines().updateRecord(hashMap);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		contentPane.add(btnNewButton);
	}
}
