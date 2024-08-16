/*
Internships: CodeSoft
Task-3 ATM
*/
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int balance = 10000; // The balance of bank
        int choice, withdraw, deposit;

        while (true) {
            System.out.println("Welcome to my ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = myObj.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Withdraw money from your account: ");
                    withdraw = myObj.nextInt();

                    // Check if balance is sufficient for withdrawal
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Carefully,refund your cash.");
                    } else {
                        System.out.println("Incorrect your balance! Please try again.");
                    }
                    System.out.println("");
                }

                case 2 -> {
                    System.out.print("Put in money into your account: ");
                    deposit = myObj.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("");
                }

                case 3 -> {
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                }

                case 4 -> {
                    System.out.println("Exiting...");
                    myObj.close();
                    System.exit(0);
                }

                default -> {
                    System.out.println("opp! please try again.");
                    System.out.println("");
                }
            }
        }
    }
}