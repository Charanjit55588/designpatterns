package simplefactory;


public class FireFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeFactory shapeFactory=new ShapeFactory();
		
		Shape shape1=shapeFactory.getShape("Circle");
		shape1.draw();
	
		Shape shape2=shapeFactory.getShape("Square");
		shape2.draw();
		
		Shape shape3=shapeFactory.getShape("Rectangle");
		shape3.draw();
		
	}

}
