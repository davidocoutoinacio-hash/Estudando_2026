package Estudando_2026.Exercicio_de_Tesk.Tesk01;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = 0;
        double salary = 0.0;
        boolean dadosValidos = false;

        while (!dadosValidos) {
            try {
                Thread.sleep(100);

                System.out.print("Qual seu nome? ");
                name = scanner.nextLine();

                System.out.print("Qual sua idade? ");
                age = scanner.nextInt();

                System.out.print("Qual seu salário mensal? ");
                salary = scanner.nextDouble();
                
                dadosValidos = true;

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (InputMismatchException e) {
                System.out.println("\nErro: Você digitou um valor inválido! Tente novamente.\n");
                scanner.nextLine(); // Limpa o buffer do scanner
                dadosValidos = false;
            }
        }


        
        int opcao = 0;

        while (opcao != 4) {


            System.out.println("\n===== MENU =====");
            System.out.println("1 - Ver dados cadastrados");
            System.out.println("2 - Calcular salário anual");
            System.out.println("3 - Verificar maioridade");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();


        switch (opcao){

            case 1:
                System.out.printf("Dados cadastrados: Nome: %s, Idade: %d, Salário: R$ %.2f", name, age, salary);
                 System.out.println(" ");
                break;
            case 2:
                double annualSalary = salary * 12;
                System.out.printf("Salário anual: R$ %.2f", annualSalary);
                 System.out.println(" ");
                break;
            case 3:
                if (age >= 18) {
                    System.out.println("Você é maior de idade.");
                     System.out.println(" ");
                } else {
                    System.out.println("Você é menor de idade.");
                     System.out.println(" ");
                }
                break;
            case 4:
                System.out.println("Saindo...");
                 System.out.println(" ");
                break;
            default:
                System.out.println("Opção inválida.");
                 System.out.println(" ");
                break;

        }

        } 

        scanner.close();
    }
}



    


    


