package factorypattern;

import factorypattern.BalancedFactoryCreator;
import factorypattern.RandomFactoryCreator;
import factorypattern.ShapeFactoryCreator;

public class FireFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ShapeFactoryCreator bfc=new BalancedFactoryCreator();
		ShapeFactoryCreator rfc=new RandomFactoryCreator();
		bfc.generator("Square");
		//to be fixed its accessing Shape from simplefactory package
		simplefactory.Shape shape1=bfc.generator("Square");
		shape1.draw();
		simplefactory.Shape shape2=rfc.generator("Square");
		shape2.draw();

	}

}
