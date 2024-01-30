public class Main {
    public static void main(String[] args) {
        String message = "hello world";
        Persistable persist = new MyDatabaseWriter();
        persist.save(message);
        persist = new MyFileWriter();
        persist.save(message);
    }
}
