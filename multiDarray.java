public class multiDarray{
    public static void main(String[] args) {
        System.out.println("Array 1:");
        int arr[][]={{1,2,3} , {4,5,6}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array 2:");
        int ary[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                ary[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(ary[i][j]+" ");
            }
            System.out.println();
        } 
    }
}