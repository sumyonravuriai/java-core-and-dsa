import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Friends implements Comparable<Friends>{
    int age;
    String name; 
    public Friends(String name,int age){ // constructor
        this.name = name;
        this.age = age;
    }

    public int compareTo(Friends a){
        return (this.age>a.age)? 1:-1;
    }

    public String toString(){
        return "Student[name="+ name +",age="+age+"]";
    }

}

public class ComparableSort{
    public static void main(String[] args) {

        // Comparator<Friends> com = (i,j) -> {
        //     if(i.age > j.age){
        //         return 1;
        //     }
        //     else{
        //         return -1;
        //     }
        // };

        List<Friends> frnds = new ArrayList<>();

        frnds.add(new Friends("Karthik",20));
        frnds.add(new Friends("Rutvik",17));
        frnds.add(new Friends("Rishi",19));

        Collections.sort(frnds);
        

        for(Friends f : frnds){
            System.out.println(f);
        }
    }
}