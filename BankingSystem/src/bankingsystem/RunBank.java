
package bankingsystem;

import java.util.Scanner;

public class RunBank {
    public static void main(String[] args) {
  Bank bank=new Bank();
  
          while(true){
              
              System.out.println("1.Create Account ");
              System.out.println("2.Check Balance ");
               System.out.println("3.Deposit");
               System.out.println("4.Withdraw");
               System.out.println("5.Transfer");
               System.out.println("6.Exit");
               System.out.print("Enter Your Choice : ");
              Scanner sc=new Scanner(System.in);
              int option =sc.nextInt();
              switch(option){
                  case 1:bank.createAccount();
                  break;
                  case 2:bank.checkBalance();
                  break;
                  case 3:bank.diposit();
                  break;
                  case 4:bank.withdraw();
                  break;
                  case 5: bank.transferBalance();
                  break;
                  case 6:System.exit(0);
                  break;
                  default:System.err.println("Invalid Option");
              }
        
          }
    }
}

