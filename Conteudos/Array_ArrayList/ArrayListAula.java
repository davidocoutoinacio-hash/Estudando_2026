package Estudando_2026.Conteudos.Array_ArrayList;
import java.util.ArrayList;
import java.util.List;


public class ArrayListAula {

    public static void main(String[] args) {


        //Declaração
        
        List<Integer> numeros = new ArrayList<>(10);

        //Adição

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //Acesso
        System.out.println(numeros.get(0) +
        ", " + numeros.get(1) +
        ", " + numeros.get(2));

        //Atualização
        numeros.set(0, 0);
        System.out.println(numeros);
        //Inserção
        numeros.add(1, 1);
        System.out.println(numeros);
        //Remoção
        numeros.remove(0);
        System.out.println(numeros);



    }
    
}
