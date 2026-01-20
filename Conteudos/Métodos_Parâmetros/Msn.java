package Estudando_2026.Conteudos.Métodos_Parâmetros;

import java.util.Scanner;


public class Msn {


  

    static void mostrarMensagem(String name) {
     System.out.println("Nome: " + name);   

    }
    static void mostrarIdade(int age) {
        System.out.println("Idade: " + age);   
    }

    static void mostrarAltura(double height) {
        System.out.println("Altura: " + height);   
    }

    static void mostrarPeso(float weight) {
        System.out.println("Peso: " + weight);   
    }

    static double calcularSalarioAnual(double salarioMensal) {
        return salarioMensal * 12;
    }

    static double calcularIMC(float peso, double altura) {
        return peso / (altura * altura);
    }

    static void mostrarMenu() {
    System.out.println("\n===== MENU =====");
    System.out.println("1 - Ver dados cadastrados");
    System.out.println("2 - Calcular salário anual");
    System.out.println("3 - Verificar maioridade");
    System.out.println("4 - Sair");
}

static boolean isMaiorDeIdade(int idade) {
    return idade >= 18;
}


}



    
    


