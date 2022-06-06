package lab4;

import java.io.IOException;

public abstract class ImageInterface {
	public abstract void drawBox()  throws IOException;
	public abstract void viewImage(int x, int y)  throws IOException;
}
