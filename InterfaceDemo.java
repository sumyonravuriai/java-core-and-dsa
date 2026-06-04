interface A{
    int age = 18;   // public static final (default)
    void show();  // public abstract (default)
    void config();
}

class B implements A{

    public void show(){
        System.out.println("in show..");
    }
    public void config(){
        System.out.println("in config..");
    }

}

public class InterfaceDemo{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
    }
}