public class strings{
    public static void main(String[] args) {
        String name = "Sumyon";   //string literal (common method)
        System.out.println("Name:" + name);
        String branch = new String("CSE");  //using new keyword
        System.out.println("Branch:" + branch);
        System.out.println(name.charAt(3));  //through index
        System.out.println(name.concat(" "+branch));  //concatenate two strings
    }
}