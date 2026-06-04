import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter here :");
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String c = sc.nextLine();
        boolean d = sc.nextBoolean();
        
        System.out.println(a+" "+b+" "+c+" "+d);
        sc.close();
    } 
}