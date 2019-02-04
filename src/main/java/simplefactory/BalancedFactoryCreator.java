package simplefactory;

public class BalancedFactoryCreator extends ShapeFactoryCreator{

	@Override
	public Shape generator(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType==null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}

}
