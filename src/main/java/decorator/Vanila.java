package decorator;

public class Vanila {
	Beverage beverage;
	Vanila(Beverage beverage){
		this.beverage=beverage;
	}
	int cost() {
		return this.beverage.cost() + 2;
		
	}

}
