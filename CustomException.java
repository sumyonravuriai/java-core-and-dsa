class SumyonException extends Exception{
    public SumyonException(String str){  // parameterized constructor
        super(str);  // it calls super class constructor (Exception class)
    }
}

public class CustomException{
     public static void main(String[] args) {
        int balance = 0;

        try {
            if(balance < 10){
                throw new SumyonException("Min balance is 10");  // it calls constructor
            }
        } 
        catch(SumyonException e){
            System.out.println("Insufficient balance :"+e);
        }
        catch (Exception e) {
            System.out.println("something wrong.."+ e);
        }

        System.out.println(balance);
    }
}