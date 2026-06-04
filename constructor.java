class human{
    String name;
    int age;
    public human(){  //constructor
        name = "sample";
        age = 18;
    }
}
public class constructor{
    public static void main(String[] args) {
        human obj = new human();  //constructor runs
        System.out.println(obj.name +" : "+ obj.age);
    }
}