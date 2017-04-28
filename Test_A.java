package raytracer;

public class Test_A {

	Vektor v = new Vektor(1,2,3);
    final static double eps = 0.0001;

    static boolean report(String name, boolean result)
    {
        System.out.println("test " + name);
        if (result)
            System.out.println("passed");
        else
            System.out.println("failed");
        return result;
    }

    static boolean is_equal(double d1, double d2)
    {
        return Math.abs(d1 - d2) <= ((Math.abs(d1) > Math.abs(d2) ? Math.abs(d2) : Math.abs(d1)) * eps);
    }

    static boolean is_equal(Vektor v1, Vektor v2)
    {
        return is_equal(v1.x, v2.x) && is_equal(v1.y, v2.y) && is_equal(v1.z, v2.z);
    }

    static boolean test_addition()
    {
        boolean result = true;
        result &= report("add 1", is_equal(new Vektor(1, 2, 3).add(new Vektor(3,4,6)), new Vektor(4, 6, 9)));
        result &= report("add 2", is_equal(new Vektor(3, 4, 6).add(new Vektor(1,2,3)), new Vektor(4, 6, 9)));

        Vektor v = new Vektor(1, 2, 3);
        result &= report("add 3",is_equal(v.add(new Vektor(3, 4, 6)), new Vektor(4, 6, 9)));
        result &= report("add 4",is_equal(v, new Vektor(4, 6, 9)));

        return report("test_addition", result);
    }

    static boolean test_subtraction()
    {
        boolean result = true;

        result &= report("subtract 1",is_equal(new Vektor(1, 2, 3).sub(new Vektor(3, 4, 6)), new Vektor(-2, -2, -3)));
        result &= report("subtract 2",is_equal(new Vektor(3, 4, 6).sub(new Vektor(1, 2, 3)), new Vektor(2, 2, 3)));

        Vektor v1 = new Vektor(1, 2, 3);
        result &= report("subtract 3",is_equal(v1.sub(new Vektor(3, 4, 6)), new Vektor(-2, -2, -3)));
        result &= report("subtract 4",is_equal(v1, new Vektor(-2, -2, -3)));

        Vektor v2 = new Vektor(1, 2, 3);
        result &= report("subtract 5",is_equal(v2.sub(new Vektor(3, 4, 6)), new Vektor(-2, -2, -3)));
        result &= report("subtract 6",is_equal(v2, new Vektor(-2, -2, -3)));

        return report("test_subtraction", result);
    }

    static boolean test_negation()
    {
        boolean result = true;
        result &= is_equal(new Vektor(1, 2, 3).neg(), new Vektor(-1, -2, -3));
        return report("test_negation", result);
    }

    static boolean test_scalar_multiplication()
    {
        boolean result = true;

        result &= report("scalar mul 1",is_equal(new Vektor(1, 2, 3).mul(1.5), new Vektor(1.5, 3.0, 4.5)));
        result &= report("scalar mul 2",is_equal(new Vektor(1, 2, 3).mul(1.5), new Vektor(1.5, 3.0, 4.5)));
// Vektro has to be leftside value. 1.5 * vektor is not valid
        Vektor v = new Vektor(1, 2, 3);
        result &= report("scalar mul 3",is_equal(v.mul(1.5), new Vektor(1.5, 3.0, 4.5)));
        result &= report("scalar mul 4",is_equal(v, new Vektor(1.5, 3.0, 4.5)));

        return report("test_scalar_multiplication", result);
    }

    static boolean test_scalar_product()
    {
        boolean result = true;

        result &= report("scalar product 1", is_equal(new Vektor(1, 2, 3).mul(new Vektor(3, 4, 6)), 29));
        result &= report("scalar product 2",is_equal(new Vektor(3, 4, 6).mul(new Vektor(1, 2, 3)), 29));

        return report("test_scalar_product", result);
    }

    static boolean test_norm()
    {
        boolean result = true;

        result &= is_equal(Vektor.norm(new Vektor(1, 2, 3)), 3.741657);

        return report("test_length", result);
    }

    static boolean test_normalize()
    {
        boolean result = true;

        result &= is_equal(Vektor.normalize(new Vektor(1, 2, 3)), new Vektor(0.267261, 0.534522, 0.801784));

        return report("test_normalize", result);
    }
	
    public static void main(String[] args) {
		boolean result = true;
	    result &= Test_A.test_addition();
	    result &= Test_A.test_subtraction();
	    result &= Test_A.test_negation();
	    result &= Test_A.test_scalar_multiplication();
	    result &= Test_A.test_scalar_product();
	    result &= Test_A.test_norm();
	    result &= Test_A.test_normalize();
	    Test_A.report("raytracer sub task a", result);

	}

}
