public class Camera extends Machine implements AutoCloseable{

    @Override
    public void start() {
        System.out.println("Starting Camera");
    }

    @Override
    public void doStuff() {

    }

    @Override
    public void shutDown() {

    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("Oh no!");
    }
}
