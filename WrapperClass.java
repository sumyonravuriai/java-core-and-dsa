public class WrapperClass{
    public static void main(String[] args) {
        
        int a = 10;
        Integer num1 = a;    // auto-boxing
        System.out.println(num1);

        Integer num2 = 20;
        int b = num2;        // auto-unboxing
        System.out.println(b);

        String str = "123";
        int value = Integer.parseInt(str);   // String to int
        System.out.println(value);
    }
}