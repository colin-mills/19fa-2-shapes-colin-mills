public class Square extends Shape {

    private double sideLength;

	Square( ShapeDescription description ) {
        super(description);
        sideLength = description.getDoubles().get(0);
    }//END constructor
	
	/**
	 * Returns the area of a shape
	 * @return the area
	 */
    @Override
    public double getArea() {
       double area = Math.pow(sideLength, 2);
       return area;
    }//END getArea
	
	
	/**
	 * Returns the perimeter of a shape
	 * @return the perimeter 
	 */
    @Override
    public double getPerimeter() {
        double perimeter = 4 * sideLength;
        return perimeter;
    }//END get perim
}