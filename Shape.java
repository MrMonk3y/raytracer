package raytracer;

public class Shape {

	int type; // INV: either 0 (sphere) or 1 (plane)
	Vektor v; // sphere: center, plane: plane normal
	double d; // sphere: radius, plane: distance from origin
	Color ambientColor; // ambient color ("Eigenleuchten")
	Color diffuseColor; // diffuse color ("Diffuse Lichtreflektion")
	Color reflectionColor; // reflection color ("Spiegelung")
	// POST: shape is initialized with type = Type, v = V
	// d = D, ambientColor = aC, diffuseColor=dC and
	// reflectionColor = rC
	Shape(int Type, Vektor V, double D, Color aC, Color dC, Color rC);
	// POST: if there is an intersection between ray and
	// this shape, return true and return intersection
	// point as the parameter t in ray.start + ray.direction * t.
	// return false otherwise
	boolean intersect(const Ray& ray, double& t) const;
	// PRE: vector "at" lies on the surface of this object
	// POST: return a normal vector of the shape at position "at"
	Vektor get_normal(const Vektor& at) const;
}
