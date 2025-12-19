package s01_strategy_pattern;

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    // 핵심 포인트: 런타임 교체
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();
}