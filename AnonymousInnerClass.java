class A{
    public void show(){
        System.out.println("in A show");
    }
}
public class AnonymousInnerClass{
    public static void main(String[] args) {
        A obj = new A(){   // anonymous inner class
            public void show(){  
                System.out.println("in new show");
            }
        };
        obj.show();

    }
}