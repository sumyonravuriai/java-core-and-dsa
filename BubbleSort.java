
import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {-5,-5,-2,5,3,2,63,1,0,-2};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++){ // Largest element "bubble up" to the END after every pass
                if(arr[j-1]>arr[j]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}