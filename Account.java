// Constructor Chaining to Another Class in Java

class Account{
  
    Account(String first_name, int your_age){
        String fname = first_name;
        int age = your_age;
  
        System.out.println("\nThe name entered is " + fname);
        System.out.println("Your are " + age + " years old.");
    }
  
    Account(){
        System.out.println("\nWelcome dear customer");
    }
  
    public static void main(String args[]){
        FixedDeposit acct = new FixedDeposit();
    }
  
 }
  
 class FixedDeposit extends Account{
  
    FixedDeposit(){
  
        super("SIBOMANA GLORRY", 20); // calling the no-arg constructor in the base class
        double APY = 12.5;
        System.out.println("Your current interest rate is " + APY + "%");
    }
 }
