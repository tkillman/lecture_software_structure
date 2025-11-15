public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public String createDough() {
        return "NYPizzaIngredientFactory createDough";
    }

    @Override
    public String createSauce() {
        return "NYPizzaIngredientFactory createSauce";
    }

    @Override
    public String createCheese() {
        return "NYPizzaIngredientFactory createCheese";
    }

    @Override
    public String createVeggies() {
        return "NYPizzaIngredientFactory createVeggies";
    }

    @Override
    public String createPepperoni() {
        return "NYPizzaIngredientFactory createPepperoni";
    }

    @Override
    public String createClam() {
        return "NYPizzaIngredientFactory createClam";
    }
}
