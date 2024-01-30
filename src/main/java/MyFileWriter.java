public class MyFileWriter implements Persistable {
    @Override
    public void save(String message) {
        System.out.println("CVS: Write " + message + " to file");
    }
}
