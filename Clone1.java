public class Clone1 implements Cloneable {
    String sNo;
    double height;

    Clone1(String sNo, double height){
        this.sNo=sNo;
        this.height=height;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
    
        Clone1 c1=new Clone1("c1",1.5);
        Clone1 c2=(Clone1)c1.clone();
        System.out.println(c2.sNo);
    }
}
