interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("coding in laptop.."); 
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("coding in desktop..");
    }
}

class Developer{
    public void devApp(Computer device){
        device.code();
    }
}

public class NeedInterfaces{
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer obj = new Developer();
        obj.devApp(lap);
        obj.devApp(desk);
    }
}