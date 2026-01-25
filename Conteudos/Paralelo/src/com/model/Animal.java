package src.com.model;

import java.util.Scanner;

public class Animal {

    public void emitirSom(String som) {
        System.out.println(som);
    }

    public void comer(String animal, String comida) {
        System.out.printf("O %s está comendo: %s\n", animal, comida);
    }

    public void dormir(String animal) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Pressione ENTER para Acordar...");
            System.out.printf("O %s está dormindo ", animal);

            // Aguarda o ENTER ser pressionado
            sc.nextLine();

            // Anima o sono com pontos
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.printf(".");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.printf("\nComeçou a roncar\n");

            // Emite sons de ronco
            try {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("ZzZzZzZz...\n");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Acordou!");
        }
    }
}

        

 



 

               

                    

                
            

                

    

                

            
  

 
