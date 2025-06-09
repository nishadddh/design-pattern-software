package factory2;

public class ShapeFactory {
    // Use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return (Shape) new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return (Shape) new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return (Shape) new Square();
        }
        return null;
    }
}