class Example extends Base{
    Example(int age){
        //calling the parameterised constructor of base class
        super("Java");
        System.out.println("Example constructor");
    }
    Example(){
        
        System.out.println("Non parameterised constructor of example class");
    }
    public static void main(String[] args) {
        Base ex=new Example();
        
        

    }

}

