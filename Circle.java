public  class Circle extends Shape {

    private double radius;
	/**
	 * You should override this to create a shape, based on the
	 * shape's description (see ShapeDescription class)
	 * @param description the name of the shape and some doubles that define it
	 */
	Shape( ShapeDescription description ) {
        radius = description.getDoubles();
    }
	
	/**
	 * Returns the area of a shape
	 * @return the area
	 */
    @Override
    public double getArea()
    {
       double area = Math.sqrt(radius) * Math.PI;
       return area;
    }
	
	
	/**
	 * Returns the perimeter of a shape
	 * @return the perimeter 
	 */
    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}