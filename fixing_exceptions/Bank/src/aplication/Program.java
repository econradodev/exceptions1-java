package aplication;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount of withdraw: ");
            Double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (DomainException e) {
            System.out.print("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.print("Unexpected error");
        }
    }
}