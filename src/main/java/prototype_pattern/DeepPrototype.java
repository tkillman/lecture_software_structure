package prototype_pattern;

class DeepPrototype implements Prototype<DeepPrototype> {

    int x = 10;
    Nested ref = new Nested(100);

    @Override
    public DeepPrototype clone() {
        DeepPrototype copy = new DeepPrototype();
        copy.x = this.x;
        copy.ref = this.ref.clone(); // deep copy → 새로운 Nested 객체
        return copy;
    }

    @Override
    public String toString() {
        return "Deep{x=" + x + ", ref=" + ref + "}";
    }
}
