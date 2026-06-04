interface A{
    void cam();
}
interface B{
    void videos();
}
interface C extends B{ // interface extends interface
    void images();
}


class Z implements A,C{  // multiple interfaces
    public void cam(){
        System.out.println("quality camera");
    }
    public void videos(){
        System.out.println("quality videos");
    }
    public void images(){
        System.out.println("quality images");
    } 
}

public class MultipleInterfaces{
    public static void main(String[] args) {
        A obj1 = new Z();
        obj1.cam();
        C obj2 = (C)obj1;  // downcasting
        obj2.videos();
        obj2.images();
    }
}