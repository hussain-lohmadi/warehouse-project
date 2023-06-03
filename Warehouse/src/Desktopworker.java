public class Desktopworker extends Employees {
    //private int position;

    private int ID;

    public Desktopworker(String name /* , double salary*/, int workShift, int ID /* ,String title*/) {
        super(name /* ,salary*/, workShift, ID /* ,title*/);
        this.ID = ID;
        
    }
    public void printDeskEmployeesInfo (){
        System.out.println("Name :"+ this.getName() );
        System.out.println("ID: "+ this.getID() );
        System.out.println("Work shift: "+ this.getWorkShift());
        
    }
}

    