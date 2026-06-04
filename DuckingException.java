class A{
    public void show() throws ClassNotFoundException{  // Ducking exception using throws keyword

        Class.forName("College");  // checked Exception
    }
}

public class DuckingException{
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("No class is found "+ e);
        }
        catch(Exception e){
            System.out.println("Something wrong.. "+ e);
        }

        System.out.println("Bye");
    }
}  