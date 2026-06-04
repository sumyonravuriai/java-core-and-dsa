enum Status{
    Failed,Success,Pending;
}
enum Day{
    Monday,Tuesday,Wednesday,Sunday;
}

public class EnumIfAndSwitch{
    public static void main(String[] args) {

        Status s = Status.Success; 
        if(s == Status.Failed)
            System.out.println("Try again");
        else if(s == Status.Success)
            System.out.println("Done");
        else 
            System.out.println("Wait"); 

        Day d = Day.Sunday;
        switch(d){
            case Monday: System.out.println("Starting day");  // in switch write only enum constants (no Day. prefix)
                        break;
            case Tuesday:
            case Wednesday: System.out.println("Mid days");
                        break;
            default: System.out.println("Holiday");
        }
    }
}