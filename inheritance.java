import machine.*;
public class inheritance{
    public static void main(String[] args) {
        VeryAdvCal obj = new VeryAdvCal();
        int r1 = obj.add(2,3);
        int r2 = obj.sub(5,4);
        int r3 = obj.mul(3,7);
        int r4 = obj.div(100,4);
        double r5 = obj.power(5,4);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}