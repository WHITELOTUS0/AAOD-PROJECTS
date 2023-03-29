public final class Person{
    private final String name;
    private final int age;

    Person(String name, int age){
        this.name = name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Person withAge(int newAge){
        return new Person(name, newAge);
    }

    public static void main(String[] args) {
        Person p = new Person("John", 30);
        p.withAge(0);
        System.out.println(p.withAge(1));
    }

}