public class Intern1 {
    public static void main(String[] args) {
        String s = new String("Hello");//heap
        String s1 = s.intern();//String Constant Pool
        String s2 = "Hello";
        System.out.println(s==s1);
        System.out.println(s1==s2);
    }
}
