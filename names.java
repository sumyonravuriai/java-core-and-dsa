
//     public void show(){
//         System.out.println("hello java");
//     }
//     String name;
// }
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class names{
    public static void main(String[] args) {
    //    String num ="12393";
    //    int value = Integer.parseInt(num);
    //    int hi =19;
    //    System.out.println(value);
    //    Integer obj = hi;
    //    System.out.println(obj.hashCode());
        // int a = 10;
        // int b = 0;
        // System.out.println("bye");
        // int result = a/b;
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k=1;
        List<Integer> list = new ArrayList<>();
        long sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum*10+num[i];
        }
        long n=sum+k;
        System.out.println(n);
        while(n!=0){
            list.add((int)(n%10));
            n=n/10;
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}