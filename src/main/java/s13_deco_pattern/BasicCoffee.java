package s13_deco_pattern;

public class BasicCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public int cost() {
        return 3000;
    }
}