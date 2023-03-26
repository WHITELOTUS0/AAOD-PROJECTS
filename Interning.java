public class Interning{
   
    
    public static void main(String[] args) {
        String s1 = new String("Glorry");
        String s2 = new String("Glorry");
        String s3 = s1.intern();
        System.out.println(s3);
        System.out.println(s1==s3);
        String s4="Glorry";
        System.out.println(s3==s4);
        System.out.println(s1==s2);
    }
}