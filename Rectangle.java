public class Rectangle extends Shape {

    private double height, width = 0.0;
	/**
	 * You should override this to create a shape, based on the
	 * shape's description (see ShapeDescription class)
	 * @param description the name of the shape and some doubles that define it
	 */
	Rectangle( ShapeDescription description ) {
        super(description);
        Vector<Double> sideVector = description.getDoubles();
        
        height = sideVector[0];
        width = sideVector[1];
    }
	
	/**
	 * Returns the area of a shape
	 * @return the area
	 */
    @Override
    public double getArea()
    {
       double area = height * width;
       return area;
    }
	
	
	/**
	 * Returns the perimeter of a shape
	 * @return the perimeter 
	 */
    @Override
    public double getPerimeter() {
        double perimeter = (height * 2) + (width * 2);
        return perimeter;
    }
}