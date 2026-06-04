class human{
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class thisKeyword{
    public static void main(String[] args) {
        human obj = new human();
        obj.setAge(45);
        System.out.println(obj.getAge());
    }
    
}