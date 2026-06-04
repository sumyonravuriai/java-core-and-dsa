class hello{
    private int age = 18;
    private String name = "Ravuri";
    public int getAge(){  //getter
        return age;
    }
    public String getName(){ //getter
        return name;
    }
    public void setName(String n){ //setter
        name = n;
    }
}
public class encapsulation{
    public static void main(String[] args) {
        hello obj = new hello();
        System.out.println(obj.getAge()+ " : " +obj.getName());
        obj.setName("sumyon");
        System.out.println(obj.getName());
    }
}