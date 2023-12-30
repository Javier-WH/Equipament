package components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;


public class Cmessage extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private ActionListener okActionListener;
	private ActionListener cancelActionListener;

	/**
	 * @wbp.parser.constructor
	 */
	public Cmessage( String okText, String cancelText, String messageText, ActionListener okActionListener) {


		this(okText, cancelText, messageText, okActionListener, null);
	}

	public Cmessage( String okText, String cancelText, String messageText, ActionListener okActionListener, ActionListener cancelActionListener) {
		super();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cmessage.class.getResource("/assets/logoA.jpg")));
		this.okActionListener = okActionListener;
		this.cancelActionListener = cancelActionListener;
		contentPanel.setBackground(Constants.getSurfaceColor());
		setBackground(Constants.getSurfaceColor());
		setType(Type.POPUP);
		setResizable(false);
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(416, 168);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setPreferredSize(new Dimension(400, 60));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JLabel lblMessaje = new JLabel(messageText);
			lblMessaje.setForeground(Constants.getMainColor());
			lblMessaje.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblMessaje.setHorizontalAlignment(SwingConstants.CENTER);
			lblMessaje.setPreferredSize(new Dimension(112, 60));
			contentPanel.add(lblMessaje);
		}

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Constants.getSurfaceColor());
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				CButton okButton = new CButton(okText);
				okButton.setMaximumSize(new Dimension(80, 23));
				okButton.setPreferredSize(new Dimension(100, 40));
				okButton.setActionCommand("OK");
				okButton.addActionListener(this.okActionListener);
				buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}

			CButton cancelButton = new CButton(cancelText);
			cancelButton.setPreferredSize(new Dimension(100, 40));
			cancelButton.setActionCommand("Cancel");

			if (this.cancelActionListener != null) {
				cancelButton.addActionListener(this.cancelActionListener);
			} else {
				cancelButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
			}

			buttonPane.add(cancelButton);
		}
		pack(); // Ajusta el tamaño de la ventana según su contenido
		setLocationRelativeTo(null);
	}
}