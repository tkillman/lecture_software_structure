package s12_prototype_pattern;

class DeepPrototype implements Cloneable {

    int x = 10;
    Nested ref = new Nested(100);

    @Override
    public DeepPrototype clone() {
        DeepPrototype copy = new DeepPrototype();

        copy.x = this.x;
        try {
            copy.ref = this.ref.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // deep copy → 새로운 Nested 객체
        return copy;
    }

    @Override
    public String toString() {
        return "Deep{x=" + x + ", ref=" + ref + "}";
    }
}
