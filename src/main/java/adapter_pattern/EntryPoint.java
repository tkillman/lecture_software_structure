package adapter_pattern;

public class EntryPoint {

    public static void main(String[] args) {
        System.out.println("Adapter Pattern Example");

        MallardDuck duck = new MallardDuck();
        WildTurkey turky = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turky);

        turky.gobble();
        turky.jump();

        testDuck(duck);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
