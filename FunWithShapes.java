public class FunWithShapes extends ShapeHandler {

    FunWithShapes() throws ShapeException {
        super();
    }//END construct
    /**
	 * Given the shapeDescriptions, converts it to a vector
	 * of actual shape objects.
	 */
    @Override
    public void convertDescriptionsToShapes() {

        for (ShapeDescription s: shapeDescriptions) {
            
            ShapeDescription.ShapeTypes shapeType = s.getShapeType();

            if (shapeType == ShapeDescription.ShapeTypes.CIRCLE) {
                Circle shape = new Circle(s);
                shapes.add(shape);
            }
            else if (shapeType == ShapeDescription.ShapeTypes.SQUARE) {
                Square shape = new Square(s);
                shapes.add(shape);
            }
            else if (shapeType == ShapeDescription.ShapeTypes.RECTANGLE) {
                Rectangle shape = new Rectangle(s);
                shapes.add(shape);
            }
            else if (shapeType == ShapeDescription.ShapeTypes.TRIANGLE) {
                Triangle shape = new Triangle(s);
                shapes.add(shape);
            }
        }//END for loop

    }//END convert Descriptions

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
    }//END sumArea
	

	
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
    }//END sumPErim 
    public static void main(String[] args) {

        try {
            double areas = 0.0;
            double perimeters = 0.0;

            FunWithShapes fun = new FunWithShapes();
            areas = fun.sumOverAreas();
            perimeters = fun.sumOverPerimeters();

            System.out.println(areas);
            System.out.println(perimeters);
            
        } 
        catch (ShapeException exc) {
            System.out.println("Caught Shape Exception");
        }
        catch (Exception e) {
            System.out.println("WTF");
        }
         
    }//END Main 

}//END FUNWITHSHAPES