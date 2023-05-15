/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapplication2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankingApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank("SCB");
        int option = 0, accountNumber;
        String accountName;
        double amount, balance;

        while (option != 6) {
            System.out.println("Main Menu");
            System.out.println("1.Display All Accounts");
            System.out.println("2.Open New Account");
            System.out.println("3.Close Existing Account");
            System.out.println("4.Deposit​");
            System.out.println("5.Withdraw");
            System.out.println("6.Exit");

            System.out.print("Enter your choice: ");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    bank.listAccount();
                    break;
                case 2:
                    accountNumber = generateAccountNumber();
                    System.out.print("Enter Account Name: ");
                    accountName = scan.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    balance = scan.nextDouble();
                    bank.openAccount(accountNumber, accountName, balance);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    bank.closeAccount(accountNumber);
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Account amount: ");
                    amount = scan.nextDouble();
                    bank.depositMoney(accountNumber, amount);
                    break;
                case 5:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Account amount: ");
                    amount = scan.nextDouble();
                    bank.withdrawMoney(accountNumber, amount);
                    break;
            }

            System.out.println();
        }
    }
    
    public static int generateAccountNumber() {
        Random rand = new Random();
        int accNumber = 100000 + rand.nextInt(900000);
        return accNumber;
    }

}
