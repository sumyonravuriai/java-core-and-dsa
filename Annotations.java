class A{
    public void showExampleForAnnotation(){
        System.out.println("in A show");
    }
}

class B extends A{
    @Override   // annotation       // if any mistake it gives an error
    public void showExampleForAnnotation(){  
        System.out.println("in B show");
    }
}

public class Annotations{
    public static void main(String[] args) {
        B obj = new B();
        obj.showExampleForAnnotation();
    }
}