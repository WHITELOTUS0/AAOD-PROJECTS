// Using an Initialization Block for Constructor Chaining in Java

class Apples{
 
    {
        System.out.println("\nThis is fresh from South Africa.");
    }
  
    Apples(){
        System.out.println("Color: Green");
    }
  
    {
        System.out.println("No artificial fertilisers used!");
    }
  
    Apples(String color){
        System.out.println("Color: "+ color);  
    }
  
 public static void main(String args[]){
    Apples myApple = new Apples();
 }
 }
