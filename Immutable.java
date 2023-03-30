final class Immutable {
    
    private String name;
    private int age;

    Immutable(String Name, int Age){
        this.name=Name;
        this.age=Age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        Immutable i1=new Immutable("A",10);

        System.out.println(i1.getName());
        System.out.println(i1.getAge());
    }
}


