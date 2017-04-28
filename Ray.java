package raytracer;

public class Ray {

	Vektor start;
	Vektor direction; // INV: normalized
	// constructor
	// PRE: non-zero vector d
	// POST: ray with offset s and normalized direction vector d
	Ray(Vektor s, Vektor d){
		assert(d.x != 0 || d.y != 0 || d.z != 0);
		
		start = s;
		direction = Vektor.normalize(d);
	};
	
	
}
