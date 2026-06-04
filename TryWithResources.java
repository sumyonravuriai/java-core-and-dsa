
import java.util.Scanner;

public class TryWithResources{
    public static void main(String[] args) {
        try(Scanner hi = new Scanner(System.in)){  // automatically close resources after use
            int a = hi.nextInt();
            System.out.println(a);
        }
        
    }
}