class Child extends Upcasting {
    void show(){
        System.out.println("Show method in child class");
    }
    public int age=8;

    public static void main(String[] args) {
        //creating an object of the upcasting class(parent class) but referencing it to child class
        Upcasting up=new Child();
        up.show();
        System.out.println(up.age);
    }
}


