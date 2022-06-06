package lab4;

import java.awt.Container;
import java.awt.Image;
import java.awt.Panel;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frames extends JFrame{
	private JPanel currentPanel;
	public Frames(String str){
		super(str);
	}

	public void box(int width, int height) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.currentPanel = new PanelBox(width, height);
		this.add(this.currentPanel);
		this.setSize(1000, 1000);
		this.setVisible(true);
	}

	public void image(BufferedImage img, int x, int y, int width, int height) {
		this.remove(this.currentPanel);
		JLabel label = new JLabel(new ImageIcon(img));
		this.currentPanel = new PanelImage(label, x, y, width, height);
		this.add(this.currentPanel);
		this.setVisible(true);
	}

}
