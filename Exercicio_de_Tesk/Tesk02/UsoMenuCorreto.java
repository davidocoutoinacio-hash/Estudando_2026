package Estudando_2026.Exercicio_de_Tesk.Tesk02;
import java.util.Scanner;

public class UsoMenuCorreto {

        static String name = "";
        static int age = 0;
        static double salary = 0.0;


    static void comecar() {

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Qual seu nome? ");
        name = scanner.nextLine();

        System.out.print("Qual sua idade? ");
        age = scanner.nextInt();

        System.out.print("Qual seu salário mensal? ");
        salary = scanner.nextDouble();

    }



    static void menu() {

        Scanner scanner = new Scanner(System.in);

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
                    mostrarDados();
                    break;

                case 2:
                    double salarioAnual = calcularSalarioAnual();
                    System.out.printf("\nSalário anual: R$ %.2f%n", salarioAnual);
                    break;

                case 3:
                    boolean maiorDeIdade = isMaiorDeIdade(age);
                    System.out.println("\nMaior de idade: " + (maiorDeIdade ? "Sim" : "Não"));
                    break;

                case 4:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;

            }

        }



        }


        static void mostrarDados() {
            System.out.println("\n--- Dados Cadastrados ---");
            System.out.println("Nome: " + name);
            System.out.println("Idade: " + age);
            System.out.printf("Salário mensal: R$ %.2f%n", salary);


    }


    static double calcularSalarioAnual() {
        return salary * 12;

        }

         static boolean isMaiorDeIdade(int idade) {
        return idade >= 18;
    
    }

}

    


