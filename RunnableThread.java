class Sam{
    public void show(){
        System.out.println("In Show");
    }
}
class A extends Sam implements Runnable{   // you can extend other class also
    @Override
    public void run(){   // runnable has run();
        for(int i=0;i<5;i++){
            System.out.println("Me");
        } 
    }
}

public class RunnableThread{
    public static void main(String[] args) {
        A obj = new A();
        Runnable obj1 = new A();
        Runnable obj2 = () -> {  // lambda expression
                for(int i=0;i<5;i++){
                    System.out.println("our");
                }
        };
        obj.show();

        Thread t1 = new Thread(obj1);  // runnable doesn't have start();
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}