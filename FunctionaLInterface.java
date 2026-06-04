@FunctionalInterface  // annotation
interface A{     // functional interface
    void show();
}

public class FunctionaLInterface{
    public static void main(String[] args) {
        A ref = new A(){   // anonymous inner class
            @Override
            public void show(){
                System.out.println("in show..");
            }
        };
        ref.show();
    }
}