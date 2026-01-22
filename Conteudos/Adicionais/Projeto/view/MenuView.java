package Projeto.view;

import java.util.Scanner;

public class MenuView {
    private final Scanner scanner;

    public MenuView() {
        this.scanner = new Scanner(System.in);
    }

    public String solicitarNome() {
        System.out.print("Qual seu nome? ");
        return scanner.nextLine();
    }

    public int solicitarIdade() {
        System.out.print("Qual sua idade? ");
        return scanner.nextInt();
    }

    public double solicitarSalario() {
        System.out.print("Qual seu salário mensal? ");
        return scanner.nextDouble();
    }

    public int exibirMenuEObterOpcao() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Ver dados cadastrados");
        System.out.println("2 - Calcular salário anual");
        System.out.println("3 - Verificar maioridade");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public void exibirDadosUsuario(String dados) {
        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println(dados);
    }

    public void exibirSalarioAnual(double salarioAnual) {
        System.out.printf("\nSalário anual: R$ %.2f%n", salarioAnual);
    }

    public void exibirMensagemMaioridade(boolean isMaior) {
        if (isMaior) {
            System.out.println("\nVocê é maior de idade.");
        } else {
            System.out.println("\nVocê é menor de idade.");
        }
    }

    public void exibirMensagemSaida() {
        System.out.println("\nEncerrando o sistema...");
    }

    public void exibirOpcaoInvalida() {
        System.out.println("\nOpção inválida. Tente novamente.");
    }

    public void fechar() {
        scanner.close();
    }
}
