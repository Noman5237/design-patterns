package factory.pizzastore.store;

import factory.pizzastore.factory.NYPizzaIngredientFactory;
import factory.pizzastore.factory.PizzaIngredientFactory;
import factory.pizzastore.franchise.NYFranchise;
import factory.pizzastore.pizza.Pizza;
import factory.pizzastore.pizza.Pizzas;

public class NYStylePizzaStore extends PizzaStore {
	
	private final PizzaIngredientFactory pizzaIngredientFactory;
	
	public NYStylePizzaStore() {
		pizzaIngredientFactory = new NYPizzaIngredientFactory();
	}
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = Pizzas.createPizza(type, pizzaIngredientFactory);
		return new NYFranchise(pizza);
	}
}
