package prototype_pattern;

class ShallowPrototype implements Prototype<ShallowPrototype> {

    int x = 10;
    Nested ref = new Nested(100);

    @Override
    public ShallowPrototype clone() {
        ShallowPrototype copy = new ShallowPrototype();
        copy.x = this.x;
        copy.ref = this.ref; // shallow copy → 참조 공유
        return copy;
    }

    @Override
    public String toString() {
        return "Shallow{x=" + x + ", ref=" + ref + "}";
    }
}
