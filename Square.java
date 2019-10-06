public class Square extends Shape {

    private double sideLength;
	/**
	 * You should override this to create a shape, based on the
	 * shape's description (see ShapeDescription class)
	 * @param description the name of the shape and some doubles that define it
	 */
	Square( ShapeDescription description ) {
        super(description);
        sideLength = description.getDoubles();
    }
	
	/**
	 * Returns the area of a shape
	 * @return the area
	 */
    @Override
    public double getArea()
    {
       double area = Math.pow(sideLength, 2);
       return area;
    }
	
	
	/**
	 * Returns the perimeter of a shape
	 * @return the perimeter 
	 */
    @Override
    public double getPerimeter() {
        double perimeter = 4 * sideLength;
        return perimeter;
    }
}