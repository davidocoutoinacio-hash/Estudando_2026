package Estudando_2026.Conteudos.Métodos_Parâmetros;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        // Uso dos métodos da classe Msn
        Msn.mostrarMensagem("Alice");
        Msn.mostrarIdade(30);
        Msn.mostrarAltura(1.75);
        Msn.mostrarPeso(70.5f);

        // Cálculos
        double anual = Msn.calcularSalarioAnual(2000);
        System.out.println("Salário Anual: " + anual);

        double imc = Msn.calcularIMC(70.5f, 1.75);
        System.out.println("IMC: " + imc);

        Msn.mostrarMenu();

      
    }
    
}
