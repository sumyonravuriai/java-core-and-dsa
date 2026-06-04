enum Status{
    Failed,Success,Pending;   // public static final Status
}

public class Enum{
    public static void main(String[] args) {
        Status[] hey = Status.values();
        for(Status hi : hey){  // enhanced for loop
            System.out.println(hi +" : "+hi.ordinal());
        }
    }
}