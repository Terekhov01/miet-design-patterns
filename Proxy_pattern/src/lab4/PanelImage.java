package lab4;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelImage extends JPanel implements MouseListener, MouseMotionListener{

	int prevX, prevY;
	JLabel label;

	public PanelImage(JLabel label, int x, int y,int w, int h) {
		this.setLayout(null);
		this.label = label;
		this.label.setBounds(0,0,w,h);
		this.label.setLocation(x,y);
		addMouseMotionListener(this);
		addMouseListener(this);
		add(this.label);

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		prevX = label.getX() - e.getX();
		prevY = label.getY() - e.getY();

		Component c = e.getComponent();
		if(c instanceof JLabel){
			updateLocation(e);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Component c = e.getComponent();
		if(c instanceof JLabel){
			updateLocation(e);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		updateLocation(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	private void updateLocation(MouseEvent e) {
		label.setLocation(prevX + e.getX(), prevY + e.getY());
		repaint();
	}

}