public class Rectangle extends Shape {

    private double height = 0.0;
    private double width = 0.0;

	Rectangle( ShapeDescription description ) {
        super(description);
        
        height = description.getDoubles().get(0);
        width = description.getDoubles().get(1);
    }//END Constructor
	
	/**
	 * Returns the area of a shape
	 * @return the area
	 */
    @Override
    public double getArea(){
       double area = height * width;
       return area;
    }//END get area
	
	
	/**
	 * Returns the perimeter of a shape
	 * @return the perimeter 
	 */
    @Override
    public double getPerimeter() {
        double perimeter = (height * 2) + (width * 2);
        return perimeter;
    }//END getPerim
}