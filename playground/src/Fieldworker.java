public class Fieldworker extends Employees {
    private String position;

    public Fieldworker(String name, double salary, int workShift, String position) {
        super(name, salary, workShift);
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }
}