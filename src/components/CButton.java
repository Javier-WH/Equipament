package components;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class CButton extends JButton {

	private int radius = 50;
	private boolean isOver = false;

	public CButton(String text) {
		super("   " + text + "   ");
		setBorder(null);
		setContentAreaFilled(false);
		setBackground(Constants.getSurfaceColor());
		setForeground(Constants.getMainColor());
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setFont(Constants.getMainFont());
		
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				setBackground(Constants.getActionColor());

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (isOver) {
			
					setBackground(Constants.getMainColor());
					setForeground(Constants.getSurfaceColor());
				} else {
					setBackground(Constants.getSurfaceColor());
					setForeground(Constants.getMainColor());
				}

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(Constants.getMainColor());
				setForeground(Constants.getSurfaceColor());
				isOver = true;

			}

			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(Constants.getSurfaceColor());
				setForeground(Constants.getMainColor());
				isOver = false;

			}
		});

	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Constants.getMainColor());
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
		g2.setColor(getBackground());
		g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);

		super.paintComponent(g);
	}
}
