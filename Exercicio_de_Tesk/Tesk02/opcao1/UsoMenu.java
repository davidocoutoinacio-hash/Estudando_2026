package Estudando_2026.Exercicio_de_Tesk.Tesk02.opcao1;
import java.util.Scanner;

public class UsoMenu {
     
    
    
    static void comecar() {

         Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Qual seu nome? ");
        String name = scanner.nextLine();

        System.out.print("Qual sua idade? ");
        int age = scanner.nextInt();

        System.out.print("Qual seu salário mensal? ");
        double salary = scanner.nextDouble();

        int opcao = 0;

    
        while (opcao != 4) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Ver dados cadastrados");
            System.out.println("2 - Calcular salário anual");
            System.out.println("3 - Verificar maioridade");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n--- Dados Cadastrados ---");
                    System.out.println("Nome: " + name);
                    System.out.println("Idade: " + age);
                    System.out.printf("Salário mensal: R$ %.2f%n", salary);
                    break;

                case 2:
                    double salarioAnual = salary * 12;
                    System.out.printf("\nSalário anual: R$ %.2f%n", salarioAnual);
                    break;

                case 3:
                    if (age >= 18) {
                        System.out.println("\nVocê é maior de idade.");
                    } else {
                        System.out.println("\nVocê é menor de idade.");
                    }
                    break;

                case 4:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
       
    
