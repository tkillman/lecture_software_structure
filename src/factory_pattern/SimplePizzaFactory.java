public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
            pizza = new CheesePizza(ingredientFactory);
            // else if (type.equals("greek"))
            // pizza = new GreekPizza();
            // else if (type.equals("pepperoni"))
            // pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
