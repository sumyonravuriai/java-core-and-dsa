public class ExceptionHandling{
    public static void main(String[] args) {
        int i = 0;
        int result = 0;
        try {
            result = 15/i;
        } 
        catch(Exception e){
            System.out.println("Something went wrong..");
        }
        System.out.println("Bye " + result);
    }
}