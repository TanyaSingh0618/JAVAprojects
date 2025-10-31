package JAVAprojects.src;

import java.util.Scanner;

// Java banking program for beginners
public class Main {
    double balance = 0;
    boolean isRunning = true;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create an instance of the class to access non-static members
        Main bankApp = new Main();
        bankApp.start();
    }

    public void start() {
        while (isRunning) {
            System.out.println("***************************");
            System.out.println("Banking Program");
            System.out.println("***************************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************************");
            System.out.print("Enter Your Choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Deposited: $" + deposit);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn: $" + withdraw);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our Banking Program!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
