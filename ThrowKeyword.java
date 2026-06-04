public class ThrowKeyword{
    public static void main(String[] args) {
        int n = 20;
        int result = 0;

        try {
          result = 15/n; 
          if(result == 0){
            throw new ArithmeticException("I dont want zero");  // explicitly throw an exception
          } 
        } 
        catch(ArithmeticException e){
            result = 15;
            System.out.println("The default value :" + e);
        }
        catch (Exception e) {
            System.out.println("something wrong " + e);
        }

        System.out.println(result);
        System.out.println("Bye");
    }
}