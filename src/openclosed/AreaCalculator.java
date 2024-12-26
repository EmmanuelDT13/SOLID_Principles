package openclosed;



public class AreaCalculator {

    public double calculateArea(GeneralShapeCalculator shape, double... dimensions) {
    	return shape.calculateArea(dimensions);
}

interface GeneralShapeCalculator{
	public double calculateArea(double... dimensions);
}

class CircleCalculator implements GeneralShapeCalculator{
	@Override
	public double calculateArea(double... dimensions) {
		double radius = dimensions[0];
        return Math.PI * radius * radius;
	}
}

class RectangleCalculator implements GeneralShapeCalculator{
	@Override
	public double calculateArea(double... dimensions) {
        double length = dimensions[0];
        double width = dimensions[1];
        return length * width; // Área del rectángulo
	}
}

class TriangleCalculator implements GeneralShapeCalculator{
	@Override
	public double calculateArea(double... dimensions) {
        double base = dimensions[0];
        double height = dimensions[1];
        return 0.5 * base * height; // Área del triángulo
		}
	}
}