abstract class Hello{
    public abstract void show();
    public abstract void config();
}
public class AbstractAndAnonymousInnerClass{
    public static void main(String[] args) {
        Hello obj = new Hello(){  // object belongs to anonymous inner class not abstract class
            public void show(){
                System.out.println("This is show");
            }
            public void config(){
                System.out.println("This is config");
            }
        };
        obj.show();
        obj.config();
    }
}