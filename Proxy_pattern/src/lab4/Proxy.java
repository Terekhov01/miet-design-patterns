package lab4;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;
public class Proxy extends ImageInterface {
	public RealImage img;

	@Override 
	public void drawBox() throws IOException {
		if(img==null) {
			String path = "lab4/earth-lake-7217.jpg";
			BufferedImage image = ImageIO.read(new File(path));
			img = new RealImage(path, image.getWidth(), image.getHeight());
		}
		img.drawBox();
	}
	@Override
	public void viewImage(int x, int y)  throws IOException {
		img.picture = ImageIO.read(new File(img.path));	
		img.viewImage(x, y);
	}
}
