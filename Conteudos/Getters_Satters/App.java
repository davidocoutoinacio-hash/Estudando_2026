package br.daviic.Service;

import java.util.Scanner;



public class App {

    double numero1;
    double numero2;


    public static void main(String[] args) {

    App app = new App();
    Scanner scanner = new Scanner(System.in);



    while (true) {
Calculadora calculadora = new Calculadora();

try {

System.out.println("Digite o primeiro número:");
app.numero1 = scanner.nextDouble();
System.out.println("Digite o segundo número:");
app.numero2 = scanner.nextDouble();


 
} catch (Exception e) {

    System.out.println("Digite um numero válido. Tente novamente.");
   
}




System.out.println("Escolha a opção:");


System.out.println("=================================");

System.out.println("CALCULADORA SIMPLES");

System.out.println("=================================");

System.out.println("1 - Soma");
System.out.println("2 - Multiplicação");
System.out.println("3 - Subtração");
System.out.println("4 - Divisão");
System.out.println("5 - Sair");

System.out.println("=================================");


try {


    

switch (scanner.nextInt()) {
    

case 1:
    
System.out.println(calculadora.soma(app.numero1, app.numero2));
break;
case 2:
System.out.println(calculadora.multiplicacao(app.numero1, app.numero2));
break;
case 3:
System.out.println(calculadora.subtracao(app.numero1, app.numero2));
break;
case 4:
System.out.println(calculadora.divisao(app.numero1, app.numero2));
break;
case 5:
System.out.println("Encerrando a calculadora. Até mais!");
System.exit(0);
break;


default:
System.out.println("Operação inválida.");
break;
       
    }

    

    } catch (Exception e) {
    System.out.println("Operação inválida. Tente novamente.");
    App.main(args);
    }

}

    }
}



