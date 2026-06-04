class human{
    int age;
    String name;
    public human(){   // default constructor
        age = 19;
        name = "karthik";
    }
    public human(int a,String b){  // parameterized constructor
        age = a;
        name = b;
    }
}
public class parameterizedConstructor{
    public static void main(String[] args) {
        human obj1 = new human();  // default
        human obj2 = new human(18,"sumyon");  // parameterized
        System.out.println(obj1.name +" : "+ obj1.age);
        System.out.println(obj2.name +" : "+ obj2.age);

    }
}