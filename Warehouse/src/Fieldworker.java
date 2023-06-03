public class Fieldworker extends Employees {
    //private int position;

    private int ID;

    public Fieldworker(String name /*double salary*/, int workShift, int ID) {
        super(name , workShift, ID);
        this.ID = ID;
    }
    public void printFeildEmployeesInfo (){
        System.out.println("Name :"+ this.getName() );
        System.out.println("ID: "+ this.getID() );
        System.out.println("Work shift: "+ this.getWorkShift());
        
    }}

    //public void setPosition(int position) {
    //    this.position = position;
    //}