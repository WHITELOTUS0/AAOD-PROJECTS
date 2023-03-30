public class Mutable {
    String name;

    Mutable(String name){
        this.name=name;
    }

    public void setName(String s){
        this.name=s;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Mutable m=new Mutable("Mutable");
        System.out.println(m.getName());
        m.setName("Glorry");
        System.out.println(m.getName());
    }
}
