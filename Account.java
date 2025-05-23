import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Account {
    private int CustomerId;
    private int Pin;
    private double Checkingbalance=0;
    private double Savingbalance=0;

    Scanner n = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00 ");

    public int setCustomerId(int customerId) {
        this.CustomerId = customerId;
        return CustomerId;
    }
    public int getCustomerId() {
        return CustomerId;
    }

    public int setPin(int pin) {
        this.Pin = pin;
        return Pin;
    }
    public int getPin() {
        return Pin;
    }

    public double getCheckingbalance(){
        return Checkingbalance;
    }

    public double getSavingbalance(){
        return Savingbalance;
    }

    public double calcCheckingbalance(double amount){
        Checkingbalance=(Checkingbalance-amount);
        return Checkingbalance;
    }

    public double calcSavingbalance(double amount){
        Savingbalance=(Savingbalance-amount);
        return Savingbalance;
    }

    public double calcCheckingdeposit(double amount){
        Checkingbalance=(Checkingbalance+amount);
        return Checkingbalance;
    }

    public double calcSavingdeposit(double amount){
        Savingbalance=(Savingbalance+amount);
        return Savingbalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("checking account balance: "+moneyFormat.format(Checkingbalance));
        System.out.println("Enter Amount to withdraw from Checking Account");
        double amount=n.nextDouble();

        if(Checkingbalance-amount>=0){
            calcCheckingbalance(amount);
            System.out.println("Updated Checking Account balance: "+moneyFormat.format(Checkingbalance));
        }
        else{
            System.out.println("Insufficent Balance");
        }
        
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving account balance: "+moneyFormat.format(Savingbalance));
        System.out.println("Enter Amount to withdraw from Saving Account");
        double amount=n.nextDouble();

        if(Savingbalance-amount>=0){
            calcSavingbalance(amount);
            System.out.println("Updated Saving Account balance: "+moneyFormat.format(Savingbalance));
        }
        else{
            System.out.println("Insufficent Balance");
        }
        
    }

    public void getCheckingDepositInput(){
        System.out.println("checking account balance: "+moneyFormat.format(Checkingbalance));
        System.out.println("Enter Amount to deposit in Checking Account");
        double amount=n.nextDouble();

        if(Checkingbalance+amount>=0){
            calcCheckingdeposit(amount);
            System.out.println("Updated Checking Account balance: "+moneyFormat.format(Checkingbalance));
        }
        else{
            System.out.println("deposit valid amount");
        }
        
    }

    public void getSavingDepositInput(){
        System.out.println("Saving account balance: "+moneyFormat.format(Savingbalance));
        System.out.println("Enter Amount to deposit in Saving Account");
        double amount=n.nextDouble();

        if(Savingbalance+amount>=0){
            calcSavingdeposit(amount);
            System.out.println("Updated saving Account balance: "+moneyFormat.format(Savingbalance));
        }
        else{
            System.out.println("deposit valid amount");
        }
        
    }



    }
    
    



