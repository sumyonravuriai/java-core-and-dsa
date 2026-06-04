class student{  //create a class
    String name;   //variables
    int age;
    void display(){   //methods
        System.out.println(name + " " + age);
    }
}
class calculator{  //class creation
    int forest(int a,int b){  //method
        int ans = a+b;
        return ans;
    }
}
public class class_object22{
    public static void main(String[] args) {   //main method
        student s1 = new student();  //object creation
        s1.name = "sumyon";
        s1.age = 18;
        student s2 = new student();  //object creation 
        s2.name = "karthik";
        s2.age = 21;
        s1.display();
        s2.display();
        calculator cal = new calculator(); //object creation
        int num1 = 25;
        int num2 = 50;
        int result = cal.forest(num1,num2);
        System.out.println("Total:" + result);
    }
}