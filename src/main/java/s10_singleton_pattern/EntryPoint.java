package s10_singleton_pattern;

public class EntryPoint {
    public static void main(String[] args) {

        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();

        System.out.println(s1 == s2); // true
    }
}
