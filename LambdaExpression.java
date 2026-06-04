@FunctionalInterface
interface A{   // functional interface
    void score(int a);
}

public class LambdaExpression{
    public static void main(String[] args) {
        A obj = (x) -> {  // lambda expression
            System.out.println("score is: " + x);
        };
        obj.score(49);
    }
}