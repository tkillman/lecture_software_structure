package s10_singleton_pattern;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        // 외부 생성 방지
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}