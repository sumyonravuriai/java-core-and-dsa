public class methods{
    void greet(){  //method
        System.out.println("Hello Java");
    }
    String BuyPen(int cost){  //method
        if(cost>=5){
            return "pen";
        }
        return "nothing";
    }
    public static void main(String[] args) {
        methods hi = new methods();  //obect creation
        hi.greet();  //method calling
        String res = hi.BuyPen(7);  //method calling
        System.out.println(res);
    }
}