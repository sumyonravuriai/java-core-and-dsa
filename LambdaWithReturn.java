@FunctionalInterface
interface Cal{
    int add(int a, int b);
}

public class LambdaWithReturn{
    public static void main(String[] args) {
        Cal obj = (a,b) -> {
            return a+b;
        };  
        int result = obj.add(2,5);
        System.out.println(result);
    }
}
