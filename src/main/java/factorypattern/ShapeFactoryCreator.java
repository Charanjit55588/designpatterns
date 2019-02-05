package factorypattern;

import simplefactory.Shape;

abstract public class ShapeFactoryCreator {
abstract public Shape generator(String shapeType);
}
