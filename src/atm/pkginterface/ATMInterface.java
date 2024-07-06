
 
package atm.pkginterface;
import java.util.Scanner;
class ATM{
    double Balance;
    int PIN=1234;
    
    public void checkpin(){
        System.out.println("Enter Your pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter A Valid PIN");
        }
        sc.close();
    }
    @SuppressWarnings("resource")
    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        
        //Enter CHoice get from user
        Scanner sc = new Scanner(System.in);
        int opt =sc.nextInt();
        
       if (opt==1){
           checkbalance();
       }
       else if(opt==2){
           withdraw();
       }
       else if(opt==3){
           deposit();
       }
       else if(opt==4){
           return;
       }
       else{
           System.out.println("Enter A Valid Choice");
           menu();
       }

       sc.close();
    }
    
    public void checkbalance(){
        System.out.println("Balnce : "+Balance);
        menu();
    }
    public void withdraw(){
        System.out.println("Enter Amount To Withdraw");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        
        if(Balance<amount){
            System.out.println("Insufficient Balnce");
            menu();
        }
        else{
            Balance = Balance-amount;
            System.out.println("Money Withdraw Success");
            menu();
        }
        sc.close();
    }
    
    public void deposit(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        Balance = Balance+amount;
        System.out.println("Money Deposit Success");
        menu();
        
        sc.close();
    }
}
public class ATMInterface {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
    
}
