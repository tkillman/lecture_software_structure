package main.java.template_pattern;

public class Coffee extends CaffeineBeverage {

    // void prepareRecipe() {
    // boilWater();
    // brewCoffeeGrinds();
    // pourInCup();
    // addSugarAndMilk();
    // }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public void brew() {
        brewCoffeeGrinds();
    }

    @Override
    public void addCondiments() {
        addSugarAndMilk();
    }

    @Override
    boolean customerWantsCondiments() {
        // custom hook 변경
        return true;
    }
}
