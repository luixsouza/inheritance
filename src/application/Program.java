package application;

import entities.BusinessAccount;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de conta empresarial!");

        System.out.print("Digite o número da conta: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o titular da conta: ");
        String holder = sc.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double balance = sc.nextDouble();

        System.out.print("Digite o limite de empréstimo: ");
        double loanLimit = sc.nextDouble();

        BusinessAccount account = new BusinessAccount(number, holder, balance, loanLimit);

        int option;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Fazer empréstimo");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Atualizar limite de empréstimo");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", account.getBalance());
                    break;

                case 2:
                    System.out.print("Digite o valor do empréstimo: ");
                    double loanAmount = sc.nextDouble();
                    if (loanAmount <= account.getLoanLimit()) {
                        account.loan(loanAmount);
                        System.out.println("Empréstimo realizado com sucesso!");
                        System.out.printf("Novo saldo: R$ %.2f%n", account.getBalance());
                    } else {
                        System.out.println("Erro: Valor do empréstimo excede o limite disponível.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double withdrawalAmount = sc.nextDouble();
                    if (withdrawalAmount <= account.getBalance()) {
                        account.withdraw(withdrawalAmount);
                        System.out.println("Saque realizado com sucesso!");
                        System.out.printf("Novo saldo: R$ %.2f%n", account.getBalance());
                    } else {
                        System.out.println("Erro: Saldo insuficiente.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o novo limite de empréstimo: ");
                    double newLoanLimit = sc.nextDouble();
                    account.setLoanLimit(newLoanLimit);
                    System.out.println("Limite de empréstimo atualizado com sucesso!");
                    break;

                case 5:
                    System.out.println("Saindo... Obrigado por usar o sistema!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 5);

        sc.close();
    }
}