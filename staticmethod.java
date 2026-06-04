class student{
    String name;
    static String college;
    public static void fun(student a){   //static method
        System.out.println(a.name + " : " + college);
    }
}
public class staticmethod{
    public static void main(String[] args) {
       student s1 = new student();
       s1.name = "reihan";
       student.college = "Sri chaitanya";
       student.fun(s1);  //access through class name
    }
}