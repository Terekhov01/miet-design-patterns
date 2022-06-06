package lab4;

import java.io.IOException;

public class Main {
	public static ImageInterface imageInetface;
	public static void main(String[] args) throws IOException {
		imageInetface  = start(); //туда складывается прокси
		imageInetface.drawBox();
	}

	public static Proxy start() {
		Proxy img = new Proxy();
		return img;
	}
}
