public abstract class Machine {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public abstract void start();
    public abstract void doStuff();
    public abstract void shutDown();

    public void run(){
        start();
    }

}
