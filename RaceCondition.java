class Sample{
    int count;
    public synchronized void increment(){  // synchronized helps only one thread runs at a time
        count++;
    }
}

public class RaceCondition{
    public static void main(String[] args){
        Sample obj = new Sample();
        Runnable obj1 = () -> {
            for(int i=0;i<100000;i++){
                obj.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i=0;i<100000;i++){
                obj.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join(); // checked exception
        }
        catch (InterruptedException e) {
        }
        try {
            t2.join(); // wait for thread
        }
        catch (InterruptedException e) {
        }

        System.out.println(obj.count);
    }
}