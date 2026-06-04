class hello{
    static int x;
    public hello(){
        System.out.println("value is :"+ x);
    }
    static{
        x = 10;
        System.out.println("static block executes first");
    }
}
public class staticblock{
    public static void main(String[] args) {
        hello a = new hello();
        System.out.println("it is main method");
    }
}