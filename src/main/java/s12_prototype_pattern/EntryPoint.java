package s12_prototype_pattern;

public class EntryPoint {

    public static void main(String[] args) {
        ShallowPrototype prototype1 = new ShallowPrototype();
        ShallowPrototype prototype2 = prototype1.clone();

        System.out.println(prototype2.ref.data = 200); // 200
        System.out.println(prototype1.ref.data); // 200
        System.out.println(prototype1.ref == prototype2.ref); // true

        DeepPrototype dp1 = new DeepPrototype();
        DeepPrototype dp2 = dp1.clone();
        System.out.println(dp2.ref.data = 300); // 300
        System.out.println(dp1.ref.data); // 200
        System.out.println(dp1.ref == dp2.ref); // false
    }
}
