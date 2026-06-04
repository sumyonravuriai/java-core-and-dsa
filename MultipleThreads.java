class A extends Thread{  // Thread class
    public void run(){          // run() - contains code to execute
        for(int i=0;i<10;i++){
            System.out.println("Hi");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
        }
    }
}

public class MultipleThreads{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();     // starts new thread
        obj2.start();     // starts new thread
    }
}