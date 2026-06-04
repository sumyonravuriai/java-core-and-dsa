
import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {-5,0,0,5,1,5,999,-954};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            // To find the MAX element in unsorted part of the array
            int max=0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            
            // swap max element to the end part of the unsorted array
            int temp = arr[max];
            arr[max] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}