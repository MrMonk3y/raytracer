package raytracer;
import java.util.Collections;
import java.util.Vector;
import java.awt.Color;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
/*from w w w . j a  v a2  s. c  o m*/
import javax.imageio.ImageIO;


public class Bitmap {

	private int width;
	private int height;
	private Vector<Color> pixels;
	//move.add(new Integer(x));
	public Bitmap(int w, int h){
		width = w;
		height = h;
		pixels = new Vector<Color>(width * height);
		assert (width < 32767);
		assert (height < 32767);
		assert (height > -1);
		assert (width > -1);
	}

   
	public Color getColor(int x, int y){
		assert (x < width);
		assert (y < height);
		return pixels.elementAt(y*width + x);
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}


	void fill(Color color)
	{
		Collections.fill(pixels, color);
	}

	void static save (String filename)
	{
	}

	void Bitmap::Write (std::ostream& os, float value)
	{
	}

	void Bitmap::Write (std::ostream& os, unsigned length, int value)
	{
	}
	
	

	/*
	int main ()
	{
		Bitmap bitmap (512, 512);

		Color top = Red;
		Color bottom = Green;

		for (unsigned y = 0; y != bitmap.GetHeight (); ++y)
		{
			Color color = top + (bottom - top) * (float (y) / bitmap.GetHeight ());

			for (unsigned x = 0; x != bitmap.GetWidth (); ++x)
				bitmap (x, y) = color;
		}

		bitmap.Save ("test.bmp");
	}
	 */



}
