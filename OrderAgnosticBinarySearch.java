public class OrderAgnosticBinarySearch{
    public static void main(String[] args) {
        // int[] arr = {-3,-1,4,4,52,64,99,521}; // ascending arr[0]<arr[n-1];
        int[] arr = {921,856,521,300,24,0,-95,-800}; // descending
        int target=-95;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr,int target){

        boolean isAsc = arr[0]<arr[arr.length-1];
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        
        while(low<=high){
            mid  = low + ((high-low)/2);
            if(arr[mid]==target)  // both for ascending and descending
                return mid;  // element found
            if(isAsc){  // for ascending
                if(target>arr[mid])
                    low=mid+1;
                else
                    high=mid-1;
            }
            else{  // for descending
                if(target>arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            
        }
        return -1;  // element not found
    }
}