package factorypattern;

import simplefactory.Circle;
import simplefactory.Shape;

public class RandomFactoryCreator extends ShapeFactoryCreator{

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
			return new Circle();
		}
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Circle();
		}
		return null;
	}

}
