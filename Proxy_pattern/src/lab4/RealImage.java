package lab4;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;
import javax.swing.JFrame;

public class RealImage extends ImageInterface {
	public BufferedImage picture;
	public String path;
	public int width;
	public int height;
	Frames frame;

	public RealImage(String path, int width, int height) {
		this.frame = new Frames("Proxy pattern");
		this.path = path;
		this.width = width;
		this.height =height;
	}

	@Override 
	public void drawBox() throws IOException {
		System.out.println(picture +"  picture during drawing box");
		frame.box(width, height);
	}
	@Override
	public void viewImage(int x, int y)  throws IOException {
		System.out.println(picture +"  picture during drawing image");
		frame.image(picture, x, y, width, height);
	}
}
