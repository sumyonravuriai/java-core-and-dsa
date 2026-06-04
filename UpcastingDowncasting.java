
class A {
    public void show1() {
        System.out.println("in show A");
    }

}

class B extends A {
    public void show2(){
        System.out.println("in show B");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        A ref1 = new B();  //upcasting   done automatically   child object to parent reference
        ref1.show1();
        
        B ref2 = (B) ref1; //downcasting    explicitly achieve     parent reference to child reference
        ref2.show2();
        
    }
}
