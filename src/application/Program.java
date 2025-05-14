package application;

import entities.Account;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Importação da classe account
        Account account;

        System.out.print("Enter acconout number: ");
        int number = scan.nextInt();

        System.out.print("Enter account holder: ");
        scan.nextLine();
        String holder = scan.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scan.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(number, holder, initialDeposit); //Informação de três atributos caso deposite
        } else{
            account = new Account(number, holder); //Informação de dois atributos caso não deposite
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account); //Dados da conta atualizados

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scan.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scan.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

    }

}
