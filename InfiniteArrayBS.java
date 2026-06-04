public class InfiniteArrayBS{
    public static void main(String[] args) { // array length unknow
        int[] arr={-8,-2,0,22,62,121,136,150,185,200,250,275,360,451,498,566,900,1010,1206,1351,1698,1983,2007,2011}; // assume infinite array
        int target=150; //18
        int result=-1;
        try{
        result=ans(arr,target);
        }
        catch(Exception e){
            System.out.println("infinte array taking is not possible to me ");
        }
        System.out.println(result);
    }
    static int ans(int[] arr,int target){  // To find start and end
        int start=0;
        int end=1; // length is unknown
        while(arr[end]<target){
            int newStart=end+1;
            end=end+ (end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        int mid=0;
        while(start<=end){
            mid=start+((end-start)/2);
            if(arr[mid]==target)
                return mid;
            if(target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}