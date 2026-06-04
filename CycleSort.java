
import java.util.Arrays;

public class CycleSort{
    public static void main(String[] args) {
        int[] arr = {5,3,1,2,4};  // It must is in range 1-N or 0-(N-1), without missing elements
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){ // swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else
                i++;
        }
    }
}