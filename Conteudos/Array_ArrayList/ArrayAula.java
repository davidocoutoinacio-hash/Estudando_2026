package Estudando_2026.Conteudos.Array_ArrayList;

import java.util.Arrays;

public class ArrayAula {
    public static void main(String[] args) {


       
    Arrays.toString(new int[] {1, 2, 3});
        //Inicialização
        int[] numeros1 = { 1, 2, 3};
        int numeros2[] = { 1, 2, 3};
        

        //Declaração

    int[] numeros3 = new int [3];
    
    // Acesso aos valores

    numeros3[0] = 1;
    numeros3[1] = 2;
    numeros3[2] = 3;
  

    //Impressão 

    System.out.println(Arrays.toString(numeros1));
    System.out.println(Arrays.toString(numeros2));
    System.out.println(Arrays.toString(numeros3));

    }


}