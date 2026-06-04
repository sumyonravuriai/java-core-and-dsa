public class method_overloading{
    //same method name
    int add(int a,int b){ //method
        return a+b;
    }
    int add(int a,int b,int c){  //parameter count change
        return a+b+c;
    }
    double add(double a,int b){  //parameter data-type change
        return a+b;
    }
    public static void main(String[] args) {
        method_overloading be = new method_overloading();
        int res1 = be.add(2,3); 
        int res2 = be.add(1,4,7);  //method calling
        double res3 = be.add(2.49,1);
        System.out.println(res1+" "+res2+" "+res3);
    }
}