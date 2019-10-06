import ShapeDescription.ShapeTypes;

public class FunWithShapes extends ShapeHandler {

    public static void main(String[] args) {
        System.out.println("Hello Georgetown");
        return;
    }
    /**
	 * Given the shapeDescriptions, converts it to a vector
	 * of actual shape objects.
	 */
    @Override
    public void convertDescriptionsToShapes() {
        ShapeTypes shapeType = "";

        for (ShapeDescription s: shapeDescriptions) {

            shapeType = s.getShapeType;

                if (shape == ShapeTypes.CIRCLE) {
                    Circle shape = Circle(s);
                }
                else if (shapeType == ShapeTypes.SQUARE) {
                    Square shape = Square(s);
                }
                else if (shapeType == ShapeTypes.RECTANGLE) {
                    Rectangle shape = Rectangle(s);
                }
                else if (shapeType == ShapeTypes.TRIANGLE) {
                    Triangle shape = Triangle(s);
                }
                else {System.out.println("Shape Type: " + shape + " not found from within convertDescriptionsToShapes()");
            }
            shapes.add(shape);

        }
    }

	
	
	/**
	 * Computes the sum of the shapes' areas, where the shapes
	 * are from the shapes list
	 * @return the sum of the shapes' areas
	 */
    @Override
	public double sumOverAreas() {
        double tempArea = 0.0;
        double totalArea = 0.0;
        for (Shape s: shapes) {
            tempArea = s.getArea();
            totalArea += tempArea;
        }
        return totalArea;
    }
	

	
	/**
	 * Computes the sum of the shapes' perimeters, where the shapes
	 * are from the shapes list
	 * @return the sum of the shapes' perimeters
	 */
    @Override
    public double sumOverPerimeters() {
        double tempPerimeter = 0.0;
        double totalPerimeter = 0.0;
        for (Shape s: shapes) {
            tempPerimeter = s.getPerimeter();
            totalPerimeter += tempPerimeter;
        }
        return totalPerimeter;
    } 

}