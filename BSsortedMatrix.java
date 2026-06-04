
import java.util.Arrays;

public class BSsortedMatrix{
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {5,6,7},
            {9,10,11},
            {13,14,15}
        };
        int target = 10;
        int[] ans = searchSortedMatrix(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchSortedMatrix(int[][] matrix,int target){

        int rStart=0;
        int rEnd=matrix.length-1;
        int cStart=0;
        int CEnd=matrix[0].length-1;

        while(rStart<rEnd){
            int rMid= rStart+(rEnd-rStart)/2;
            if(target==matrix[rMid][CEnd]){
                return new int[]{rMid,CEnd};
            }
            if(target>matrix[rMid][CEnd])
                rStart=rMid+1;
            else
                rEnd=rMid;
        }
        while(cStart<=CEnd){ // simple Binary Search
            int cMid= cStart+(CEnd-cStart)/2;
            if(target==matrix[rStart][cMid])
                return new int[]{rStart,cMid};
            if(target>matrix[rStart][cMid])
                cStart=cMid+1;
            else
                CEnd=cMid-1;
        }
        return new int[]{-1,-1};
    }
}