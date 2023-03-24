//Object cloning in java
public class Student implements Cloneable {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try{
        Student obj = new Student("GLORRY", 20);
        Student obj1 = (Student) obj.clone();
        System.out.println(obj.name +"\n"+obj.age);
        System.out.println(obj1.age);
        }
        catch(CloneNotSupportedException e){}
    }
}