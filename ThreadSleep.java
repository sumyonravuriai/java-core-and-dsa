class A extends Thread{
    public void run(){   // run contains code to execute
        try{
            for(int i=0;i<10;i++){
            System.out.println("Hi.");
            Thread.sleep(20);   // pause 20-ms
          }
        }
        catch(InterruptedException e){
            System.out.println("Interrupt");
        }
    }
}
class B extends Thread{
    public void run(){
       try{
            for(int i=0;i<10;i++){
                System.out.println("Hello.");
                Thread.sleep(20);  // checked exception
             }
       }
       catch(InterruptedException e){
            System.out.println("Interrupt");
       }
    }
}

public class ThreadSleep{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();  // new thread 
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("interrupted");
        }
        obj2.start();  // new thread
    }
}