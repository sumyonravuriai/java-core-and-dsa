import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI{
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,5,3,8,7,4);
        
        // method-1
        System.out.println("Method-1");
        Stream<Integer> s1 = nums.stream();  // original data not affected
        // s1.forEach(n -> System.out.println(n));
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // s2.forEach(n -> System.out.println(n));
        Stream<Integer> s3 = s2.map(n -> n*2);
        // s3.forEach(n -> System.out.println(n));
        int result1 = s3.reduce(0, (c,e) -> c+e);
        System.out.println(result1);

        // method-2
        System.out.println("Method-2");
        int result2 = nums.stream()  //  original data not affected
                        .filter(n -> n%2==0)
                        //.forEach(n -> System.out.println(n));
                        .map(n -> n*2)
                        //.forEach(n -> System.out.println(n));
                        .reduce(0,(c,e) -> c+e);
        System.out.println(result2);
    }
}