package Estudando_2026.Exercicio_de_Tesk.Tesk02.opcao3Aprovado;
import java.util.Scanner;

public class UsoMenuCorreto {

    // Método responsável por iniciar o fluxo
    static void iniciar(Scanner scanner) {

        // Leitura dos dados
        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.print("Qual seu salário mensal? ");
        double salario = scanner.nextDouble();

        // Inicia o menu passando os dados
        menu(scanner, nome, idade, salario);
    }

    // Controle do menu
    static void menu(Scanner scanner, String nome, int idade, double salario) {

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
                    mostrarDados(nome, idade, salario);
                    break;

                case 2:
                    double salarioAnual = calcularSalarioAnual(salario);
                    System.out.printf("\nSalário anual: R$ %.2f%n", salarioAnual);
                    break;

                case 3:
                    mostrarMaioridade(idade);
                    break;

                case 4:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }

    // Exibe os dados cadastrados
    static void mostrarDados(String nome, int idade, double salario) {
        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Salário mensal: R$ %.2f%n", salario);
    }

    // Regra de negócio: salário anual
    static double calcularSalarioAnual(double salarioMensal) {
        return salarioMensal * 12;
    }

    // Regra de negócio: maioridade
    static void mostrarMaioridade(int idade) {
        if (idade >= 18) {
            System.out.println("\nVocê é maior de idade.");
        } else {
            System.out.println("\nVocê é menor de idade.");
        }
    }
}
