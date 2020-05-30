
package bankingsystem;

import java.util.Scanner;

public class Bank  {
    
    Accounts acc[]=new Accounts[50];
   void maker() {
       for (int i=0;i<50;i++) acc[i] = new  Accounts(); 
   }
    Scanner sc=new Scanner(System.in);
   int balance;
  static int  counter=0;
void createAccount(){
    acc[counter]=new Accounts();
      System.out.println("WELCOME");
      System.out.print("Enter your name : ");
      acc[counter].setName(sc.nextLine());
      //sc.next();
      System.out.print("Enter initial amount before creating account : ");
      acc[counter].setBalance(sc.nextInt());
     System.out.println("Here is your account number :" + acc[counter].setAccounts() );
      System.out.print("Please set your password : ");
     acc[counter].setPassword(sc.nextInt());
     System.out.println("Congratulations! Your account has been created successfully.");
     counter++;
     System.err.println("Please remember your pin number and account number ");
     System.out.println("****************************************************************************" );
   
}

// DIPOSIT

  void diposit(){
        System.out.println("Enter your account number");
        int accnum=sc.nextInt();
           System.out.println("Enter your pin number");
        int pin=sc.nextInt();
          System.out.print("Enter amount you want to diposit : ");
          int amount=sc.nextInt();    
        if(amount>0){
        for(int i=0;i<counter;i++)
        {
            
            if(accnum==acc[i].getAccount() && pin==acc[i].getPassword())
            {
                acc[i].setBalance(acc[i].getBalance()+amount);
                System.out.println("Your Current Balance is :" +acc[i].getBalance());
            }
            else System.err.println("Sorry ! Inavalid Pin or Account Number ");      
               }
            
        }
       else System.err.println("Please put a valid amount.");
     }
  
  // WITHDRAW 
  
    void withdraw(){
        System.out.print("Enter your account number : ");
        int accnum=sc.nextInt();
          System.out.println("Enter your pin number");
        int pin=sc.nextInt();
          System.out.print("Enter amount you want to withdraw : ");
        int amount=sc.nextInt();    
          for(int j=0;j<counter;j++){
              if(accnum==acc[j].getAccount() && pin==acc[j].getPassword())
              {
                  if(amount<=acc[j].getBalance())
                  {
                      acc[j].setBalance(acc[j].getBalance()-amount);
                      System.out.println("Your current balance is : "+acc[j].getBalance());
                  }
                  else System.err.println("Insufficient Balance");
              }
            else System.err.println("Sorry ! Inavalid Pin or Account Number "); 
          }
    }
    
    // CHECK BALANCE
    
    void checkBalance(){
        System.out.print("Enter your account number : ");
        int accnum=sc.nextInt();
        System.out.println("Enter your pin number");
        int pin=sc.nextInt();
        for(int k=0;k<counter;k++)
        {
            if(accnum==acc[k].getAccount() && pin==acc[k].getPassword())
            {
                System.out.println("Your current balance is : "+acc[k].getBalance());
            }
             else System.err.println("Sorry ! Inavalid Pin or Account Number "); 
    }

// TRANSFER        

}
void transferBalance(){
    
     System.out.print("Enter your account number : ");
      int  account1=sc.nextInt();
        System.out.println("Enter your pin number");
        int pin=sc.nextInt();
        System.out.print("Enter account number you want to transfer amount : ");
       int account2=sc.nextInt();
        System.out.print("Enter amount : ");
       int amount=sc.nextInt();
           
          for(int j=0;j<counter;j++){
              if(account1==acc[j].getAccount() && pin==acc[j].getPassword())
              {
                  if(amount<=acc[j].getBalance())
                  {
                      acc[j].setBalance(acc[j].getBalance()-amount);
                      System.out.println("Your current balance is : "+acc[j].getBalance());
                  }
                  else System.err.println("Insufficient Balance");
              }
               else System.err.println("Sorry ! Inavalid Pin or Account Number "); 
          }
         for(int i=0;i<counter;i++)
        {
            System.out.println(acc[i].getAccount());
            if(account2==acc[i].getAccount())
            {
                acc[i].setBalance(acc[i].getBalance()+amount);
                System.out.println("Your Current Balance is :" +acc[i].getBalance());
            }
              else System.err.println("Sorry ! Account Number "); 
        }
      

        }
}



