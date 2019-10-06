
public class FunWithShapes extends ShapeHandler {
    public static void main(String[] args) {

        //try {
            double areas = 0.0;
            double perimeters = 0.0;
            //ShapeHandler fun = new FunWithShapes();
            
            //double areas = fun.sumOverAreas();
            //double perimeters = fun.sumOverPerimeters();

            
            System.out.println(areas);
            System.out.println(perimeters);

            return;

        /*} catch (ShapeException e) {
            System.out.println("Caught ShapeException");
        } catch (Exception e) {
            System.out.println("Unknown exception caught here");
        }*/

        
    }
    /**
	 * Given the shapeDescriptions, converts it to a vector
	 * of actual shape objects.
	 */
    @Override
    public void convertDescriptionsToShapes() {
        //ShapeTypes shapeType = "";

        for (ShapeDescription s: shapeDescriptions) {

            //shapeType = s.getShapeType;

                if (s.getShapeType == ShapeDescription.ShapeTypes.CIRCLE) {
                    Circle shape = new Circle(s);
                }
                else if (s.getShapeType == ShapeDescription.ShapeTypes.SQUARE) {
                    Square shape = new Square(s);
                }
                else if (s.getShapeType == ShapeDescription.ShapeTypes.RECTANGLE) {
                    Rectangle shape = new Rectangle(s);
                }
                else if (s.getShapeType == ShapeDescription.ShapeTypes.TRIANGLE) {
                    Triangle shape = new Triangle(s);
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