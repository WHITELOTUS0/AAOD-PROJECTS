import java.io.*;

public class Persist{
    public static void main(String[] args) {
        try{
            Student2 s = new Student2(211, "Sharo");
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
        }catch(Exception e){System.out.println(e);}
    }
}
