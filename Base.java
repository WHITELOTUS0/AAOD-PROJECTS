class Base{
    String name;
    Base(){
        this("Glorry");
        System.out.println("Non parameterised constructor of base");
    }

    Base(String name){
        this.name=name;
        System.out.println("My name is "+name+" fom parameterised constuctor of base class");
    }
    
}


