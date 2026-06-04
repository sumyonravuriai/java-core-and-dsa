import java.util.Set;
import java.util.TreeSet;

public class SetUsingTreeSet{
    public static void main(String[] args) {

        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(18);
        nums.add(7);
        nums.add(45);
        nums.add(1);
        nums.add(7);

        System.out.println(nums);
    }
}