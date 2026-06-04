
class A extends Object {

    public A() {
        super(); // defaulty there
        System.out.println("in A");
    }

    public A(int x) {
        System.out.println("in A int");
    }
}

class B extends A {

    public B() {
        super(6);
        System.out.println("in B");
    }

    public B(int x) {
        this();
        System.out.println("in B int");
    }
}

public class this_superMethod {

    public static void main(String[] args) {
        B obj = new B(5);  //it calls constructor in b
    }
}
