import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort{
    public static void main(String[] args) {
        Comparator<Integer> com = (i,j) -> {  // lambda expression  it has compare() method
            return (i%10 > j%10)?1:-1;  // swap(1),no swap(-1)  
        }; 
        List<Integer> nums = new ArrayList<>();

        nums.add(34);
        nums.add(22);
        nums.add(17);

        Collections.sort(nums);  // Collections is a class
        System.out.println(nums);

        Collections.sort(nums,com);  // own logic sorting
        System.out.println(nums);


    }
}