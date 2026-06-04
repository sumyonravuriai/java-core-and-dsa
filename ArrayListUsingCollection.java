import java.util.ArrayList;
import java.util.Collection;

public class ArrayListUsingCollection{
    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(7);
    
        System.out.println(nums);
        for(int n : nums){
            System.out.println(n);
        }
    }
}