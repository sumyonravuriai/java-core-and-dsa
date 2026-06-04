class students{
    String name;
    static String college;   //college is similar for all students
    public void fun(){
        System.out.println(name+" : "+college);
    }
}
public class staticvariable{
    public static void main(String[] args) {
        students s1 = new students();
        s1.name = "sumyon";
        students s2 = new students();
        s2.name = "chetan";
        students.college = "GVPE"; //access through class name
        s1.fun();
        s2.fun();
        //System.out.println(students.college);
    }
}