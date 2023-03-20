/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;
import java.util.Scanner;

/**
 *
 * @author Nila Enjeni
 */
public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
        String name=sc.nextLine();
        String customerId=sc.nextLine();
        BankAccount obj1=new BankAccount(name,customerId);
        
    }
}

class BankAccount{
    double bal;
    double prevTrans;
    String customerName;
    String customerId;

    BankAccount(String customerName,String customerId){
        this.customerName=customerName;
        this.customerId=customerId;
    }
     void deposit(double amount){
        if(amount!=0){
            bal+=amount;
            prevTrans=amount;
        }
    }

    void withdraw(double amt){
        if(amt!=0 && bal>=amt){
            bal-=amt;
            prevTrans=-amt;
        }
        else if(bal<amt){
            System.out.println("Bank balance insufficient");
        }
    }

    void getPreviousTrans(){
        if(prevTrans>0){
            System.out.println("Deposited: "+prevTrans);
        }
        else if(prevTrans<0){
            System.out.println("Withdrawn: "+Math.abs(prevTrans));
        }
        else{
            System.out.println("No transaction occured");
        }
    }

}