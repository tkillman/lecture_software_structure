package quiz;

import java.util.Map;

public abstract class BadClient {

    public Map queryDatabase(String queryString) {

        /// 고차원 컴포넌트가 저차원 컴포넌트에 의존하고 있다.
        /// DI 원칙 위반 - 구체 클래스에 의존, 추상화에 의존하지 않는다.
        Database db = new AlphaDatabase();
        // CheckQueryIsValid(queryString);
        return db.find(queryString);
    }
}
