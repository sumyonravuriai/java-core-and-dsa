public class forloop19{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            System.out.println("Day "+i);
            for (int j=3;j>=1;j--) {
                System.out.println("  "+"countdown "+j);
            }
        }
    }
}