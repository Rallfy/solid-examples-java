package solid_principles;

// Dependency Inversion Principle: Code to interfaces, not implementations


// Bad: High-level module depends on low-level module
class MySQLDatabase {
    void save(String data) { System.out.println("Saved to MySQL"); }
}

class UserService {
    private MySQLDatabase db = new MySQLDatabase();
    void saveUser(String data) { db.save(data); }
}


// Good: Depend on abstraction
interface Database {
    void save(String data);
}

class MySQLDatabaseImpl implements Database {
    public void save(String data) { System.out.println("Saved to MySQL"); }
}

class UserServiceBetter {
    private final Database db;
    UserServiceBetter(Database db) { this.db = db; }
    void saveUser(String data) { db.save(data); }
}