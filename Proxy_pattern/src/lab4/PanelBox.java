package lab4;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JPanel;

class PanelBox extends JPanel implements MouseListener, MouseMotionListener{
	public int x =0,y=0 , width, height;
	Rectangle rect;
	int counter =0;
	public PanelBox(int w, int h){
		this.width = w;
		this.height = h;
		this.rect = new Rectangle(x,y,width,height);
		addMouseMotionListener(this);
		addMouseListener(this);

	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(rect);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		counter++;
		if (counter==2) {
			try {
				Main.imageInetface.viewImage((int)rect.getX(),(int)rect.getY());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = (int)rect.getX() - e.getX();
		y = (int)rect.getY()- e.getY();
		updateLocation(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		updateLocation(e);
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
		rect.setLocation(x + e.getX(), y + e.getY());
		rect.setSize(width,height);
		repaint();
	}
}
