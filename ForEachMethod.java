
import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;


public class ForEachMethod{
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3,4,1,8);

        // Consumer<Integer> con = new Consumer<Integer>(){  // functional interface
        //     public void accept(Integer a){
        //         System.out.println(a);
        //     }
        // };
        // nums.forEach(con);

        nums.forEach((n) -> System.out.println(n));


        // for(int i = 0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        // for(int n : nums){
        //     System.out.println(n);
        // }
    }
}