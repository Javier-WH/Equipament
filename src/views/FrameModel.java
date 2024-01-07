package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import components.CButton;
import components.Constants;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FrameModel extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	CButton okButton = new CButton("Aceptar");
	protected boolean showAceeptButton = false;
	
	public FrameModel(JPanel parent, String title) {
		getContentPane().setBackground(Constants.getSurfaceColor());
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameModel.class.getResource("/assets/logoF.png")));
		setModal(true);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 655, 484);
		setSize(1000, 600);
		setLocationRelativeTo(parent);
		setTitle(title);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		contentPanel.setBackground(Constants.getSurfaceColor());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Constants.getSurfaceColor());
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				if(showAceeptButton) {
					okButton.setPreferredSize(new Dimension(100, 30));
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				
			}
			{
				CButton cancelButton = new CButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setPreferredSize(new Dimension(100, 30));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	protected void onAcept(ActionListener action) {
		showAceeptButton = true;
		okButton.addActionListener(action);
	}

	public void setShowAceeptButton(boolean showAceeptButton) {
		this.showAceeptButton = showAceeptButton;
	}
	
	

}
