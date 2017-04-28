package raytracer;


public class Vektor {
	
	public double x;
	public double y;
	public double z;
	
	public Vektor(){
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Vektor(double x_, double y_, double z_){
		x = x_;
		y = y_;
		z = z_;
	}
	
	public Vektor add(Vektor v){
		x += v.x;
		y += v.y;
		z += v.z;
		
		return this;
	}
	
	public Vektor sub(Vektor v){
		x -= v.x;
		y -= v.y;
		z -= v.z;
		
		return this;
	}
	
	public double mul(Vektor v){
		return x*v.x + y*v.y + z*v.z;
	}
	
	public Vektor mul(double d){
		x *= d;
		y *= d;
		z *= d;
		
		return this;
	}
	
	public Vektor neg(){
		x *= -1;
		y *= -1;
		z *= -1;
		
		return this;
	}
	
	public static Vektor normalize(Vektor v){
		
		return v.mul(1/norm(v));
	}

	public static double norm(Vektor v){
		return Math.sqrt(v.x*v.x + v.y*v.y + v.z*v.z);
	}
}
