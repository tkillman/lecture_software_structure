package s01_strategy_pattern;

public class EntryPoint {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly(); // 날개로 난다

        // 전략 교체
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly(); // 날 수 없다
    }
}
