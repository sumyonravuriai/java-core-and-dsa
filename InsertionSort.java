
import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {5,1,4,3,2,0};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){    // outer loop
            for(int j=i+1;j>0;j--){    // inner loop
                if(arr[j-1]>arr[j]){    // swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else    // bcz already that part is in sorted
                    break; 
            }
        } 
    }
}