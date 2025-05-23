import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.io.IOException;
import java.net.CacheRequest;

public class Optionmenu extends Account {
        static Scanner Sc=new Scanner(System.in);
        DecimalFormat moneyFormat=new DecimalFormat(" '$'###,##0.00");

        HashMap<Integer,Integer> data= new HashMap<Integer,Integer>();

        public void getlogin() throws IOException{
            int x=1;
            do{
             try{
                data.put(12345, 54321);
                data.put(98765,56789);

                System.out.println("welcome to Atm !!!");
                System.out.println("Enter your Customer Id :");
                setCustomerId(Sc.nextInt());

                System.out.println("Enter your PIN :");
                setPin(Sc.nextInt());
             }
             catch(Exception e){
                System.out.println("\nWrong CustomerId or PIN");
                x=2;
             }
             int cn=getCustomerId();
             int pn=getPin();

             if(data.containsKey(cn) && data.get(cn) == pn){
                getAccounttype();
            }
            else{
                System.out.println("\nWrong CustomerID or PIN");
            }}
            while (x==1); 
            }
            public void getAccounttype(){
                System.out.println("Select The Type Of Account You Want To Access :");
                System.out.println("1. Current Account");
                System.out.println("2. Saving Account");
                System.out.println("3.Exit");
   
            int selection = Sc.nextInt();
            
            switch (selection){
                case 1:
                  getChecking();
                  break;
                
                case 2:
                  getSaving();
                  break;
                
                case 3:
                  System.out.println("Thank You For Using The ATM");
                  break;
                  
                default :
                System.out.println("invalid choice");
                getAccounttype();
               }
            }
            public void getChecking(){
               System.out.println("checking Account :");
               System.out.println("1.View Balance");
               System.out.println("2.Withdraw Funds");
               System.out.println("3.Deposit funds");
               System.out.println("4.Exit");
               
               int selection=Sc.nextInt();

               switch (selection) {
                  case 1:
                  System.out.println("Checking Account Balance : "+moneyFormat.format(getCheckingbalance()));
                     getAccounttype();
                     break;
                  
                  case 2:
                  getCheckingWithdrawInput();
                  getAccounttype();

                  case 3:
                  getCheckingDepositInput();
                  getAccounttype();

                  case 4:
                   System.out.println("Thank You For Using ATM !");
                   break;
                  default:
                  System.out.println("Invalid Choice");
                     break;
               }
            }

            public void getSaving(){
               System.out.println("Saving Account :");
               System.out.println("1.View Balance");
               System.out.println("2.Withdraw Funds");
               System.out.println("3.Deposit funds");
               System.out.println("4.Exit");
               
               int selection=Sc.nextInt();

               switch (selection) {
                  case 1:
                   System.out.println("Saving Account Balance : "+moneyFormat.format(getSavingbalance()));
                   getAccounttype();
                   break;
                  
                  case 2:
                   getSavingWithdrawInput();
                   getAccounttype();
                   break;

                  case 3:
                   getSavingDepositInput();
                   getAccounttype();
                   break;

                  case 4:
                   System.out.println("Thank You for Using The ATM !");
                   break;

                  default:
                  System.out.println("Invalid Choice");
                     break;
               }

            }
         }
