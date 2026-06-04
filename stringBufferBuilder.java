public class stringBufferBuilder{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");  //StringBuilder has similar properties
        sb.append("Sumyon");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.reverse());
    }
}