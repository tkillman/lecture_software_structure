package main.java.template_pattern;

public class Tea extends CaffeineBeverage {
    // void prepareRecipe() {
    // boilWater();
    // steepTeaBag();
    // pourInCup();
    // addLemon();
    // }

    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
