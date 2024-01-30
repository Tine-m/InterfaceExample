public class MyDatabaseWriter implements Persistable{
    @Override
    public void save(String message) {
        System.out.println("SQL: INSERT " + message + " INTO TABLE");
    }
}
