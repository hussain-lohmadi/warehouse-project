public class Desktopworker extends Employees {
    private int position;

    public Desktopworker(String name, double salary, int workShift, int position) {
        super(name, salary, workShift);
        this.position = position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }
    
    
}