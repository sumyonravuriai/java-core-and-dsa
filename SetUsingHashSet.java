import java.util.HashSet;
import java.util.Set;

public class SetUsingHashSet{
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<Integer>(); 

        nums.add(18);
        nums.add(7);
        nums.add(45);
        nums.add(1);
        nums.add(7);

        System.out.println(nums);
        
    }
}