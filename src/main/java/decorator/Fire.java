package decorator;

public class Fire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vanila valina=new Vanila(new Expresso());
		System.out.println(valina.cost());
		
		SoyMilk soy=new SoyMilk(new Expresso());
		System.out.println(soy.cost());
	}

}
