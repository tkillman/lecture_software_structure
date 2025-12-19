package quiz;

import java.util.Map;

public abstract class GoodClient {
    
    
    public Map queryDatabase(String queryString) {
        Database db = CreateDatabase ();
        CheckQueryIsValid(queryString);
        return db.find(queryString);
    }
    
    protected abstract Database CreateDatabase ();

    protected void CheckQueryIsValid(String queryString) {
        // Implement validation logic here
    }
}
