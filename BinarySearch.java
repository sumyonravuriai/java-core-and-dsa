public class BinarySearch{
    public static void main(String[] args) {

        int[] arr = {-32,-5,-1,2,54,366,999,1021}; // ascending sorted array
        int target=999;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid = low + ((high-low)/2); // (low+high)/2
            if(target>arr[mid])
                low=mid+1;
            else if(target<arr[mid])
                high=mid-1;
            else
                return mid; // element found
        }
        return -1; // element not found
    }
}