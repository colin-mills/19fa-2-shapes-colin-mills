public class Circle extends Shape {

    private double radius;

	Circle( ShapeDescription description ) {
        super(description);
        radius = description.getDoubles().get(0);
    }//END Constructor
	
	/**
	 * Returns the area of a shape
	 * @return the area
	 */
    @Override
    public double getArea() {
       double area = Math.pow(radius, 2) * Math.PI;
       return area;
    }//END getArea
	
	
	/**
	 * Returns the perimeter of a shape
	 * @return the perimeter 
	 */
    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }//END get Perim
}