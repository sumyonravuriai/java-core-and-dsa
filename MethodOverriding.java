class parent{
    public void show(){
        System.out.println("in parent show");
    }
}
class child extends parent{
    public void show(){
        System.out.println("in child show");
    }
}
public class MethodOverriding{
    public static void main(String[] args) {
        parent obj = new child();
        obj.show();
    }
}