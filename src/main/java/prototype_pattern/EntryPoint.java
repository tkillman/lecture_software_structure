package prototype_pattern;

public class EntryPoint {

    public static void main(String[] args) {
        System.out.println("hi");
        Cloneable prototype = new ShallowPrototype();
        Cloneable clone = prototype.clone();

        prototype = new DeepPrototype();
        clone = prototype.clone();
    }
}
