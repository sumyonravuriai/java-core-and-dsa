import java.util.ArrayList;
import java.util.List;

public class ArrayListUsingList{
    public static void main(String[] args) {

        List<Integer> names = new ArrayList<Integer>();

        names.add(1);   // add elements
        names.add(45);
        names.add(18);
        names.add(7);

        System.out.println(names);
        System.out.println(names.get(3));  // access elements through index
        System.out.println(names.contains(8));  // check element
        System.out.println(names.indexOf(18));   // give element at index
        names.remove(3);  // remove element
        System.out.println(names);
        System.out.println(names.size());  // gives length
    }
}