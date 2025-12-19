package s01_strategy_pattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("청둥오리");
    }
}