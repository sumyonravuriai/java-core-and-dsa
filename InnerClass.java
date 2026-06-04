class A{
    public void outside(){
        System.out.println("outside");   
    }
    class B{    // instance inner class
        public void inside1(){
            System.out.println("inside instance class");
        }
    }
    static class C{   // static inner class
        public void inside2(){
            System.out.println("inside static class");
        }
    }
}
public class InnerClass{
    public static void main(String[] args) {

        A obj1 = new A();  
        obj1.outside();

        A.B obj2 = obj1.new B();  // access through object
        obj2.inside1();

        A.C obj3 = new A.C();   // access through class
        obj3.inside2();
    }
}