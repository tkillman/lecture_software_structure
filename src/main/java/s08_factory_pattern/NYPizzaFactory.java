package s08_factory_pattern;
public class NYPizzaFactory extends SimplePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }
        // else if (type.equals("veggie")) {
        // pizza = new NYStyleVeggiePizza();
        // }
        return pizza;
    }

}
