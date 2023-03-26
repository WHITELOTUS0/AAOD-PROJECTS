public class Interning{
   
    
    public static void main(String[] args) {
        String s1 = new String("Glorry");
        String s2 = new String("Glorry");
        String s3 = s1.intern();
        System.out.println(s3);
    }
}