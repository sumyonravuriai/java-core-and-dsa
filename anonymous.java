class Test{
    public Test(){
        System.out.println("default");
    }
    public void show(){
        System.out.println("Hello java");
    }
     public void shows(){
        System.out.println("Hello python");
    }
}
public class anonymous{
    public static void main(String[] args) {
        new Test().shows(); //anonymous object
        new Test().show(); //anonymous object
    }
}