enum Phone{
    Vivo("16k"),Samsung("40k"),Iphone("70k"); // constants or objects of parameterized
    String price;
    Phone(String price){  // private constructor of parameterized
        System.out.println("hi");
        this.price = price;
        System.out.println(price);
    }
    public void show(){
        System.out.println("in show " + price);
    }

}

public class EnumClass{
    public static void main(String[] args) {
        Phone ph = Phone.Samsung;
        ph.show();
    }
}