public class Triangle extends Shape {

    private double a, b, c = 0.0;
	/**
	 * You should override this to create a shape, based on the
	 * shape's description (see ShapeDescription class)
	 * @param description the name of the shape and some doubles that define it
	 */
	Triangle( ShapeDescription description ) {
        super(description);
        Vector<Double> sideVector = sideVector(description.getDoubles());
        
        a = sideVector[0];
        b = sideVector[1];
        c = sideVector[2];
    }
	
	/**
	 * Returns the area of a shape
	 * @return the area
	 */
    @Override
    public double getArea()
    {
       double area = 0.0;
       double s = 0.0;

       s = .5 * (a+b+c);
       area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
       return area;
    }
	
	
	/**
	 * Returns the perimeter of a shape
	 * @return the perimeter 
	 */
    @Override
    public double getPerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
}