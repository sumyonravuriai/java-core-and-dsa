public class arrays{
    public static void main(String[] args) {
        int arr1[] = {1,4,7};  //direct values declaration
        System.out.println(arr1[0]);
        System.out.println(arr1[2]);
        int arr2[] = new int[3]; //give size
        arr2[0] = 21;
        arr2[1] = 4;
        arr2[2] = 5;
        for(int i=0;i<3;i++){
            System.out.println(arr2[i]);
        }
    }
}