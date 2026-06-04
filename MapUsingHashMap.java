import java.util.HashMap;
import java.util.Map;

public class MapUsingHashMap{
    public static void main(String[] args) {
        
        Map<String,Integer> students = new HashMap<>();
        
        students.put("Chetan",97);
        students.put("Ganesh",92);
        students.put("Karthik",95);
        students.put("Ganesh",100);

        System.out.println(students);
        System.out.println(students.get("Chetan"));  // values access through keys
        System.out.println(students.keySet());
        System.out.println(students.values());

        for(String n : students.keySet()){
            System.out.println(n + " : " + students.get(n));
        }

    }
}