package decorator;

public class SoyMilk extends Decorator{
	Beverage beverage;
	SoyMilk(Beverage beverage){
		this.beverage=beverage;
	}
	int cost() {
		return this.beverage.cost() + 5;
		
	}
}
