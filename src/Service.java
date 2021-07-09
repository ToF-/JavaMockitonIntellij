public class Service {
    private final Database database;

    public Service(Database database) {
        this.database = database;
    }

    public boolean query(String s) {
        return database.isAvailable();
    }
}
