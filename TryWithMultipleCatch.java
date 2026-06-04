public class TryWithMultipleCatch{
    public static void main(String[] args) {
        int i = -5;
        int result = 0;
        int arr[] = {1,5,8};
        String str = null;
        int value = 0;

        try {
            result = 7/i;
            arr[2] = 45;
            value = str.length();
        }
        catch(ArithmeticException e){  // specific exception
            System.out.println("cannot divide with zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("cannot go out of index");
        }
        catch(Exception e){ // general exception
            System.out.println("something wrong.." + e);
        }

        System.out.println("Bye");
    }
}