class students{
    String name;
    int roll;
}

public class ArrayofObjects{
    public static void main(String[] args) {
        students s1 = new students();
        s1.name = "rishi";
        s1.roll = 141;

        students s2 = new students();
        s2.name = "sumyon";
        s2.roll = 184;

        students s3 = new students();
        s3.name = "rutwik";
        s3.roll = 187;

        students arr[] = new students[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].name + ":" + arr[i].roll);
        }
    }
}