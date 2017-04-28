package raytracer;

public class Color {

	float r;
	float g;
	float b;

	public Color (){
		r = 1;
		g = 1;
		b = 1;
	}

	public Color(float R, float G, float B){
		r = R;
		g = G;
		b = B;
	}

	public Color add(Color c){
		r += c.r; 
		g += c.g; 
		b += c.b; 
		return this;
	}
	public Color sub(Color c){
		r -= c.r;
		g -= c.g;
		b -= c.b;
		return this;
	}

	public Color mul(Color c){
		r *= c.r;
		g *= c.g;
		b *= c.b;
		return this;
	}

	public Color mul(float s){
		r *= s;
		g *= s;
		b *= s;
		return this;
	}


	public static boolean equals(Color a, Color b)
			{
		return a.r == b.r && a.g == b.g && a.b == b.b;
			}

	public static boolean nequal (Color a, Color b)
			{
		return a.r != b.r || a.g != b.g || a.b != b.b;
			}

	Color AdjustColor(Color c)
	{
		if (c.r>1) c.r=1;
		if (c.g>1) c.g=1;
		if (c.b>1) c.b=1;
		if (c.r<0) c.r=0;
		if (c.g<0) c.g=0;
		if (c.b<0) c.b=0;
		return c;
	}


	static final Color Red = new Color(1, 0, 0);
	static final Color Green = new Color(0, 1, 0);
	static final Color Blue = new Color(0, 0, 1);
	static final Color Black = new Color(0, 0, 0);
	static final Color White = new Color(1, 1, 1);

}
