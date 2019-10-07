public class Triangle extends Shape {

    private double a = 0.0;
    private double b = 0.0;
    private double c = 0.0;

    
	Triangle( ShapeDescription description ) {
        super(description);
        a = description.getDoubles().get(0);
        b = description.getDoubles().get(1);
        c = description.getDoubles().get(2);
    }//END constructor
	
	/**
	 * Returns the area of a shape
	 * @return the area
	 */
    @Override
    public double getArea() {
       double area = 0.0;
       double s = 0.0;

       s = .5 * (a+b+c);
       area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
       return area;
    }//END getArea
	
	
	/**
	 * Returns the perimeter of a shape
	 * @return the perimeter 
	 */
    @Override
    public double getPerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }//END getPerim
}