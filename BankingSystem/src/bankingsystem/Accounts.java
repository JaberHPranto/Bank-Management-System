
package bankingsystem;


public class Accounts {
   
    private int account;
    private int  balance;
   private  int pin ; 
    private String name;
 static int accountNumberGenerator=10000;
int setAccounts() {
         account=++accountNumberGenerator;  
         return account;
    }

    public int getPassword() {
        return pin;
    }

    public void setPassword(int pin) {
        this.pin = pin;
    }
  
    public void setName(String name) {
        this.name = name;
    }
   

    public int getAccount() {
       
        return account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
            
        
        
        
        
        
        
    
}
