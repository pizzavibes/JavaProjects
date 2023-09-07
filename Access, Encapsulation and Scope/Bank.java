
package bank;


public class Bank {

 private CheckingAccount accountOne;
 private CheckingAccount accountTwo;
  
 public Bank(){
 accountOne = new
 CheckingAccount("Zeus", 100);
  accountTwo = new
 CheckingAccount("Hades", 200);
  
     CheckingAccount accountThree = new
         CheckingAccount("Ares", 50 );
  
 }
          
            
    public static void main(String[] args) {
        Bank bankOfGods =new Bank();
        System.out.println(bankOfGods.accountOne.name);
        System.out.println(bankOfGods.accountOne.balance);
    }
    
}
