import java.io.*;

public class Persist{
    public static void main(String[] args) {
        try{
            Student2 s1 = new Student2(211, "Sharo");
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(s1);
            oout.flush();
            oout.close();
            System.out.println("succes");
        }catch(Exception e){System.out.println(e);}
    }
}
