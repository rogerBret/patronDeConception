package new_builder2;

public class MonteurPizzaLocale extends MonteurPizza {
	public void monterPate() {
		pizza.setPate("locale");
	}
	
	public void monterSauce() {
		pizza.setSauce("secret");
	}
	
	public void monterGarniture() {
		pizza.setGarniture("ingredients locaux");
	}
}
