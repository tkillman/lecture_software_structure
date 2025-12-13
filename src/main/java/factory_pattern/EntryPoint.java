package factory_pattern;

public class EntryPoint {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");

    }
}
